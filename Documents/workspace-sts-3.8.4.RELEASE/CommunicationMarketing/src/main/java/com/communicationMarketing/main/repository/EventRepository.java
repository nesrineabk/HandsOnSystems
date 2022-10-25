package com.communicationMarketing.main.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.communicationMarketing.main.entity.event;
@Repository
public interface  EventRepository extends MongoRepository<event,Long>  {

}
