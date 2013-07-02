/*
 * An XML document type.
 * Localname: ContactList
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactListDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one ContactList(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class ContactListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactListDocument
{
    
    public ContactListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTLIST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactList");
    
    
    /**
     * Gets the "ContactList" element
     */
    public com.callfire.api.data.ContactListDocument.ContactList getContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactListDocument.ContactList target = null;
            target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().find_element_user(CONTACTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactList" element
     */
    public void setContactList(com.callfire.api.data.ContactListDocument.ContactList contactList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactListDocument.ContactList target = null;
            target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().find_element_user(CONTACTLIST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ContactListDocument.ContactList)get_store().add_element_user(CONTACTLIST$0);
            }
            target.set(contactList);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactList" element
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
     * An XML ContactList(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class ContactListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactListDocument.ContactList
    {
        
        public ContactListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        private static final javax.xml.namespace.QName SIZE$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Size");
        private static final javax.xml.namespace.QName CREATED$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "Size" element
         */
        public java.math.BigInteger getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Size" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Size" element
         */
        public void setSize(java.math.BigInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$2);
                }
                target.setBigIntegerValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "Size" element
         */
        public void xsetSize(org.apache.xmlbeans.XmlInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SIZE$2);
                }
                target.set(size);
            }
        }
        
        /**
         * Gets the "Created" element
         */
        public java.util.Calendar getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Created" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Created" element
         */
        public void setCreated(java.util.Calendar created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$4);
                }
                target.setCalendarValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "Created" element
         */
        public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$4);
                }
                target.set(created);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public long getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(long id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setLongValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlLong id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
    }
}
