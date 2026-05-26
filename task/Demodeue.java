package day4and5;
import java.util.*;
public class Demodeue {
	

	    public static void main(String[] args) {

	        Deque<Integer> d = new ArrayDeque<>();

	        d.addFirst(20);
	        d.addLast(60);
	        d.addLast(90);
	        System.out.println(d.offerFirst(100));
	        System.out.println(d.removeFirst());
	        System.out.println(d.pollFirst());
	        System.out.println(d.pollLast());
	        d.addFirst(20);
	        d.addLast(60);
	        d.addLast(90);
	        System.out.println(d.peekFirst());
	        System.out.println(d.peekLast());
	        System.out.println(d.getFirst());
	        System.out.println(d.getLast());
	        System.out.println(d);
	    }
	}

