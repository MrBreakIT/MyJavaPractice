package hashSetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("BMW");
		h.add("Mercedes");
		h.add("Jeep");
		h.add("Land Rover");
		h.add("Ferrari");
		System.out.println(h);
		System.out.println(h.size());
		h.remove("Mercedes");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains("Mercedes"));
		System.out.println(h.contains("BMW"));
		System.out.println(h.isEmpty());

		System.out.println("**************************");

		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(13);
		hashbrowns.add(24);
		hashbrowns.add(5);
		System.out.println(hashbrowns);
		System.out.println(hashbrowns.toArray());

		Iterator<Integer> it = hashbrowns.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
