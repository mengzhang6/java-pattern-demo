package meng.pattern.abstractfactotry;

public class NorthFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		return new NorthApple();
	}

	@Override
	public Fruit getBanana() {
		return null;
	}

}
