package flavt.slg.lib.constants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaroslav
 */
public class SLG_ConstantsCmd {
    public static final int SLG_CMD_SET = 0x21;                           //33 = 0x21 = "!"
    public static final int SLG_CMD_REQ = 0x22;                           //34 = 0x22 = """
    
    public static final int SLG_CMD_ACT_SAVE_FLASH_PARAM       = 0x23;    //35 = 0x23 = "#"    Param: 0-1-2-3  - page to save
    public static final int SLG_CMD_ACT_RELOAD_FLASH_PARAM     = 0x24;    //36 = 0x24 = "$"    Param: 0-1-2-3  - page to reload
    
    public static final int SLG_CMD_ACT_T_CALIBRATION          = 0x25;    //37 = 0x25 = "%"
    public static final int SLG_CMD_ACT_RESET_T_CALIB          = 0x26;    //38 = 0x26 = "&"

    public static final int SLG_CMD_ACT_LASER_OFF              = 0x27;    //39 = 0x27 = "'"
    public static final int SLG_CMD_ACT_INTEGR_OFF             = 0x28;    //40 = 0x28 = "("
    public static final int SLG_CMD_ACT_INTEGR_ON              = 0x29;    //41 = 0x29 = ")"
    public static final int SLG_CMD_ACT_INTEGR_RESET           = 0x2A;    //42 = 0x2A = "*"

    public static final int SLG_CMD_ACT_SWC_DW_DNDU_OUTPUT     = 0x2B;    //43 = 0x2B = "+"

    public static final int SLG_CMD_ACT_LOCK_DEVICE            = 0x2C;    //44 = 0x2C = ","
    public static final int SLG_CMD_ACT_UNLOCK_DEVICE          = 0x2D;    //45 = 0x2D = "-"
    
    public static final int SLG_MC_COMMAND_SWITCH_TO_MAX_RATE_DNDU = 0x2E;    //46 = 0x2E = "."

    public static final int SLG_CMD_ACT_RESET_PHSH_CALIB    = 0x2F;    //47 = 0x2F = "/"
    public static final int SLG_CMD_ACT_RESET_DC_CALIB      = 0x30;    //48 = 0x30 = "0"
}
