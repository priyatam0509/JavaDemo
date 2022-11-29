package com.piyush;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Integer> s = new HashSet<>();
		Set<Integer> s = new TreeSet<>();
		s.add(87);
		s.add(67);
		s.add(45);
		s.add(45);
		for(int i :s) {
			System.out.println(i);
		}

	}

}
