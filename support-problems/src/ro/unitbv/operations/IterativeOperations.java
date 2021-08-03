package ro.unitbv.operations;

import java.util.Arrays;
import java.util.List;

/**
 * @author PF065157
 *
 */
public class IterativeOperations {

	public static void main(String args[]) {
		doWhileOperation1();
		doWhileOperation2();
		whileOperation();
		forOperation1();
		forOperation2();
	}

	/**
	 * Iterate over array and print values in console
	 */
	public static void doWhileOperation1() {
		int[] values = { 1, 2, 3, 4, 6, 2, 8 };

		int index = 0;
		do {
			System.out.print(values[index] + ", ");
			index++;
		} while (index < values.length);
		System.out.println();
	}

	public static void doWhileOperation2() {
		int[] values = {};
		int index = 0;
		if (index < values.length) {
			do {
				System.out.print(values[index] + ", ");
				index++;
			} while (index < values.length);
		}
	}
	
	public static void whileOperation() {
		int[] values = {3};
		int index = 0;
		while (index < values.length) {
				System.out.print(values[index] + ", ");
				index++;
		}
		System.out.println();
	}
	
	public static void forOperation1() {
		int[] values = { 1, 2, 3, 4, 6, 2, 8 };
		
		for(int i =0; i<values.length;i++) {
			System.out.print(values[i]+", ");
		}
		System.out.println();
	}
	
	public static void forOperation2() {
		int[] values = { 1, 2, 3, 4, 6, 2, 8 };
		
		int i =0;
		for(; ;) {
			if(i<values.length) {
				break;
			}
			System.out.print(values[i]+", ");
			i++;
		}
		System.out.println();
	}
	
	public static void forEach() {
		int[] values = { 1, 2, 3, 4, 6, 2, 8 };
		// for-each
		for(int val: values) {
			System.out.print(val+ ", ");
		}
	}
	
	/**
	 * In Java8 +
	 */
	public static void forEachFunctional() {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 6, 2, 8 ); 		
		values.forEach(value-> System.out.print(value+ ", "));
		
	}
}
