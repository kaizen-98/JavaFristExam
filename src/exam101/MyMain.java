package exam101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyMain {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bW = new BufferedWriter(new FileWriter("\\Users\\Lenovo\\eclipseee\\projectExam101\\files101\\file101.pdf"));
		bW.write("java html python css javascript");
		bW.write("\njava html python css javascript");
		bW.close();
		
		
		
		
	}

}
