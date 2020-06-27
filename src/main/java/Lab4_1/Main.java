package Lab4_1;

public class Main {
   public static void main (String[] args){
	  A a=new A();
	  a.processTemplate(Resource.A);
	System.out.println("");
	  B b=new B();
	  b.processTemplate(Resource.B);
	   System.out.println("");
	  C c=new C();
	  c.processTemplate(Resource.C);
   }
}
