package com.communicationMarketing.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.communicationMarketing.main.entity.post;

@Repository

public interface postRepository   extends MongoRepository<post,Long>{

}