/*
 * XML Type:  IdLabelRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.IdLabelRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML IdLabelRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class IdLabelRequestImpl extends com.callfire.api.service.xsd.impl.IdRequestImpl implements com.callfire.api.service.xsd.IdLabelRequest
{
    
    public IdLabelRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELNAME$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
    
    
    /**
     * Gets the "LabelName" element
     */
    public java.lang.String getLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LabelName" element
     */
    public org.apache.xmlbeans.XmlString xgetLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LabelName" element
     */
    public void setLabelName(java.lang.String labelName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$0);
            }
            target.setStringValue(labelName);
        }
    }
    
    /**
     * Sets (as xml) the "LabelName" element
     */
    public void xsetLabelName(org.apache.xmlbeans.XmlString labelName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$0);
            }
            target.set(labelName);
        }
    }
}
