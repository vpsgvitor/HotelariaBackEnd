package br.com.vitor.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vitor.model.CheckIn;

public interface CheckInRepository extends MongoRepository<CheckIn, Integer> { }