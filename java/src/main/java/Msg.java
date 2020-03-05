import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
 
import javax.swing.JFrame;
 
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
 
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
 
public class Msg extends JFrame {
    private static final long serialVersionUID = 3170335398335303363L;
    private String uname = "qq";
 
    private DatagramSocket server;// UDP
    private InetAddress broadcastAddress;// 廣播地址
    private int port;// 監聽端口
 
    private final Map<String, UserInfo> userTable = new Hashtable<String, UserInfo>();// 用戶列表
    private final String guid = UUID.randomUUID().toString().replace("-", "").toUpperCase();// 本機唯一標識
 
    private JTable table;
    private JTextArea textArea;
    private JLabel lblNewLabel_1;
 
    public Msg() throws SocketException {
        this(5413);
    }
 
    public Msg(int port) throws SocketException {
        this.port = port;
 
        getContentPane().setLayout(null);
        getContentPane().setBackground(SystemColor.control);
 
        JButton btnNewButton = new JButton("刷新");
        btnNewButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                refresh();
            }
        });
        btnNewButton.setBackground(SystemColor.control);
        btnNewButton.setBounds(299, 119, 83, 28);
        getContentPane().add(btnNewButton);
 
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(12, 12, 275, 135);
        getContentPane().add(scrollPane);
 
        table = new JTable(new DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, }, new String[] { "\u7528\u6236\u540D", "IP", "GUID" }) {
            private static final long serialVersionUID = -6259343924352571655L;
 
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        table.setBackground(new Color(255, 255, 255));
        scrollPane.setViewportView(table);
        table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(12, 159, 370, 104);
        getContentPane().add(scrollPane_1);
 
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER) || (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_S)) {
                    sendMessage();
                }
            }
        });
        scrollPane_1.setViewportView(textArea);
 
        JButton button = new JButton("發送");
        button.setBackground(SystemColor.control);
        button.setBounds(141, 275, 83, 28);
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                sendMessage();
            }
        });
        getContentPane().add(button);
 
        JButton button_1 = new JButton("關閉");
        button_1.setBackground(SystemColor.control);
        button_1.setBounds(22, 275, 83, 28);
        button_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Msg.this.dispatchEvent(new WindowEvent(Msg.this, WindowEvent.WINDOW_CLOSING));
            }
        });
        getContentPane().add(button_1);
 
        JLabel lblNewLabel = new JLabel("當前在線人數");
        lblNewLabel.setBounds(299, 29, 83, 18);
        getContentPane().add(lblNewLabel);
 
        lblNewLabel_1 = new JLabel("0");
        lblNewLabel_1.setBounds(305, 59, 55, 18);
        getContentPane().add(lblNewLabel_1);
         
        JLabel lblNewLabel_2 = new JLabel("Alt+S或Ctrl+Enter發送");
        lblNewLabel_2.setBounds(242, 280, 140, 18);
        getContentPane().add(lblNewLabel_2);
 
        this.setSize(400, 348);
        setBackground(SystemColor.control);
        setResizable(false);
        setTitle("局域網聊天");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    sendBroadcast((guid + "2").getBytes(), broadcastAddress);
                } catch (Exception e2) {
                }
            }
        });
 
        try {
 
            uname = JOptionPane.showInputDialog("請輸入你的暱稱");
            uname = uname == null ? "匿名" : uname;
            server = new DatagramSocket(port);
 
            broadcastAddress = InetAddress.getByName("255.255.255.255");
 
            new AcceptBroadcastThread().start();// 啟動監聽
            sendBroadcast((guid + "0" + uname).getBytes(), broadcastAddress);// 發送全網廣播，通知上線
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "端口" + port + "被佔用！");
            System.exit(0);
        }
    }
 
    /**
     * 向外發送數據
     * 
     * @param data
     * @param address
     * @throws IOException
     */
    public void sendBroadcast(byte[] data, InetAddress address) throws IOException {
        DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
        server.send(dp);
    }
 
    /**
     * 刷新列表
     */
    public void refresh() {
        // 清空列表
        userTable.clear();
        DefaultTableModel tableModel = ((DefaultTableModel) table.getModel());
        for (int j = table.getRowCount(); j > 0; j--) {
            tableModel.removeRow(j - 1);
        }
        try {
            sendBroadcast((guid + "3" + uname).getBytes(), broadcastAddress);// 重新發送全網廣播，通知上線
        } catch (Exception e) {
        }
    }
 
    public void alertMessage(final String msg) {
        new Thread() {
            public void run() {
                JOptionPane.showMessageDialog(Msg.this, msg);
            };
        }.start();
    }
 
    /**
     * 發送文字消息
     */
    public void sendMessage() {
        int[] selectRows = table.getSelectedRows();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        String msg = guid + "1" + textArea.getText();
        byte[] data = string2Bytes(msg);
        for (int i = 0, j = selectRows.length; i < j; i++) {
            String key = (String) tableModel.getValueAt(selectRows[i], 2);
            UserInfo ui = key == null ? null : userTable.get(key);
            if (ui != null) {
                try {
                    textArea.setText("");
                    sendBroadcast(data, ui.getIpAddress());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "發送消息到" + ui.getName() + "(" + ui.getIpAddress().getHostAddress() + ")失敗！", "發送失敗", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
 
    private byte[] string2Bytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception e) {
        }
        return null;
    }
 
    class UserInfo {
 
        private String guid;
        private String name;
        private InetAddress ipAddress;
 
        public String getGuid() {
            return guid;
        }
 
        public void setGuid(String guid) {
            this.guid = guid;
        }
 
        public String getName() {
            return name;
        }
 
        public void setName(String name) {
            this.name = name;
        }
 
        public InetAddress getIpAddress() {
            return ipAddress;
        }
 
        public void setIpAddress(InetAddress ipAddress) {
            this.ipAddress = ipAddress;
        }
    }
 
    class AcceptBroadcastThread extends Thread {
        public void run() {
            while (true) {
                try {
                    DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
                    server.receive(dp);
 
                    String msg = new String(dp.getData(), 0, dp.getLength(), "UTF-8");// 解析廣播數據包
                    String uid = msg.substring(0, 32);
                    String type = msg.substring(32, 33);
 
                    if (type.equals("0") || type.equals("3")) {
                        UserInfo ui = new UserInfo();
                        ui.setGuid(uid);
                        ui.setName(msg.substring(33));
                        ui.setIpAddress(dp.getAddress());
 
                        // 刷新請求，只響應不做其他處理
                        if (userTable.containsKey(ui.getGuid()) && type.equals("3")) {
                            sendBroadcast((guid + "0" + uname).getBytes(), broadcastAddress);
                        }
 
                        // 上線通知
                        if (!userTable.containsKey(ui.getGuid())) {
                            userTable.put(ui.getGuid(), ui);// 將新用戶添加到用戶表
                            lblNewLabel_1.setText("" + userTable.size());
 
                            sendBroadcast((guid + "0" + uname).getBytes(), broadcastAddress);// 響應非本機廣播
                            ((DefaultTableModel) table.getModel()).insertRow(0, new String[] { ui.getName(), ui.getIpAddress().getHostAddress(), ui.getGuid() });
                        }
                    } else if (type.equals("1")) {
                        UserInfo ui = userTable.get(uid);
                        alertMessage(ui.getName() + "(" + ui.getIpAddress().getHostAddress() + ")-" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n" + msg.substring(33));
                    } else {
                        userTable.remove(uid);// 移除用戶
                        lblNewLabel_1.setText("" + userTable.size());
 
                        DefaultTableModel tableModel = ((DefaultTableModel) table.getModel());
                        for (int i = 0, j = table.getRowCount(); i < j; i++) {
                            if (tableModel.getValueAt(i, 2).equals(uid)) {
                                tableModel.removeRow(i);
                            }
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
    }
 
    public static void main(String[] args) throws Exception {
        Msg msg = new Msg();
        msg.setVisible(true);
    }
}