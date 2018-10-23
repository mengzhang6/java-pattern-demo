package meng.pattern.simplefactotry;

/**
 * @author mengzhang6
 *
 */
public class FruitFactory {

	public static Fruit getApple() {
		return new Apple();
	}

	public static Fruit getBanana() {
		return new Banana();
	}

	public static Fruit getFruit(String fruitType) {

		try {
			if (fruitType.equalsIgnoreCase("apple")) {
				return Apple.class.newInstance();
			} else if (fruitType.equalsIgnoreCase("banana")) {
				return Banana.class.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Fruit getFruitByClassName(String className) {

		try {
			return (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
