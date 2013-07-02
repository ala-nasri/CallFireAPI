/*
 * XML Type:  ToNumber
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ToNumber
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * An XML ToNumber(@http://api.callfire.com/data).
 *
 * This is an atomic type that is a restriction of com.callfire.api.data.ToNumber.
 */
public class ToNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.callfire.api.data.ToNumber
{
    
    public ToNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ToNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CLIENTDATA$0 = 
        new javax.xml.namespace.QName("", "ClientData");
    
    
    /**
     * Gets the "ClientData" attribute
     */
    public java.lang.String getClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTDATA$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClientData" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTDATA$0);
            return target;
        }
    }
    
    /**
     * True if has "ClientData" attribute
     */
    public boolean isSetClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIENTDATA$0) != null;
        }
    }
    
    /**
     * Sets the "ClientData" attribute
     */
    public void setClientData(java.lang.String clientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTDATA$0);
            }
            target.setStringValue(clientData);
        }
    }
    
    /**
     * Sets (as xml) the "ClientData" attribute
     */
    public void xsetClientData(org.apache.xmlbeans.XmlString clientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTDATA$0);
            }
            target.set(clientData);
        }
    }
    
    /**
     * Unsets the "ClientData" attribute
     */
    public void unsetClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIENTDATA$0);
        }
    }
}
