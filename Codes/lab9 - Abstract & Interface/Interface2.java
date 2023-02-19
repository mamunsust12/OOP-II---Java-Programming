package lab10;
// an interface method is public and abstract by default
interface IF1{      void show();    }
interface IF2{      void show();    }
interface IF3 extends IF1,IF2{     
    void msg();    
}
class IC implements IF3{
    public void show(){ System.out.println("Interface: show");}
    public void msg(){System.out.println("Interface: msg");}
}
public class Interface2 {
    public static void main(String args[]){
        IC ob=new IC();
        ob.show();
        ob.msg();
    }
}
