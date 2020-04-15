package q001.interfacewithgeneric;

public class CarProducer02<T> implements MyProducer02<T> {
	@Override
	public T produce() {
		return (T) new Car();
	}
}
