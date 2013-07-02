/*
 * An XML attribute type.
 * Localname: deprecatedVersion
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.DeprecatedVersionAttribute
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one deprecatedVersion(@http://api.callfire.com/annotations) attribute.
 *
 * This is a complex type.
 */
public class DeprecatedVersionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DeprecatedVersionAttribute
{
    
    public DeprecatedVersionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPRECATEDVERSION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "deprecatedVersion");
    
    
    /**
     * Gets the "deprecatedVersion" attribute
     */
    public java.math.BigDecimal getDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATEDVERSION$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "deprecatedVersion" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DEPRECATEDVERSION$0);
            return target;
        }
    }
    
    /**
     * True if has "deprecatedVersion" attribute
     */
    public boolean isSetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEPRECATEDVERSION$0) != null;
        }
    }
    
    /**
     * Sets the "deprecatedVersion" attribute
     */
    public void setDeprecatedVersion(java.math.BigDecimal deprecatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATEDVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATEDVERSION$0);
            }
            target.setBigDecimalValue(deprecatedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "deprecatedVersion" attribute
     */
    public void xsetDeprecatedVersion(org.apache.xmlbeans.XmlDecimal deprecatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DEPRECATEDVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(DEPRECATEDVERSION$0);
            }
            target.set(deprecatedVersion);
        }
    }
    
    /**
     * Unsets the "deprecatedVersion" attribute
     */
    public void unsetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEPRECATEDVERSION$0);
        }
    }
}
