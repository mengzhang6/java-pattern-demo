package meng.pattern.proxy.test5;

import java.util.Random;

public class Train {
	
	public void move() {
		try {
			System.out.println("火车行驶中···");
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
