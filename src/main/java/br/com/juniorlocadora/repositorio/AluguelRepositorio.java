package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepositorio extends JpaRepository<Aluguel, Long> {
}
