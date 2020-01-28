package 算法练习;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/17 11:49
 */
public class 倒转单词 {


    public static String ReverseSentence(String str) {

        String[] split = str.split(" ");

        if(str.equals(" ")){

            return " ";
        }
        StringBuilder stringBuilder=new StringBuilder();


        for(int i=split.length-1;i>=0;i--) {


            stringBuilder.append(split[i]);
            stringBuilder.append(" ");

        }

        return  stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        倒转单词.ReverseSentence(" ");
    }

}
