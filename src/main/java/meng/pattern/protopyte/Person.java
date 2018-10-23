package meng.pattern.protopyte;

/**
 * 原型
 * 
 * @author mengzhang6
 *
 */
public class Person implements Cloneable {

	private int id;
	private String name;
	private String sex;

	private Address address;

	public Person() {
	}

	public Person(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 对原型对象进行克隆，浅度克隆
	 */
	public Person clone() {
		try {
			// 使用Cloneable接口的克隆方法
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 深度克隆
	 * 
	 * @return
	 */
	public Person cloneDeep() {
		try {
			Person person = (Person) super.clone();
			Address address = person.getAddress().clone();
			person.setAddress(address);
			return person;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", address=" + address.toString() + "]";
	}

}
