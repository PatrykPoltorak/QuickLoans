package com.example.QuickLoans.Service.Interface;

import com.example.QuickLoans.Model.Loans;

public interface LoansServiceInterface {
    void add(Loans loans);
    void addMoney(int id, float money);
    void subtract(int id, float money);
}
