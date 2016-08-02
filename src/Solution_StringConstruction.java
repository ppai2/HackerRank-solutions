import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_StringConstruction {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=0; i<n; i++) {
			String input = scan.next();
			int cost = checkCost(input);
			System.out.println(cost);
		}
	}

	private static int checkCost(String input) {
		int cost = 0;
		Set<Character> buffer = new HashSet<Character>();
		StringBuilder result = new StringBuilder();
		char[] charArr = input.toCharArray();
		for (char ch : charArr) {
			if (buffer.contains(ch)) {
				result.append(ch);
			} else {
				buffer.add(ch);
				result.append(ch);
				cost += 1;
			}
		}
		return cost;
	}

}
