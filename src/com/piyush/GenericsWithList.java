package com.piyush;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericsWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Integer> l = new ArrayList<>();
            l.add(4);
            l.add(6);
            l.add(2,4);
            Collections.sort(l);
            Collections.reverse(l);
            
            for(Integer i:l) {
            	System.out.println(i);
            }
	}

}
