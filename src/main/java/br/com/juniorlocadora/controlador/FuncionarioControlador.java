package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.FuncionarioDto;
import br.com.juniorlocadora.servico.FuncionarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioControlador {

    @Autowired
    private FuncionarioServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuncionarioDto> findById(@PathVariable Long id){
        FuncionarioDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<FuncionarioDto>> findAll(Pageable pageable){
        Page<FuncionarioDto> funcionarios = servico.findAll(pageable);
        return ResponseEntity.ok().body(funcionarios);
    }
}
