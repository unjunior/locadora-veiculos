package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.ModeloCarro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloCarroRepositorio extends JpaRepository<ModeloCarro, Long> {
}
