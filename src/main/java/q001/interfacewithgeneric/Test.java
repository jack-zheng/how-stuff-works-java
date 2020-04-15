package q001.interfacewithgeneric;

public class Test {
	public static void main(String[] args) {
		MyProducer01 myProducer01 = new CarProducer01();
		Car car01 = (Car) myProducer01.produce();

		MyProducer02<Car> myProducer02 = new CarProducer02<>();
		Car car02 = myProducer02.produce();

		MyProducer02<String> myProducer02_2 = new CarProducer02<>();
		//String car02_2 = myProducer02_2.produce(); // throw java.lang.ClassCastException

		MyProducer02<Car> myProducer02_3 = new CarProducer03();
		Car car03 = myProducer02_3.produce();
	}
}
