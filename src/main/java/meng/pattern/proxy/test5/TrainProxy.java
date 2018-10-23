package meng.pattern.proxy.test5;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TrainProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		//设置创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	/**
	 * 拦截所有目标类方法的调用
	 * obj 目标类的实例
	 * method 目标方法的反射对象
	 * args 方法的参数
	 * proxy 代理类的实例
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		//代理类调用父类的方法
		System.out.println("动态代理中的业务处理···");
		proxy.invokeSuper(obj, args);
		System.out.println("业务处理结束");
		return null;
	}

}
