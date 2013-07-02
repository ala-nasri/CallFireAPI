/*
 * An XML document type.
 * Localname: AddContactsToList
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.AddContactsToListDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one AddContactsToList(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class AddContactsToListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.AddContactsToListDocument
{
    
    public AddContactsToListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDCONTACTSTOLIST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "AddContactsToList");
    
    
    /**
     * Gets the "AddContactsToList" element
     */
    public com.callfire.api.service.xsd.ContactListRequest getAddContactsToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().find_element_user(ADDCONTACTSTOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddContactsToList" element
     */
    public void setAddContactsToList(com.callfire.api.service.xsd.ContactListRequest addContactsToList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().find_element_user(ADDCONTACTSTOLIST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactListRequest)get_store().add_element_user(ADDCONTACTSTOLIST$0);
            }
            target.set(addContactsToList);
        }
    }
    
    /**
     * Appends and returns a new empty "AddContactsToList" element
     */
    public com.callfire.api.service.xsd.ContactListRequest addNewAddContactsToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListRequest target = null;
            target = (com.callfire.api.service.xsd.ContactListRequest)get_store().add_element_user(ADDCONTACTSTOLIST$0);
            return target;
        }
    }
}
