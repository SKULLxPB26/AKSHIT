import java.util.Scanner;
class Addition 
{
    Scanner sc=new Scanner(System.in);
    void maths()
    {
        System.out.println("please enter the value of a");
        int a=sc.nextInt();
        System.out.println("please enter the value of b");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("the sum of two variables="+c);
    }
}
class Subtraction extends Addition
{
    void maths()
    {
        System.out.println("please enter the value of x");
        int x=sc.nextInt();
        System.out.println("please enter the value of y");
        int y=sc.nextInt();
        int z=x-y;
        System.out.println("the difference of two variables="+z);
    }
}
class dynamicmethoddispatch1
{
    public static void main(String args[])
    {
        Addition ref;
        Addition a1=new Addition();
        Subtraction s1=new Subtraction();
        ref=a1;
        ref.maths();
        ref=s1;
        ref.maths();

    }
}