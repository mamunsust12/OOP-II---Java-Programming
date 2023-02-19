package lab9;
class A1{
    void show(){System.out.println("A");} 
}
class A2 extends A1{ 
	//void show(){System.out.println("B");} 
}
class A3 extends A2{ 
	void show(){System.out.println("C");} 
}
public class DMD {
    public static void main(String[] args) {  
	A1 ob;
                        ob= new A3();
	ob.show();
    }  
}
