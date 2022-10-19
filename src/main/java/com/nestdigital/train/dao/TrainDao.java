package com.nestdigital.train.dao;

import com.nestdigital.train.model.TrainModel;
import org.springframework.data.repository.CrudRepository;

public interface TrainDao extends CrudRepository<TrainModel,Integer> {
}
