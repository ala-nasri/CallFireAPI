/*
 * An XML document type.
 * Localname: UpdateSubscription
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.UpdateSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one UpdateSubscription(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class UpdateSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UpdateSubscriptionDocument
{
    
    public UpdateSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "UpdateSubscription");
    
    
    /**
     * Gets the "UpdateSubscription" element
     */
    public com.callfire.api.service.xsd.SubscriptionRequest getUpdateSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().find_element_user(UPDATESUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateSubscription" element
     */
    public void setUpdateSubscription(com.callfire.api.service.xsd.SubscriptionRequest updateSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().find_element_user(UPDATESUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().add_element_user(UPDATESUBSCRIPTION$0);
            }
            target.set(updateSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateSubscription" element
     */
    public com.callfire.api.service.xsd.SubscriptionRequest addNewUpdateSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionRequest target = null;
            target = (com.callfire.api.service.xsd.SubscriptionRequest)get_store().add_element_user(UPDATESUBSCRIPTION$0);
            return target;
        }
    }
}
