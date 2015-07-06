package com.example.practice.base;

import java.math.BigDecimal;
import java.util.Currency;

import com.google.common.base.Preconditions;

public class BasePreconditions {
	public class Monkey {
		private BigDecimal amount = null;
		private Currency currency = null;;
		
		public Monkey(BigDecimal amount, Currency currency) {
			/*
			if (amount == null) {
				throw new NullPointerException("amount must not be null");
			}
			
			if (currency == null) {
				throw new NullPointerException("currency must not be null");
			}
			
			if (amount.signum() < 0) {
				throw new IllegalArgumentException("amount must be positive");
			}
			*/
			Preconditions.checkNotNull(amount, "amount must not be null");
			Preconditions.checkNotNull(currency, "currency must not be null");
			Preconditions.checkArgument(amount.signum() >= 0, "amount must be positive: %s", amount);
			
			this.amount = amount;
			this.currency = currency;
		}
	}
}
