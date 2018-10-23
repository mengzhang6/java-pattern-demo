package meng.pattern.proxy.test1;

/**
 * 使用继承方式实现静态代理
 */
public class CarProxy extends Car {

	@Override
	public void move() {
		System.out.println("汽车开始行驶");
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶");
		System.out.println("汽车行驶时间：" + (endTime - startTime) + "ms");
	}
}