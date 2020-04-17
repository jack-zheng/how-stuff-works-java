package q003;

public class Test {
  public static void main(String[] args) {
    System.out.println(Test.class.getResource("").getPath());
    System.out.println(Test.class.getClassLoader().getResource("").getPath());

	  System.out.println(Test.class.getResource("003Test.xml"));
  }
}
