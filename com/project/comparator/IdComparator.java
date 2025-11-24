package com.project.comparator;
import java.util.Comparator;

import com.project.account_management.BankAccount;

public class IdComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount a1, BankAccount a2) {
        return a1.getAccountId().compareTo(a2.getAccountId());
    }
}
