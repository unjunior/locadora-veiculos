package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.ModeloCarroDto;
import br.com.juniorlocadora.dto.ModeloCarroFabricanteDto;
import br.com.juniorlocadora.entidades.Fabricante;
import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.repositorio.FabricanteRepositorio;
import br.com.juniorlocadora.repositorio.ModeloCarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ModeloCarroServico {

    @Autowired
    private ModeloCarroRepositorio repositorio;

    @Autowired
    private FabricanteRepositorio fabricanteRepositorio;

    @Transactional
    public ModeloCarroDto findById(Long id){
        Optional<ModeloCarro> result = repositorio.findById(id);
        ModeloCarro modelo = result.get();
        return new ModeloCarroDto(modelo);
    }

    @Transactional(readOnly = true)
    public Page<ModeloCarroDto> findAll(Pageable pageable){
        Page<ModeloCarro> result = repositorio.findAll(pageable);
        return result.map(x -> new ModeloCarroDto(x));
    }

    @Transactional
    public ModeloCarroDto insert (ModeloCarroDto dto){
        ModeloCarro mc = new ModeloCarro();
        mc.setDescricao(dto.getDescricao());
        mc.setCategoria(dto.getCategoria());

        mc = repositorio.save(mc);
        return new ModeloCarroDto(mc);
    }

    /*
    // post associado com fabricante
    @Transactional
    public ModeloCarroFabricanteDto insert (ModeloCarroFabricanteDto dto){

        ModeloCarro modeloCarro = new ModeloCarro();

        modeloCarro.setDescricao(dto.getDescricao());
        modeloCarro.setCategoria(dto.getCategoria());

        Fabricante fabricante = fabricanteRepositorio.getReferenceById(dto.getFabricante().getId());
        modeloCarro.setFabricante(fabricante);

        modeloCarro = repositorio.save(modeloCarro);
        return new ModeloCarroFabricanteDto(modeloCarro);
    }
    */
}
