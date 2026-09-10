package practicejava;
import java.util.*;
public class removeDupList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,3,4,5,5,6);
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		
		List<String> name=Arrays.asList("Kowshik","Kowshik","Kowshik","Krishna");
		Set<String> names=new HashSet<>(name);
		System.out.println(names);
		
		Map <String,Integer>student = new HashMap<>();
	    student.put(" kowshik ", 1);
	    student.put(" krishna ",2);
	    //System.out.println(student);
	    
	    for(String str:name) {
	    	student.put(str,student.getOrDefault(str,0)+1);
	    }
	    System.out.println(student);

	}

}
