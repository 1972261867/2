import java.util.Scanner;

public class TestAutoLion {
    public static void main(String[] args) {
        AutoLion autoLion = new AutoLion();
        Scanner sc = new Scanner(System.in);
        String color2 = sc.nextLine();
        autoLion.color = color2;
        autoLion.color1();
        String getcolor = autoLion.getColor();
        System.out.println(getcolor);
    }
}
