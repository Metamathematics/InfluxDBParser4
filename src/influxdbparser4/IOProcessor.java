/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package influxdbparser4;

import java.io.File;

/**
 *
 * @author sergeygerodes
 */
public class IOProcessor {
    File inputFile;
    File outputFile;

    public IOProcessor(File readedfile) {
        this.inputFile = readedfile;
    }
    
    
    public void writeInfluxDBFile(InfluxImportFile f){
        
    }
    
    
}
