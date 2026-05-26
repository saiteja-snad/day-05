package Multitread;

 class p extends Thread {
	public void run() {
		System.out.println();
		for(int i=0;i<=10;i++) {
			System.out.print(i+"  ");
		}
	}
 }
  class p1 extends Thread{
	  public void run() {
		for(int i=11;i<=20;i++) {
			System.out.print(i+"   ");
		}
	}
  }
  
  class p2 extends Thread{
	  public void run() {
		for(int i=21;i<=30;i++) {
			System.out.print(i+"   ");
		}
	}
  }
 public class Demo{
	public static void main(String[] args) throws InterruptedException {
		p t1=new p();
		p1 t2=new p1();
		p2 t3=new p2();
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	
	    t1.join();
	    System.out.println( );
		t2.start();
		//t2.join();
		t2.wait(20);
		
		System.out.println();
		t3.start();
		
	}
}

