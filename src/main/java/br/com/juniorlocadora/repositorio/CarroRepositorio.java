package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepositorio extends JpaRepository<Carro, Long> {
}
