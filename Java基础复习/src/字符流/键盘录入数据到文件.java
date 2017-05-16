package 字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class 键盘录入数据到文件 {
/**
* @param args
* @throws IOException
*/
public static void main(String[] args) throws IOException {
/*
* 1,需求：将键盘录入的数据写入到一个文件中。
*
* 2,需求：将一个文本文件内容显示在控制台上。
*
* 3,需求：将一个文件文件中的内容复制到的另一个文件中。
*/
	//读取流读取控制台写入的数据
	BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
	//创建一个目录。用于得到的数据写入
	BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\123.txt"));
	
	String len=null;
	
	while((len=bis.readLine())!=null){
		///判断如果是over字符串出现了，将结束输入
		if("over".equals(len)){
			break;
		}
		bw.write(len);
		bw.newLine();
		bw.flush();
	}
	System.out.println("完成");
	bw.close();
	bis.close();
	
}
}