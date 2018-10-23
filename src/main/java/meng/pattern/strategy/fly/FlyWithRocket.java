package meng.pattern.strategy.fly;

public class FlyWithRocket implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("用火箭去飞行，装逼中···");
	}

}
