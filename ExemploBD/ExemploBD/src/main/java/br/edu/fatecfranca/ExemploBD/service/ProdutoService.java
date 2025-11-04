package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import java.util.List;
import java.util.Optional;

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

    //método que consulta um produto em particular
    public Optional<Produto> listaPorId(Long id){
        // se o findById() encontrar um produto, retorna ele,
        // se o findById() não encontrar retorna null
        // select * from tb_produto wher tb_produto.id = id
        return produtoRepository.findById(id);

    }

    //metodo para inserir um produto na tabela tb_produto
    public Produto insere (Produto produto){
        //insert into tb_produto values (...)
        return produtoRepository.save(produto);
    }

    //método pra remover um produto da tabela tb_produto
    public boolean remover(Long id) {
        if (produtoRepository.existsById(id)) { //verifica se o produto existe
            produtoRepository.deleteById(id);
            return true;
        }
        return false; //não encontrou
    }
    public Produto atualizar(Long id, Produto novoProduto){
        //novoProduto não tem id
        if (produtoRepository.existsById(id)) { //verifica se o produto existe
            novoProduto.setId(id); //atualizo novoProduto com o id
            return produtoRepository.save(novoProduto); //atualiza e retorna produto atual.
        }
        return null; //caso o produto não exista
    }

}
