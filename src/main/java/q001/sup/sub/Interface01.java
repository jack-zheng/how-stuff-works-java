package q001.sup.sub;

public interface Interface01 {
	String name = "Interface01";

	void sayHello();

	default void methodWithImpl() {
		System.out.println("call method with Impl.");
	}

	static void methodWithStaticModifier() {
		System.out.println("call method with static modifier.");
	}
}
