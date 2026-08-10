package com.fatma.vehicle;

import com.fatma.databae.DBManager;

public class Plane implements Vehicle{
    private DBManager dbManager;

    public Plane(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public void saveIntoDB(String vehicle) {
        dbManager.saveData("Plane" , vehicle);
    }
}
