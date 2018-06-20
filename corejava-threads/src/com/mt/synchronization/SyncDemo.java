package com.mt.synchronization;
class Display{
	 synchronized public void wish(String name){
		//remove Sysnchronized key word for normal
		 for(int i=0;i<10;i++){
			System.out.print("Good Morning :");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		Display d1=new Display();
		MyThread t1=new MyThread(d1,"Chaithanya");
		MyThread t2=new MyThread(d1, "Akil");
		t1.start();
		t2.start();
	}

}
