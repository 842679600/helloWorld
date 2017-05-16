package 字符流;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class 行号设置 {
/**
* @param args
* @throws IOException
*/
public static void main(String[] args) throws IOException {
FileReader fr = new FileReader("D:\\123.txt");
LineNumberReader lnr = new LineNumberReader(fr);
String line = null;
lnr.setLineNumber(100);
while((line=lnr.readLine())!=null){
System.out.println(lnr.getLineNumber()+":"+line);
}
lnr.close();
}
}
