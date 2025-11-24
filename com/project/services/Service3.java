package com.project.services;
import java.util.List;

import com.project.account_management.BankAccount;
import com.project.searching.Searching;
import com.project.searching.SearchingFactory;

public class Service3 {
    public void searchingAccount(){
        SearchingFactory factory=new SearchingFactory();
        Searching searching=factory.ReturnSearchingMethod();
        List<BankAccount> accounts = searching.searchingAccount();
        if(accounts.size()>0){
            System.out.println("Tài khoản được tìm thấy:");
            for(BankAccount account : accounts){
                System.out.println(account);
            }
        } else {
            System.out.println("Không tìm thấy tài khoản.");
        }
    }
}
