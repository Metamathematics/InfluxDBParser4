/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package influxdbparser4;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergeygerodes
 */
public class InfluxDBParser4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputFilePath = args[0];
        String inputFormat = args[1];
        run(inputFilePath,inputFormat);
    }
    
    static public void run(String inputFilePath, String inputFormat){
        
        try {
            
            IOProcessor iop = new IOProcessor(inputFilePath);
            iop.parse(inputFormat);
            iop.writeInfluxDBFile();
            
        } catch (Exception ex) {
            Logger.getLogger(InfluxDBParser4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
