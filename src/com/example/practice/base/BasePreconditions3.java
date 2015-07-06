package com.example.practice.base;

import java.math.BigDecimal;
import java.util.Currency;

import static com.google.common.base.Preconditions.*;

public class BasePreconditions3 {

	public class Monkey {
		private BigDecimal amount = null;
		private Currency currency = null;;
		
		public Monkey(BigDecimal amount, Currency currency) {
			/*
			this.amount = Preconditions.checkNotNull(amount, "amount must not be null");
			this.currency = Preconditions.checkNotNull(currency, "currency must not be null");
			Preconditions.checkArgument(amount.signum() >= 0, "amount must be positive: %s", amount);
			*/
			this.amount = checkNotNull(amount, "amount must not be null");
			this.currency = checkNotNull(currency, "currency must not be null");
			checkArgument(amount.signum() >= 0, "amount must be positive: %s", amount);

		}
	}



}
