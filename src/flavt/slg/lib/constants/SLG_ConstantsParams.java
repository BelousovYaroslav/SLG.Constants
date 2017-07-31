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
public class SLG_ConstantsParams {
    public final int SLG_PARAM_UTD1                     = 0x00;    //000 термодатчик 1
    public final int SLG_PARAM_UTD2                     = 0x01;    //001 термодатчик 2
    public final int SLG_PARAM_UTD3                     = 0x02;    //002 термодатчик 3
    public final int SLG_PARAM_I1                       = 0x03;    //003 разрядный ток I1
    public final int SLG_PARAM_I2                       = 0x04;    //004 разрядный ток I2
    public final int SLG_PARAM_VRPC                     = 0x05;    //005 напряжение на пьезокорректорах
    public final int SLG_PARAM_AMPLANG_ALTERA           = 0x06;    //006 амплитуда колебаний виброподвеса получамая от Altera
    public final int SLG_PARAM_AMPLANG_DUS              = 0x07;    //007 амплитуда колебаний виброподвеса получаемая от ДУП
    public final int SLG_PARAM_RULA                     = 0x08;    //008 напряжение RULA (задатчик амплитуды колебаний виброподвеса)
    
    public final int SLG_PARAM_AMPLITUDE                = 0x09;    //009 заданная амплитуда колебаний виброподвеса
    public final int SLG_PARAM_TACT_CODE                = 0x0A;    //010 код такта подставки
    public final int SLG_PARAM_M_COEFF                  = 0x0B;    //011 коэффициент ошумления M
    public final int SLG_PARAM_START_MODE               = 0x0C;    //012 начальная мода
    public final int SLG_PARAM_DEC_COEFF                = 0x0D;    //013 начальный коэффициент вычета

    public final int SLG_PARAM_CONTROL_I1               = 0x0E;    //014 контрольное значение разрядного тока I1
    public final int SLG_PARAM_CONTROL_I2               = 0x0F;    //015 контрольное значение разрядного тока I2
    public final int SLG_PARAM_CONTROL_AA               = 0x10;    //016 контрольный сигнал раскачки AMPLANG
    
    
    public final int SLG_PARAM_HV_APPLY_COUNT_SET       = 0x11;    //017 заданное количество HV тычков
    public final int SLG_PARAM_HV_APPLY_COUNT_TR        = 0x12;    //018 количество HV тычков применённое в этом запуске
    public final int SLG_PARAM_HV_APPLY_DURAT_SET       = 0x13;    //019 заданная длительность HV тычков
    public final int SLG_PARAM_HV_APPLY_PACKS           = 0x34;    //052 количество пачек HV-импульсов поджига
    
    public final int SLG_PARAM_SIGN_COEFF               = 0x14;    //020 знаковый коэффициент
    public final int SLG_PARAM_DEV_NUM                  = 0x15;    //021 Серийный номер прибора
    //public final int SLG_PARAM_DEV_NUM                  = 0x16;    //022 Серийный номер прибора. старший байт

    public final int SLG_PARAM_DATE_Y                   = 0x17;    //023 Дата.год
    public final int SLG_PARAM_DATE_M                   = 0x18;    //024 Дата.месяц
    public final int SLG_PARAM_DATE_D                   = 0x19;    //025 Дата.день
    
    public final int SLG_PARAM_ORG                      = 0x1A;    //026 Название организации
    public final int SLG_PARAM_ORG_B1                   = 0x1B;    //027 Название организации. Байт 1
    public final int SLG_PARAM_ORG_B2                   = 0x1C;    //028 Название организации. Байт 2
    public final int SLG_PARAM_ORG_B3                   = 0x1D;    //029 Название организации. Байт 3
    public final int SLG_PARAM_ORG_B4                   = 0x1E;    //030 Название организации. Байт 4
    public final int SLG_PARAM_ORG_B5                   = 0x1F;    //031 Название организации. Байт 5
    public final int SLG_PARAM_ORG_B6                   = 0x20;    //032 Название организации. Байт 6
    public final int SLG_PARAM_ORG_B7                   = 0x21;    //033 Название организации. Байт 7
    public final int SLG_PARAM_ORG_B8                   = 0x22;    //034 Название организации. Байт 8
    public final int SLG_PARAM_ORG_B9                   = 0x23;    //035 Название организации. Байт 9
    public final int SLG_PARAM_ORG_B10                  = 0x24;    //036 Название организации. Байт 10
    public final int SLG_PARAM_ORG_B11                  = 0x25;    //037 Название организации. Байт 11
    public final int SLG_PARAM_ORG_B12                  = 0x26;    //038 Название организации. Байт 12
    public final int SLG_PARAM_ORG_B13                  = 0x27;    //039 Название организации. Байт 13
    public final int SLG_PARAM_ORG_B14                  = 0x28;    //040 Название организации. Байт 14
    public final int SLG_PARAM_ORG_B15                  = 0x29;    //041 Название организации. Байт 15
    public final int SLG_PARAM_ORG_B16                  = 0x2A;    //042 Название организации. Байт 16
    
    public final int SLG_PARAM_VERSION                  = 0x2B;    //043 версия прошивки

    public final int SLG_PARAM_TCALIB_T1                = 0x2C;    //044 температура нижней точки температурной калибровки
    public final int SLG_PARAM_TCALIB_T1_TD1            = 0x2D;    //045 показания датчика TD1 на нижней температурной точке
    public final int SLG_PARAM_TCALIB_T1_TD2            = 0x2E;    //046 показания датчика TD2 на нижней температурной точке
    public final int SLG_PARAM_TCALIB_T1_TD3            = 0x2F;    //047 показания датчика TD3 на нижней температурной точке
    
    public final int SLG_PARAM_TCALIB_T2                = 0x30;    //048 температура верхней точки температурной калибровки
    public final int SLG_PARAM_TCALIB_T2_TD1            = 0x31;    //049 показания датчика TD1 на верхней температурной точке
    public final int SLG_PARAM_TCALIB_T2_TD2            = 0x32;    //050 показания датчика TD2 на верхней температурной точке
    public final int SLG_PARAM_TCALIB_T2_TD3            = 0x33;    //051 показания датчика TD3 на верхней температурной точке
    
    //СМ ВЫШЕ public final int SLG_PARAM_HV_APPLY_PACKS = 0x34;    //052 количество пачек HV-импульсов поджига
    
    public final int SLG_PARAM_AMPL_HOLD_MEAN           = 0x35;    //053  алгоритм стабилизации амплитуды: среднее
    public final int SLG_PARAM_AMPL_HOLD_ROUND          = 0x36;    //054  алгоритм стабилизации амплитуды: круг (период среднего) 
    public final int SLG_PARAM_AMPL_HOLD_ACTIVE         = 0x37;    //055  алгоритм стабилизации амплитуды: флаг активной регулировки

    public final int SLG_PARAM_SECONDS_FROM_START       = 0x38;    //056  секундный таймер от момента старта прибора

    public final int SLG_PARAM_PH_SH_CALIB_T            = 0x39;    //057  калибровка фазового сдвига. температура
    public final int SLG_PARAM_PH_SH_CALIB_PH_SH        = 0x3A;    //058  калибровка фазового сдвига. фазовый сдвиг
}
