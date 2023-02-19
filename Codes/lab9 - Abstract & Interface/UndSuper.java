package lab9;
 class  P{
     int a=10; 
     void msg(){  System.out.println("Ami Super Class"); }
}
class Q extends P{ 
 int a=20;
 void msg(){  System.out.println("Ami Sub Class"); }
 void test(){ 
     super.msg();
   // System.out.println(a);
    System.out.println(super.a);
    }
}
public class UndSuper{
    public static void main(String[] args) {       
        Q ob=new  Q();
        //ob.test();
        ob.msg();
    }  
}
