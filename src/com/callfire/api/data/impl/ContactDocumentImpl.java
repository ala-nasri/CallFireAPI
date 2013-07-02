/*
 * An XML document type.
 * Localname: Contact
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Contact(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class ContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactDocument
{
    
    public ContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Contact");
    
    
    /**
     * Gets the "Contact" element
     */
    public com.callfire.api.data.ContactDocument.Contact getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactDocument.Contact target = null;
            target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contact" element
     */
    public void setContact(com.callfire.api.data.ContactDocument.Contact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactDocument.Contact target = null;
            target = (com.callfire.api.data.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
            }
            target.set(contact);
        }
    }
    
    /**
     * Appends and returns a new empty "Contact" element
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
     * An XML Contact(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class ContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactDocument.Contact
    {
        
        public ContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName FIRSTNAME$2 = 
            new javax.xml.namespace.QName("", "firstName");
        private static final javax.xml.namespace.QName LASTNAME$4 = 
            new javax.xml.namespace.QName("", "lastName");
        private static final javax.xml.namespace.QName ZIPCODE$6 = 
            new javax.xml.namespace.QName("", "zipcode");
        private static final javax.xml.namespace.QName HOMEPHONE$8 = 
            new javax.xml.namespace.QName("", "homePhone");
        private static final javax.xml.namespace.QName WORKPHONE$10 = 
            new javax.xml.namespace.QName("", "workPhone");
        private static final javax.xml.namespace.QName MOBILEPHONE$12 = 
            new javax.xml.namespace.QName("", "mobilePhone");
        
        
        /**
         * Gets the "id" attribute
         */
        public long getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$0);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$0);
            }
        }
        
        /**
         * Gets the "firstName" attribute
         */
        public java.lang.String getFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "firstName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRSTNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "firstName" attribute
         */
        public boolean isSetFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIRSTNAME$2) != null;
            }
        }
        
        /**
         * Sets the "firstName" attribute
         */
        public void setFirstName(java.lang.String firstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTNAME$2);
                }
                target.setStringValue(firstName);
            }
        }
        
        /**
         * Sets (as xml) the "firstName" attribute
         */
        public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRSTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIRSTNAME$2);
                }
                target.set(firstName);
            }
        }
        
        /**
         * Unsets the "firstName" attribute
         */
        public void unsetFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIRSTNAME$2);
            }
        }
        
        /**
         * Gets the "lastName" attribute
         */
        public java.lang.String getLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "lastName" attribute
         */
        public boolean isSetLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTNAME$4) != null;
            }
        }
        
        /**
         * Sets the "lastName" attribute
         */
        public void setLastName(java.lang.String lastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTNAME$4);
                }
                target.setStringValue(lastName);
            }
        }
        
        /**
         * Sets (as xml) the "lastName" attribute
         */
        public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTNAME$4);
                }
                target.set(lastName);
            }
        }
        
        /**
         * Unsets the "lastName" attribute
         */
        public void unsetLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTNAME$4);
            }
        }
        
        /**
         * Gets the "zipcode" attribute
         */
        public java.lang.String getZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZIPCODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "zipcode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ZIPCODE$6);
                return target;
            }
        }
        
        /**
         * True if has "zipcode" attribute
         */
        public boolean isSetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZIPCODE$6) != null;
            }
        }
        
        /**
         * Sets the "zipcode" attribute
         */
        public void setZipcode(java.lang.String zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZIPCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZIPCODE$6);
                }
                target.setStringValue(zipcode);
            }
        }
        
        /**
         * Sets (as xml) the "zipcode" attribute
         */
        public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ZIPCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ZIPCODE$6);
                }
                target.set(zipcode);
            }
        }
        
        /**
         * Unsets the "zipcode" attribute
         */
        public void unsetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZIPCODE$6);
            }
        }
        
        /**
         * Gets the "homePhone" attribute
         */
        public java.lang.String getHomePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOMEPHONE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "homePhone" attribute
         */
        public com.callfire.api.data.PhoneNumber xgetHomePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(HOMEPHONE$8);
                return target;
            }
        }
        
        /**
         * True if has "homePhone" attribute
         */
        public boolean isSetHomePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOMEPHONE$8) != null;
            }
        }
        
        /**
         * Sets the "homePhone" attribute
         */
        public void setHomePhone(java.lang.String homePhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOMEPHONE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOMEPHONE$8);
                }
                target.setStringValue(homePhone);
            }
        }
        
        /**
         * Sets (as xml) the "homePhone" attribute
         */
        public void xsetHomePhone(com.callfire.api.data.PhoneNumber homePhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(HOMEPHONE$8);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_attribute_user(HOMEPHONE$8);
                }
                target.set(homePhone);
            }
        }
        
        /**
         * Unsets the "homePhone" attribute
         */
        public void unsetHomePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOMEPHONE$8);
            }
        }
        
        /**
         * Gets the "workPhone" attribute
         */
        public java.lang.String getWorkPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKPHONE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "workPhone" attribute
         */
        public com.callfire.api.data.PhoneNumber xgetWorkPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(WORKPHONE$10);
                return target;
            }
        }
        
        /**
         * True if has "workPhone" attribute
         */
        public boolean isSetWorkPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WORKPHONE$10) != null;
            }
        }
        
        /**
         * Sets the "workPhone" attribute
         */
        public void setWorkPhone(java.lang.String workPhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKPHONE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WORKPHONE$10);
                }
                target.setStringValue(workPhone);
            }
        }
        
        /**
         * Sets (as xml) the "workPhone" attribute
         */
        public void xsetWorkPhone(com.callfire.api.data.PhoneNumber workPhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(WORKPHONE$10);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_attribute_user(WORKPHONE$10);
                }
                target.set(workPhone);
            }
        }
        
        /**
         * Unsets the "workPhone" attribute
         */
        public void unsetWorkPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WORKPHONE$10);
            }
        }
        
        /**
         * Gets the "mobilePhone" attribute
         */
        public java.lang.String getMobilePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEPHONE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mobilePhone" attribute
         */
        public com.callfire.api.data.PhoneNumber xgetMobilePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(MOBILEPHONE$12);
                return target;
            }
        }
        
        /**
         * True if has "mobilePhone" attribute
         */
        public boolean isSetMobilePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MOBILEPHONE$12) != null;
            }
        }
        
        /**
         * Sets the "mobilePhone" attribute
         */
        public void setMobilePhone(java.lang.String mobilePhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEPHONE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOBILEPHONE$12);
                }
                target.setStringValue(mobilePhone);
            }
        }
        
        /**
         * Sets (as xml) the "mobilePhone" attribute
         */
        public void xsetMobilePhone(com.callfire.api.data.PhoneNumber mobilePhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_attribute_user(MOBILEPHONE$12);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_attribute_user(MOBILEPHONE$12);
                }
                target.set(mobilePhone);
            }
        }
        
        /**
         * Unsets the "mobilePhone" attribute
         */
        public void unsetMobilePhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MOBILEPHONE$12);
            }
        }
    }
}
