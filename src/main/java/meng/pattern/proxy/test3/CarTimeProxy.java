package meng.pattern.proxy.test3;

/**
 * 使用聚合方式实现静态代理(相对于继承方式，建议优先使用聚合方式)
 */
public class CarTimeProxy implements Moveable {

	private Moveable moveable;

	public CarTimeProxy(Moveable moveable) {
		this.moveable = moveable;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶:" + startTime);
		moveable.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶:" + endTime);
		System.out.println("汽车行驶时间：" + (endTime - startTime) + "ms");
	}

}
