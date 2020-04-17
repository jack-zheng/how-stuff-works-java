package q003;

import java.net.URL;

public class Q003Test {
	public static void main(String[] args) throws Exception {
		URL url = Q003Test.class.getResource("test.xml");
		System.out.println(url.toURI());
	}
}
