package com.example.QuickLoans.Repository;

import com.example.QuickLoans.Model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Integer> {
    @Query("select l from Loans l where id=?1")
    Loans findLoansById(int id);

    @Query("select l from Loans l where name=?1")
    List<Loans> findLoansByName(String name);
}
