public class Bindu {

	public static void main(String[] args) {
		String test = "123abc-45def";
		String[] testRes = test.trim().split("[a-zA-Z]+");
		int result = 0;
		for (int i=0; i<testRes.length; i++) {
			result += Integer.parseInt(testRes[i]);
		}
		System.out.println(result);
	}
}
