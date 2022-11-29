// collection -> list -> ArrayList
// if size is fixed then go for array if not go for collections but default collection is object type
//to identify the collection of particular data type we use generic i.e collection<Integer> values = new ArrayList<Integer>// here we can not mention();
package com.piyush;

import java.util.ArrayList;
import java.util.*;

public class collectionandgenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values = new ArrayList<>();
		values.add(5);
		values.add(6);
		values.add(9);
		System.out.println(values);
		Iterator it = values.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		
		}
	}

}
