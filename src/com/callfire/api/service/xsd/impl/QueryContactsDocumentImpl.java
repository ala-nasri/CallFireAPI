/*
 * An XML document type.
 * Localname: QueryContacts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryContacts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryContactsDocument
{
    
    public QueryContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCONTACTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryContacts");
    
    
    /**
     * Gets the "QueryContacts" element
     */
    public com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts getQueryContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts target = null;
            target = (com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts)get_store().find_element_user(QUERYCONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryContacts" element
     */
    public void setQueryContacts(com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts queryContacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts target = null;
            target = (com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts)get_store().find_element_user(QUERYCONTACTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts)get_store().add_element_user(QUERYCONTACTS$0);
            }
            target.set(queryContacts);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryContacts" element
     */
    public com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts addNewQueryContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts target = null;
            target = (com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts)get_store().add_element_user(QUERYCONTACTS$0);
            return target;
        }
    }
    /**
     * An XML QueryContacts(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class QueryContactsImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.QueryContactsDocument.QueryContacts
    {
        
        public QueryContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Field");
        private static final javax.xml.namespace.QName CONTACTLISTID$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactListId");
        private static final javax.xml.namespace.QName STRING$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "String");
        
        
        /**
         * Gets the "Field" element
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Field" element
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELD$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Field" element
         */
        public boolean isSetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$0) != 0;
            }
        }
        
        /**
         * Sets the "Field" element
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELD$0);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "Field" element
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELD$0);
                }
                target.set(field);
            }
        }
        
        /**
         * Unsets the "Field" element
         */
        public void unsetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$0, 0);
            }
        }
        
        /**
         * Gets the "ContactListId" element
         */
        public long getContactListId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$2, 0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ContactListId" element
         */
        public boolean isSetContactListId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTLISTID$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTLISTID$2);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONTACTLISTID$2);
                }
                target.set(contactListId);
            }
        }
        
        /**
         * Unsets the "ContactListId" element
         */
        public void unsetContactListId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTLISTID$2, 0);
            }
        }
        
        /**
         * Gets the "String" element
         */
        public java.lang.String getString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "String" element
         */
        public org.apache.xmlbeans.XmlString xgetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "String" element
         */
        public boolean isSetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$4) != 0;
            }
        }
        
        /**
         * Sets the "String" element
         */
        public void setString(java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$4);
                }
                target.setStringValue(string);
            }
        }
        
        /**
         * Sets (as xml) the "String" element
         */
        public void xsetString(org.apache.xmlbeans.XmlString string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$4);
                }
                target.set(string);
            }
        }
        
        /**
         * Unsets the "String" element
         */
        public void unsetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$4, 0);
            }
        }
    }
}
