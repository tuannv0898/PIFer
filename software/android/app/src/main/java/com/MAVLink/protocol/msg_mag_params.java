/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MAG_PARAMS PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * 
 */
public class msg_mag_params extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MAG_PARAMS = 12;
    public static final int MAVLINK_MSG_LENGTH = 24;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MAG_PARAMS;

      
    /**
     * 
     */
    public float mag_bias_x;
      
    /**
     * 
     */
    public float mag_bias_y;
      
    /**
     * 
     */
    public float mag_bias_z;
      
    /**
     * 
     */
    public float mag_scale_x;
      
    /**
     * 
     */
    public float mag_scale_y;
      
    /**
     * 
     */
    public float mag_scale_z;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MAG_PARAMS;
        
        packet.payload.putFloat(mag_bias_x);
        packet.payload.putFloat(mag_bias_y);
        packet.payload.putFloat(mag_bias_z);
        packet.payload.putFloat(mag_scale_x);
        packet.payload.putFloat(mag_scale_y);
        packet.payload.putFloat(mag_scale_z);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a mag_params message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.mag_bias_x = payload.getFloat();
        this.mag_bias_y = payload.getFloat();
        this.mag_bias_z = payload.getFloat();
        this.mag_scale_x = payload.getFloat();
        this.mag_scale_y = payload.getFloat();
        this.mag_scale_z = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mag_params() {
        this.msgid = MAVLINK_MSG_ID_MAG_PARAMS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mag_params( float mag_bias_x, float mag_bias_y, float mag_bias_z, float mag_scale_x, float mag_scale_y, float mag_scale_z) {
        this.msgid = MAVLINK_MSG_ID_MAG_PARAMS;

        this.mag_bias_x = mag_bias_x;
        this.mag_bias_y = mag_bias_y;
        this.mag_bias_z = mag_bias_z;
        this.mag_scale_x = mag_scale_x;
        this.mag_scale_y = mag_scale_y;
        this.mag_scale_z = mag_scale_z;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mag_params( float mag_bias_x, float mag_bias_y, float mag_bias_z, float mag_scale_x, float mag_scale_y, float mag_scale_z, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MAG_PARAMS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.mag_bias_x = mag_bias_x;
        this.mag_bias_y = mag_bias_y;
        this.mag_bias_z = mag_bias_z;
        this.mag_scale_x = mag_scale_x;
        this.mag_scale_y = mag_scale_y;
        this.mag_scale_z = mag_scale_z;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mag_params(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MAG_PARAMS;
        
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
        return "MAVLINK_MSG_ID_MAG_PARAMS - sysid:"+sysid+" compid:"+compid+" mag_bias_x:"+mag_bias_x+" mag_bias_y:"+mag_bias_y+" mag_bias_z:"+mag_bias_z+" mag_scale_x:"+mag_scale_x+" mag_scale_y:"+mag_scale_y+" mag_scale_z:"+mag_scale_z+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MAG_PARAMS";
    }
}
        