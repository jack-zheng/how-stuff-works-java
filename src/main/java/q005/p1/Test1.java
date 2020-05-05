package q005.p1;

import q005.p2.Son2;

public class Test1 {
	public static void main(String[] args) {
		Son1 s1 = new Son1();
		s1.f();
		// s1.clone(); // Compile Err

		Son2 s2 = new Son2();
		s2.f();
		// s2.clone(); // Compile err
	}
}
