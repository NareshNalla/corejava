package com.test;

import java.util.*;

public class Test8 {

	public static void main(String[] args) {

		List ids = new ArrayList(); // Line 1

		ids.add(123);

		ids.add(99);

		

		Map students = new HashMap(); // Line 2

		students.put("Jess",ids.get(0));

		students.put("Jimmy",ids.get(1));

		

		int x = ((Long)students.get("Jimmy")).intValue(); // Line 3

		
		/*cannot convert from Object to Foo*/
	}

}
