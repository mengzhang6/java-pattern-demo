package meng.pattern.strategy.fly;

public class FlyNoWay implements FlyingStragety{

	@Override
	public void performFly() {
		System.out.println("我不会飞行。");
	}

}
