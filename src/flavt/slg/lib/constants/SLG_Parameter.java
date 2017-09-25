/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavt.slg.lib.constants;

/**
 *
 * @author yaroslav
 */
public class SLG_Parameter {
    private String m_strParameterName;
    public String GetName() { return m_strParameterName;}
    public void SetName( String strName) { m_strParameterName = strName;}
    
    private String m_strFullParameterName;
    public String GetFullName() { return m_strFullParameterName;}
    public void SetFullName( String strFullName) { m_strFullParameterName = strFullName;}
    
    private boolean m_bCanBeAddedToOutputList;
    public boolean GetCanBeAddedToOutputList() { return m_bCanBeAddedToOutputList;}
    public void SetCanBeAddedToOutputList( boolean bCanBeAdded) { m_bCanBeAddedToOutputList = bCanBeAdded;}
}
