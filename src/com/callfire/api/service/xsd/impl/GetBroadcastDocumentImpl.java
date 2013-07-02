/*
 * An XML document type.
 * Localname: GetBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetBroadcastDocument
{
    
    public GetBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetBroadcast");
    
    
    /**
     * Gets the "GetBroadcast" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBroadcast" element
     */
    public void setGetBroadcast(com.callfire.api.service.xsd.IdRequest getBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETBROADCAST$0);
            }
            target.set(getBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBroadcast" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETBROADCAST$0);
            return target;
        }
    }
}
