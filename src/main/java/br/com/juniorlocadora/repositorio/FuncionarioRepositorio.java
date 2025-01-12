package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {
}
