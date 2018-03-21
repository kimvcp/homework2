import java.util.ArrayList;
import java.util.List;

/**
 * A class of studying how to use recursion.
 * 
 * @author Vichaphol Thamsuthikul
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list == null || list.size() <= 1)
			return list;
		List<?> rest = list.subList(1, list.size());
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else
			unique(rest);

		return list;

	}

	/**
	 * Finding the value of Fibonacci number.
	 * 
	 * @param number
	 * @return the value of fibonacci number
	 */
	public static int fibonacci(int n) {
		// the base case
		if (n <= 0)
			return 0;
		if (n <= 2)
			return 1;
		// the recursive step
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int fibonacci2(int n) {
		return fibonaciiHelper(0, 1, n);
	}

	/**
	 * Helper method for Fibonacci.
	 * 
	 * @param start
	 *            value
	 * @param next
	 *            value
	 * @param position
	 * @return
	 */
	private static int fibonaciiHelper(int start, int next, int position) {
		if (position <= 0)
			return start;
		return fibonaciiHelper(next, start + next, position - 1);
	}

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println(unique(list));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci2(48));
	}
}
