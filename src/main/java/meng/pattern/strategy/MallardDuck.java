package meng.pattern.strategy;

import meng.pattern.strategy.fly.FlyWithWin;

/**
 * 绿脖子鸭
 * 
 * @author mengzhang6
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我是绿脖子鸭");
	}

}
