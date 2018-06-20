package com.mt.prevent.te;
public class Interrupted extends Thread{
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // need to handle the IE
		System.out.println("task");

	}

	public static void main(String args[]){
		Interrupted t1=new Interrupted();
		t1.start();
		try{
			t1.interrupt();
		}catch(Exception e){System.out.println("Exception handled "+e);}

	}
}

/*If thread is not in sleeping or waiting state, 
 * calling the interrupt() method sets the interrupted flag to true
 *  that can be used to stop the thread by the java programmer later.
 */