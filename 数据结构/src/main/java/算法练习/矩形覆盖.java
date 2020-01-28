package 算法练习;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 9:37
 */
public class 矩形覆盖 {
    public int RectCover(int target) {

        if(target==1||target==2||target==3){
            return target;
        }


        return RectCover(target-1)+RectCover(target-2);


    }

    public static void main(String[] args) {
        矩形覆盖 矩形覆盖 = new 矩形覆盖();


        for (int i=1;i<100;i++){

            System.out.printf("%d ",矩形覆盖.RectCover(i));

        }

    }
}
