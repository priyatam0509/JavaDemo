package com.piyush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud implements Comparable<stud>{
	int roll,marks;
	String name;
	public stud(int roll,String name, int marks) {
		super();
		this.roll=roll;
		this.name = name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "stud[rollno=" + roll + ",marks=" +marks + ", name=" + name +"]";
	}
	public int compareTo(stud s) {
		// TODO Auto-generated method stub
		return marks>s.marks?1:-1;
	}
	
}

public class ComparableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<stud> l = new ArrayList<>();
		l.add(new stud(23,"Piyush",55));
		l.add(new stud(12, "rinki", 80));
		l.add(new stud(16,"Radhe", 70));
		l.add(new stud(65,"gyanu", 100));
		
		Collections.sort(l,(i,j)->i.name.length()>j.name.length()?1:-1);
		for(stud s:l)
		System.out.println(s);
		

	}

}
