/*
 * XML Type:  BroadcastRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.BroadcastRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML BroadcastRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class BroadcastRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.BroadcastRequest
{
    
    public BroadcastRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
    private static final javax.xml.namespace.QName BROADCAST$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Broadcast");
    
    
    /**
     * Gets the "RequestId" element
     */
    public java.lang.String getRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestId" element
     */
    public boolean isSetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTID$0) != 0;
        }
    }
    
    /**
     * Sets the "RequestId" element
     */
    public void setRequestId(java.lang.String requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
            }
            target.setStringValue(requestId);
        }
    }
    
    /**
     * Sets (as xml) the "RequestId" element
     */
    public void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REQUESTID$0);
            }
            target.set(requestId);
        }
    }
    
    /**
     * Unsets the "RequestId" element
     */
    public void unsetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTID$0, 0);
        }
    }
    
    /**
     * Gets the "Broadcast" element
     */
    public com.callfire.api.data.BroadcastDocument.Broadcast getBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Broadcast" element
     */
    public void setBroadcast(com.callfire.api.data.BroadcastDocument.Broadcast broadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$2, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().add_element_user(BROADCAST$2);
            }
            target.set(broadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "Broadcast" element
     */
    public com.callfire.api.data.BroadcastDocument.Broadcast addNewBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().add_element_user(BROADCAST$2);
            return target;
        }
    }
}
