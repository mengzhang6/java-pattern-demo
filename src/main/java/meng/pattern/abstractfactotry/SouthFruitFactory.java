package meng.pattern.abstractfactotry;

public class SouthFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		return new SouthApple();
	}

	@Override
	public Fruit getBanana() {
		return null;
	}

}
