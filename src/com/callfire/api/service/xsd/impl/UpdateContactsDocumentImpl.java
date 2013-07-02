/*
 * An XML document type.
 * Localname: UpdateContacts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.UpdateContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one UpdateContacts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class UpdateContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UpdateContactsDocument
{
    
    public UpdateContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTACTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "UpdateContacts");
    
    
    /**
     * Gets the "UpdateContacts" element
     */
    public com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts getUpdateContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts target = null;
            target = (com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts)get_store().find_element_user(UPDATECONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContacts" element
     */
    public void setUpdateContacts(com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts updateContacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts target = null;
            target = (com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts)get_store().find_element_user(UPDATECONTACTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts)get_store().add_element_user(UPDATECONTACTS$0);
            }
            target.set(updateContacts);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateContacts" element
     */
    public com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts addNewUpdateContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts target = null;
            target = (com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts)get_store().add_element_user(UPDATECONTACTS$0);
            return target;
        }
    }
    /**
     * An XML UpdateContacts(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class UpdateContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UpdateContactsDocument.UpdateContacts
    {
        
        public UpdateContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACT$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Contact");
        
        
        /**
         * Gets array of all "Contact" elements
         */
        public com.callfire.api.data.ContactDocument.Contact[] getContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACT$0, targetList);
                com.callfire.api.data.ContactDocument.Contact[] result = new com.callfire.api.data.ContactDocument.Contact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Contact" element
         */
        public com.callfire.api.data.ContactDocument.Contact getContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactDocument.Contact target = null;
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Contact" element
         */
        public int sizeOfContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT$0);
            }
        }
        
        /**
         * Sets array of all "Contact" element
         */
        public void setContactArray(com.callfire.api.data.ContactDocument.Contact[] contactArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactArray, CONTACT$0);
            }
        }
        
        /**
         * Sets ith "Contact" element
         */
        public void setContactArray(int i, com.callfire.api.data.ContactDocument.Contact contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactDocument.Contact target = null;
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contact" element
         */
        public com.callfire.api.data.ContactDocument.Contact insertNewContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactDocument.Contact target = null;
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().insert_element_user(CONTACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contact" element
         */
        public com.callfire.api.data.ContactDocument.Contact addNewContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactDocument.Contact target = null;
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Contact" element
         */
        public void removeContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT$0, i);
            }
        }
    }
}
