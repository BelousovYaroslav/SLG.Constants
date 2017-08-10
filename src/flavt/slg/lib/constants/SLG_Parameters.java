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
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        SLG_Parameter param = new SLG_Parameter();
        param.SetName( "Термодатчик 1");
        param.SetFullName( "000.Термодатчик 1");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD1, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Термодатчик 2");
        param.SetFullName( "001.Термодатчик 2");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD2, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Термодатчик 3");
        param.SetFullName( "002.Термодатчик 3");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_UTD3, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Разрядный ток I1");
        param.SetFullName( "003.Разрядный ток I1");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_I1, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Разрядный ток I2");
        param.SetFullName( "004.Разрядный ток I2");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_I2, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Напряжение на рьезокорректорах");
        param.SetFullName( "005.Напряжение на рьезокорректорах");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_VRPC, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Амплитуда колебаний виброподвеса получамая от Altera");
        param.SetFullName( "006.Амплитуда колебаний виброподвеса получамая от Altera");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPLANG_ALTERA, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Амплитуда колебаний виброподвеса получаемая от ДУП");
        param.SetFullName( "007.Амплитуда колебаний виброподвеса получаемая от ДУП");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_AMPLANG_DUS, param);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        param = new SLG_Parameter();
        param.SetName( "Напряжение RULA (задатчик амплитуды колебаний виброподвеса)");
        param.SetFullName( "008.Напряжение RULA (задатчик амплитуды колебаний виброподвеса)");
        param.SetCanBeAddedToList( true);
        
        m_devices.put( SLG_ConstantsParams.SLG_PARAM_RULA, param);
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
            if( param.GetCanBeAddedToList()) {
                model.addElement( param.GetFullName());
            }
        }
    }
}
