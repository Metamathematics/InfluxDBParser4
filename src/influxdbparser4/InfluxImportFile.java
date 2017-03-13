/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package influxdbparser4;

import java.util.Map;

/**
 *
 * @author sergeygerodes
 */
public class InfluxImportFile {
    String database;
    String retentionPolicy;
    Map tagset;
    Map fieldset;
    long timestamp;

    public InfluxImportFile(String database, String retentionPolicy, Map tagset, Map fieldset, long timestamp) {
        this.database = database;
        this.retentionPolicy = retentionPolicy;
        this.tagset = tagset;
        this.fieldset = fieldset;
        this.timestamp = timestamp;
    }


    
    
}
