package IO流.身份证;

import java.io.*;
import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/15 0:19
 */

public class People {
    String url = "jdbc:mysql://localhost:3306/people?"
            + "user=root&password=111&useUnicode=true&characterEncoding=UTF8";
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    public People() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {


        // ctrl+alt + m 抽取方法

        People people = new People();
        // people.print();
        people.deleteRepetition();

    }

    public void print() throws SQLException, IOException {

        File file = new File("C://Users/111/Desktop/120000万身份证1.txt");

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Connection connection = null;
        String sql = "select * from peoples order by number";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Date date = new Date();

        while (resultSet.next()) {


            bufferedWriter.write(resultSet.getString(1));
            bufferedWriter.write("----");
            bufferedWriter.write(resultSet.getString(2));
            bufferedWriter.write("----");
            bufferedWriter.write(resultSet.getString(3));
            bufferedWriter.write("----");
            bufferedWriter.write(resultSet.getString(4));
            bufferedWriter.write("----");
            bufferedWriter.write(resultSet.getString(5));
            bufferedWriter.write("----");
            bufferedWriter.write(resultSet.getString(6));
            bufferedWriter.newLine();

            bufferedWriter.flush();
        }

        Date date1 = new Date();

        System.out.println(date1.getTime() - date.getTime());
        System.out.println((date1.getTime() - date.getTime()) / 1000);
        resultSet.close();
        bufferedWriter.close();
        preparedStatement.close();
        connection.close();

    }


    public void insertPeople() throws IOException, SQLException {
        String sql = "insert into peoples(name,age,sex,birthday,number) values(?,?,?,?,?) ";


        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File("C:\\Users/111/Desktop/6W身份证.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;
        String name = null;
        String number = null;
        while ((string = bufferedReader.readLine()) != null) {

            if ("".equals(string)) {
                continue;
            }
            try {
                String[] split = string.split("----");
                name = split[0];
                number = split[1];
                //姓名

                preparedStatement.setString(1, name);

                //年龄
                preparedStatement.setString(2, "1");
                //性别

                preparedStatement.setString(3, Integer.valueOf(number.substring(14, 15)) % 2 == 0 ? "女" : "男");
                //生日
                preparedStatement.setString(4, number.substring(6, 14));
                //身份证号
                preparedStatement.setString(5, number);


                preparedStatement.execute();
            } catch (Exception e) {

                System.out.println(name + "----" + number);
            }


        }

        preparedStatement.close();

        bufferedReader.close();
    }

    public void deleteRepetition() throws SQLException {

        //分步走
        //查出来所有 姓名 身份证号码


        PreparedStatement preparedStatement = null;
        String sql = "SELECT * FROM peoples GROUP BY number HAVING COUNT(*)>1";


        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Map map = new HashMap<String, String>();
        int i = 0;
        Date date = new Date();
         DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        System.out.println(dateTimeInstance.format(date));
        while (resultSet.next()) {
            map.put(resultSet.getString(6), resultSet.getString(2));
            i++;
        }
        int size=map.size();


        preparedStatement.close();
        System.out.println(i);
        Date date2 = new Date();
        System.out.println(dateTimeInstance.format(date2));


        String sql2 = "delete from peoples where number=? ";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);

        //根据key 删除所有重复项
        Set set = map.keySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            preparedStatement1.setString(1, next);
            preparedStatement1.executeUpdate();
            System.out.println(size--);
        }
        preparedStatement1.close();
        Date date3 = new Date();
        System.out.println(dateTimeInstance.format(date3));


        Set<Map.Entry> set1 = map.entrySet();


        Iterator<Map.Entry> iterator1 = set1.iterator();
        String sql3 = "insert into peoples(name,age,sex,birthday,number) values(?,?,?,?,?) ";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql3);

        //添加
        while (iterator1.hasNext()) {
            Map.Entry next1 = iterator1.next();

            String key = (String) next1.getKey();
            String value = (String) next1.getValue();

            preparedStatement2.setString(1, (String) next1.getValue());
            preparedStatement2.setInt(2, 1);
            preparedStatement2.setString(3, Integer.valueOf(value.substring(14, 15)) % 2 == 0 ? "女" : "男");
            preparedStatement2.setString(4, key.substring(6, 14));
            preparedStatement2.setString(5, key);
            preparedStatement2.executeUpdate();
        }
        preparedStatement2.close();
        Date date4 = new Date();
        System.out.println(dateTimeInstance.format(date4));

    }

}
