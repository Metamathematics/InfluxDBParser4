/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formats;

/**
 *
 * @author sergeygerodes
 */
public class LineProtocolException extends Exception{
    public LineProtocolException() { super(); }
    public LineProtocolException(String message) { super(message); }
    public LineProtocolException(String message, Throwable cause) { super(message, cause); }
    public LineProtocolException(Throwable cause) { super(cause); }
}
