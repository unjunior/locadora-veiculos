package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.ModeloCarroDto;
import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.repositorio.ModeloCarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ModeloCarroServico {

    @Autowired
    private ModeloCarroRepositorio repositorio;

    @Transactional
    public ModeloCarroDto findById(Long id){
        Optional<ModeloCarro> result = repositorio.findById(id);
        ModeloCarro modelo = result.get();
        return new ModeloCarroDto(modelo);
    }
}
