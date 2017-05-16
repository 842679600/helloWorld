package 集合;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import 集合.entity.Person;
import 集合.entity.Student;
public class TreeMapDemo {
/**
* @param args
*/
public static void main(String[] args) {
TreeMap<Student,String> tm = new TreeMap<Student,String>(new
ComparatorByName2());
tm.put(new Student("lisi",38),"北京");
tm.put(new Student("zhaoliu",24),"上海");
tm.put(new Student("xiaoqiang",31),"沈阳");
tm.put(new Student("wangcai",28),"大连");
tm.put(new Student("zhaoliu",24),"铁岭");
Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();
while(it.hasNext()){
Map.Entry<Student,String> me = it.next();
Student key = me.getKey();
String value = me.getValue();
System.out.println(key.getName()+":"+key.getAge()+"---"+value);
}
}
}

class ComparatorByName2 implements Comparator {
@Override
public int compare(Object o1, Object o2) {
Student p1 = (Student)o1;
Student p2 = (Student)o2;
int temp = p1.getName().compareTo(p2.getName());
return temp==0?p1.getAge()-p2.getAge(): temp;
// return 1;//有序。
}
}
