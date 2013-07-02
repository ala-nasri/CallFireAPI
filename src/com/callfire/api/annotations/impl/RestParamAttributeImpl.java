/*
 * An XML attribute type.
 * Localname: restParam
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.RestParamAttribute
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one restParam(@http://api.callfire.com/annotations) attribute.
 *
 * This is a complex type.
 */
public class RestParamAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.RestParamAttribute
{
    
    public RestParamAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTPARAM$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "restParam");
    
    
    /**
     * Gets the "restParam" attribute
     */
    public java.lang.String getRestParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTPARAM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "restParam" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetRestParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(RESTPARAM$0);
            return target;
        }
    }
    
    /**
     * True if has "restParam" attribute
     */
    public boolean isSetRestParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTPARAM$0) != null;
        }
    }
    
    /**
     * Sets the "restParam" attribute
     */
    public void setRestParam(java.lang.String restParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTPARAM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTPARAM$0);
            }
            target.setStringValue(restParam);
        }
    }
    
    /**
     * Sets (as xml) the "restParam" attribute
     */
    public void xsetRestParam(org.apache.xmlbeans.XmlToken restParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(RESTPARAM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(RESTPARAM$0);
            }
            target.set(restParam);
        }
    }
    
    /**
     * Unsets the "restParam" attribute
     */
    public void unsetRestParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTPARAM$0);
        }
    }
}
