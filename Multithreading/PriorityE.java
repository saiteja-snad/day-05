package Multitread;

class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " Priority: "
                + Thread.currentThread().getPriority()
                + " Value: " + i);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
            }
        }
    }
}
public class PriorityE {
	public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

         t1.setName("Low");
        t2.setName("Normal");
        t3.setName("High");

         t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
          t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
}
}