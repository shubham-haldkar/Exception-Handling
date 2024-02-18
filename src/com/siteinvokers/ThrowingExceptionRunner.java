package com.siteinvokers;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Amount  " + +amount + " " + currency;
	}

	public void add(Amount other) {
		if (!this.currency.equals(other.currency)) {
			throw new RuntimeException("Currencies does not match : ");
		}
		this.amount = this.amount + other.amount;
	}

}

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		Amount amt1 = new Amount("INR", 100);
		Amount amt2 = new Amount("INRR", 200);

		amt1.add(amt2);
		System.out.println(amt1.toString());
	}
}
