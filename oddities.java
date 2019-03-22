import java.util.*;

public class oddities {

	public static void main(String[] args) {
		int testcase = args[0];
		for (int i = 0; i < testcase; i++) {
			int numberToCheck = args[i];
			boolean isEven = false;

			int k = 0;
			while (args[i] < 2 * k)
				k++;
			if (args[i] == 2 * k)
				System.out.println(args[i] + " is even");
			else
				System.out.println(args[i] + " is odd");

		} //for i
	} //main

} //Oddities

