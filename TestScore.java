import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        ScoreBiz scoreBiz = new ScoreBiz();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入java分数：");
        double java1=Double.parseDouble(sc.nextLine());
        System.out.println("输入C#分数：");
        double c1 =Double.parseDouble(sc.nextLine());
        scoreBiz.java=java1;
        scoreBiz.c=c1;
        scoreBiz.printScore();
    }
}
