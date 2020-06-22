package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int threader;
	
	ThreadedGreeter(int i){
		threader = i;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + threader);
		if(threader < 50) {
			Thread t = new Thread(new ThreadedGreeter(threader+=1));
			t.start();
			try {

				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
