package hashMaps;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int c = 88;

		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);

		System.out.println(happy);
		System.out.println(happy.get("a"));
		System.out.println(happy.get("c"));

		System.out.println("*********************************");

		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("userName1", "password1");
		fun.put("userName2", "password2");
		fun.put("userName3", "password3");

		fun.remove("loginUserName");
		fun.remove("userName2");

		System.out.println(fun);
		System.out.println(fun.containsValue("password1234"));
		System.out.println(fun.containsKey("userName3"));

		System.out.println(fun.replace("userName1", "betterPassword"));
		System.out.println(fun);
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		// arrays you can get the index and it's in order.... With hashMaps the order
		// changes

	}

}
