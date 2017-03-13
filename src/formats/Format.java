/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formats;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sergeygerodes
 */
public abstract class Format {
    
    abstract public String readDatabase();
    abstract public String readRetentionPolicy();
    abstract public String readTagset();
    abstract public String readFieldset();
    abstract public long readTimestamp();
    
    
    public static long parseTimestamp(String timestamp, String pattern) throws ParseException {
        /*
        how to build patterns you can find at
        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        
        Examples: 
            Timestamp: "01/31/17 05:00:04" Pattern: "MM/dd/yy HH:mm:ss"
            Timestamp: "01/31/2017 05:00:04.567" Pattern: "MM/dd/yyyy HH:mm:ss.SSS"
            Timestamp: "01/31/2017 05:00:04 AM" Pattern: "MM/dd/yyyy hh:mm:ss a"
        */
        
        DateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(timestamp);
        //return String.valueOf(date.getTime());
        return date.getTime();
    } 
            
}
