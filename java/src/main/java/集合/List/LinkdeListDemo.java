package 集合.List;


import javax.swing.tree.TreeNode;
import java.util.*;

public class LinkdeListDemo {





    public static void main(String[] args) {
        LinkedList<String> string=new LinkedList<>();



        string.add("沥青");
        string.add("李青");
        string.add("唱");
        string.add("跳");
        string.add("篮球");
        string.add("rap");

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();


        System.out.println(string.size());

        string.peek();
        string.poll();
        string.pop();






    }


}
