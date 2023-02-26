import java.util.Scanner;

public class TestMyShopping {
    public static void main(String[] args) {
        MyShopping myShopping = new MyShopping();
        Scanner sc = new Scanner(System.in);
        int a=1;
        while (a==1){
            myShopping.showLoginMenu();
            int num = sc.nextInt();
            if(num==1){
                while (a==1){
                    myShopping.showMainMenu();
                    int num1 =sc.nextInt();
                    if(num1==2){
                       while (a==1){
                           myShopping.showCustMenu();
                           int num2 = sc.nextInt();
                           if(num2==1){
                               System.out.println("执行幸运大放送");
                               a=2;
                           }else if(num2==2){
                               System.out.println("执行幸运抽奖");
                               a=2;
                           }else if(num2==3){
                               System.out.println("执行生日问候");
                               a=2;
                           }else if(num2==0){
                               break;
                           }
                       }
                    }else if(num1==1){
                        System.out.println("功能未开放！");
                        a=2;
                    }else if(num1==0){
                        break;
                    }
                }
            }else{
                System.out.println("退出系统");
                a=2;
            }
        }
    }
}
