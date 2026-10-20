package controller;

import model.entity.Pessoa;
import model.service.PessoaService;

public class PessoaController {

    private final PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void criarPessoa(){
        pessoaService.criar();
        IO.println("Criado com sucesso!!");
    }
}
