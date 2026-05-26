package day4and5;
@FunctionalInterface
interface Demo1 {
    void show();
}

interface Calculator{
	int add(int a, int b);
}

public class Functionalinter {
	public static void main(String[] args) {
		
Demo1 d=()->System.out.println("functional interface");
d.show();


Calculator c=(s,t)->{
	return s+t;
};
System.out.println(c.add(20, 50));

}

}

