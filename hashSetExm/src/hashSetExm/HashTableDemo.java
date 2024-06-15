package hashSetExm;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) {

			 // Hash table with String keys and String values
			Hashtable<String, String> ht = new Hashtable<String, String>();
			ht.put("Nitin", "nitin123@gmail.com");
			ht.put("Deepak", "deepak123@gmail.comss");
			// ht.put(null, "abc"); //RTE not allowed null Keys/values
			ht.put("Harish", "harish123@gmail.com");
			// ht.put(null, null);
			ht.put("Ravi", "ravi123@gmail.com");
			System.out.println("\nHashtable with name and emailId");
			System.out.println(ht);

			System.out.println("\nTraversing a Hashtable\n");
			Enumeration<String> em = ht.keys();
			while (em.hasMoreElements()) {
				String nm = em.nextElement().toString();
				System.out.println(nm + " : " + ht.get(nm));
		}
	}
}

/*
 * Output : 
 			Hash table with name and emailId
			{Ravi=ravi123@gmail.com, Deepak=deepak123@gmail.comss, Harish=harish123@gmail.com, Nitin=nitin123@gmail.com}
			
			Traversing a Hash table
			
			Ravi : ravi123@gmail.com
			Deepak : deepak123@gmail.comss
			Harish : harish123@gmail.com
			Nitin : nitin123@gmail.com
 */
