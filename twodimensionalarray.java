import java.util.Scanner;
class twodimensionalarray
{
    Scanner sc=new Scanner(System.in);
void twodarray()
{
String name[][];
name= new String [3][2];

System.out.println("PLEASE ENTER THE ELEMENTS OF ARRAY");
System.out.println("ENTER THE ELEMENT ON FIRST ROW AND FIRST COLUMN");
name[0][0]=sc.nextLine();
System.out.println("ENTER THE ELEMENT ON FIRST ROW AND SECOND COLUMN");
name[0][1]=sc.nextLine();
System.out.println("ENTER THE ELEMENT ON SECOND ROW AND FIRST COLUMN");
name[1][0]=sc.nextLine();
System.out.println("ENTER THE ELEMENT ON SECOND ROW AND SECOND COLUMN");
name[1][1]=sc.nextLine();
System.out.println("ENTER THE ELEMENT ON THIRD ROW AND FIRST COLUMN");
name[2][0]=sc.nextLine();
System.out.println("ENTER THE ELEMENT ON THIRD ROW AND THIRD COLUMN");
name[2][1]=sc.nextLine();

int z=name.length;
System.out.println("THE LENGTH OF ARRAY="+z);
System.out.println("THE ELEMENTS OF ARRAY ARE");

for(int i=0;i<name.length;i++)
{
for(int q=0;q<name[i].length;q++)
{
    System.out.println(name[i][q]);
}
}
}
public static void main(String[] args) {
    twodimensionalarray T2=new twodimensionalarray();
    T2.twodarray();
}
}