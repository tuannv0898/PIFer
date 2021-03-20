/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE EVT_SENSOR PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Report sensor status. No need a respond message for confimation
 */
public class msg_evt_sensor extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_EVT_SENSOR = 6;
    public static final int MAVLINK_MSG_LENGTH = 1;
    private static final long serialVersionUID = MAVLINK_MSG_ID_EVT_SENSOR;

      
    /**
     * IMU status
     */
    public byte imu_status;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_EVT_SENSOR;
        
        packet.payload.putByte(imu_status);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a evt_sensor message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.imu_status = payload.getByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_evt_sensor() {
        this.msgid = MAVLINK_MSG_ID_EVT_SENSOR;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_evt_sensor( byte imu_status) {
        this.msgid = MAVLINK_MSG_ID_EVT_SENSOR;

        this.imu_status = imu_status;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_evt_sensor( byte imu_status, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_EVT_SENSOR;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.imu_status = imu_status;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_evt_sensor(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_EVT_SENSOR;
        
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
        return "MAVLINK_MSG_ID_EVT_SENSOR - sysid:"+sysid+" compid:"+compid+" imu_status:"+imu_status+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_EVT_SENSOR";
    }
}
        