package javaprotected;

import demo1.Access;

public class Protected {
   protected int i=560;
   protected  void show() 
	
	 {
		System.out.println("hello world");
		}

	public static void main(String[] args) {
		
		//object
				Access a1= new Access();
				
				a1.show();
				
				System.out.println(a1.getI());

			}

		}
