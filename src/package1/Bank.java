package package1;

public class Bank {
	private BankAccount[] accounts;

	public Bank() {
		accounts = new BankAccount[100];
	}

	private double summationOfBalances() {
		/* Implement */
	}

	private double smallestBalance() {
		/* Implement */
	}

	private void sortAccountsByName() {
		
	}

	private static void swap(int[] array, int a, int b) {
		if (a >= array.length || b >= array.length) {
			return;
		}
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
