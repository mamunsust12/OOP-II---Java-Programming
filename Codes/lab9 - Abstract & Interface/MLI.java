package lab10;
class A{
    int a=10;
}
class B extends A{
    int b=100;
}
class C extends B{
    int c=1000;
}
public class MLI {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.c);
        System.out.println(ob.b);
        System.out.println(ob.a);
    } 
}
