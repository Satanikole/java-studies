
public class TestingNestedFor {
  public static void main(String[] args) {
	for (int m = 0; m <= 10; m++) {
		for ( int c = 0; c <=10; c++) {
			System.out.print(m * c);
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
