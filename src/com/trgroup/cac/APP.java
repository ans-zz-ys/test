package com.trgroup.cac;

public class APP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new APP().test();
	}

	private void test() {
		for (int i = 0; i < 10000000; i++) {

			if (i % 11 == 0 && i % 9 == 8 && i % 7 == 6 && i % 5 == 4
					&& i % 3 == 2) {
				System.out.println(i);
				//break;
			}

		}
	}

}
