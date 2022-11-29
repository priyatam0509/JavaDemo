// in list we can have any number of data types and here in list we pass argument as object not any data type

package com.piyush;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List l = new ArrayList();
       l.add(5); // Integer v = new Integer(4);
       l.add(6);
       l.add(2,3);
       l.add("rtg");
       Iterator it = l.iterator();
//       while(it.hasNext()) {
//    	   System.out.println(it.next());
//       }
       
//       for(int i=0;i<l.size();i++) {
//    	   System.out.println(l.get(i));
//       }
//	}
       for(Object o:l) {
    	   System.out.println(o);
       }
	}

}
