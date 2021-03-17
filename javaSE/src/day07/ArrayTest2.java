package day07;
/**
 *  @author: Alen
 *  @Date: 2021/3/17 16:46
 *  @Description:数组元素的反转
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        String[] str = new String[]{"AA","JJ","DD","MM","EE"};

        String temp;
        for (int i = 0; i < str.length / 2 ; i++) {
            temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = temp;
        }

        for (String s : str) {
            System.out.print(s +"\t");
        }
    }
}
