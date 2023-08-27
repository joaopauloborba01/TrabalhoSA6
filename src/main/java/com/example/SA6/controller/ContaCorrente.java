package com.example.SA6.controller;

import com.example.SA6.model.Conta;
import com.example.SA6.model.ContaCorrentePF;

public interface ContaCorrente {

    Double sacar(Double quantidade, Conta conta);

    void depositar(Double quantidade, Conta conta);

    void transferir(Double quantidade, Conta conta);

    Double consultaSaldo(ContaCorrentePF conta);

}