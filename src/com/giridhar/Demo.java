package com.giridhar;

public class Demo {

	public void info() {
		int a = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.print(a * i + " ");
		}
	}

public void infoDisplay() {
System.out.print("hi i am giridhar");

		int b =11;
		for (int j = 1; j <= 10; j++) {
			System.out.print(b * j + " ");
		}
	}


	public static void main(String[] args) {

		System.out.println("i am from demo class");
		System.out.println("hello giridhar");
		Demo demo = new Demo();
		demo.info();
demo.infoDisplay();


	}

}
