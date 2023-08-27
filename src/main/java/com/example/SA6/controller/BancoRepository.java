package com.example.SA6.controller;

import com.example.SA6.model.Conta;
import com.example.SA6.model.ContaCorrentePF;
import org.springframework.data.repository.CrudRepository;

public interface BancoRepository extends CrudRepository<ContaCorrentePF, Long> {
}
