/*
 * An XML document type.
 * Localname: GetContactBatch
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetContactBatch(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetContactBatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetContactBatchDocument
{
    
    public GetContactBatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCONTACTBATCH$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetContactBatch");
    
    
    /**
     * Gets the "GetContactBatch" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACTBATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetContactBatch" element
     */
    public void setGetContactBatch(com.callfire.api.service.xsd.IdRequest getContactBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACTBATCH$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACTBATCH$0);
            }
            target.set(getContactBatch);
        }
    }
    
    /**
     * Appends and returns a new empty "GetContactBatch" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACTBATCH$0);
            return target;
        }
    }
}
