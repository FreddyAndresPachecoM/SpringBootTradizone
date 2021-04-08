package com.tradiZone.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tradiZone.web.app.model.Recomendacion;

@Repository
public interface RecomendacionRepository extends MongoRepository<Recomendacion, String>{

}
