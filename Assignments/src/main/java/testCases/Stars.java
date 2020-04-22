package testCases;

import org.testng.annotations.Test;

public class Stars {
	int num = 7;
	int tri = 4;

	@Test(priority = 2)
	public void stars() {
		System.out.println();
		System.out.print("&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		for (int i = num; i >= 0; i--) {
			System.out.println();
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
		//	System.out.println();
		}
	}

	

	@Test(priority = 1)
	public void Triangle() {
		
		for (int k = 0; k <= tri; k++) {
			System.out.println();
			for (int l = tri - k; l > 0; l--) {
				System.out.print(" ");
			}
			for (int m = (2 * k) + 1; m > 0; m--) {
				System.out.print("*");
			}
		}
	}
}
