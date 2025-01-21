package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.CarroDto;
import br.com.juniorlocadora.entidades.Carro;
import br.com.juniorlocadora.repositorio.CarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Transactional(readOnly = true)
    public Page<CarroDto> findAll(Pageable pageable){
        Page<Carro> result = repositorio.findAll(pageable);
        return result.map(x -> new CarroDto(x));
    }

    @Transactional
    public CarroDto insert(CarroDto dto){
        Carro carro = new Carro();
        carro.setCor(dto.getCor());
        carro.setPlaca(dto.getPlaca());
        carro.setChassi(dto.getChassi());

        carro = repositorio.save(carro);
        return new CarroDto(carro);
    }
}
