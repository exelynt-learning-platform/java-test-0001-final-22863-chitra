
public class JAVA_TEST_0001 {
	public static void main(String[] args) {
		HollowDiamond(5);
	}

	public static void HollowDiamond(int n) {
		StringBuilder sb = new StringBuilder();

		// Top Half 
		for (int i = 1; i <= n; i++) {
			sb.append(generateRow(i, n));
		}

		// Bottom Half
		for (int i = n - 1; i >= 1; i--) {
			sb.append(generateRow(i, n));
		}

		// Single print for the entire pattern
		System.out.print(sb.toString());
	}

	
	static String generateRow(int i, int n) {
		StringBuilder row = new StringBuilder();

		// spaces
		for (int j = 1; j <= n - i; j++) {
			row.append(" ");
		}

		// Add first star
		row.append("*");

		// Add inner spaces and second star
		if (i > 1) {
			for (int j = 1; j <= (2 * i - 3); j++) {
				row.append(" ");
			}
			row.append("*");
		}

		row.append("\n");
		return row.toString();
	}
}
