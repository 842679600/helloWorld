package 集合;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ComparatorByLength implements Comparator {
@Override
public int compare(Object o1, Object o2) {
String s1 = (String)o1;
String s2 = (String)o2;
int temp = s1.length()-s2.length();
return temp==0? s1.compareTo(s2): temp;
}
}
/*
* 对字符串进行长度排序。
*
* "20 18 -1 89 2 67"
*/
public class TreeSetTest长度比较器 {
public static void main(String[] args) {
TreeSet ts = new TreeSet(new ComparatorByLength());
ts.add("aaaaa");
ts.add("zz");
ts.add("nbaq");
ts.add("cba");
ts.add("abc");
Iterator it = ts.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}
