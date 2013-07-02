/*
 * An XML document type.
 * Localname: ContactQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ContactQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ContactQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactQueryResultDocument
{
    
    public ContactQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactQueryResult");
    
    
    /**
     * Gets the "ContactQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult getContactQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult)get_store().find_element_user(CONTACTQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactQueryResult" element
     */
    public void setContactQueryResult(com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult contactQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult)get_store().find_element_user(CONTACTQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult)get_store().add_element_user(CONTACTQUERYRESULT$0);
            }
            target.set(contactQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult addNewContactQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult)get_store().add_element_user(CONTACTQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML ContactQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ContactQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult
    {
        
        public ContactQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTLISTNAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactListName");
        private static final javax.xml.namespace.QName CONTACT$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Contact");
        
        
        /**
         * Gets the "ContactListName" element
         */
        public java.lang.String getContactListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContactListName" element
         */
        public org.apache.xmlbeans.XmlString xgetContactListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTLISTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ContactListName" element
         */
        public boolean isSetContactListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTLISTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "ContactListName" element
         */
        public void setContactListName(java.lang.String contactListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTLISTNAME$0);
                }
                target.setStringValue(contactListName);
            }
        }
        
        /**
         * Sets (as xml) the "ContactListName" element
         */
        public void xsetContactListName(org.apache.xmlbeans.XmlString contactListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTLISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTLISTNAME$0);
                }
                target.set(contactListName);
            }
        }
        
        /**
         * Unsets the "ContactListName" element
         */
        public void unsetContactListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTLISTNAME$0, 0);
            }
        }
        
        /**
         * Gets array of all "Contact" elements
         */
        public com.callfire.api.data.ContactDocument.Contact[] getContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACT$2, targetList);
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
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$2, i);
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
                return get_store().count_elements(CONTACT$2);
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
                arraySetterHelper(contactArray, CONTACT$2);
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
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$2, i);
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
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().insert_element_user(CONTACT$2, i);
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
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().add_element_user(CONTACT$2);
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
                get_store().remove_element(CONTACT$2, i);
            }
        }
    }
}
