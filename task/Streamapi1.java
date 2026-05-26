package day4and5;
import java.util.*;
import java.util.stream.Collectors;
public class Streamapi1 {
	public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,3,2,4,6,5,9,8,7);

        /*list.stream()
            .filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println(list);*/
        
//        list.stream().map(n->n*n).forEach(System.out::println );
        
     long c=  list.stream().sorted().count();
       System.out.print(c);
    }
}
