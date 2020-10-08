package cse360assignment02;

public class Main {
	public static void main(String[] args)
	{
		AddingMachine test = new AddingMachine();
		test.add(2);
		test.subtract(3);
		test.add(5);
		System.out.println(test);
		System.out.println(test.getTotal());
		test.clear();
		System.out.println(test);
		System.out.println(test.getTotal());
		test.add(2);
		test.subtract(3);
		test.add(1010);
		System.out.println(test);
		System.out.println(test.getTotal());
	}

}
