/*
 * An XML document type.
 * Localname: LabelNumber
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.LabelNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one LabelNumber(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class LabelNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.LabelNumberDocument
{
    
    public LabelNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELNUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelNumber");
    
    
    /**
     * Gets the "LabelNumber" element
     */
    public com.callfire.api.service.xsd.NumberLabelRequest getLabelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().find_element_user(LABELNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabelNumber" element
     */
    public void setLabelNumber(com.callfire.api.service.xsd.NumberLabelRequest labelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().find_element_user(LABELNUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().add_element_user(LABELNUMBER$0);
            }
            target.set(labelNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "LabelNumber" element
     */
    public com.callfire.api.service.xsd.NumberLabelRequest addNewLabelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().add_element_user(LABELNUMBER$0);
            return target;
        }
    }
}
