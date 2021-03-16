package day06;
/**
 *  @author: Alen
 *  @Date: 2021/3/16 15:53
 *  @Description: 数组相关
 */
public class ArrayTest {
    public static void main(String[] args) {


        //定义数组
        int[] arr = new int[5];

        //数组长度
        System.out.println(arr.length);

        //数组赋值
        arr[0] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        //数组遍历
        for (int i : arr) {
            System.out.println(arr[i]);
        }
        System.out.println("*****************int******************");
        /**数组默认初始化值*/
        //整型数组 默认为0
        int[] arr1 = new int[5];
        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println("*****************short******************");
        //short数组0
        short[] shorts = new short[5];
        for (short s : shorts) {
            System.out.println(s);
        }
        System.out.println("*****************float******************");
        //浮点型数组0.0
        float[] f1 = new float[5];
        for (int i = 0; i <f1.length ; i++) {
            System.out.println(f1[i]);
        }

        for (float v : f1) {
            System.out.println(v);
        }
        //字符型数组0\u0000 非'0'
        System.out.println("*****************char******************");
        char[] chars = new char[5];
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        //字符串型数组null
        System.out.println("*****************string******************");
        String[] str = new String[5];
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);
        }
        //或者
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println(str[0]);
    }
}
