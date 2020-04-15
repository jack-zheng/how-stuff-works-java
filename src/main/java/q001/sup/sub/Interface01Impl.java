package q001.sup.sub;

public class Interface01Impl implements Interface01, Interface02 {
	@Override
	public void sayHello() {
		System.out.println("Hello from Interface01Impl.");
	}

	@Override
	public void methodWithImpl() {
		System.out.println("call override method.");
	}

	public static void main(String[] args) {
		Interface01 impl = new Interface01Impl();

		impl.sayHello();
		impl.methodWithImpl();

		Interface01.methodWithStaticModifier();
	}
}
