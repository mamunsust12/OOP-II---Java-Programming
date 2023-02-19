package lab9;
  class A{
     int a=10; 
      void test(){
          a=100;  // Error- because final variable cannt be reinitialized
           System.out.println(a);
    }
}
class B extends A{ // Error- because final class cannt be inherited
 @Override
 void test(){ // Error- because final method cannt be overridden
    System.out.println("Final method can't be overridden");
    }
}
public class UndFinal {
    public static void main(String[] args) {       
    
	}  
}
