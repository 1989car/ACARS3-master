/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acars3.net;

/**
 *
 * @author Michael
 */
public class UnmuteMessage extends KickMessage
{
    public int getType()
    {
        return NetMessage.UNMUTE;
    }
    
    public UnmuteMessage(String userid)
    {
        super(userid);
    }
}
