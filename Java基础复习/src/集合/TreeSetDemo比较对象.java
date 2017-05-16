package 集合;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import 集合.entity.Person;

public class TreeSetDemo比较对象 {
public static void main(String[] args) {
TreeSet ts = new TreeSet(new ComparatorByName());
/*
* 以Person对象年龄进行从小到大的排序。
*
*/
ts.add(new Person("zhangsan",28));
ts.add(new Person("lisi",21));
ts.add(new Person("zhouqi",29));
ts.add(new Person("zhaoliu",30));
ts.add(new Person("wangu",24));
Iterator it = ts.iterator();
while(it.hasNext()){
Person p = (Person)it.next();
System.out.println(p.getName()+":"+p.getAge());
}
}

}

class ComparatorByName implements Comparator {
@Override
public int compare(Object o1, Object o2) {
Person p1 = (Person)o1;
Person p2 = (Person)o2;
int temp = p1.getName().compareTo(p2.getName());
return temp==0?p1.getAge()-p2.getAge(): temp;
// return 1;//有序。
}
}