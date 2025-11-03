package com.banking.service;

import com.banking.model.Transaction;
import java.math.BigDecimal;
import java.util.List;

public interface TransactionService {

    Transaction deposit(String accountNumber, BigDecimal amount);

    Transaction withdraw(String accountNumber, BigDecimal amount);

    Transaction transfer(String fromAccountNumber, String toAccountNumber, BigDecimal amount);

	List<Transaction> getTransactionsForAccount(String accountNumber);
}
