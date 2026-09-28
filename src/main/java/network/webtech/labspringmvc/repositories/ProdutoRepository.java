package network.webtech.labspringmvc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import network.webtech.labspringmvc.models.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    // save, findById, findAll, deleteById... já vêm prontos por herança.
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário.
}
