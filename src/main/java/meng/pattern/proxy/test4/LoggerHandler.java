package meng.pattern.proxy.test4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler implements InvocationHandler {

	private Object target;

	public LoggerHandler(Object target) {
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
		System.out.println("日志开始");
		method.invoke(target);
		System.out.println("日志结束");
		return null;
	}

}
