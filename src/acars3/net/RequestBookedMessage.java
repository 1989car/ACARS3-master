/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acars3.net;

/**
 *
 * @author Michael
 */
public class RequestBookedMessage extends NetMessage
{
    public int getType()
    {
        return NetMessage.REQUEST_BOOKED;
    }
    
    public RequestBookedMessage(){}
}