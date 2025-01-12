package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.FabricanteDto;
import br.com.juniorlocadora.entidades.Fabricante;
import br.com.juniorlocadora.repositorio.FabricanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FabricanteServico {

    @Autowired
    private FabricanteRepositorio repositorio;

    @Transactional
    public FabricanteDto findById(Long id){
        Optional<Fabricante> result = repositorio.findById(id);
        Fabricante fabricante = result.get();
        return new FabricanteDto(fabricante);
    }
}
