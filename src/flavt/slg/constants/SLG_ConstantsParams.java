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
public class SLG_ConstantsParams {
    public final int SLG_PARAM_UTD1                     = 0x00;    //термодатчик 1
    public final int SLG_PARAM_UTD2                     = 0x01;    //термодатчик 2
    public final int SLG_PARAM_UTD3                     = 0x02;    //термодатчик 3
    public final int SLG_PARAM_I1                       = 0x03;    //разрядный ток I1
    public final int SLG_PARAM_I2                       = 0x04;    //разрядный ток I2
    public final int SLG_PARAM_VRPC                     = 0x05;    //напряжение на пьезокорректорах
    public final int SLG_PARAM_AMPLANG_ALTERA           = 0x06;    //амплитуда колебаний виброподвеса получамая от Altera
    public final int SLG_PARAM_AMPLANG_DUS              = 0x07;    //амплитуда колебаний виброподвеса получаемая от ДУП
    public final int SLG_PARAM_RULA                     = 0x08;    //напряжение RULA (задатчик амплитуды колебаний виброподвеса)
    
    public final int SLG_PARAM_AMPLITUDE                = 0x09;    //заданная амплитуда колебаний виброподвеса
    public final int SLG_PARAM_TACT_CODE                = 0x0A;    //код такта подставки
    public final int SLG_PARAM_M_COEFF                  = 0x0B;    //коэффициент ошумления M
    public final int SLG_PARAM_START_MODE               = 0x0C;    //начальная мода
    public final int SLG_PARAM_DEC_COEFF                = 0x0D;    //начальный коэффициент вычета

    public final int SLG_PARAM_CONTROL_I1               = 0x0E;    //контрольное значение разрядного тока I1
    public final int SLG_PARAM_CONTROL_I2               = 0x0F;    //контрольное значение разрядного тока I2
    public final int SLG_PARAM_CONTROL_AA               = 0x10;    //контрольный сигнал раскачки AMPLANG
    
    
    public final int SLG_PARAM_HV_APPLY_COUNT_SET       = 0x11;    //заданное количество HV тычков
    public final int SLG_PARAM_HV_APPLY_COUNT_TR        = 0x12;    //количество HV тычков применённое в этом запуске
    public final int SLG_PARAM_HV_APPLY_DURAT_SET       = 0x13;    //заданная длительность HV тычков
    public final int SLG_PARAM_HV_APPLY_PACKS           = 0x34;    //количество пачек HV-импульсов поджига
    
    public final int SLG_PARAM_SIGN_COEFF               = 0x14;    //знаковый коэффициент
    public final int SLG_PARAM_DEV_NUM                  = 0x15;    //Серийный номер прибора
    //public final int SLG_PARAM_DEV_NUM                  = 0x16;    //Серийный номер прибора. старший байт

    public final int SLG_PARAM_DATE_Y                   = 0x17;    //Дата.год
    public final int SLG_PARAM_DATE_M                   = 0x18;    //Дата.месяц
    public final int SLG_PARAM_DATE_D                   = 0x19;    //Дата.день
    
    public final int SLG_PARAM_ORG                      = 0x1A;    //Название организации
    public final int SLG_PARAM_ORG_B1                   = 0x1B;    //Название организации. Байт 1
    public final int SLG_PARAM_ORG_B2                   = 0x1C;    //Название организации. Байт 2
    public final int SLG_PARAM_ORG_B3                   = 0x1D;    //Название организации. Байт 3
    public final int SLG_PARAM_ORG_B4                   = 0x1E;    //Название организации. Байт 4
    public final int SLG_PARAM_ORG_B5                   = 0x1F;    //Название организации. Байт 5
    public final int SLG_PARAM_ORG_B6                   = 0x20;    //Название организации. Байт 6
    public final int SLG_PARAM_ORG_B7                   = 0x21;    //Название организации. Байт 7
    public final int SLG_PARAM_ORG_B8                   = 0x22;    //Название организации. Байт 8
    public final int SLG_PARAM_ORG_B9                   = 0x23;    //Название организации. Байт 9
    public final int SLG_PARAM_ORG_B10                  = 0x24;    //Название организации. Байт 10
    public final int SLG_PARAM_ORG_B11                  = 0x25;    //Название организации. Байт 11
    public final int SLG_PARAM_ORG_B12                  = 0x26;    //Название организации. Байт 12
    public final int SLG_PARAM_ORG_B13                  = 0x27;    //Название организации. Байт 13
    public final int SLG_PARAM_ORG_B14                  = 0x28;    //Название организации. Байт 14
    public final int SLG_PARAM_ORG_B15                  = 0x29;    //Название организации. Байт 15
    public final int SLG_PARAM_ORG_B16                  = 0x2A;    //Название организации. Байт 16
    
    public final int SLG_PARAM_VERSION                  = 0x2B;    //версия прошивки

    public final int SLG_PARAM_TCALIB_T1                = 0x2C;    //температура нижней точки температурной калибровки
    public final int SLG_PARAM_TCALIB_T1_TD1            = 0x2D;    //показания датчика TD1 на нижней температурной точке
    public final int SLG_PARAM_TCALIB_T1_TD2            = 0x2E;    //показания датчика TD2 на нижней температурной точке
    public final int SLG_PARAM_TCALIB_T1_TD3            = 0x2F;    //показания датчика TD3 на нижней температурной точке
    
    public final int SLG_PARAM_TCALIB_T2                = 0x30;    //температура верхней точки температурной калибровки
    public final int SLG_PARAM_TCALIB_T2_TD1            = 0x31;    //показания датчика TD1 на верхней температурной точке
    public final int SLG_PARAM_TCALIB_T2_TD2            = 0x32;    //показания датчика TD2 на верхней температурной точке
    public final int SLG_PARAM_TCALIB_T2_TD3            = 0x33;    //показания датчика TD3 на верхней температурной точке
    
    //LAST                      0x34 = 52 - HV_APPLY_PACKS
}
