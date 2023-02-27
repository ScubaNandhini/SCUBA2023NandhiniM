package Week2Assignment;

public class multiThreading implements Runnable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread multiThreading1 = new Thread("Thread1");
		Thread multiThreading2 = new Thread("Thread2");
		multiThreading1.start();
		multiThreading2.start();
		System.out.println("Threading Begins");
		System.out.println(multiThreading1.getName());
	    System.out.println(multiThreading2.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
