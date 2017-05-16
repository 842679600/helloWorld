package 字符流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class 读取流 {
	/*
	 * 需求：读取一个文本，将读取到的字符打印到控制台上
	 */
	
		public static void main(String[] args) throws Exception {
			BufferedReader br=new BufferedReader(new FileReader("d:\\123.txt"));
			String len=null;
			while((len=br.readLine())!=null){
				System.out.println(len);
			}
		}

}
