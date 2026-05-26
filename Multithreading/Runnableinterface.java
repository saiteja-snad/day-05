package Multitread;


public class Runnableinterface implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.print(i+"  ");
		}
		
	}

}

 class Runnableinterface1 implements Runnable{

	@Override
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.print(i+"  ");
		}
		
	}

}
class Cv {
	public static void main(String[] args) throws InterruptedException {
		Runnableinterface r = new Runnableinterface();
		Thread t=new Thread(r);
		t.start();
		t.join();
		Runnableinterface1 r1 = new Runnableinterface1();
		Thread t1=new Thread(r1);
		t1.start();
		t1.join();
		
	}
}
