package com.MessageTest.messagegetandpost;

public class TestClass2 extends Thread {
	public void run(){
		TestClass1 c1=new TestClass1();
		 while(true){
		System.out.println("ssssssss");
		try {
			sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 c1.start();
		
		 c1.settb();
		
		 }
	}
 public static void main(String[] args){
	TestClass2 t1=new TestClass2();
	 t1.start();
 }
}
