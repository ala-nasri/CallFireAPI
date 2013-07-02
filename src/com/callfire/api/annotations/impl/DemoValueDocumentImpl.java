/*
 * An XML document type.
 * Localname: demoValue
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.DemoValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one demoValue(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class DemoValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DemoValueDocument
{
    
    public DemoValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEMOVALUE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "demoValue");
    
    
    /**
     * Gets the "demoValue" element
     */
    public java.lang.String getDemoValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "demoValue" element
     */
    public org.apache.xmlbeans.XmlString xgetDemoValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "demoValue" element
     */
    public void setDemoValue(java.lang.String demoValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEMOVALUE$0);
            }
            target.setStringValue(demoValue);
        }
    }
    
    /**
     * Sets (as xml) the "demoValue" element
     */
    public void xsetDemoValue(org.apache.xmlbeans.XmlString demoValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEMOVALUE$0);
            }
            target.set(demoValue);
        }
    }
}
