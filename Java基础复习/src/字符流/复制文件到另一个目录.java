package 字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class 复制文件到另一个目录 {
	public static void main(String[] args) throws Exception {
		//读取一个已有文件，用缓冲读取流与文件相关联
		BufferedReader br=new BufferedReader(new FileReader("D:\\123.txt"));
		//创建一个新目录。用于存储读取到的数据，并写入
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\aaaaaaaaa.txt"));
		String len=null;
		while((len=br.readLine())!=null){
			//写入数据
			bw.write(len);
			//创建一个新行，用于换行
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}

}
