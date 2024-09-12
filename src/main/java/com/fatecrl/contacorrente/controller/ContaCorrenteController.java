package com.fatecrl.contacorrente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecrl.contacorrente.model.Conta;
import com.fatecrl.contacorrente.service.ContaService;

@RestController
@RequestMapping("/conta-corrente")
public class ContaCorrenteController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public List<Conta> getAll(){
        return contaService.findAll();
    }


}
