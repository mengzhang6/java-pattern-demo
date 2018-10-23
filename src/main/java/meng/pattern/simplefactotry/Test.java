package meng.pattern.simplefactotry;

public class Test {

	public static void main(String[] args) {
		Fruit apple = FruitFactory.getFruit("apple");
		apple.get();
		
		Fruit banana = FruitFactory.getFruitByClassName("meng.factotry.simple.Banana");
		banana.get();
	}

}
