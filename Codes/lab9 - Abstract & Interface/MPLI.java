package lab10;
//class AA{    int a=10;  }
//class BB{    int b=100; }
// Multiple inheritance is not posible in java through class
//class CC extends AA, BB{     int c=1000; }
public class MPLI {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.c);
        System.out.println(ob.b);
        System.out.println(ob.a);
    } 
}
