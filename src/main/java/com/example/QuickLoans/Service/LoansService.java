package com.example.QuickLoans.Service;

import com.example.QuickLoans.Model.Loans;
import com.example.QuickLoans.Repository.LoansRepository;
import com.example.QuickLoans.Service.Interface.LoansServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class LoansService implements LoansServiceInterface {
    private final LoansRepository loansRepository;

    public LoansService(LoansRepository loansRepository) {
        this.loansRepository = loansRepository;
    }

    @Override
    public void add(Loans loans) {
        loansRepository.save(loans);
    }

    @Override
    public void addMoney(int id, float money) {
        Loans loans = loansRepository.findLoansById(id);
        if(money>0){
            loans.setMoney(loans.getMoney()+money);
        }else{
            loans.setMoney(money);
        }
    }

    @Override
    public void subtract(int id, float money) {
        Loans loans = loansRepository.findLoansById(id);
        loans.setMoney(loans.getMoney()-money);
        loansRepository.save(loans);
    }
}
