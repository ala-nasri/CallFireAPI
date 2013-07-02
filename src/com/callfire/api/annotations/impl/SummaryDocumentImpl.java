/*
 * An XML document type.
 * Localname: summary
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.SummaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one summary(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class SummaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.SummaryDocument
{
    
    public SummaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUMMARY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "summary");
    
    
    /**
     * Gets the "summary" element
     */
    public java.lang.String getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "summary" element
     */
    public org.apache.xmlbeans.XmlString xgetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "summary" element
     */
    public void setSummary(java.lang.String summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARY$0);
            }
            target.setStringValue(summary);
        }
    }
    
    /**
     * Sets (as xml) the "summary" element
     */
    public void xsetSummary(org.apache.xmlbeans.XmlString summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUMMARY$0);
            }
            target.set(summary);
        }
    }
}
