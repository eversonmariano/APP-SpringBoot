package br.com.everson.SpringBoot.repositories;

import br.com.everson.SpringBoot.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositories extends JpaRepository<Aluno, Long> {
}
