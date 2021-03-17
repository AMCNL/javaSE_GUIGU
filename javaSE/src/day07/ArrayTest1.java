package day07;
/**
 *  @author: Alen
 *  @Date: 2021/3/17 15:01
 *  @Description: 随机生成10个【10-99】随机数，求其最大数，最小数，求和，平均数
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);
            System.out.print(arr[i]+"\t");
        }

        int maxValue = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }


        System.out.println("\n最大值是："+maxValue);

        int minValue = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.println("最小值是："+minValue);

        //去和
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("求和："+sum);

        //取平均数
        int avgValue = sum / arr.length;

        System.out.println("平局值："+avgValue);


    }
}
