
public class TestingNestedLopps2 {

	public static void main(String[] args) {
		for (int r = 0; r <= 10; r++) {
			for ( int c = 0; c <=10; c++) {
				if(c > r) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
