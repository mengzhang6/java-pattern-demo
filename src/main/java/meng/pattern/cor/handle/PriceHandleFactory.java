package meng.pattern.cor.handle;

import meng.pattern.cor.employee.CEO;
import meng.pattern.cor.employee.Director;
import meng.pattern.cor.employee.Manager;
import meng.pattern.cor.employee.President;
import meng.pattern.cor.employee.Sales;

/**
 * 
 * @author mengzhang6
 *
 */
public class PriceHandleFactory {
	/**
	 * 创建责任链
	 * 
	 * @return
	 */
	public static PriceHandle getInstance() {
		PriceHandle sales = new Sales();
		PriceHandle manager = new Manager();
		PriceHandle director = new Director();
		PriceHandle president = new President();
		PriceHandle ceo = new CEO();
		sales.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(president);
		president.setSuccessor(ceo);
		return sales;
	}
}
