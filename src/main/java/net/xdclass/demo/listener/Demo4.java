package net.xdclass.demo.listener;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo4  implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("正在计算中..");
		Thread.sleep(2000);
		return 3;
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		FutureTask<Integer> task=new FutureTask<Integer>(new Demo4());
		Thread t=new Thread(task);
		t.start();
		System.out.println(task.get());
		
		
	}

}
