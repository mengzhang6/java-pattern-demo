package meng.pattern.cor.handle;


/**
 * 价格处理人，负责处理客户折扣的请求
 * 
 * @author mengzhang6
 *
 */
public abstract class PriceHandle {

	// 后继 ，用于传递请求
	protected PriceHandle successor;

	public void setSuccessor(PriceHandle successor) {
		this.successor = successor;
	}

	public abstract void processDiscount(float discount);

}
