import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一条边：");
        int a1 = sc.nextInt();
        System.out.println("输入第二条边：");
        int b1 = sc.nextInt();
        System.out.println("输入第三条边：");
        int c1 = sc.nextInt();
        triangle.a=a1;
        triangle.b=b1;
        triangle.c=c1;
        triangle.Girth();
        triangle.Area();
        if(a1+b1<c1||a1+c1<b1||b1+c1<a1){
            System.out.println("无法组成三角形！");
        }else{
            triangle.Outcome();
        }
    }
}
