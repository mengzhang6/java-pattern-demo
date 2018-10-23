package meng.pattern.proxy.test2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Moveable proxy = new CarProxy(car);
		proxy.move();
	}

}
