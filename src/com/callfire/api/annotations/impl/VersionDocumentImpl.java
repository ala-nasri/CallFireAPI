/*
 * An XML document type.
 * Localname: version
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.VersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one version(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class VersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.VersionDocument
{
    
    public VersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "version");
    
    
    /**
     * Gets the "version" element
     */
    public org.apache.xmlbeans.XmlObject getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.apache.xmlbeans.XmlObject version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.apache.xmlbeans.XmlObject addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
}
