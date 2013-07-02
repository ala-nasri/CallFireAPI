/*
 * An XML document type.
 * Localname: DeleteContactList
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.DeleteContactListDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one DeleteContactList(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class DeleteContactListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteContactListDocument
{
    
    public DeleteContactListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECONTACTLIST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "DeleteContactList");
    
    
    /**
     * Gets the "DeleteContactList" element
     */
    public com.callfire.api.service.xsd.IdRequest getDeleteContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETECONTACTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteContactList" element
     */
    public void setDeleteContactList(com.callfire.api.service.xsd.IdRequest deleteContactList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETECONTACTLIST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETECONTACTLIST$0);
            }
            target.set(deleteContactList);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteContactList" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewDeleteContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETECONTACTLIST$0);
            return target;
        }
    }
}
