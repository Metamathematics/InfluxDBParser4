/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package influxdbparser4;

import formats.LineProtocolException;
import java.util.ArrayList;

/**
 *
 * @author sergeygerodes
 */
public class InfluxImportFile {
    private String database;
    private String retentionPolicy;
    private ArrayList<Token> tokens;

    public InfluxImportFile(String database, String retentionPolicy, ArrayList<Token> tokens) throws LineProtocolException {
         if (database == null){
            throw new LineProtocolException("No database given");
        }
        
         this.database = database;
        this.retentionPolicy = retentionPolicy;
        this.tokens = tokens;
    }


    public String getDatabase() {
        return database;
    }

    public String getRetentionPolicy() {
        return retentionPolicy;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    
}
