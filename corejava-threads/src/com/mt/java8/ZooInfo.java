package com.mt.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
	public static void main(String[] args) {
		ExecutorService executorService =null;
		try{
			executorService = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			executorService.execute(() ->System.out.println("Printing zoo inventory"));
			executorService.execute(()-> {for(int i=0; i<3;i++)
				System.out.println("Printing record: "+i);}
			);
			executorService.execute(() ->System.out.println("Printing zoo inventory"));
			System.out.println("end");
		}finally{
			if(executorService != null)executorService.shutdown();
		}
	}

}
