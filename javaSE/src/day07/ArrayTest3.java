package day07;
/**
 *  @author: Alen
 *  @Date: 2021/3/17 17:04
 *  @Description: 二分查找
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,5,9,11,23,56,89,98,110,111,116,120,135,169,178,198};

        int dest1 = 23;
        int start = 0;
        int end = arr.length-1;
        boolean flag = true;
        while (flag){
            int middle = (start+end)/2;
            if(dest1 == arr[middle]){
                System.out.println("找到指定的元素，位置为："+middle);
                flag = false;
                break;
            }else if(dest1 < arr[middle]){
                end = middle-1;
            }else{
                start = middle+1;
            }
        }

        if(flag){
            System.out.println("对不起，没有找到该元素。。。");
        }

    }
}
