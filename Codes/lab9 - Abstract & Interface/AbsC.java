package lab10;
abstract class P{
      abstract void show1();
      static void show2(){}
      abstract void Info(); 
}
abstract class Q extends P{
    //void show1(){}
   abstract void msg();
}
class R extends Q{
     void show1(){}
     void msg(){ }
     void Info(){}
}
public class AbsC {
     public static void main(String args[]){
        R ob=new R();
        ob.show1();
        ob.msg();
        //P.show2();
        
    }
}
