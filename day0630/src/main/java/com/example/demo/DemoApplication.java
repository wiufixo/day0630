package com.example.demo;

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
		
		Math sub = (a,b)->{
			return a - b;
		};
		Math multi = (a,b)->{return a * b;};
		Math add = (a,b)->a + b;
	}

}
