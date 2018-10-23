package meng.pattern.proxy.test2;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		
		try {
			System.out.println("汽车行驶中···");
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
