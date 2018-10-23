package meng.pattern.builder;

public class BungalowHouseBuilder implements HouseBuilder {

	private House house = new House();

	@Override
	public void makeFloor() {
		house.setFloor("平房木板");
	}

	@Override
	public void makeWall() {
		house.setWall("平房的墙");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("平房楼顶");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
