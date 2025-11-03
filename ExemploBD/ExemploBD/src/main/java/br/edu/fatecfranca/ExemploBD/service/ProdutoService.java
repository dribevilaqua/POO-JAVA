package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    // Injeção de dependência
    //usar um objeto para chmar um método sem precisar instancia-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    // Método que consulta todos os produtos
    public List<Produto> listaTodos() {
        // SELECT * FROM tb_produto
        return produtoRepository.findAll();
    }
}
