package com.rooroo;

public class Demo {
	
	public volatile int a=0;
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.a=20;
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(demo.getA());
			}
		});
		t.start();
		
		
	}

}
