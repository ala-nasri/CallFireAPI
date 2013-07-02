/*
 * An XML document type.
 * Localname: RemoveContactsFromList
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.RemoveContactsFromListDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one RemoveContactsFromList(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class RemoveContactsFromListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.RemoveContactsFromListDocument
{
    
    public RemoveContactsFromListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVECONTACTSFROMLIST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RemoveContactsFromList");
    
    
    /**
     * Gets the "RemoveContactsFromList" element
     */
    public com.callfire.api.service.xsd.ContactListRequest getRemoveContactsFromList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().find_element_user(REMOVECONTACTSFROMLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveContactsFromList" element
     */
    public void setRemoveContactsFromList(com.callfire.api.service.xsd.ContactListRequest removeContactsFromList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().find_element_user(REMOVECONTACTSFROMLIST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactListRequest)get_store().add_element_user(REMOVECONTACTSFROMLIST$0);
            }
            target.set(removeContactsFromList);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveContactsFromList" element
     */
    public com.callfire.api.service.xsd.ContactListRequest addNewRemoveContactsFromList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().add_element_user(REMOVECONTACTSFROMLIST$0);
            return target;
        }
    }
}
