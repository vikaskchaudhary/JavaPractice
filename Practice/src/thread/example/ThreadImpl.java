package thread.example;

public class ThreadImpl extends Thread{
	
	public void run(){
		System.out.println("Thread "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImpl t1= new ThreadImpl();
		t1.start();
		ThreadImpl t2= new ThreadImpl();
		//Thread t2= new Thread(new ThreadImpl());
		t2.start();
		//t1.run();
		//t1.run();
	}

}
