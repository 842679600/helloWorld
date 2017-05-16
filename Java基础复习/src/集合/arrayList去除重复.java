package 集合;

import java.util.ArrayList;
import java.util.Iterator;

import 集合.entity.Person;

public class arrayList去除重复 {
	
	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("test1", 12));
		al.add(new Person("test2", 14));
		al.add(new Person("test3", 15));
		al.add(new Person("test4", 16));
		al.add(new Person("test2", 14));

	
	al=getSingle(al);
	
	for (Iterator<Person> it = al.iterator(); it.hasNext();) {
		System.out.println(it.next());
	}
//		ArrayList al=new ArrayList();
//		al.add("1212");
//		al.add("sas");
//		al.add("sas");
//		al.add("sas");
//		al.add("2014");
//		al.add("2015");
//		
//		al= getSingle(al);
//		for(Iterator it=al.iterator();it.hasNext();){
//			System.out.println(it.next());
//		}
//	

	}

	private static ArrayList getSingle(ArrayList al) {
		
		ArrayList temp=new ArrayList();
		for (Iterator it = al.iterator(); it.hasNext();) {
			Object obj = it.next();
			if(!(temp.equals(obj))){
				temp.add(obj);
			}
			
		}
		
		return temp;
	}
}
