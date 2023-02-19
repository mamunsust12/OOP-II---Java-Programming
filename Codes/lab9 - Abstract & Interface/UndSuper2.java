package lab9;
 class  M{
     int a=10;
}
class N extends M{ 
	int a=20;
}
class O extends N{ 
	int a=30;
  void test(){ 
    System.out.println(super.a);
    }
}
public class UndSuper2{
    public static void main(String[] args) {       
        O ob=new  O();
        ob.test();
    }  
}
