package meng.pattern.abstractfactotry;


public class Test {

	public static void main(String[] args) {
		Fruit northApple = new NorthFruitFactory().getApple();
		northApple.get();
	}

}
