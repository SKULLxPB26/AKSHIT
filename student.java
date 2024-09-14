
import java.util.Scanner;

interface name
{
 public void studentname();


interface rollno
{
    void studentrollno();
}


interface age
{
    void studentage1();
}


class student implements name,rollno,age{
    Scanner sc=new Scanner(System.in);
   @Override
        public void studentname(){
   
    
        System.out.println("enter your name=");
        String name=sc.nextLine();
        System.out.println("your name is "+name);
    }
    @Override
     public void studentrollno(){
        System.out.println("enter your rollno");
        int b=sc.nextInt();
        System.out.println("your rollno="+b);
    }
    @Override
        public void studentage1(){
        System.out.println("enter your age");
        int c=sc.nextInt();
        System.out.println("your age is"+c); 
    }
public static void main(String[] args) {
        student s1=new student();
        s1.studentname();
        s1.studentage1();
       
        s1.studentrollno();
    }

}
}