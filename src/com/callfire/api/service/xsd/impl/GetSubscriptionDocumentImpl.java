/*
 * An XML document type.
 * Localname: GetSubscription
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetSubscription(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetSubscriptionDocument
{
    
    public GetSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetSubscription");
    
    
    /**
     * Gets the "GetSubscription" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETSUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSubscription" element
     */
    public void setGetSubscription(com.callfire.api.service.xsd.IdRequest getSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETSUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETSUBSCRIPTION$0);
            }
            target.set(getSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSubscription" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETSUBSCRIPTION$0);
            return target;
        }
    }
}
