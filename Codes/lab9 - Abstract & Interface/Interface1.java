package lab10;
interface I1{
    void show1();
    abstract void show2();
    //1. interface is unable to hold non-abstract method except default
     //void show3(){}
    default void show4(){}
}
interface I2 extends I1{
    @Override
    void show1();
    abstract void show5(); 
}
public class Interface1 {
     public static void main(String[] args) {
         // 2. We cannot instantiate (create object) an interface
         //I1 ob=new I1();
    } 
}
