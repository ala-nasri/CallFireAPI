/*
 * An XML attribute type.
 * Localname: requiredIn
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.RequiredInAttribute
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one requiredIn(@http://api.callfire.com/annotations) attribute.
 *
 * This is a complex type.
 */
public class RequiredInAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.RequiredInAttribute
{
    
    public RequiredInAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIREDIN$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "requiredIn");
    
    
    /**
     * Gets the "requiredIn" attribute
     */
    public java.util.List getRequiredIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDIN$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "requiredIn" attribute
     */
    public com.callfire.api.annotations.RequiredInAttribute.RequiredIn xgetRequiredIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.RequiredInAttribute.RequiredIn target = null;
            target = (com.callfire.api.annotations.RequiredInAttribute.RequiredIn)get_store().find_attribute_user(REQUIREDIN$0);
            return target;
        }
    }
    
    /**
     * True if has "requiredIn" attribute
     */
    public boolean isSetRequiredIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUIREDIN$0) != null;
        }
    }
    
    /**
     * Sets the "requiredIn" attribute
     */
    public void setRequiredIn(java.util.List requiredIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIREDIN$0);
            }
            target.setListValue(requiredIn);
        }
    }
    
    /**
     * Sets (as xml) the "requiredIn" attribute
     */
    public void xsetRequiredIn(com.callfire.api.annotations.RequiredInAttribute.RequiredIn requiredIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.RequiredInAttribute.RequiredIn target = null;
            target = (com.callfire.api.annotations.RequiredInAttribute.RequiredIn)get_store().find_attribute_user(REQUIREDIN$0);
            if (target == null)
            {
                target = (com.callfire.api.annotations.RequiredInAttribute.RequiredIn)get_store().add_attribute_user(REQUIREDIN$0);
            }
            target.set(requiredIn);
        }
    }
    
    /**
     * Unsets the "requiredIn" attribute
     */
    public void unsetRequiredIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUIREDIN$0);
        }
    }
    /**
     * An XML requiredIn(@http://api.callfire.com/annotations).
     *
     * This is a list type whose items are com.callfire.api.annotations.RestMethod.
     */
    public static class RequiredInImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.annotations.RequiredInAttribute.RequiredIn
    {
        
        public RequiredInImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RequiredInImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
