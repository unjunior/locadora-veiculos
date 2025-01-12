package br.com.juniorlocadora.repositorio;


import br.com.juniorlocadora.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio  extends JpaRepository<Pessoa, Long> {
}
