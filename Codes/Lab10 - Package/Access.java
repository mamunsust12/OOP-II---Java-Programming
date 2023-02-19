package pack2;
import pack1.*;
import pack1.B;
import pack1.sp.*;
public class Access {
     public static void main(String[] args) {
           A a =new A();
              a.show();
           B b =new B();
               b.show();
           pack1.C c =new pack1.C();
                         c.show();
          Sub1 ob1=new Sub1();
                 ob1.show();
         Sub2 ob2=new Sub2();
                 ob2.hello();
    }
     
}
