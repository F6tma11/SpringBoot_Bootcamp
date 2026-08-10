package com.fatma.database;

public class DatabaseOperations {
    private String url;
    private String password;
    private String username;

    public DatabaseOperations(String url,String username,String password){
        this.url=url;
        this.username=username;
        this.password=password;
    }

    public void connectToDatabase(){
        System.out.println(String.format("You are connected to %s with username %s",url,username));
    }

    public void disconnectToDatabase(){
        System.out.println(String.format("Now..You are disconnected to %s with username %s",url,username));
    }
}
