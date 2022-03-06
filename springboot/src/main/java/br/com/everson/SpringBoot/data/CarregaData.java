package br.com.everson.SpringBoot.data;

import br.com.everson.SpringBoot.model.Aluno;
import br.com.everson.SpringBoot.repositories.AlunoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;

@Component
public class CarregaData {

    @Value("${habilitar.carregar.massa.dados}")
    private boolean podeCarregarDados;

    @Autowired
    private AlunoRepositories alunoRepositories;

    @PostConstruct
    public void loadData() {

        if (podeCarregarDados) {
            for (int x = 0; x < 50; x++) {
                alunoRepositories.save(new Aluno((long) x, "Everson Mariano" + x, "99785-423" + x, "everson@gmail.com", Instant.now()));
            }

        }
    }
}
