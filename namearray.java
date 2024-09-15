import java.util.Scanner;
class namearray
{
    Scanner sc=new Scanner(System.in);
    void array()
    {
        String name[]=new String[5];
        System.out.println("PLEASE ENTER THE NAME OF STUDENTS");
        System.out.println("the name of first student=");
         name[0]=sc.nextLine();
        System.out.println("the name of second student=");
        name[1]=sc.nextLine();
        System.out.println("the name of third student=");
        name[2]=sc.nextLine();
        System.out.println("the name of fourth student=");
        name[3]=sc.nextLine();
        System.out.println("the name of fifth student=");
       name[4]=sc.nextLine();

       int j=name.length;
       System.out.println("TOTAL LENGHT OF ARRAY="+j);
       System.out.println("ELEMENTS OF ARRAY ARE");
       int i;
       for(i=0;i<j;i++)
       {
        
        System.out.println(name[i]);
       }
    }

    public static void main(String args[])
    {
        namearray n1=new namearray();
        n1.array();
    }
}