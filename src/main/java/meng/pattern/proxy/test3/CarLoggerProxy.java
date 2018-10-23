package meng.pattern.proxy.test3;

/**
 * 使用聚合方式实现静态代理(相对于继承方式，建议优先使用聚合方式)
 */
public class CarLoggerProxy implements Moveable {

	private Moveable moveable;

	public CarLoggerProxy(Moveable moveable) {
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("日志开始");
		moveable.move();
		System.out.println("日志结束");
	}

}
