package com.siteinvokers;

class Amount1 {
	private String currency;
	private int Amount1;

	public Amount1(String currency, int Amount1) {
		super();
		this.currency = currency;
		this.Amount1 = Amount1;
	}

	@Override
	public String toString() {
		return "Amount1  " + +Amount1 + " " + currency;
	}

	public void add(Amount1 other) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(other.currency)) {
			throw new CurrenciesDoNotMatchException(
					"Currencies dont match " + other.currency + " and " + this.currency);
		}
		this.Amount1 = this.Amount1 + other.Amount1;
	}

}

// If u extend runtime wexception then we dont have to handle it
class CurrenciesDoNotMatchException extends Exception {

	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount1 amt1 = new Amount1("INR", 100);
		Amount1 amt2 = new Amount1("INRR", 200);

		amt1.add(amt2);
		System.out.println(amt1.toString());
	}

}
