package com.example.demo;

import java.util.ArrayList;
import java.util.function.IntFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		Car mycar = new Car();
//		mycar.move();
//		
//		new Moveable() {
//			@Override
//			public void move() {
//				System.out.println("날아서 움직입니다!");
//			}
//		}.move();
		
//		Math sub = new Math() {
//			
//			@Override
//			public int calc(int a, int b) {
//				return a - b;
//			}
//			
//		};
		
//		Math sub = (a,b)->{
//			return a - b;
//		};
//		Math multi = (a,b)->{return a * b;};
//		Math add = (a,b)->a + b;
//		
//		System.out.println(add.calc(8, 2));
//		System.err.println(multi.calc(3, 5));
//		System.out.println(sub.calc(9, 2));
		
		IntFunction<ArrayList<Integer>> getList = (a)->{
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i<a; i++) {
				list.add(100);
			}
			return list;
		};
		
		System.out.println(getList.apply(5));
	}

}
