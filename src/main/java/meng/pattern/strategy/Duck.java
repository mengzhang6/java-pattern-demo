package meng.pattern.strategy;

import meng.pattern.strategy.fly.FlyingStragety;

/**
 * 鸭子的基类
 * 
 * @author mengzhang6
 *
 */
public abstract class Duck {

	/**
	 * 组合，持有飞行策略的接口
	 */
	private FlyingStragety flyingStragety;

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}

	/**
	 * 
	 */
	public void fly() {
		flyingStragety.performFly();
	}

	public abstract void display();

	public void quack() {
		System.out.println("嘎嘎嘎···");
	}

}
