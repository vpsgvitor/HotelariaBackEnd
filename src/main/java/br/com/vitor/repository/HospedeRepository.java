package br.com.vitor.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vitor.model.Hospede;

public interface HospedeRepository extends MongoRepository<Hospede, Integer>{ }
