/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Service;

/**
 *
 * @author astud
 */
public class DivisionException extends Exception {

    /**
     * Creates a new instance of <code>DivisionException</code> without detail
     * message.
     */
    public DivisionException() {
    }

    /**
     * Constructs an instance of <code>DivisionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionException(String msg) {
        super(msg);
    }
}
