/*
 * An XML document type.
 * Localname: GetNumberOrder
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetNumberOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetNumberOrder(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetNumberOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetNumberOrderDocument
{
    
    public GetNumberOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETNUMBERORDER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetNumberOrder");
    
    
    /**
     * Gets the "GetNumberOrder" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETNUMBERORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetNumberOrder" element
     */
    public void setGetNumberOrder(com.callfire.api.service.xsd.IdRequest getNumberOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETNUMBERORDER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETNUMBERORDER$0);
            }
            target.set(getNumberOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "GetNumberOrder" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETNUMBERORDER$0);
            return target;
        }
    }
}
