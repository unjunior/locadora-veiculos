package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.dto.ApoliceSeguroDto;
import br.com.juniorlocadora.servico.ApoliceSeguroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/apolices-seguros")
public class ApoliceSeguroControlador {

    @Autowired
    private ApoliceSeguroServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ApoliceSeguroDto> findById(@PathVariable Long id){
        ApoliceSeguroDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ApoliceSeguroDto>> findAll(Pageable pageable){
        Page<ApoliceSeguroDto> lista = servico.findAll(pageable);
        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    public ResponseEntity<ApoliceSeguroDto> insert(@RequestBody ApoliceSeguroDto dto){
        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
