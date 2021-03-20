/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PID_REPORT PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Report pid internal parameter
 */
public class msg_pid_report extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PID_REPORT = 16;
    public static final int MAVLINK_MSG_LENGTH = 25;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PID_REPORT;

      
    /**
     * Set point
     */
    public float sp;
      
    /**
     * Feed back
     */
    public float fb;
      
    /**
     * P part
     */
    public float P_Part;
      
    /**
     * I part
     */
    public float I_Part;
      
    /**
     * D part
     */
    public float D_Part;
      
    /**
     * Output
     */
    public float U;
      
    /**
     * Object that PID control
     */
    public short pid_control;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_PID_REPORT;
        
        packet.payload.putFloat(sp);
        packet.payload.putFloat(fb);
        packet.payload.putFloat(P_Part);
        packet.payload.putFloat(I_Part);
        packet.payload.putFloat(D_Part);
        packet.payload.putFloat(U);
        packet.payload.putUnsignedByte(pid_control);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a pid_report message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.sp = payload.getFloat();
        this.fb = payload.getFloat();
        this.P_Part = payload.getFloat();
        this.I_Part = payload.getFloat();
        this.D_Part = payload.getFloat();
        this.U = payload.getFloat();
        this.pid_control = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_pid_report() {
        this.msgid = MAVLINK_MSG_ID_PID_REPORT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_pid_report( float sp, float fb, float P_Part, float I_Part, float D_Part, float U, short pid_control) {
        this.msgid = MAVLINK_MSG_ID_PID_REPORT;

        this.sp = sp;
        this.fb = fb;
        this.P_Part = P_Part;
        this.I_Part = I_Part;
        this.D_Part = D_Part;
        this.U = U;
        this.pid_control = pid_control;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_pid_report( float sp, float fb, float P_Part, float I_Part, float D_Part, float U, short pid_control, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PID_REPORT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.sp = sp;
        this.fb = fb;
        this.P_Part = P_Part;
        this.I_Part = I_Part;
        this.D_Part = D_Part;
        this.U = U;
        this.pid_control = pid_control;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_pid_report(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PID_REPORT;
        
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
        return "MAVLINK_MSG_ID_PID_REPORT - sysid:"+sysid+" compid:"+compid+" sp:"+sp+" fb:"+fb+" P_Part:"+P_Part+" I_Part:"+I_Part+" D_Part:"+D_Part+" U:"+U+" pid_control:"+pid_control+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PID_REPORT";
    }
}
        