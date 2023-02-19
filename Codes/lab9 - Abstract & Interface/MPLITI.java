package lab10;
interface AA{  
    void show();
}
interface BB{ 
     void show();
}
// Multiple inheritance is posible in java through Interface
interface CC extends AA,  BB{    
     void msg();
}
public class MPLITI {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.c);
        System.out.println(ob.b);
        System.out.println(ob.a);
    } 
}

