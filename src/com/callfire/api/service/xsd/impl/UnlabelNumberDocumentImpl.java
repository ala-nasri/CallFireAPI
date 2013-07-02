/*
 * An XML document type.
 * Localname: UnlabelNumber
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.UnlabelNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one UnlabelNumber(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class UnlabelNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UnlabelNumberDocument
{
    
    public UnlabelNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNLABELNUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "UnlabelNumber");
    
    
    /**
     * Gets the "UnlabelNumber" element
     */
    public com.callfire.api.service.xsd.NumberLabelRequest getUnlabelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().find_element_user(UNLABELNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnlabelNumber" element
     */
    public void setUnlabelNumber(com.callfire.api.service.xsd.NumberLabelRequest unlabelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().find_element_user(UNLABELNUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().add_element_user(UNLABELNUMBER$0);
            }
            target.set(unlabelNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "UnlabelNumber" element
     */
    public com.callfire.api.service.xsd.NumberLabelRequest addNewUnlabelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberLabelRequest target = null;
            target = (com.callfire.api.service.xsd.NumberLabelRequest)get_store().add_element_user(UNLABELNUMBER$0);
            return target;
        }
    }
}
