/*
 * XML Type:  SubscriptionRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SubscriptionRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML SubscriptionRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class SubscriptionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SubscriptionRequest
{
    
    public SubscriptionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
    private static final javax.xml.namespace.QName SUBSCRIPTION$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Subscription");
    
    
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
     * Gets the "Subscription" element
     */
    public com.callfire.api.data.SubscriptionDocument.Subscription getSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscription" element
     */
    public void setSubscription(com.callfire.api.data.SubscriptionDocument.Subscription subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$2, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().add_element_user(SUBSCRIPTION$2);
            }
            target.set(subscription);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    public com.callfire.api.data.SubscriptionDocument.Subscription addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().add_element_user(SUBSCRIPTION$2);
            return target;
        }
    }
}
