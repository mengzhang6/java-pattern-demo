package meng.pattern.cor.employee;

import meng.pattern.cor.handle.PriceHandle;

/**
 * CEO，最高能够处理50%的请求
 * 
 * @author mengzhang6
 *
 */
public class CEO extends PriceHandle {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.50) {
			System.out.format("%s批准了%.2f的折扣%n", this.getClass().getSimpleName(),
					discount);
		} else {
			System.out.format("%s拒接了该请求%n", this.getClass().getSimpleName());
		}
	}

}
