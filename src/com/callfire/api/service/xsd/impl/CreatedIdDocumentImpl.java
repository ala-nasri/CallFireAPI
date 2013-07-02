/*
 * An XML document type.
 * Localname: CreatedId
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreatedIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreatedId(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreatedIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreatedIdDocument
{
    
    public CreatedIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreatedId");
    
    
    /**
     * Gets the "CreatedId" element
     */
    public long getCreatedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedId" element
     */
    public org.apache.xmlbeans.XmlLong xgetCreatedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CREATEDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreatedId" element
     */
    public void setCreatedId(long createdId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDID$0);
            }
            target.setLongValue(createdId);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedId" element
     */
    public void xsetCreatedId(org.apache.xmlbeans.XmlLong createdId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CREATEDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CREATEDID$0);
            }
            target.set(createdId);
        }
    }
}
