package day07;
/**
 *  @author: Alen
 *  @Date: 2021/3/17 10:44
 *  @Description:杨辉三角
 */
public class Yanghui {
    public static void main(String[] args) {
        //创建一个二维数组
        int[][] arr = new int[10][];

        //给数组赋值
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new int[i+1];
        }

        for (int i = 0; i <arr.length ; i++) {
               // 首末元素赋值
                arr[i][0] = 1;
                arr[i][i] = 1;
                // 非首末元素赋值
                for (int j = 1; j <arr[i].length-1 ; j++) {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }

        }


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
