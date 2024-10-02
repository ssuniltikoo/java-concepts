package dev.core.concepts.java.designpattern.singleton;

public class DbConnection {
    private static DbConnection instance;

    static {
        instance = new DbConnection();
    }

    private DbConnection(){}

    public  static DbConnection getInstance(){
//        if(instance == null){
//            instance = new DbConnection();
//        }
        return instance;
    }
}
