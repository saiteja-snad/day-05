package day4and5;
interface Demo {
    void show();
}

//===================================

interface Add{
	void sum(int a,int b);
}

//=============================================
interface Square{
	int find(int n);
}

//===============================================
interface Message{
	String display(String name);
}

public class Lambda {
public static void main(String[] args) {
//=========================================
	Demo d=()->System.out.println("hi saiteja");
	d.show();
	
//==================================================
	
	Add A=(a,b)->System.out.println(a+b);
	A.sum(10, 30);
	
//=================================================
	
	Square s=(n)->n*n;
	System.out.println(s.find(10));
	
//===================================================
	
	Message m=name->"welcome "+name;
	System.out.println(m.display("sai"));
}
}
