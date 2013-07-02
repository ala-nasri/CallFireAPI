/*
 * An XML document type.
 * Localname: CreateSubscription
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateSubscription(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateSubscriptionDocument
{
    
    public CreateSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATESUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateSubscription");
    
    
    /**
     * Gets the "CreateSubscription" element
     */
    public com.callfire.api.service.xsd.SubscriptionRequest getCreateSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().find_element_user(CREATESUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateSubscription" element
     */
    public void setCreateSubscription(com.callfire.api.service.xsd.SubscriptionRequest createSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().find_element_user(CREATESUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().add_element_user(CREATESUBSCRIPTION$0);
            }
            target.set(createSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateSubscription" element
     */
    public com.callfire.api.service.xsd.SubscriptionRequest addNewCreateSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().add_element_user(CREATESUBSCRIPTION$0);
            return target;
        }
    }
}
