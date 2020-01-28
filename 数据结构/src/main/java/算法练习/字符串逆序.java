package 算法练习;

public class 字符串逆序 {

    public static void main(String[] args) {



        字符串逆序 j = new 字符串逆序();
        System.out.println(j.Main(10));



    }


    int Main(int i) {

        if (i >= 10) {
            return Main(i - 5) + Main(i - 10) + Main(i - 1) + Main(i - 2);
        } else if (i >= 5) {
            return Main(i - 5) + Main(i - 1) + Main(i - 2);
        } else if (i > 2) {
            return Main(i - 1) + Main(i - 2);
        } else if (i == 1||i==2) {
            return i;
        } else {
            return 1;
        }


    }
}
