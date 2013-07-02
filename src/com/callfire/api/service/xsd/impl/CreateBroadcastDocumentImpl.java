/*
 * An XML document type.
 * Localname: CreateBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateBroadcastDocument
{
    
    public CreateBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateBroadcast");
    
    
    /**
     * Gets the "CreateBroadcast" element
     */
    public com.callfire.api.service.xsd.BroadcastRequest getCreateBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().find_element_user(CREATEBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateBroadcast" element
     */
    public void setCreateBroadcast(com.callfire.api.service.xsd.BroadcastRequest createBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().find_element_user(CREATEBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().add_element_user(CREATEBROADCAST$0);
            }
            target.set(createBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateBroadcast" element
     */
    public com.callfire.api.service.xsd.BroadcastRequest addNewCreateBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastRequest target = null;
            target = (com.callfire.api.service.xsd.BroadcastRequest)get_store().add_element_user(CREATEBROADCAST$0);
            return target;
        }
    }
}
