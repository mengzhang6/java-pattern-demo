package meng.pattern.builder;

public class ApartmentHouseBuilder implements HouseBuilder {

	private House house = new House();

	@Override
	public void makeFloor() {
		house.setFloor("公寓木板");
	}

	@Override
	public void makeWall() {
		house.setWall("公寓的墙");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("公寓楼顶");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
