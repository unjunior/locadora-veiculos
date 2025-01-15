package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.ModeloCarroDto;
import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.servico.ModeloCarroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/modelos")
public class ModeloCarroControlador {

    @Autowired
    private ModeloCarroServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ModeloCarroDto> findById(@PathVariable Long id){
        ModeloCarroDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ModeloCarroDto>> findAll(Pageable pageable){
        Page<ModeloCarroDto> lista = servico.findAll(pageable);
        return ResponseEntity.ok().body(lista);
    }
}
