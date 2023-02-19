package lab9;
class AA{  
    AA(){ System.out.println("Dada");} 
}
class BB extends AA{  
    BB(){ System.out.println("Baba");} 
    BB(String n){ System.out.println("Baba"+n);}
}
class CC  extends BB{  
 CC(){  
       super("Babare");
        System.out.println("Sele");
    }  
}
public class UndSuper4 {
    public static void main(String[] args) {    
                CC ob=new CC();
    }                
}
