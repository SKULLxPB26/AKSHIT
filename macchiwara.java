import java.util.Scanner;
interface square
{
   public double squareperimeter(int side);
}
interface rectangle
{
   public double rectangleperimeter(int lenght,int breadth);
}
class triangle
{
    Scanner sc=new Scanner(System.in);
    int result;
    void triangleperimeter()
    {
        System.out.println("enter the side of triangle");
        int a=sc.nextInt();
        result=3*a;
        System.out.println("PERIMETER OF TRIANGLE="+result);
    }
}
class hexagon extends triangle implements square,rectangle
{
    void hexagonperimeter()
{
    int results;
    System.out.println("ENTER THE SIDE OF HEXAGON");
    int x=sc.nextInt();
    results=6*x;
    System.out.println("THE PERIMETER OF HEXAGON="+results);
}
       public double squareperimeter(int side)
        {
            return 4*side; 
        }
   public double rectangleperimeter(int lenght,int breadth)
    {
       return 2*(lenght+breadth); 
    }

}
class interfaces
{
    public static void main(String args[])
    {
        hexagon h1=new hexagon();
        System.out.println("THE PERIMETER OF SQUARE="+h1.squareperimeter(4));
        
        System.out.println("THE PERIMETER OF RECTANGLE="+h1.rectangleperimeter(10,10));
        
        h1.triangleperimeter();
        h1.hexagonperimeter();
    }
}






