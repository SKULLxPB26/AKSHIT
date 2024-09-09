import java.util.Scanner;
class methodoverriding{
    Scanner sc=new Scanner(System.in);
 class shapes{
void area(){
    System.out.println("the following are the areas of different shapes");
}
}
  public class square {
    int result;
void area(int x){
    System.out.println("enter the value of side of square---");
x=sc.nextInt();
result=x*x;
System.out.println("the area of square is----"+result);
}
}

 public class rectangle {
    int result;
    void area(int l,int b){
System.out.println("enter the value of lenght of rectangle--- ");
l=sc.nextInt();
System.out.println("enter the value of breadth of rectangle");
b=sc.nextInt();
result=l*b;
System.out.println("the area of rectangle is---"+result);
    }
}

 public class circle  {
    double result;
    static double pie=3.14;
    void area(int r){
        System.out.println("enetr the value of radius of circle---");
        r=sc.nextInt();
        result=pie*r*r;
        System.out.println("the araea of circle is---"+result);
    }
}
public static void main(String args[]){
   circle c1=new circle();
   c1.area();
   rectangle r1=new rectangle();
   r1.area();
   square s1=new square();
   s1.area();    

}

}


