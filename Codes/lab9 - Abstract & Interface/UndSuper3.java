package lab9;
class  X{                   
    void msg(){System.out.println("Ami Dada");}
}
class Y extends X{  
        void msg(){System.out.println("Ami Baba");}    
    }
class Z extends Y{ 
                                void msg(){System.out.println("Ami Sele");}
  void test(){ 
         super.msg();
        // msg();
    }
}
public class UndSuper3{
    public static void main(String[] args) {       
        Z ob=new  Z();
        ob.test();
    }  
}
