package meng.pattern.template;

/**
 * 提神饮料的模板基类
 * 
 * @author mengzhang6
 *
 */
public abstract class RefreshBeverage {

	/**
	 * 制作饮料的模版方法（注意：使用final,不允许子类重写该方法） 封装了子类需要遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1 将水煮沸
		boilWater();
		// 步骤2 泡制饮料
		brew();
		// 步骤3 将饮料倒入杯中
		pourInCup();

		// 步骤4 加入调味料
		if (isCustomerWantsCondiments()) {
			addCondiments();
		}
	}

	/*
	 * Hook, 钩子函数，提供一个默认或空的实现 具体的子类可以自行决定是否挂钩以及如何挂钩 询问用户是否加入调料
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

	/*
	 * 基本方法，将水煮沸
	 */
	private void boilWater() {
		System.out.println("1:将水煮沸");
	}

	/*
	 * 基本方法，将饮料倒入杯中
	 */
	private void pourInCup() {
		System.out.println("3:将饮料倒入杯中");
	}

	/*
	 * 抽象的基本方法，泡制饮料
	 */
	protected abstract void brew();

	/*
	 * 抽象的基本方法, 加入调味料
	 */
	protected abstract void addCondiments();
}
