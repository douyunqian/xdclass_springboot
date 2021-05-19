package com.roro.lambda;

import java.util.Arrays;
import java.util.List;

public class Demo7 {
	
	
	public int add(List<Integer> values) {
		
		values.parallelStream().forEach(System.out::println);
		return values.parallelStream().mapToInt( a -> a).sum();
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> values=Arrays.asList(10,20,30,40);
		Demo7 demo7=new Demo7();
		int v=demo7.add(values);
		System.out.println(v);
		
		
		
	}

}
