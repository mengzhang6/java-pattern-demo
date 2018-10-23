package meng.pattern.cor.test;

import java.util.Random;

import meng.pattern.cor.Customer;
import meng.pattern.cor.handle.PriceHandleFactory;

/**
 * 责任链的测试类
 * 
 * @author mengzhang6
 *
 */
public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandle(PriceHandleFactory.getInstance());
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			customer.requestDiscount(random.nextFloat());
		}
	}

}
