package meng.pattern.factotry;

public class AppleFctory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
