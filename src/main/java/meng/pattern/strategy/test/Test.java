package meng.pattern.strategy.test;

import meng.pattern.strategy.Duck;
import meng.pattern.strategy.ReadHeadDuck;

/**
 * <pre>
 * 	策略模式的启示：
 * 		多用组合(持有某个类的引用)
 * 		少用继承(extends,implements)
 * </pre>
 * 
 * @author mengzhang6
 *
 */
public class Test {

	public static void main(String[] args) {
		Duck readHeadDuck = new ReadHeadDuck();
		readHeadDuck.display();
		readHeadDuck.fly();
		readHeadDuck.quack();
	}

}
