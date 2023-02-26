import java.util.Scanner;

public class TestStarSMS {
    public static void main(String[] args) {
        StartSMS startSMS = new StartSMS();
        Scanner sc = new Scanner(System.in);
        int a=1;
        while (a==1){
            startSMS.showLoginMenu();
            int num = sc.nextInt();
            if(num==1){
                    System.out.print("请输入用户名：");
                    String user = sc.next();
                    System.out.print("请输入密码：");
                    String password = sc.next();
                    if(user.equals("admin")&&password.equals("123456")){
                        while (a==1){
                            startSMS.showMainMenu();
                            int num1 =sc.nextInt();
                            if(num1==2){
                                while (a==1){
                                    startSMS.showCustMenu();
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
                                while (a==1){
                                    startSMS.showCustInfo();
                                    int num3 =sc.nextInt();
                                    if(num3==1||num3==2||num3==3||num3==4){
                                        System.out.println("功能暂未开放！");
                                        a=2;
                                    }else if(num3==0){
                                        break;
                                    }
                                }
                            }else if(num1==0){
                                break;
                            }
                        }
                    }else{
                        System.out.println("输入的密码或账号错误，请重新输入！");
                        break;
                    }
            }else{
                System.out.println("欢迎下次再来");
                a=2;
            }
        }
    }
}



