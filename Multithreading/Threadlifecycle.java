package Multitread;
import java.util.*;
class Threadm extends Thread{
	static int a=10;
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {

                Thread.sleep(1000);

            } catch(Exception e) {
            }
		}
	}
}
public class Threadlifecycle {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Threadm.a);
		Scanner sc=new Scanner(System.in);
		Threadm t=new Threadm();
		System.out.println(t.getState());
		t.start();
		
		System.out.println(t.getState());
		Thread.sleep(200);
		System.out.println(t.getState());
		
		t.join();
		System.out.println(t.getState());
	}
}
