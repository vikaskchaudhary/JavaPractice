package thread.example;

public class ParentThread implements PThread{
	ParentThread(){
		System.out.println("Parent thread");
	}
	
	public void start(){
		System.out.println("Parent Start");
		this.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
