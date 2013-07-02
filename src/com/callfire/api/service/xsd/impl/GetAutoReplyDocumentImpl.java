/*
 * An XML document type.
 * Localname: GetAutoReply
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetAutoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetAutoReply(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetAutoReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetAutoReplyDocument
{
    
    public GetAutoReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAUTOREPLY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetAutoReply");
    
    
    /**
     * Gets the "GetAutoReply" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETAUTOREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAutoReply" element
     */
    public void setGetAutoReply(com.callfire.api.service.xsd.IdRequest getAutoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETAUTOREPLY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETAUTOREPLY$0);
            }
            target.set(getAutoReply);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAutoReply" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETAUTOREPLY$0);
            return target;
        }
    }
}
