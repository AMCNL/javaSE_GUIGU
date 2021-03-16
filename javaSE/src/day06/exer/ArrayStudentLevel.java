package day06.exer;

import java.util.Scanner;
/**
 *  @author: Alen
 *  @Date: 2021/3/16 19:58
 *  @Description:从键盘读入学生成绩，找出最高分，并输出学生成绩等级
 */
public class ArrayStudentLevel {
    public static void main(String[] args) {
        //1.创建学生数组
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scanner.nextInt();
        int[] stus = new int[number];

        //2.键盘输入五个学生的成绩
        System.out.print("请输入"+number+"个成绩：");
        for (int i = 0; i <stus.length ; i++) {
            stus[i] = scanner.nextInt();
        }

        //3.遍历数组，查找成绩最大的学生
        int maxScore = 0;
        for (int i = 0; i <stus.length ; i++) {
            if(maxScore<stus[i]){
                maxScore = stus[i];
            }
        }
        System.out.println("最高分是："+maxScore);

        char level;
        //4.设定学生成绩登记
        for (int i = 0; i <stus.length ; i++) {
            if(maxScore-stus[i]<=10){
                level = 'A';
            }else if(maxScore - stus[i]<=20){
                level = 'B';
            }else if(maxScore - stus[i]<=30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("Student："+i+"\tscore： "+stus[i]+"\tgrade is："+level );
        }
    }
}
