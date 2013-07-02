/*
 * An XML document type.
 * Localname: baseUrl
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.BaseUrlDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one baseUrl(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class BaseUrlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.BaseUrlDocument
{
    
    public BaseUrlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEURL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "baseUrl");
    
    
    /**
     * Gets the "baseUrl" element
     */
    public org.apache.xmlbeans.XmlObject getBaseUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BASEURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseUrl" element
     */
    public void setBaseUrl(org.apache.xmlbeans.XmlObject baseUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BASEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(BASEURL$0);
            }
            target.set(baseUrl);
        }
    }
    
    /**
     * Appends and returns a new empty "baseUrl" element
     */
    public org.apache.xmlbeans.XmlObject addNewBaseUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(BASEURL$0);
            return target;
        }
    }
}
