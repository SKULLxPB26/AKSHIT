class addition{

    void addition(int x,int y){
        int a=x;
        int b=y;
      int c= a+b;
      System.out.println("the sum of two variables="+c);
    }
}
class subtraction extends addition{
	    super (10,10);
 void subtraction(int x,int y){

    int s=x;
    int t=y;
    int d=s-t;
System.out.println("the difference of two variable="+d);
 }
}
class Super{
    public static void main(String args[]){
        subtraction s1=new subtraction();

    }
}