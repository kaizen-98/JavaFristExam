package exam101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
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
		
	//	FilenameFilter textFilter = new FilenameFilter() {
		//	public boolean accept(File file, String name) {
		//	return name.toLowerCase().endsWith(".pdf");
		//	}
		//	};
			
			
			while(scan.hasNextLine()) {
				
				//System.out.println(scan.nextLine());
				txtContent = txtContent.concat(scan.nextLine() + "\n");
			}
		for (int i =0; i<99; i++) {
			BufferedWriter br = new BufferedWriter( new FileWriter("\\Users\\Lenovo\\eclipseee\\projectExam101\\file101"+i+".pdf"));
			 br.write(txtContent);
			 br.close();
				
		}
		BufferedReader brr = new BufferedReader(new FileReader("\\Users\\Lenovo\\eclipseee\\projectExam101\\file101.pdf"));
		
		Scanner sc = new Scanner(System.in);
		int wordCount = 0;
		String s;
		System.out.println("Enter the word you want to search pdf ");
		String input = sc.next();
		while((s=brr.readLine())!=null) {
			if(s.equals(input)) {
				wordCount++;
			}
		}
		
		if(wordCount!=0) {
			System.out.println("Number of word here that you seach "+wordCount);
		}
		else {
			System.out.println("We couldnt find it");
		}
	
		
	

}}
