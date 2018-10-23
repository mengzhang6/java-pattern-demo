package meng.pattern.template;

public class Test {

	public static void main(String[] args) {
		System.out.println("制备咖啡...");
		RefreshBeverage coffee = new Coffee();
		coffee.prepareBeverageTemplate();
		System.out.println("咖啡好了！");
		
		System.out.println("******************************************");
		
		System.out.println("制备茶...");
		RefreshBeverage tea = new GreenTea();
		tea.prepareBeverageTemplate();
		System.out.println("茶好了！");
	}

}
