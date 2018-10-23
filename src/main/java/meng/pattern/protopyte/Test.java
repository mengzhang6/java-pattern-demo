package meng.pattern.protopyte;

/**
 * 
 * @author mengzhang6
 *
 */
public class Test {

	public static void main(String[] args) {
		Person person1 = new Person(1, "mengzhang6", "male");
		Address address = new Address("安徽省", "亳州市", "涡阳县");
		person1.setAddress(address);

		// 与person1指向同一块内存
		Person person2 = person1;
		System.out.println(person2 == person1);
		System.out.println(person1.toString());

		// 克隆出一个新的对象,浅度克隆
		Person person3 = person1.clone();
		System.out.println(person3 == person1);
		person3.setId(2);
		System.out.println(person3.toString());
		System.out.println("");

		// 当person1所持有的Address对象发生改变时
		address.setCounty("蒙城县");
		System.out.println(person1.toString());
		// 克隆对象所持有的Address对象也发生了改变
		// 这是因为克隆时仅仅克隆了引用的地址，并没有重现创建一个Address对象
		// 这里体现了浅度克隆
		System.out.println(person3.toString());
		System.out.println();

		// 克隆出一个新的对象,深度克隆
		Person person4 = person1.cloneDeep();
		// 当person1所持有的Address对象再次发生改变时
		address.setCounty("利辛县");
		System.out.println(person1.toString());
		// 深度克隆出的对象所持有的Address对象不会发生改变
		System.out.println(person4.toString());
	}

}
