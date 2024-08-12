import java.util.Scanner;
class Bike {
int x;
 Scanner sc=new Scanner(System.in);
                                            void hello1(){

                                                        System.out.println("the price of bike is ");
                                                        x=sc.nextInt();
}
}
class Aftercost extends Bike {
    int y;
    void hello2(){

        System.out.println("total extra cost  over the bike is");
        y=sc.nextInt();
    }
}
class Total extends Aftercost {


    void totalcost(){
		 int b=x=100;
    int c=y=200;
       int a=b+c;
        System.out.println("total money wasted on bike"+a);

    }
}
class Costinheritance{
    public static void main(String args[]){
        Bike b1=new Bike();
        Aftercost a1=new Aftercost();
        Total t1=new Total();
        b1.hello1();
        a1.hello2();
        t1.totalcost();
    }
}