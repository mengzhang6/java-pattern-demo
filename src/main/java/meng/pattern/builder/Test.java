package meng.pattern.builder;

public class Test {

	public static void main(String[] args) {
		// 由建筑师和施工队去建造房子
		HouseBuilder builder = new BungalowHouseBuilder();
		HouseDirector director = new HouseDirector();
		director.makeHouse(builder);

		// 客户只需要获取到房子即可
		House house = builder.getHouse();
		System.out.println(house);
	}

}
