package com.colin.safeTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colin.safeTravels.models.Expense;

import jakarta.validation.Valid;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
}