package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.FuncionarioDto;
import br.com.juniorlocadora.dto.MotoristaDto;
import br.com.juniorlocadora.dto.PessoaDto;
import br.com.juniorlocadora.servico.MotoristaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/motorista")
public class MotoristaControlador {

    @Autowired
    private MotoristaServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaDto> findById(@PathVariable Long id){
        PessoaDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<MotoristaDto>> findAll(Pageable pageable){
        Page<MotoristaDto> lista = servico.findAll(pageable);
        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    public ResponseEntity<MotoristaDto> insert(@RequestBody MotoristaDto dto){
        MotoristaDto novo = servico.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(novo.getId()).toUri();
        return ResponseEntity.created(uri).body(novo);
    }
}
