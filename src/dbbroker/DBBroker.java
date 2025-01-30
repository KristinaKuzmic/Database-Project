/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbbroker;

import domain.object.DomainObject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kristina
 */
public class DBBroker {

    private Connection connection;
    private String username;
    private String password;
    private String url;
    
    public DBBroker(){
        this.setDatabaseAccessParams();
    }

    private void setDatabaseAccessParams() {

        try {
            Properties properties = new Properties();
            String propertiesFileName = "config/dbconfig.properties";
            FileInputStream fis = new FileInputStream(propertiesFileName);
            properties.load(fis);
            
            this.password = properties.getProperty("password");
            this.url = properties.getProperty("url");
            this.username = properties.getProperty("username");
            
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    
    public void connect() throws Exception{
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            throw new Exception("Connection error");
        }        
    }
    
    
    public void disconnect() throws Exception{
        if(connection!=null){
            try {
                connection.close();
                System.out.println("DB dissconected");
            } catch (SQLException ex) {
                throw new Exception("Dissconection error");
            }
        }
    }
    
    /* public List<DomainObject> getPartition(DomainObject object, String part) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM DOZNAKA " + part;
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs);
        } catch (SQLException ex) {
            throw ex;
        }
    }*/
    
    
    public int insert(DomainObject object) throws SQLException{
        try {
            Statement statement = connection.createStatement();
            String query = "insert into " + object.getTableName() + "(" + object.getAllInsertColumnNames() + ")" + 
                    " values " + object.getColumnValues() + ")";
            System.out.println(query);
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public List<DomainObject> getAll(DomainObject object) throws SQLException{
        Statement statement = connection.createStatement();
        String query = "select " + object.getAllColumnNames() + " from "
                +object.getTableName() + " order by " + object.getOrderByColumn();
        System.out.println(query);
        ResultSet rs = statement.executeQuery(query);
        return object.getObjectsFromResultSet(rs);
    }
    
     public List<DomainObject> getAllWithWhere(DomainObject object, String whereClause) throws SQLException{
        Statement statement = connection.createStatement();
        String query = "select " + object.getAllColumnNames() + " from "
                +object.getTableName() + " where " + whereClause +  " order by " + object.getOrderByColumn();
        System.out.println(query);
        ResultSet rs = statement.executeQuery(query);
        return object.getObjectsFromResultSet(rs);
    }
    
     public int delete(DomainObject object) throws SQLException{
         Statement statement = connection.createStatement();
         String query = "delete from " + object.getTableName() + " where " + object.getDeleteWhereClause();
         return statement.executeUpdate(query);
     }
    
     
     public int update(DomainObject object) throws SQLException{
         Statement statement = connection.createStatement();
         String query = "update " + object.getTableName() + " set " + object.getUpdateClause() + " where " + object.getUpdateWhereClause();
         return statement.executeUpdate(query);
     }
    
    public int updatePartial(DomainObject object, String setClause) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "update " + object.getTableName() + " set " + setClause + " where " + object.getUpdateWhereClause();
            System.out.println(query);
            int rowsUpdated = statement.executeUpdate(query);
            return rowsUpdated;
        } catch (SQLException ex) {
            throw ex;
        }
    }
}
