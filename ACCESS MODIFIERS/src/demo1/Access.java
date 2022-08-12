package demo1;

public class Access {
	
	private  int i=50;
	public  void show() 
	
	 {
		System.out.println("hello world");
		}

	public static void main(String[] args) {
		 
	//object
		Access a1= new Access();
		
		a1.show();
		
		System.out.println(a1.getI());

	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
