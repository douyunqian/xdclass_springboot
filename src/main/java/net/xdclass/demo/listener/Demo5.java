package net.xdclass.demo.listener;

import java.util.Timer;
import java.util.TimerTask;

public class Demo5 {
	
	public static void main(String[] args) {
		Timer timer=new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(System.currentTimeMillis());
				
			}
		}, 0,1000);
		
		
		
	}

}
