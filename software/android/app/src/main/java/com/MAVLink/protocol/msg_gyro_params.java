/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GYRO_PARAMS PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Gyro calibration parameters. No need a respond message for confimation
 */
public class msg_gyro_params extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GYRO_PARAMS = 9;
    public static final int MAVLINK_MSG_LENGTH = 12;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GYRO_PARAMS;

      
    /**
     * Gyro Offset X
     */
    public float gyro_offset_x;
      
    /**
     * Gyro Offset Y
     */
    public float gyro_offset_y;
      
    /**
     * Gyro Offset Z
     */
    public float gyro_offset_z;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GYRO_PARAMS;
        
        packet.payload.putFloat(gyro_offset_x);
        packet.payload.putFloat(gyro_offset_y);
        packet.payload.putFloat(gyro_offset_z);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gyro_params message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.gyro_offset_x = payload.getFloat();
        this.gyro_offset_y = payload.getFloat();
        this.gyro_offset_z = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gyro_params() {
        this.msgid = MAVLINK_MSG_ID_GYRO_PARAMS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gyro_params( float gyro_offset_x, float gyro_offset_y, float gyro_offset_z) {
        this.msgid = MAVLINK_MSG_ID_GYRO_PARAMS;

        this.gyro_offset_x = gyro_offset_x;
        this.gyro_offset_y = gyro_offset_y;
        this.gyro_offset_z = gyro_offset_z;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gyro_params( float gyro_offset_x, float gyro_offset_y, float gyro_offset_z, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GYRO_PARAMS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.gyro_offset_x = gyro_offset_x;
        this.gyro_offset_y = gyro_offset_y;
        this.gyro_offset_z = gyro_offset_z;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gyro_params(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GYRO_PARAMS;
        
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
        return "MAVLINK_MSG_ID_GYRO_PARAMS - sysid:"+sysid+" compid:"+compid+" gyro_offset_x:"+gyro_offset_x+" gyro_offset_y:"+gyro_offset_y+" gyro_offset_z:"+gyro_offset_z+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GYRO_PARAMS";
    }
}
        