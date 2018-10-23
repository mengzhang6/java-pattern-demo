package meng.pattern.strategy.newproduct;

import meng.pattern.strategy.Duck;
import meng.pattern.strategy.fly.FlyNoWay;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我是玩具鸭");
	}

	/**
	 * 覆写父类的方法，【没有组合方法好，如果忘记覆写会出现bug】
	 */
	public void quick() {
		System.out.println("我的叫声和真实世界的鸭子不同。");
	}
}
