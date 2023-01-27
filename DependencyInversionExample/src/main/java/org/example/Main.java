package org.example;

interface DBConnectionInterface{
    public int connect();
}

class MySqlConnection implements DBConnectionInterface{
    public int connect(){
        return 1;
    }
}

class PasswordRemainder{
    private DBConnectionInterface dbConnection;

    public PasswordRemainder(DBConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }
}