package thread.example;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadImpl extends Thread{
	static int x;
	
//	{
//		x=0l;
//	}
	public synchronized void run(){
		
		//x++;
		for(int i=0;i<10;i++)
		System.out.println("Thread "+(++x)+" "+Thread.currentThread().getName());
		//xyz
//		Object obj=null;
//		System.out.println(obj.);
		
		
		
	}

	/*@Override
	public void start(){
		this.run();
	}*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		File f1= new File("xyz.txt");
		ThreadImpl t1= new ThreadImpl();
		//t1.start();
		//t1.start();
		ThreadImpl t2= new ThreadImpl();
		//Thread t2= new Thread(new ThreadImpl());
		//t1.wait();
		//t2.start();
		//t1.yield();
//		//t2.join();
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
//		t1.run();
//		t2.run();
//		t1.start();
//		t2.start();
		
//		ThreadImpl t3=null;
//		t3.start();
	}

}
