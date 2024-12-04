import java.util.Scanner;
class Squarenumber
{
    Scanner sc=new Scanner(System.in);
    void multiply()
    {
        System.out.println("please enter the number of which you want the square");
        int a=sc.nextInt();
        int b=a*a;
        System.out.println("the square of number="+b);
    }
}
class Cubenumber extends Squarenumber
{
    void multiply()
    {
        System.out.println("enter the value of number you want the cube of");
        int x=sc.nextInt();
        int y=x*x*x;
        System.out.println("the cube of number="+y);
    }
}
class overriding1
{
    public static void main(String[] args) {
        Cubenumber c1=new Cubenumber();
        c1.multiply();
       Squarenumber s1=new Squarenumber();
       s1.multiply();
    }
}