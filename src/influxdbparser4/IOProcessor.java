/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package influxdbparser4;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author sergeygerodes
 */
public class IOProcessor {
    File inputFile;
    InfluxImportFile parsedValues;
    File outputFile;

    public IOProcessor(String inputPath) throws FileNotFoundException {
        File ifile = new File(inputPath);
        if (ifile.exists()){
            this.inputFile = ifile;
        } else {
            throw new FileNotFoundException("The File with the given Path does not exists");
        }
    }
    
    public void parse(String format){
        
        
        
        this.parsedValues = null;
    }
    
    public void writeInfluxDBFile(){
        
    }
    
    
}
