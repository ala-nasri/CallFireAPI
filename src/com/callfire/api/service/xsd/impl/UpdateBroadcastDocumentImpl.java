/*
 * An XML document type.
 * Localname: UpdateBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.UpdateBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one UpdateBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class UpdateBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UpdateBroadcastDocument
{
    
    public UpdateBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "UpdateBroadcast");
    
    
    /**
     * Gets the "UpdateBroadcast" element
     */
    public com.callfire.api.service.xsd.BroadcastRequest getUpdateBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().find_element_user(UPDATEBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateBroadcast" element
     */
    public void setUpdateBroadcast(com.callfire.api.service.xsd.BroadcastRequest updateBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().find_element_user(UPDATEBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().add_element_user(UPDATEBROADCAST$0);
            }
            target.set(updateBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateBroadcast" element
     */
    public com.callfire.api.service.xsd.BroadcastRequest addNewUpdateBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().add_element_user(UPDATEBROADCAST$0);
            return target;
        }
    }
}
