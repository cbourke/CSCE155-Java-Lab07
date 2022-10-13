package unl.cse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

public class ListUtilsTests {

	/**
	 * Default tolerance for differences in floating point values.
	 */
	public static final double DELTA = 0.0001;

	/**
	 * Test Lists
	 */
	public static final List<Integer> TEST_LIST_001 = List.of(8, 3, 5, 2, 1, 3, 9, 1);
	public static final List<Integer> TEST_LIST_002 = List.of(-8, -3, -5, -2, -1, -3, -9, -1);
	public static final List<Integer> TEST_LIST_003 = List.of(100, 0, -100);
	public static final List<Integer> TEST_LIST_004 = List.of(-100, 0, 100);
	public static final List<Integer> TEST_LIST_005 = List.of(1, 2, 3, 4, 5, 6, 7, 8);

	//  TEST_LIST_001
	
	/**
	 * Tests the {@link ListUtils#getMean()} method using {@link #TEST_LIST_001}
	 * with a {@link #DELTA} tolerance.
	 */
	@Test
	public void testGetMean001() {

		double expected = 4.0;
		double actual = ListUtils.getMean(TEST_LIST_001);
		assertEquals(expected, actual, DELTA);
	}

	/**
	 * Tests the {@link ListUtils#getMin()} method using {@link #TEST_LIST_001}
	 * list.
	 */
	@Test
	public void testGetMin001() {

		int expected = 1;
		int actual = ListUtils.getMin(TEST_LIST_001);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_001} list.
	 */
	@Test
	public void testGetIndexOfMin001() {

		int expected01 = 4;
		int expected02 = 7;
		int actual = ListUtils.getIndexOfMin(TEST_LIST_001);
		assertTrue(actual == expected01 || actual == expected02);
	}

	/**
	 * Tests the {@link ListUtils#getMax()} method using {@link #TEST_LIST_001}
	 * list.
	 */
	@Test
	public void testGetMax001() {

		int expected = 9;
		int actual = ListUtils.getMax(TEST_LIST_001);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_001} list.
	 */
	@Test
	public void testGetIndexOfMax001() {

		int expected = 6;
		int actual = ListUtils.getIndexOfMax(TEST_LIST_001);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#filterThreshold()} method using
	 * {@link #TEST_LIST_001} list.
	 */
	@Test
	public void testFilterThreshold001() {

		List<Integer> expected = List.of(8, 5, 9);
		List<Integer> actual = ListUtils.filterThreshold(TEST_LIST_001, 5);
		assertEquals(expected, actual);
	}
	
	//  TEST_LIST_002
	
	/**
	 * Tests the {@link ListUtils#getMean()} method using {@link #TEST_LIST_002}
	 * with a {@link #DELTA} tolerance.
	 */
	@Test
	public void testGetMean002() {

		double expected = -4.0;
		double actual = ListUtils.getMean(TEST_LIST_002);
		assertEquals(expected, actual, DELTA);
	}

	/**
	 * Tests the {@link ListUtils#getMin()} method using {@link #TEST_LIST_002}
	 * list.
	 */
	@Test
	public void testGetMin002() {

		int expected = -9;
		int actual = ListUtils.getMin(TEST_LIST_002);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_002} list.
	 */
	@Test
	public void testGetIndexOfMin002() {

		int expected = 6;
		int actual = ListUtils.getIndexOfMin(TEST_LIST_002);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getMax()} method using {@link #TEST_LIST_002}
	 * list.
	 */
	@Test
	public void testGetMax002() {

		int expected = -1;
		int actual = ListUtils.getMax(TEST_LIST_002);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_002} list.
	 */
	@Test
	public void testGetIndexOfMax002() {

		int expected = 4;
		int actual = ListUtils.getIndexOfMax(TEST_LIST_002);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#filterThreshold()} method using
	 * {@link #TEST_LIST_002} list.
	 */
	@Test
	public void testFilterThreshold002() {

		List<Integer> expected = List.of(-3, -5, -2, -1, -3, -1);
		List<Integer> actual = ListUtils.filterThreshold(TEST_LIST_002, -5);
		assertEquals(expected, actual);
	}
	
	//  TEST_LIST_003
	
	/**
	 * Tests the {@link ListUtils#getMean()} method using {@link #TEST_LIST_003}
	 * with a {@link #DELTA} tolerance.
	 */
	@Test
	public void testGetMean003() {

		double expected = 0.0;
		double actual = ListUtils.getMean(TEST_LIST_003);
		assertEquals(expected, actual, DELTA);
	}

	/**
	 * Tests the {@link ListUtils#getMin()} method using {@link #TEST_LIST_003}
	 * list.
	 */
	@Test
	public void testGetMin003() {

		int expected = -100;
		int actual = ListUtils.getMin(TEST_LIST_003);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_003} list.
	 */
	@Test
	public void testGetIndexOfMin003() {

		int expected = 2;
		int actual = ListUtils.getIndexOfMin(TEST_LIST_003);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getMax()} method using {@link #TEST_LIST_003}
	 * list.
	 */
	@Test
	public void testGetMax003() {

		int expected = 100;
		int actual = ListUtils.getMax(TEST_LIST_003);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_003} list.
	 */
	@Test
	public void testGetIndexOfMax003() {

		int expected = 0;
		int actual = ListUtils.getIndexOfMax(TEST_LIST_003);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#filterThreshold()} method using
	 * {@link #TEST_LIST_003} list.
	 */
	@Test
	public void testFilterThreshold003() {

		List<Integer> expected = List.of(100, 0);
		List<Integer> actual = ListUtils.filterThreshold(TEST_LIST_003, 0);
		assertEquals(expected, actual);
	}
	
	//  TEST_LIST_004
	
	/**
	 * Tests the {@link ListUtils#getMean()} method using {@link #TEST_LIST_004}
	 * with a {@link #DELTA} tolerance.
	 */
	@Test
	public void testGetMean004() {

		double expected = 0.0;
		double actual = ListUtils.getMean(TEST_LIST_004);
		assertEquals(expected, actual, DELTA);
	}

	/**
	 * Tests the {@link ListUtils#getMin()} method using {@link #TEST_LIST_004}
	 * list.
	 */
	@Test
	public void testGetMin004() {

		int expected = -100;
		int actual = ListUtils.getMin(TEST_LIST_004);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_004} list.
	 */
	@Test
	public void testGetIndexOfMin004() {

		int expected = 0;
		int actual = ListUtils.getIndexOfMin(TEST_LIST_004);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getMax()} method using {@link #TEST_LIST_004}
	 * list.
	 */
	@Test
	public void testGetMax004() {

		int expected = 100;
		int actual = ListUtils.getMax(TEST_LIST_004);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_004} list.
	 */
	@Test
	public void testGetIndexOfMax004() {

		int expected = 2;
		int actual = ListUtils.getIndexOfMax(TEST_LIST_004);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#filterThreshold()} method using
	 * {@link #TEST_LIST_004} list.
	 */
	@Test
	public void testFilterThreshold004() {

		List<Integer> expected = List.of(0, 100);
		List<Integer> actual = ListUtils.filterThreshold(TEST_LIST_004, 0);
		assertEquals(expected, actual);
	}
	
	//  TEST_LIST_005
	
	/**
	 * Tests the {@link ListUtils#getMean()} method using {@link #TEST_LIST_005}
	 * with a {@link #DELTA} tolerance.
	 */
	@Test
	public void testGetMean005() {

		double expected = 4.5;
		double actual = ListUtils.getMean(TEST_LIST_005);
		assertEquals(expected, actual, DELTA);
	}

	/**
	 * Tests the {@link ListUtils#getMin()} method using {@link #TEST_LIST_005}
	 * list.
	 */
	@Test
	public void testGetMin005() {

		int expected = 1;
		int actual = ListUtils.getMin(TEST_LIST_005);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_005} list.
	 */
	@Test
	public void testGetIndexOfMin005() {

		int expected = 0;
		int actual = ListUtils.getIndexOfMin(TEST_LIST_005);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getMax()} method using {@link #TEST_LIST_005}
	 * list.
	 */
	@Test
	public void testGetMax005() {

		int expected = 8;
		int actual = ListUtils.getMax(TEST_LIST_005);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#getIndexOfMin()} method using
	 * {@link #TEST_LIST_005} list.
	 */
	@Test
	public void testGetIndexOfMax005() {

		int expected = 7;
		int actual = ListUtils.getIndexOfMax(TEST_LIST_005);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#filterThreshold()} method using
	 * {@link #TEST_LIST_005} list.
	 */
	@Test
	public void testFilterThreshold005() {

		List<Integer> expected = List.of(7, 8);
		List<Integer> actual = ListUtils.filterThreshold(TEST_LIST_005, 7);
		assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ListUtils#createMultiplicationTable()} method.
	 */
	@Test
	public void testCreateMultiplicationTable001() {

		int[][] expected = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 2, 4, 6, 8, 10 }, 
				{ 3, 6, 9, 12, 15 } 
		};
		int[][] actual = ListUtils.createMultiplicationTable(3, 5);
		assertTrue(Arrays.deepEquals(expected, actual));
	}
	
	/**
	 * Tests the {@link ListUtils#createMultiplicationTable()} method.
	 */
	@Test
	public void testCreateMultiplicationTable002() {

		int[][] expected = { 
				{ 1, 2, 3 }, 
				{ 2, 4, 6 }, 
				{ 3, 6, 9 },
				{ 4, 8, 12 },
				{ 5, 10, 15 }
		};
		int[][] actual = ListUtils.createMultiplicationTable(5, 3);
		assertTrue(Arrays.deepEquals(expected, actual));
	}
	
	/**
	 * Tests the {@link ListUtils#createMultiplicationTable()} method.
	 */
	@Test
	public void testCreateMultiplicationTable003() {

		int[][] expected = { 
				{ 1, 2, 3 }, 
				{ 2, 4, 6 }, 
				{ 3, 6, 9 }
		};
		int[][] actual = ListUtils.createMultiplicationTable(3, 3);
		assertTrue(Arrays.deepEquals(expected, actual));
	}
	
	/**
	 * Tests the {@link ListUtils#createMultiplicationTable()} method.
	 */
	@Test
	public void testCreateMultiplicationTable004() {

		int[][] expected = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 2, 4, 6, 8, 10 }, 
				{ 3, 6, 9, 12, 15 },
				{ 4, 8, 12, 16, 20 },
				{ 5, 10, 15, 20, 25 }
		};
		int[][] actual = ListUtils.createMultiplicationTable(5, 5);
		assertTrue(Arrays.deepEquals(expected, actual));
	}

}
