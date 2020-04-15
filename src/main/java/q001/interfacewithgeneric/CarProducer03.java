package q001.interfacewithgeneric;

public class CarProducer03 implements MyProducer02<Car> {
	@Override
	public Car produce() {
		return new Car();
	}
}
