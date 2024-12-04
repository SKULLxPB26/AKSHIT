import java.util.Scanner;
interface rectangle
{
    double rectperimeter(double a,double b);
}
interface square
{
    double squareperimeter(double a);
}
class circle
{
    Scanner sc=new Scanner(System.in);
    void circleperimeter()
    {   
        double pie=3.14;
        System.out.println("please enter the value of radius");
        int r=sc.nextInt();
        double perm=2*pie*r;
        System.out.println("perimeter of circle="+perm);
    }
}
class Shapesperimeter extends circle implements  rectangle,square
{
    public double rectperimeter(double a,double b)
    {
        return 2*(a+b);
    }
    public double squareperimeter(double a)
    {
        return 4*a;
    }   
}
class Interfaces1
{
    public static void main(String args[])
    {
        Shapesperimeter s1=new Shapesperimeter();
        double pmofrect=s1.rectperimeter(10.5,11.7);
        System.out.println("perimeter of rectangle"+pmofrect);
        double pmofsquare=s1.squareperimeter(20);
        System.out.println("perimeter of square"+pmofsquare);
        s1.circleperimeter();
    
    }
}