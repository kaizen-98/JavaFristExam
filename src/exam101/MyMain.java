package exam101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) throws IOException {
		
		//BufferedWriter bW = new BufferedWriter(new FileWriter("\\Users\\Lenovo\\eclipseee\\projectExam101\\files101\\file101.pdf"));
		//bW.write("java html python css javascript");
		//bW.write("\njava html python css javascript");
		//bW.close();
		
		FileWriter write = new FileWriter("\\Users\\Lenovo\\eclipseee\\projectExam101\\file101.pdf");
		write.write("java html python css javascript");
		write.write("\njava html python css javascript");
		write.close();
		
		File file = new File("\\Users\\Lenovo\\eclipseee\\projectExam101\\file101.pdf");
		Scanner scan = new Scanner(file);
		String txtContent ="";
		for (int i=0;i<100;i++) {
			file = new File("file"+i+".pdf");
			while(scan.hasNextLine()) {
				
				//System.out.println(scan.nextLine());
				txtContent = txtContent.concat(scan.nextLine() + "\n");
				file.createNewFile();
			}
			
		}
		
		
		
		
	}

}
