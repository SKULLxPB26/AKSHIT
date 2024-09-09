import java.util.Scanner;
class addition{
    Scanner sc=new Scanner(System.in);
    void sum(){
        System.out.println("enter the value of x");
         int x=sc.nextInt();
        System.out.println("enter the value of y");
        int y=sc.nextInt();
        int z=x+y;
        System.out.println("the sum of two digits="+z);
    }
}
class subtraction extends addition{
    Scanner sc=new Scanner(System.in);
    void minus(){
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int c=b-a;
        System.out.println("the difference of two number="+c);
    }
}
class Single {
    
    public static void main(String args[]){
        subtraction s1=new subtraction();
        s1.minus();
    }
}