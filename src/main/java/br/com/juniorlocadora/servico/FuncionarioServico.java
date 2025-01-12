package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.FuncionarioDto;
import br.com.juniorlocadora.entidades.Funcionario;
import br.com.juniorlocadora.entidades.Pessoa;
import br.com.juniorlocadora.repositorio.FuncionarioRepositorio;
import br.com.juniorlocadora.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FuncionarioServico {

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;

    @Transactional
    public FuncionarioDto findById(Long id){

        Optional<Pessoa> result1 = pessoaRepositorio.findById(id);
        Pessoa pessoa = result1.get();

        Optional<Funcionario> result2 = funcionarioRepositorio.findById(id);
        Funcionario funcionario = result2.get();

        /*
            return new FuncionarioDto(funcionario.getId(), funcionario.getNome(), funcionario.getDataNascimento(),
                funcionario.getCpf(), funcionario.getSexo(), funcionario.getMatricula()); */

        return new FuncionarioDto(pessoa, funcionario);
    }
}
