class Implementingthread implements Runnable
{
    public void run()
    {
        System.out.println("CHILD THREAD");
        System.out.println("RUNNABLE THREAD");
    }
    public static void main(String args[])
    {
        Implementingthread i1=new Implementingthread();
        Thread t1=new Thread();
        t1.start();
    }
}
