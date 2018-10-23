package meng.pattern.proxy.test5;

public class Main {

	public static void main(String[] args) {
		TrainProxy proxy = new TrainProxy();
		Train train = (Train)proxy.getProxy(Train.class);
		train.move();
	}

}
