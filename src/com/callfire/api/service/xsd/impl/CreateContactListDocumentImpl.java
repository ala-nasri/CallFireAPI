/*
 * An XML document type.
 * Localname: CreateContactList
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateContactListDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateContactList(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateContactListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateContactListDocument
{
    
    public CreateContactListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECONTACTLIST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateContactList");
    
    
    /**
     * Gets the "CreateContactList" element
     */
    public com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList getCreateContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList target = null;
            target = (com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList)get_store().find_element_user(CREATECONTACTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateContactList" element
     */
    public void setCreateContactList(com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList createContactList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList target = null;
            target = (com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList)get_store().find_element_user(CREATECONTACTLIST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList)get_store().add_element_user(CREATECONTACTLIST$0);
            }
            target.set(createContactList);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateContactList" element
     */
    public com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList addNewCreateContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList target = null;
            target = (com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList)get_store().add_element_user(CREATECONTACTLIST$0);
            return target;
        }
    }
    /**
     * An XML CreateContactList(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateContactListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateContactListDocument.CreateContactList
    {
        
        public CreateContactListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Name");
        private static final javax.xml.namespace.QName CONTACTSOURCE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactSource");
        
        
        /**
         * Gets the "RequestId" element
         */
        public java.lang.String getRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestId" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestId" element
         */
        public boolean isSetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$0) != 0;
            }
        }
        
        /**
         * Sets the "RequestId" element
         */
        public void setRequestId(java.lang.String requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
                }
                target.setStringValue(requestId);
            }
        }
        
        /**
         * Sets (as xml) the "RequestId" element
         */
        public void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REQUESTID$0);
                }
                target.set(requestId);
            }
        }
        
        /**
         * Unsets the "RequestId" element
         */
        public void unsetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$0, 0);
            }
        }
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
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
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$4, 0);
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
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().find_element_user(CONTACTSOURCE$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$4);
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
                target = (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource)get_store().add_element_user(CONTACTSOURCE$4);
                return target;
            }
        }
    }
}
