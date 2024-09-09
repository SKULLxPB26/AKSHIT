class Methodsoverriding{
     static class actor{
        void dialogue(){
            System.out.println("following are dialogues of different actor----");
        }
        
    }
   static class sanjaydutt extends actor{
        void dialogue(){
            System.out.println("50 tola 50 tola ");
        }
    }
   static  class johnnylever extends sanjaydutt{
        void dialogue(){
            System.out.println("abhi mza aayega na bhidu");
        }
    }
    public static void main(String args[]){
        johnnylever j1=new johnnylever();
        actor a1=new johnnylever();
        j1.dialogue();
    }
}