package q001.sup;

import q001.sup.sub.Class01;
import q001.sup.sub.Interface01;

public class Test {
	public static void main(String[] args) {
		System.out.println(Interface01.name);
		System.out.println((new Class01()).name);

		//System.out.println((new Class01()).num); 编译失败，class 中默认访问权限是 package level, 外层访问不了

		Interface01.methodWithStaticModifier();
	}
}
