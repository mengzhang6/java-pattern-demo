package meng.pattern.strategy;

import meng.pattern.strategy.fly.FlyWithWin;

/**
 * 红头鸭
 * 
 * @author mengzhang6
 *
 */
public class ReadHeadDuck extends Duck {

	public ReadHeadDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我是红头鸭。");
	}

}
