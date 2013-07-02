/*
 * An XML document type.
 * Localname: ContactSource
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ContactSource(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ContactSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactSourceDocument
{
    
    public ContactSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTSOURCE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactSource");
    
    
    /**
     * Gets the "ContactSource" element
     */
    public com.callfire.api.service.xsd.ContactSourceDocument.ContactSource getContactSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactSourceDocument.ContactSource target = null;
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$0, 0);
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
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$0);
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
            target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$0);
            return target;
        }
    }
    /**
     * An XML ContactSource(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ContactSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactSourceDocument.ContactSource
    {
        
        public ContactSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACT$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Contact");
        private static final javax.xml.namespace.QName CONTACTID$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactId");
        private static final javax.xml.namespace.QName FILE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "File");
        private static final javax.xml.namespace.QName NUMBERS$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Numbers");
        
        
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
        
        /**
         * Gets the "ContactId" element
         */
        public java.util.List getContactId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$2, 0);
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
                target = (com.callfire.api.service.xsd.IdList)get_store().find_element_user(CONTACTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ContactId" element
         */
        public boolean isSetContactId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTID$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$2);
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
                target = (com.callfire.api.service.xsd.IdList)get_store().find_element_user(CONTACTID$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.IdList)get_store().add_element_user(CONTACTID$2);
                }
                target.set(contactId);
            }
        }
        
        /**
         * Unsets the "ContactId" element
         */
        public void unsetContactId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTID$2, 0);
            }
        }
        
        /**
         * Gets the "File" element
         */
        public byte[] getFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "File" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FILE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "File" element
         */
        public boolean isSetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILE$4) != 0;
            }
        }
        
        /**
         * Sets the "File" element
         */
        public void setFile(byte[] file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILE$4);
                }
                target.setByteArrayValue(file);
            }
        }
        
        /**
         * Sets (as xml) the "File" element
         */
        public void xsetFile(org.apache.xmlbeans.XmlBase64Binary file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(FILE$4);
                }
                target.set(file);
            }
        }
        
        /**
         * Unsets the "File" element
         */
        public void unsetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILE$4, 0);
            }
        }
        
        /**
         * Gets the "Numbers" element
         */
        public com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers getNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers target = null;
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers)get_store().find_element_user(NUMBERS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Numbers" element
         */
        public boolean isSetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBERS$6) != 0;
            }
        }
        
        /**
         * Sets the "Numbers" element
         */
        public void setNumbers(com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers numbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers target = null;
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers)get_store().find_element_user(NUMBERS$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers)get_store().add_element_user(NUMBERS$6);
                }
                target.set(numbers);
            }
        }
        
        /**
         * Appends and returns a new empty "Numbers" element
         */
        public com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers addNewNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers target = null;
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers)get_store().add_element_user(NUMBERS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Numbers" element
         */
        public void unsetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBERS$6, 0);
            }
        }
        /**
         * An XML Numbers(@http://api.callfire.com/service/xsd).
         *
         * This is a list type whose items are com.callfire.api.data.PhoneNumber.
         */
        public static class NumbersImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers
        {
            
            public NumbersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected NumbersImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName FIELDNAME$0 = 
                new javax.xml.namespace.QName("", "fieldName");
            
            
            /**
             * Gets the "fieldName" attribute
             */
            public java.lang.String getFieldName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDNAME$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "fieldName" attribute
             */
            public org.apache.xmlbeans.XmlString xgetFieldName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FIELDNAME$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "fieldName" attribute
             */
            public boolean isSetFieldName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(FIELDNAME$0) != null;
                }
            }
            
            /**
             * Sets the "fieldName" attribute
             */
            public void setFieldName(java.lang.String fieldName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
                    }
                    target.setStringValue(fieldName);
                }
            }
            
            /**
             * Sets (as xml) the "fieldName" attribute
             */
            public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
                    }
                    target.set(fieldName);
                }
            }
            
            /**
             * Unsets the "fieldName" attribute
             */
            public void unsetFieldName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(FIELDNAME$0);
                }
            }
        }
    }
}
