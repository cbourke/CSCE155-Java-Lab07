package unl.cse;

import java.util.List;

public class ListUtilsDemo {

	public static void main(String[] args) {
		int n = 10;
		List<Integer> list = ListUtils.generateRandomList(n);
		System.out.println(list);

		int sum = ListUtils.getSum(list);
		System.out.printf("sum of elements = %d\n", sum);

		//use this file to do ad-hoc testing of your methods 

	}

}
