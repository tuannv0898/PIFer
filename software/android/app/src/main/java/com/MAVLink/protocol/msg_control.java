/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CONTROL PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Control message
 */
public class msg_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CONTROL = 27;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CONTROL;

      
    /**
     * 
     */
    public float left;
      
    /**
     * 
     */
    public float right;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_CONTROL;
        
        packet.payload.putFloat(left);
        packet.payload.putFloat(right);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a control message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.left = payload.getFloat();
        this.right = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_control() {
        this.msgid = MAVLINK_MSG_ID_CONTROL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_control( float left, float right) {
        this.msgid = MAVLINK_MSG_ID_CONTROL;

        this.left = left;
        this.right = right;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_control( float left, float right, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.left = left;
        this.right = right;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CONTROL;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CONTROL - sysid:"+sysid+" compid:"+compid+" left:"+left+" right:"+right+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CONTROL";
    }
}
        