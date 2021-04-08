package com.tradiZone.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tradiZone.web.app.model.Local;

@Repository
public interface LocalRepository extends MongoRepository<Local, String>{

}
