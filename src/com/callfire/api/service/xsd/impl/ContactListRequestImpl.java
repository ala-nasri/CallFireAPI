/*
 * XML Type:  ContactListRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactListRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML ContactListRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class ContactListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactListRequest
{
    
    public ContactListRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTLISTID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactListId");
    private static final javax.xml.namespace.QName CONTACTSOURCE$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactSource");
    
    
    /**
     * Gets the "ContactListId" element
     */
    public long getContactListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactListId" element
     */
    public org.apache.xmlbeans.XmlLong xgetContactListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContactListId" element
     */
    public void setContactListId(long contactListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTLISTID$0);
            }
            target.setLongValue(contactListId);
        }
    }
    
    /**
     * Sets (as xml) the "ContactListId" element
     */
    public void xsetContactListId(org.apache.xmlbeans.XmlLong contactListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONTACTLISTID$0);
            }
            target.set(contactListId);
        }
    }
    
    /**
     * Gets the "ContactSource" element
     */
    public com.callfire.api.service.xsd.ContactSourceDocument.ContactSource getContactSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactSourceDocument.ContactSource target = null;
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactSource" element
     */
    public void setContactSource(com.callfire.api.service.xsd.ContactSourceDocument.ContactSource contactSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactSourceDocument.ContactSource target = null;
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$2, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$2);
            }
            target.set(contactSource);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactSource" element
     */
    public com.callfire.api.service.xsd.ContactSourceDocument.ContactSource addNewContactSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactSourceDocument.ContactSource target = null;
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$2);
            return target;
        }
    }
}
