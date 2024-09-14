import java.util.Scanner;
interface brand
{
   public  void brandname();
}
interface year
{
  public  void buildyear();
}
interface kilometer
{
   public void kmdriven();
}
class Bike implements brand,year,kilometer{
    Scanner sc=new Scanner(System.in);
    @Override
   public void brandname()
    {
        System.out.println("PLEASE ENTER BRAND NAME");
        String name=sc.nextLine();
        System.out.println("YOUR BIKE IS OF BRAND="+name);
    }
    @Override
  public  void buildyear()
    {
        System.out.println("PLEASE ENTER BUILD YEAR");
        int b=sc.nextInt();
        System.out.println("YOUR BIKE WAS BUILD IN YEAR="+b);
    }
    @Override
  public  void kmdriven()
    {
        System.out.println("PLEASE ENTER TOTAL KILOMETERS YOU HAVE DROVE YOUR BIKE");
        int c=sc.nextInt();
        System.out.println("TOTAL KILOMETERS DRIVEN="+c);
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.brandname();
        b1.buildyear();
        b1.kmdriven();
    }
    }