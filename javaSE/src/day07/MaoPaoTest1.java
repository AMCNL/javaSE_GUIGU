package day07;
/**
 *  @author: Alen
 *  @Date: 2021/3/17 21:14
 *  @Description: 冒泡排序
 */ 
public class MaoPaoTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,5,89,45,3,67,88,55};

        int tmp ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + "\t");
        }

    }
}
