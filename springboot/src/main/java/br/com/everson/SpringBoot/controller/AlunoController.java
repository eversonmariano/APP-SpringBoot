package br.com.everson.SpringBoot.controller;

import br.com.everson.SpringBoot.model.Aluno;
import br.com.everson.SpringBoot.repositories.AlunoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepositories alunoRepositories;

    @GetMapping
    public List<Aluno> listar(){

        return alunoRepositories.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Aluno aluno){
        alunoRepositories.save(aluno);
    }

    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        alunoRepositories.save(aluno);
    }

    @DeleteMapping("/{matricula}")
    public void deletar(@PathVariable Long matricula){
        alunoRepositories.deleteById(matricula);
    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> buscar(@PathVariable Long matricula){
        return alunoRepositories.findById(matricula);
    }




}
