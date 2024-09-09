import java.util.Scanner;
class addition{
    Scanner sc=new Scanner(System.in);
    void sum(){
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("the sum of two variables="+c);
    }
}
class subtraction extends addition{
    void diff(){
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        System.out.println("enter the value of y");
        int y=sc.nextInt();
        int z=y-x;
        System.out.println("the difference of two variables="+z);
    }
}
class multiplication extends addition{
    void product(){
        System.out.println("enter the value of s");
        int s=sc.nextInt();
        System.out.println("enter the value of t");
        int t=sc.nextInt();
        int d=s*t;
        System.out.println("the product of two variables="+d);
    }
}
class heirarichal{
    public static void main(String args[]){
        subtraction s1=new subtraction();
        multiplication m1=new multiplication();
        s1.diff();
        m1.product();
    }
}