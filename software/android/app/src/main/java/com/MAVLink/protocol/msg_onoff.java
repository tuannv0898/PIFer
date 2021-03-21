/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ONOFF PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * On off message
 */
public class msg_onoff extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ONOFF = 20;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ONOFF;

      
    /**
     * 
     */
    public int uwb_address;
      
    /**
     * 
     */
    public short value;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ONOFF;
        
        packet.payload.putUnsignedShort(uwb_address);
        packet.payload.putUnsignedByte(value);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a onoff message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.uwb_address = payload.getUnsignedShort();
        this.value = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_onoff() {
        this.msgid = MAVLINK_MSG_ID_ONOFF;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_onoff( int uwb_address, short value) {
        this.msgid = MAVLINK_MSG_ID_ONOFF;

        this.uwb_address = uwb_address;
        this.value = value;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_onoff( int uwb_address, short value, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ONOFF;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.uwb_address = uwb_address;
        this.value = value;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_onoff(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ONOFF;
        
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
        return "MAVLINK_MSG_ID_ONOFF - sysid:"+sysid+" compid:"+compid+" uwb_address:"+uwb_address+" value:"+value+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ONOFF";
    }
}
        