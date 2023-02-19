package lab9;
class PP{
     PP(){System.out.println("A");} 
     PP(String n){System.out.println(n);}
}
class QQ extends PP{ 
     QQ(){System.out.println("B");} 
}
class RR extends QQ{
      RR(String n){System.out.println(n);}
 }
public class Cons {
    public static void main(String[] args) {  
	RR c= new RR("Khusbul"); 
    }          
  }  