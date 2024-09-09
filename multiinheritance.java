import java.util.Scanner;
class addition{
Scanner sc=new Scanner(System.in);
	void add(){
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
		 int z=x-y;
		 System.out.println("the difference of two variables="+z);
	 }
 }
 class multiplication extends subtraction{

	 void multi(){
		 System.out.println("enter the value of k");
		 int k=sc.nextInt();
		 System.out.println("enter the value of t");
		 int t=sc.nextInt();
		 int q=k*t;
		 System.out.println("the multiplication of two variables="+q);
	 }
 }
 class multiinheritance{

	 public static void main(String args[]){
		 multiplication m1=new multiplication();
		 m1.multi();
		 m1.add();
		 m1.diff();
	 }
 }