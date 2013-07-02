/*
 * An XML document type.
 * Localname: DeleteAutoReply
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.DeleteAutoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one DeleteAutoReply(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class DeleteAutoReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteAutoReplyDocument
{
    
    public DeleteAutoReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEAUTOREPLY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "DeleteAutoReply");
    
    
    /**
     * Gets the "DeleteAutoReply" element
     */
    public com.callfire.api.service.xsd.IdRequest getDeleteAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETEAUTOREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAutoReply" element
     */
    public void setDeleteAutoReply(com.callfire.api.service.xsd.IdRequest deleteAutoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETEAUTOREPLY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETEAUTOREPLY$0);
            }
            target.set(deleteAutoReply);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteAutoReply" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewDeleteAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETEAUTOREPLY$0);
            return target;
        }
    }
}
