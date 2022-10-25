package com.communicationMarketing.main.repository;




import org.springframework.stereotype.Repository;

import com.communicationMarketing.main.entity.Partenership;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface PartenershipRepository  extends MongoRepository<Partenership,Long> {
	
}
