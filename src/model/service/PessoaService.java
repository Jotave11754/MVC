package model.service;

import model.entity.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class PessoaService {

    private static int id;
    Set<Pessoa> bancoDeDados = new HashSet<>();


    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln("Digite seu nome:"));
        p.setEmail(IO.readln("Digite seu email:"));
        p.setSenha(IO.readln("Digite sua senha:"));
        bancoDeDados.add(p);
    }

}
