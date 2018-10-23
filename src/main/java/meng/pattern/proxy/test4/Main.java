package meng.pattern.proxy.test4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

	/**
	 * JDK动态代理实现实例
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		// loader 类加载器
		// interfaces 实现的接口
		// h InvocationHandler实例
		ClassLoader loader = car.getClass().getClassLoader();
		Class<?>[] interfaces = car.getClass().getInterfaces();
		InvocationHandler h = new TimeHandler(car);
//		InvocationHandler h = new LoggerHandler(car);
		Moveable moveable = (Moveable) Proxy.newProxyInstance(loader,
				interfaces, h);
		moveable.move();
	}
}
