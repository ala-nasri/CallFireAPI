/*
 * An XML document type.
 * Localname: GetContactHistory
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetContactHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetContactHistory(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetContactHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetContactHistoryDocument
{
    
    public GetContactHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCONTACTHISTORY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetContactHistory");
    
    
    /**
     * Gets the "GetContactHistory" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetContactHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACTHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetContactHistory" element
     */
    public void setGetContactHistory(com.callfire.api.service.xsd.IdRequest getContactHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACTHISTORY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACTHISTORY$0);
            }
            target.set(getContactHistory);
        }
    }
    
    /**
     * Appends and returns a new empty "GetContactHistory" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetContactHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACTHISTORY$0);
            return target;
        }
    }
}
