public class Triangle {
    int a;
    int b;
    int c;
    public double Girth(){
        double girth =a+b+c;
        return girth;
    }
    public double Area(){
        double p =Girth()/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public void Outcome(){
        System.out.println(String.format("周长：%.0f，面积：%.2f",Girth(),Area()));
    }
}
