package br.com.everson.SpringBoot.beans;

import br.com.everson.SpringBoot.model.Aluno;
import br.com.everson.SpringBoot.repositories.AlunoRepositories;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "alunoMB")
@ViewScoped
public class AlunoMB {

    @Getter
    @Setter
    private List<Aluno> alunos = new ArrayList<>();

    @Getter
    @Setter
    private Aluno aluno;

    @Autowired
    private AlunoRepositories alunoRepositories;

    @PostConstruct
    public List<Aluno> listarTodos() {
        alunos = alunoRepositories.findAll();
        return alunos;
    }

    public Integer getTamanhoDaLista() {
        return alunos.size();
    }

    public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }
}
