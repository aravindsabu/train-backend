package com.nestdigital.train.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train")
public class TrainModel {
    @Id
    @GeneratedValue
    private int id;
    private String trainName;
    private int trainNo;
    private String fromPlace;
    private String toPlace;
    private int totalSeat;

    public TrainModel(int id, String trainName, int trainNo, String fromPlace, String toPlace, int totalSeat) {
        this.id = id;
        this.trainName = trainName;
        this.trainNo = trainNo;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.totalSeat = totalSeat;
    }

    public TrainModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }
}
