package net.xdclass.demo.listener;

public class Demo3 {

	
			public static void main(String[] args) {
//				new Thread() {
//					public void run() {
//						System.out.println("hehe");
//					};
//				}.start();   //第一种
				
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						System.out.println("第二种方法");
//						
//					}
//				}).start();
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("我是Runable接口");
						
					}
				}) {
					
					public void run() {
						
						System.out.println("第三种方式");
					};
				}.start();
				
				
				
			}
			
			
}
