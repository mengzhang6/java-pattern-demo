package meng.pattern.factotry;

public class Test {

	public static void main(String[] args) {
		FruitFactory appleFactory = new AppleFctory();
		Fruit apple = appleFactory.getFruit();
		apple.get();
	}

}
