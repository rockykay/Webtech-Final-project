package com.FinalExam.fleetms.accounts.services;

import com.FinalExam.fleetms.accounts.repositories.TransactionRepository;
import com.FinalExam.fleetms.accounts.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    //Get All Transactions
    public List<Transaction> findAll(){
        return transactionRepository.findAll();
    }

    //Get Transaction By Id
    public Transaction findById(int id) {
        return transactionRepository.findById(id).orElse(null);
    }

    //Delete Transaction
    public void delete(int id) {
        transactionRepository.deleteById(id);
    }

    //Update Transaction
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }

}
