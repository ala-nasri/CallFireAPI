/*
 * An XML attribute type.
 * Localname: sinceVersion
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.SinceVersionAttribute
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one sinceVersion(@http://api.callfire.com/annotations) attribute.
 *
 * This is a complex type.
 */
public class SinceVersionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.SinceVersionAttribute
{
    
    public SinceVersionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINCEVERSION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "sinceVersion");
    
    
    /**
     * Gets the "sinceVersion" attribute
     */
    public java.math.BigDecimal getSinceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINCEVERSION$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "sinceVersion" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetSinceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(SINCEVERSION$0);
            return target;
        }
    }
    
    /**
     * True if has "sinceVersion" attribute
     */
    public boolean isSetSinceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SINCEVERSION$0) != null;
        }
    }
    
    /**
     * Sets the "sinceVersion" attribute
     */
    public void setSinceVersion(java.math.BigDecimal sinceVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINCEVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINCEVERSION$0);
            }
            target.setBigDecimalValue(sinceVersion);
        }
    }
    
    /**
     * Sets (as xml) the "sinceVersion" attribute
     */
    public void xsetSinceVersion(org.apache.xmlbeans.XmlDecimal sinceVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(SINCEVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(SINCEVERSION$0);
            }
            target.set(sinceVersion);
        }
    }
    
    /**
     * Unsets the "sinceVersion" attribute
     */
    public void unsetSinceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SINCEVERSION$0);
        }
    }
}
