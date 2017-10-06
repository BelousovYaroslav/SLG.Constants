/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavt.slg.lib.constants;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author yaroslav
 */
public class SLG_Parameters {
    public TreeMap m_devices;
    
    private static SLG_Parameters singletonParameters = null;
   
    protected SLG_Parameters() {
        // Exists only to defeat instantiation.
        m_devices = new TreeMap();
        
        // 0x00 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        SLG_Parameter param = new SLG_Parameter();
        param.SetName( "Термодатчик 1");
        param.SetFullName( "000.Термодатчик 1");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD1, param);
        
        
        // 0x01 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Термодатчик 2");
        param.SetFullName( "001.Термодатчик 2");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD2, param);
        
        
        // 0x02 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Термодатчик 3");
        param.SetFullName( "002.Термодатчик 3");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD3, param);
        
        
        // 0x03 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Разрядный ток I1");
        param.SetFullName( "003.Разрядный ток I1");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_I1, param);
        
        
        // 0x04 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Разрядный ток I2");
        param.SetFullName( "004.Разрядный ток I2");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_I2, param);
        
        
        // 0x05 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Напряжение на пьезокорректорах");
        param.SetFullName( "005.Напряжение на пьезокорректорах");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_VRPC, param);
        
        
        // 0x06 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Амплитуда колебаний виброподвеса получамая от Altera");
        param.SetFullName( "006.Амплитуда колебаний виброподвеса получамая от Altera");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPLANG_ALTERA, param);
        
        
        // 0x07 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Амплитуда колебаний виброподвеса получаемая от ДУП");
        param.SetFullName( "007.Амплитуда колебаний виброподвеса получаемая от ДУП");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPLANG_DUS, param);
        
        
        // 0x08 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Напряжение RULA (задатчик амплитуды колебаний виброподвеса)");
        param.SetFullName( "008.Напряжение RULA (задатчик амплитуды колебаний виброподвеса)");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_RULA, param);
        
        
        // 0x0D *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Коэффициент вычета");
        param.SetFullName( "013.Коэффициент вычета");
        param.SetCanBeAddedToOutputList( true);

        m_devices.put( SLG_ConstantsParams.SLG_PARAM_DEC_COEFF, param);
        
        
        // 0x35 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Алгоритм стабилизации амплитуды: среднее");
        param.SetFullName( "053.Алгоритм стабилизации амплитуды: среднее");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPL_HOLD_MEAN, param);
        
        
        // 0x36 *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Алгоритм стабилизации амплитуды: круг (период среднего)");
        param.SetFullName( "054.Алгоритм стабилизации амплитуды: круг (период среднего)");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPL_HOLD_ROUND, param);
        
        
        // 0x0C *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Алгоритм стабилизации амплитуды: флаг активной регулировки");
        param.SetFullName( "055.Алгоритм стабилизации амплитуды: флаг активной регулировки");
        param.SetCanBeAddedToOutputList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPL_HOLD_ACTIVE, param);
        
        
        // 0x0D *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Время от старта прибора (сек)");
        param.SetFullName( "056.Время от старта прибора (сек)");
        param.SetCanBeAddedToOutputList( true);

        m_devices.put( SLG_ConstantsParams.SLG_PARAM_SECONDS_FROM_START, param);
    }
   
    public static SLG_Parameters getInstance() {
      if( singletonParameters == null) {
         singletonParameters = new SLG_Parameters();
      }
      return singletonParameters;
    }
    
    public void fillComboCanBeAddedToList( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            SLG_Parameter param = ( SLG_Parameter) entry.getValue();
            if( param.GetCanBeAddedToOutputList()) {
                model.addElement( param.GetFullName());
            }
        }
    }
}
