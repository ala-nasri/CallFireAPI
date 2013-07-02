/*
 * An XML attribute type.
 * Localname: responseOnly
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.ResponseOnlyAttribute
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one responseOnly(@http://api.callfire.com/annotations) attribute.
 *
 * This is a complex type.
 */
public class ResponseOnlyAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.ResponseOnlyAttribute
{
    
    public ResponseOnlyAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEONLY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "responseOnly");
    
    
    /**
     * Gets the "responseOnly" attribute
     */
    public boolean getResponseOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEONLY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESPONSEONLY$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseOnly" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetResponseOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESPONSEONLY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RESPONSEONLY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "responseOnly" attribute
     */
    public boolean isSetResponseOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESPONSEONLY$0) != null;
        }
    }
    
    /**
     * Sets the "responseOnly" attribute
     */
    public void setResponseOnly(boolean responseOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEONLY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSEONLY$0);
            }
            target.setBooleanValue(responseOnly);
        }
    }
    
    /**
     * Sets (as xml) the "responseOnly" attribute
     */
    public void xsetResponseOnly(org.apache.xmlbeans.XmlBoolean responseOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESPONSEONLY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RESPONSEONLY$0);
            }
            target.set(responseOnly);
        }
    }
    
    /**
     * Unsets the "responseOnly" attribute
     */
    public void unsetResponseOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESPONSEONLY$0);
        }
    }
}
