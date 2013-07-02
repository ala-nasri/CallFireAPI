/*
 * An XML document type.
 * Localname: RemoveContacts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.RemoveContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one RemoveContacts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class RemoveContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.RemoveContactsDocument
{
    
    public RemoveContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVECONTACTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RemoveContacts");
    
    
    /**
     * Gets the "RemoveContacts" element
     */
    public com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts getRemoveContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts target = null;
            target = (com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts)get_store().find_element_user(REMOVECONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveContacts" element
     */
    public void setRemoveContacts(com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts removeContacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts target = null;
            target = (com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts)get_store().find_element_user(REMOVECONTACTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts)get_store().add_element_user(REMOVECONTACTS$0);
            }
            target.set(removeContacts);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveContacts" element
     */
    public com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts addNewRemoveContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts target = null;
            target = (com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts)get_store().add_element_user(REMOVECONTACTS$0);
            return target;
        }
    }
    /**
     * An XML RemoveContacts(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class RemoveContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.RemoveContactsDocument.RemoveContacts
    {
        
        public RemoveContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactId");
        
        
        /**
         * Gets the "ContactId" element
         */
        public java.util.List getContactId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContactId" element
         */
        public com.callfire.api.service.xsd.IdList xgetContactId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.IdList target = null;
                target = (com.callfire.api.service.xsd.IdList)get_store().find_element_user(CONTACTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ContactId" element
         */
        public void setContactId(java.util.List contactId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$0);
                }
                target.setListValue(contactId);
            }
        }
        
        /**
         * Sets (as xml) the "ContactId" element
         */
        public void xsetContactId(com.callfire.api.service.xsd.IdList contactId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.IdList target = null;
                target = (com.callfire.api.service.xsd.IdList)get_store().find_element_user(CONTACTID$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.IdList)get_store().add_element_user(CONTACTID$0);
                }
                target.set(contactId);
            }
        }
    }
}
