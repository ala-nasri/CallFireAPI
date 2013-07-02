/*
 * XML Type:  NumberLabelRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.NumberLabelRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML NumberLabelRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class NumberLabelRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.NumberLabelRequest
{
    
    public NumberLabelRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Number");
    private static final javax.xml.namespace.QName LABELNAME$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
    
    
    /**
     * Gets the "Number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public com.callfire.api.data.PhoneNumber xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(com.callfire.api.data.PhoneNumber number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "LabelName" element
     */
    public java.lang.String getLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$2);
            }
            target.set(labelName);
        }
    }
}
