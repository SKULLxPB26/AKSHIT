import java.util.Scanner;
class Calculationmethodoverriding{
    Scanner sc=new Scanner(System.in);
 class addition{
        void calculation(){

            System.out.println("enter the value of a");
             int a=sc.nextInt();
             System.out.println("enter the value of b");
             int b=sc.nextInt();
              int c=a+b;
              System.out.println("the sum of two variables="+c);
        }
    }
    class subtraction extends addition{
    void calculation(){
        System.out.println("enter the value of x");
             int x=sc.nextInt();
             System.out.println("enter the value of y");
             int y=sc.nextInt();
             int z=x-y;
             System.out.println("the diffrence of two variables="+z);
    }
   }
    class multiplication extends subtraction{
    void calculation(){
        System.out.println("enter the value of s");
             int s=sc.nextInt();
             System.out.println("enter the value of t");
             int t=sc.nextInt();
             int d=s*t;
             System.out.println("the product of two variables="+d);
    }
   }
   public static void main(String args[]){
    multiplication m1=new multiplication();
    m1.calculation();
   }
}
