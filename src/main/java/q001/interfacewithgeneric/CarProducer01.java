package q001.interfacewithgeneric;

public class CarProducer01 implements MyProducer01 {
	@Override
	public Object produce() {
		return new Car();
	}
}
