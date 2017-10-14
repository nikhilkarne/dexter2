package me.training.Nikij2se.basics;

public class ConstuctorDemo {
	
	static{
		System.out.println("is static");
	}
	
	public ConstuctorDemo(String name){
		System.out.println("this is the constructor");
   }
	public ConstuctorDemo(String name ,double age){
		System.out.println("this is the constructor\t"+name+"\t" +age);
		
	}
	 public static void main(String[] args) {
			
			@SuppressWarnings("unused")
			ConstuctorDemo demo=new ConstuctorDemo("nikhil",24);
				
			}

}
