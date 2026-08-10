package com.fatma.databae;

public class DBManager {

    private String databaseUrl;
    private String databaseUserName;
    private String databasePassword;

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public void saveData(String type,String data){
        System.out.println(String.format("We store %s with type %s into database.",type,data));
    }
}
