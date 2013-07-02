/*
 * An XML document type.
 * Localname: ContactBatch
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one ContactBatch(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class ContactBatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactBatchDocument
{
    
    public ContactBatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTBATCH$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactBatch");
    
    
    /**
     * Gets the "ContactBatch" element
     */
    public com.callfire.api.data.ContactBatchDocument.ContactBatch getContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
            target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().find_element_user(CONTACTBATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactBatch" element
     */
    public void setContactBatch(com.callfire.api.data.ContactBatchDocument.ContactBatch contactBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
            target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().find_element_user(CONTACTBATCH$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().add_element_user(CONTACTBATCH$0);
            }
            target.set(contactBatch);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactBatch" element
     */
    public com.callfire.api.data.ContactBatchDocument.ContactBatch addNewContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
            target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().add_element_user(CONTACTBATCH$0);
            return target;
        }
    }
    /**
     * An XML ContactBatch(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class ContactBatchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactBatchDocument.ContactBatch
    {
        
        public ContactBatchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        private static final javax.xml.namespace.QName STATUS$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName BROADCASTID$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastId");
        private static final javax.xml.namespace.QName CREATED$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
        private static final javax.xml.namespace.QName SIZE$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Size");
        private static final javax.xml.namespace.QName REMAINING$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Remaining");
        private static final javax.xml.namespace.QName ID$12 = 
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
         * Gets the "Status" element
         */
        public com.callfire.api.data.BatchStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.BatchStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.BatchStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BatchStatus target = null;
                target = (com.callfire.api.data.BatchStatus)get_store().find_element_user(STATUS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.BatchStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.BatchStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BatchStatus target = null;
                target = (com.callfire.api.data.BatchStatus)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BatchStatus)get_store().add_element_user(STATUS$2);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "BroadcastId" element
         */
        public long getBroadcastId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$4, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "BroadcastId" element
         */
        public org.apache.xmlbeans.XmlLong xgetBroadcastId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BroadcastId" element
         */
        public void setBroadcastId(long broadcastId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTID$4);
                }
                target.setLongValue(broadcastId);
            }
        }
        
        /**
         * Sets (as xml) the "BroadcastId" element
         */
        public void xsetBroadcastId(org.apache.xmlbeans.XmlLong broadcastId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BROADCASTID$4);
                }
                target.set(broadcastId);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$6);
                }
                target.set(created);
            }
        }
        
        /**
         * Gets the "Size" element
         */
        public int getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$8, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Size" element
         */
        public org.apache.xmlbeans.XmlInt xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SIZE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Size" element
         */
        public boolean isSetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIZE$8) != 0;
            }
        }
        
        /**
         * Sets the "Size" element
         */
        public void setSize(int size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$8);
                }
                target.setIntValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "Size" element
         */
        public void xsetSize(org.apache.xmlbeans.XmlInt size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SIZE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SIZE$8);
                }
                target.set(size);
            }
        }
        
        /**
         * Unsets the "Size" element
         */
        public void unsetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIZE$8, 0);
            }
        }
        
        /**
         * Gets the "Remaining" element
         */
        public int getRemaining()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMAINING$10, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Remaining" element
         */
        public org.apache.xmlbeans.XmlInt xgetRemaining()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REMAINING$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "Remaining" element
         */
        public boolean isSetRemaining()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMAINING$10) != 0;
            }
        }
        
        /**
         * Sets the "Remaining" element
         */
        public void setRemaining(int remaining)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMAINING$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMAINING$10);
                }
                target.setIntValue(remaining);
            }
        }
        
        /**
         * Sets (as xml) the "Remaining" element
         */
        public void xsetRemaining(org.apache.xmlbeans.XmlInt remaining)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REMAINING$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REMAINING$10);
                }
                target.set(remaining);
            }
        }
        
        /**
         * Unsets the "Remaining" element
         */
        public void unsetRemaining()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMAINING$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
    }
}
