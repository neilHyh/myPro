package week6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class ewee{
	
	/*public 	static ewee instance = new ewee();
	
	private ewee() {}
	private static ewee single = new ewee();
	
	//静态工厂
	
	public static ewee getInstance() {
		return single;
	}*/
	public static void main(String[] args) throws InterruptedException {
		Set<String> set = new HashSet<String>();
		//MyThread myThread = new 
		
		Thread w = new Thread();
		w.sleep(20);
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
		System.out.println(set);
		Set<String> sortSet = new TreeSet<String>(set);
		System.out.println(sortSet);
	}
} 
