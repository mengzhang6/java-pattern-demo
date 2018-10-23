package meng.pattern.proxy.test4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * proxy 被代理对象 method 被代理对象的方法 args 方法的参数
	 * 
	 * 返回值：方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("开始时间:" + startTime);
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("结束时间:" + endTime);
		System.out.println("总时间：" + (endTime - startTime) + "ms");
		
		return null;
	}

}
