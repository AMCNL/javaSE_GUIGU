package day05.project01;
/**
 *  @author: Alen
 *  @Date: 2021/3/15 21:56
 *  @Description: 家庭收支记账软件项目测试
 */
public class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;
        int balance = 1000;//初始账户金额
        String detail = "收  支\t\t账户金额\t\t收支金额\t\t说  明\n";
        while(isFlag){
            System.out.println("-----------------家庭收支记账软件_by_Rancho-----------------\n");
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退    出\n");
            System.out.print("                 请选择《1-4》：");

            char menu = Utility.readMenuSelection();
            switch (menu){
                case '1':
                    System.out.println("-------------当前收支明细记录-------------");
                    System.out.println(detail);
                    System.out.println("---------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int number = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String readString = Utility.readString();
                    balance += number;
                    detail += ("收  入\t\t" + balance + "\t\t" + number + "\t\t\t" + readString + "\n");
                    System.out.println("---------------登记完成-------------------\n");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int number1 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String readString1 = Utility.readString();
                    if(balance>number1){
                        balance -= number1;
                        detail += ("支  出\t\t" + balance + "\t\t" + number1 + "\t\t\t" + readString1 + "\n");
                    }else{
                        System.out.println("账户余额不足...");
                        System.out.println("---------------登记失败-------------------\n");
                        break;
                    }
                    System.out.println("---------------登记完成-------------------\n");
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）");
                    char readConfirmSelection = Utility.readConfirmSelection();
                    if(readConfirmSelection == 'Y'){
                        isFlag = false;
                    }
            }


        }
    }
}
