package com.nestdigital.train.controller;

import com.nestdigital.train.dao.TrainDao;
import com.nestdigital.train.model.TrainModel;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainController {

    @Autowired
    private TrainDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/trainAdd",consumes = "application/json",produces = "application/json")
    public String trainAdd(@RequestBody TrainModel train){
        dao.save(train);

        return "(status:'success')";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/trainView")
    public List<TrainModel> trainView(){
        return (List<TrainModel>)dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteTrain",consumes = "application/json",produces = "application/json")
    public String deleteTrain(@RequestBody TrainModel train){
        dao.deleteTrainById(train.getId());
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchTrain",consumes = "application/json",produces = "application/json")
        public List<TrainModel>searchTrain(@RequestBody TrainModel train) {
        System.out.println(train.getTrainName());
        return(List<TrainModel>) dao.searchTrain(train.getTrainName());
    }

}
