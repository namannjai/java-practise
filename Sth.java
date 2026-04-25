class A{
      public A(){
	System.out.println("in A");
		}
        public A(int n){
            System.out.println("in A int");
        }
}

class B extends A
{
	public B(){
        super(4);
	System.out.println("in B");
		}

    public B(int n){
        
System.out.println("in B int");
}
}

public class Sth{
		public static void main(String args[]){
		
	B obj = new B();
	
}


}