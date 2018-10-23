package meng.pattern.builder;

public interface HouseBuilder {

	public void makeFloor();

	public void makeWall();

	public void makeHouseTop();
	
	public House getHouse();

}
