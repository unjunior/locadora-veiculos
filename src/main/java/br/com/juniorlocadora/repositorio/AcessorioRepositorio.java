package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessorioRepositorio extends JpaRepository<Acessorio, Long> {
}
