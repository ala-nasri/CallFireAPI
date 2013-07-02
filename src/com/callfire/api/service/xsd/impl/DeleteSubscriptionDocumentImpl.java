/*
 * An XML document type.
 * Localname: DeleteSubscription
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.DeleteSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one DeleteSubscription(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class DeleteSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteSubscriptionDocument
{
    
    public DeleteSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETESUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "DeleteSubscription");
    
    
    /**
     * Gets the "DeleteSubscription" element
     */
    public com.callfire.api.service.xsd.IdRequest getDeleteSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETESUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteSubscription" element
     */
    public void setDeleteSubscription(com.callfire.api.service.xsd.IdRequest deleteSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETESUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETESUBSCRIPTION$0);
            }
            target.set(deleteSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteSubscription" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewDeleteSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETESUBSCRIPTION$0);
            return target;
        }
    }
}
