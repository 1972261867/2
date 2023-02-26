public class ScoreBiz {
    String name;
    double java;
    double c;
    public double calcTotal(){
        return java+c;
    }
    public double calcAvg(){
        return (java+c)/2;
    }
    public void printScore(){
        System.out.println("张三学生的Java课程成绩是："+java+",C#课程成绩是"+c+",总分是"+calcTotal()+"，平均分是"+calcAvg());
    }
}
