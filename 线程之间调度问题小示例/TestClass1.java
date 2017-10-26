package com.MessageTest.messagegetandpost;

public class TestClass1 extends Thread{

	int i;
	boolean b;
	public TestClass1(){
		i=0;
	    b=false;
	}
	public void settb(){
		b=true;
	}
	public void run(){
		while(true){
			try {
				
				if(b){
					System.out.println("b is true");
					i++;
					
				}
				else {
					System.out.println("b is false");
				}
				sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
