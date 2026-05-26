package day4and5;

import java.util.Optional;

public class Optional1 {
	
	    public static void main(String[] args) {

	        String name = "java";

	        Optional<String> op =
	                Optional.ofNullable(name);
	        
	        System.out.println(op.isPresent());
	        System.out.println(op.get());
	        System.out.println(op.orElse("user not found"));
	        System.out.println(op.orElseGet(()->"default vales"));
	        System.out.println(op);
	    }
	}

