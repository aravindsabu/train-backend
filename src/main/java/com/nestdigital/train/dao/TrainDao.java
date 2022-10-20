package com.nestdigital.train.dao;

import com.nestdigital.train.model.TrainModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrainDao extends CrudRepository<TrainModel,Integer> {
   @Modifying
  @Query(value = "DELETE FROM `train` WHERE id= :id",nativeQuery = true)
    void deleteTrainById(Integer id);
   @Query(value = "SELECT `id`, `from_place`, `to_place`, `total_seat`, `train_name`, `train_no` FROM `train` WHERE train_name= :train_name",nativeQuery = true)
   List<TrainModel>searchTrain(String train_name);
}
