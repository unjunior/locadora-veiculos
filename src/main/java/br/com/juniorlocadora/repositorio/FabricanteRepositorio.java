package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepositorio extends JpaRepository<Fabricante, Long> {
}
