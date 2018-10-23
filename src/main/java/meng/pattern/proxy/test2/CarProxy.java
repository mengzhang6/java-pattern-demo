package meng.pattern.proxy.test2;

/**
 * 使用聚合方式实现静态代理(相对于继承方式，建议优先使用聚合方式)
 */
public class CarProxy implements Moveable {

	private Moveable moveable;

	public CarProxy(Moveable moveable) {
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("汽车开始行驶");
		long startTime = System.currentTimeMillis();
		moveable.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶");
		System.out.println("汽车行驶时间：" + (endTime - startTime) + "ms");
	}

}
