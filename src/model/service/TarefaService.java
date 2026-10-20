package model.service;

import jdk.jshell.Snippet;
import model.entity.StatusTarefa;
import model.entity.Tarefa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TarefaService {
    ;


    List<Tarefa> bancoDeDados = new ArrayList<>();
    private int proximoid = 1;

    public void criarTarefa() {
        Tarefa t = new Tarefa();
        t.setId(proximoid);
        proximoid++;
        t.setTitulo(IO.readln("Digite o titulo:"));
        t.setDescricao(IO.readln("Digite a descrição:"));
        t.setStatus(String.valueOf(StatusTarefa.PENDENTE));
        bancoDeDados.add(t);
    }

}