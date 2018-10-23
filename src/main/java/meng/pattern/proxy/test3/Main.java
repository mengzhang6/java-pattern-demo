package meng.pattern.proxy.test3;

public class Main {

	public static void main(String[] args) {
		// 先记录日志，再记录时间
		// Car car = new Car();
		// Moveable timeProxy = new CarTimeProxy(car);
		// Moveable loggerProxy = new CarLoggerProxy(timeProxy);
		// loggerProxy.move();

		// 先记录时间，再记录日志
		Car car = new Car();
		Moveable loggerProxy = new CarLoggerProxy(car);
		Moveable timeProxy = new CarTimeProxy(loggerProxy);
		timeProxy.move();
	}

}
