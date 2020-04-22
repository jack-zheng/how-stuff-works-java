package q004;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		MyHandler handler = new MyHandler();
		saxParser.parse(Test.class.getResource("emp.xml").getFile(), handler);
		// Get Employees list
		List<Employee> empList = handler.getEmpList();
		// print employee information
		for (Employee emp : empList)
			System.out.println(emp);
	}
}
