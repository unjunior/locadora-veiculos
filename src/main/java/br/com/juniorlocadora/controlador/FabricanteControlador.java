package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.FabricanteDto;
import br.com.juniorlocadora.servico.FabricanteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fabricantes")
public class FabricanteControlador {

    @Autowired
    private FabricanteServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FabricanteDto> findById(@PathVariable Long id){
        FabricanteDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<FabricanteDto>> findAll(Pageable pageable){
        Page<FabricanteDto> fabricantes = servico.findAll(pageable);
        return ResponseEntity.ok().body(fabricantes);
    }
}
