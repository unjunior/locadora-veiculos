package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.AcessorioDto;
import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.entidades.Aluguel;
import br.com.juniorlocadora.servico.AluguelServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/aluguel")
public class AluguelControlador {

    @Autowired
    private AluguelServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AluguelDto> findById(@PathVariable Long id){
        AluguelDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<AluguelDto>> findAll(Pageable pageable){
        Page<AluguelDto> list = servico.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<AluguelDto> insert(@RequestBody AluguelDto dto){
        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<AluguelDto> update (@PathVariable Long id, @RequestBody AluguelDto dto){
        dto = servico.update(id, dto);
        return ResponseEntity.ok(dto);
    }

}
