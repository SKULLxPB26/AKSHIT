public class Dynamicmethoddispatch {
    class dog{
        void sound(){
            System.out.println("bhau bhau bhau");
               }
    }
    class cat extends dog{
        void sound(){
            System.out.println("meow meow meow");
        }
    }
    class cock extends cat{
        void sound(){
            System.out.println("cuckduckooo");
        }
    }
    public static  void main(String args[]){
       Dynamicmethoddispatch D1=new Dynamicmethoddispatch();
       dog d1=D1.new cock();
       d1.sound();
    }
}
