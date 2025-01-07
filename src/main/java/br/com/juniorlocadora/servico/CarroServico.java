package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.CarroDto;
import br.com.juniorlocadora.entidades.Carro;
import br.com.juniorlocadora.repositorio.CarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarroServico {

    @Autowired
    private CarroRepositorio repositorio;

    @Transactional
    public CarroDto findById(Long id){
        Optional<Carro> result = repositorio.findById(id);
        Carro carro = result.get();
        return new CarroDto(carro);
    }
}
