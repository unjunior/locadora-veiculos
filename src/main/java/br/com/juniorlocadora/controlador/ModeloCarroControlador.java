package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.FabricanteDto;
import br.com.juniorlocadora.dto.ModeloCarroDto;
import br.com.juniorlocadora.servico.ModeloCarroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<ModeloCarroDto> insert(@RequestBody ModeloCarroDto dto){
        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    /*
    @PostMapping
    public ResponseEntity<ModeloCarroFabricanteDto> insert (@RequestBody ModeloCarroFabricanteDto dto){

        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);
    }
    */


}
