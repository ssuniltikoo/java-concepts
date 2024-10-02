package dev.core.concepts.java.designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        DbConnection db1 = DbConnection.getInstance();
        DbConnection db2 = DbConnection.getInstance();
        System.out.println("object cretaed are "+ db1 + " --- " + db2);
        // copy above through clone object

       // DbConnection copyObject = clone
    }
}
