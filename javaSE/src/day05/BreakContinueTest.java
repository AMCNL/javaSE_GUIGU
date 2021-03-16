package day05;
/**
 *  @author: Alen
 *  @Date: 2021/3/15 21:09
 *  @Description: break和continue学习补充
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        la:for (int i = 0;i <= 4 ; i++){
            for (int j = 1; j <=10 ; j++) {
                if(j % 4 == 0){
                    // break;//默认跳出包裹此关键字最近的一层循环

                    continue;//跳出包裹最近循环开启下一次循环

                    //break la;//跳出标记

                    //continue la;//跳出标记启下一次循环
                }
                System.out.print(j);
            }
        }
    }
}
