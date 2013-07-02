/*
 * An XML document type.
 * Localname: ContactListQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactListQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ContactListQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ContactListQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactListQueryResultDocument
{
    
    public ContactListQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTLISTQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactListQueryResult");
    
    
    /**
     * Gets the "ContactListQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult getContactListQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult)get_store().find_element_user(CONTACTLISTQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactListQueryResult" element
     */
    public void setContactListQueryResult(com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult contactListQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult)get_store().find_element_user(CONTACTLISTQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult)get_store().add_element_user(CONTACTLISTQUERYRESULT$0);
            }
            target.set(contactListQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactListQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult addNewContactListQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult)get_store().add_element_user(CONTACTLISTQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML ContactListQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ContactListQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.ContactListQueryResultDocument.ContactListQueryResult
    {
        
        public ContactListQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTLIST$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactList");
        
        
        /**
         * Gets array of all "ContactList" elements
         */
        public com.callfire.api.data.ContactListDocument.ContactList[] getContactListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTLIST$0, targetList);
                com.callfire.api.data.ContactListDocument.ContactList[] result = new com.callfire.api.data.ContactListDocument.ContactList[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ContactList" element
         */
        public com.callfire.api.data.ContactListDocument.ContactList getContactListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactListDocument.ContactList target = null;
                target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().find_element_user(CONTACTLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ContactList" element
         */
        public int sizeOfContactListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTLIST$0);
            }
        }
        
        /**
         * Sets array of all "ContactList" element
         */
        public void setContactListArray(com.callfire.api.data.ContactListDocument.ContactList[] contactListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactListArray, CONTACTLIST$0);
            }
        }
        
        /**
         * Sets ith "ContactList" element
         */
        public void setContactListArray(int i, com.callfire.api.data.ContactListDocument.ContactList contactList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactListDocument.ContactList target = null;
                target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().find_element_user(CONTACTLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactList" element
         */
        public com.callfire.api.data.ContactListDocument.ContactList insertNewContactList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactListDocument.ContactList target = null;
                target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().insert_element_user(CONTACTLIST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactList" element
         */
        public com.callfire.api.data.ContactListDocument.ContactList addNewContactList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactListDocument.ContactList target = null;
                target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().add_element_user(CONTACTLIST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ContactList" element
         */
        public void removeContactList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTLIST$0, i);
            }
        }
    }
}
