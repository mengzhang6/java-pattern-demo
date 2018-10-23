package meng.pattern.cor;

import meng.pattern.cor.handle.PriceHandle;

/**
 * 客户
 * 
 * @author mengzhang6
 *
 */
public class Customer {

	/**
	 * 持有"价格处理人"的引用,并不特指哪一个层级的处理人
	 */
	private PriceHandle priceHandle;

	public void setPriceHandle(PriceHandle priceHandle) {
		this.priceHandle = priceHandle;
	}

	/**
	 * 发起请求
	 * 
	 * @param discount
	 */
	public void requestDiscount(float discount) {
		priceHandle.processDiscount(discount);
	}
}
