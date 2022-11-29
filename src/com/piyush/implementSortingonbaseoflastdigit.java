package com.piyush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class implementSortingonbaseoflastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l = new ArrayList<>();
		l.add(404);
		l.add(908);
		l.add(305);
		l.add(202);
		Collections.sort(l,(i,j)->i%10>j%10?1:-1);
		for(Integer o:l) {
			System.out.println(o);
		}
		

	}

}
