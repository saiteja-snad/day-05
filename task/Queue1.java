package day4and5;
import java.util.*;
public class Queue1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<String> s=new LinkedList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			s.add(sc.next());
		}
		System.out.println(s);
		System.out.println(s.remove());
		System.out.println(s.offer(sc.next()));
		System.out.println(s.poll());
		System.out.println(s.peek());
		System.out.println(s);
		sc.close();
	}

}
