package meng.pattern.cor.employee;

import meng.pattern.cor.handle.PriceHandle;

/**
 * 经理，最高能够处理10%的请求
 * 
 * @author mengzhang6
 *
 */
public class Manager extends PriceHandle {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.10) {
			System.out.format("%s批准了%.2f的折扣%n", this.getClass().getSimpleName(),
					discount);
		} else {
			// 交给上一级进行审核
			successor.processDiscount(discount);
		}
	}

}
