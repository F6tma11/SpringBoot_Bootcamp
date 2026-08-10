package com.fatma.vehicle;

import com.fatma.databae.DBManager;

public class Car implements Vehicle{

    private DBManager dbManager;

    public Car(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public void saveIntoDB(String vehicle) {
        dbManager.saveData("Car",vehicle);
    }
}
