package unl.cse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A collection of utilities that operate on {@link List} collections.
 *
 */
public class ListUtils {

	/**
	 * A random number/data generator, seeded with the current system time by
	 * default.
	 */
	public static final Random R = new Random();

	/**
	 * Prints the given <code>table</code> (a 2-dimensional array of integers) in a
	 * nicely formatted manner.
	 * 
	 * @param table
	 */
	public static void printTable(int table[][]) {
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
		return;
	}

	/**
	 * Creates a {@link List} filled with <code>size</code> random integers in the
	 * range [0, 100).
	 * 
	 * @param size
	 * @return
	 */
	public static List<Integer> generateRandomList(int size) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(R.nextInt(100));
		}
		return result;
	}

	/**
	 * Sums the elements in the given {@link List}
	 * 
	 * @param elements
	 * @return
	 */
	public static int getSum(List<Integer> elements) {
		int total = 0;
		for (Integer x : elements) {
			total += x;
		}
		return total;
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static double getMean(List<Integer> elements) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static int getMin(List<Integer> elements) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static int getIndexOfMin(List<Integer> elements) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static int getMax(List<Integer> elements) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static int getIndexOfMax(List<Integer> elements) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param elements
	 * @return
	 */
	public static List<Integer> filterThreshold(List<Integer> elements, int threshold) {
	}

	/**
	 * TODO: write documentation
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static int[][] createMultiplicationTable(int n, int m) {
	}
}
