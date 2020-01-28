package 排序算法.内部排序;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/23 13:49
 */
public class 归并排序 {
    public static void main(String[] args) {
        int size=20;
        int[] old = new int[size];
        int[] news = new int[size];

        for (int i = 0; i < size; i++) {

            old[i] = (int) (Math.random() * size);
        }
        ;

    }

    /**
     * 归并排序进行步数拆解
     */
    public void sort(int oid[],int news[],int left,int right){

        int middle=(left+right)/2;
        //向左边拆分
        if (left<right){
            sort(oid,news,left,middle);
            sort(oid,news,middle,right);
            sort2(oid,news,left,right);

        }

    }

    public void sort2(int oid[],int news[],int left,int right){
        int left1=left;

        int middle=(left+right)/2;
        while (left<(left+right)/2){

            if (oid[left]<oid[middle]){
                news[left1]=oid[left];

                left++;

            }else {

                news[left1]=oid[middle];
                middle++;
            }
            left1++;


        }




    }
}
