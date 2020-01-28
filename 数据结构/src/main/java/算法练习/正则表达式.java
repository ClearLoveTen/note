package 算法练习;


public class 正则表达式 {
    public static void main(String[] args) {

        String str="a武佳豪bs武佳豪dddddfjsdlfj";



        String replace = str.replace("武佳豪", "李青");
        System.out.println(replace);
        String replace2 = str.replaceAll("武..d{0,2}", "沥青");
        System.out.println(replace2);
        String[] ds = str.split("d");
        String[] 豪s = str.split("豪",2);




    }
}
