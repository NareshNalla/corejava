package com.mt.overr.start;
class MyThread extends Thread{
	public void start() {
		System.out.println("start() overloaded method");
	}
	public void run(){
		System.out.println("run() method");
	}
}
class ThreadDemo {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		
		t.start();
		
		System.out.println("main method");
		t.start();
	}

}
