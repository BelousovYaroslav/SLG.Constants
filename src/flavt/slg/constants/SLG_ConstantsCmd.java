package flavt.slg.constants;

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
    public final int SLG_CMD_SET = 0x21;                           //33 = 0x21 = "!"
    public final int SLG_CMD_REQ = 0x22;                           //34 = 0x22 = """
    
    public final int SLG_CMD_ACT_SAVE_FLASH_PARAM       = 0x23;    //35 = 0x23 = "#"    Param: 0-1-2-3  - page to save
    public final int SLG_CMD_ACT_RELOAD_FLASH_PARAM     = 0x24;    //36 = 0x24 = "$"    Param: 0-1-2-3  - page to reload
    
    public final int SLG_CMD_ACT_T_CALIBRATION          = 0x25;    //37 = 0x25 = "%"
    public final int SLG_CMD_ACT_RESET_T_CALIB          = 0x26;    //38 = 0x26 = "&"

    public final int SLG_CMD_ACT_LASER_OFF              = 0x27;    //39 = 0x27 = "'"
    public final int SLG_CMD_ACT_INTEGR_OFF             = 0x28;    //40 = 0x28 = "("
    public final int SLG_CMD_ACT_INTEGR_ON              = 0x29;    //41 = 0x29 = ")"
    public final int SLG_CMD_ACT_INTEGR_RESET           = 0x2A;    //42 = 0x2A = "*"

    public final int SLG_CMD_ACT_SWC_DW_DNDU_OUTPUT     = 0x2B;    //43 = 0x2B = "+"

    public final int SLG_CMD_ACT_LOCK_DEVICE            = 0x2C;    //44 = 0x2C = ","
    public final int SLG_CMD_ACT_UNLOCK_DEVICE          = 0x2D;    //45 = 0x2D = "-"
}
