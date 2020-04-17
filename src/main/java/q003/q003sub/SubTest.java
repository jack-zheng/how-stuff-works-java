package q003.q003sub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class SubTest {
	public static void main(String[] args) throws Exception {
		File file = new File(SubTest.class.getResource("003_.xml").getFile());
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		String url = SubTest.class.getResource("/root.xml").getPath();
		System.out.println(url);
		File file1 = new File(url);
		System.out.println(file1.getPath());

		System.out.println(SubTest.class.getClassLoader().getResource(""));
		System.out.println(SubTest.class.getClassLoader().getResource("/"));
	}
}
