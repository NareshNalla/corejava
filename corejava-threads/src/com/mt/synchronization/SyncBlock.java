package com.mt.synchronization;

public class SyncBlock {
	public static void main(String[] args) throws InterruptedException{
		ThreadA b=new ThreadA();
		b.run();
		Thread.sleep(500);
		synchronized (b) {
	
		System.out.println("Main Thread trying to call wait()");	
		b.wait(1000);//pass value
		System.out.println("main thread got notification");
		System.out.println(b.total);
		}
	}
}
class ThreadA extends SyncBlock{
	int total=0;
	public void run(){
		synchronized (this) {
			System.out.println("Child thread starts notification");
			for(int i=1;i<10;i++){
				total=total+1;
			}
			System.out.println("child thread trying to given notification");
			this.notify();
			}
	}
}

