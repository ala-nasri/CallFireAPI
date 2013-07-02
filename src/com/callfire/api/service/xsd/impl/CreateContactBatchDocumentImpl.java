/*
 * An XML document type.
 * Localname: CreateContactBatch
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateContactBatch(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateContactBatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateContactBatchDocument
{
    
    public CreateContactBatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECONTACTBATCH$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateContactBatch");
    
    
    /**
     * Gets the "CreateContactBatch" element
     */
    public com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch getCreateContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch target = null;
            target = (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch)get_store().find_element_user(CREATECONTACTBATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateContactBatch" element
     */
    public void setCreateContactBatch(com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch createContactBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch target = null;
            target = (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch)get_store().find_element_user(CREATECONTACTBATCH$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch)get_store().add_element_user(CREATECONTACTBATCH$0);
            }
            target.set(createContactBatch);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateContactBatch" element
     */
    public com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch addNewCreateContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch target = null;
            target = (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch)get_store().add_element_user(CREATECONTACTBATCH$0);
            return target;
        }
    }
    /**
     * An XML CreateContactBatch(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateContactBatchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch
    {
        
        public CreateContactBatchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
        private static final javax.xml.namespace.QName BROADCASTID$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastId");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Name");
        private static final javax.xml.namespace.QName TONUMBER$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ToNumber");
        private static final javax.xml.namespace.QName CONTACTLISTID$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactListId");
        private static final javax.xml.namespace.QName SCRUBBROADCASTDUPLICATES$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ScrubBroadcastDuplicates");
        
        
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
         * Gets the "BroadcastId" element
         */
        public long getBroadcastId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$2, 0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTID$2);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BROADCASTID$2);
                }
                target.set(broadcastId);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$4, 0);
            }
        }
        
        /**
         * Gets array of all "ToNumber" elements
         */
        public com.callfire.api.data.ToNumber[] getToNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TONUMBER$6, targetList);
                com.callfire.api.data.ToNumber[] result = new com.callfire.api.data.ToNumber[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ToNumber" element
         */
        public com.callfire.api.data.ToNumber getToNumberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ToNumber target = null;
                target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ToNumber" element
         */
        public int sizeOfToNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TONUMBER$6);
            }
        }
        
        /**
         * Sets array of all "ToNumber" element
         */
        public void setToNumberArray(com.callfire.api.data.ToNumber[] toNumberArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(toNumberArray, TONUMBER$6);
            }
        }
        
        /**
         * Sets ith "ToNumber" element
         */
        public void setToNumberArray(int i, com.callfire.api.data.ToNumber toNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ToNumber target = null;
                target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(toNumber);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ToNumber" element
         */
        public com.callfire.api.data.ToNumber insertNewToNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ToNumber target = null;
                target = (com.callfire.api.data.ToNumber)get_store().insert_element_user(TONUMBER$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ToNumber" element
         */
        public com.callfire.api.data.ToNumber addNewToNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ToNumber target = null;
                target = (com.callfire.api.data.ToNumber)get_store().add_element_user(TONUMBER$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ToNumber" element
         */
        public void removeToNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TONUMBER$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$8, 0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$8, 0);
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
                return get_store().count_elements(CONTACTLISTID$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTLISTID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTLISTID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTLISTID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONTACTLISTID$8);
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
                get_store().remove_element(CONTACTLISTID$8, 0);
            }
        }
        
        /**
         * Gets the "ScrubBroadcastDuplicates" element
         */
        public boolean getScrubBroadcastDuplicates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$10, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ScrubBroadcastDuplicates" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetScrubBroadcastDuplicates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "ScrubBroadcastDuplicates" element
         */
        public boolean isSetScrubBroadcastDuplicates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCRUBBROADCASTDUPLICATES$10) != 0;
            }
        }
        
        /**
         * Sets the "ScrubBroadcastDuplicates" element
         */
        public void setScrubBroadcastDuplicates(boolean scrubBroadcastDuplicates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRUBBROADCASTDUPLICATES$10);
                }
                target.setBooleanValue(scrubBroadcastDuplicates);
            }
        }
        
        /**
         * Sets (as xml) the "ScrubBroadcastDuplicates" element
         */
        public void xsetScrubBroadcastDuplicates(org.apache.xmlbeans.XmlBoolean scrubBroadcastDuplicates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SCRUBBROADCASTDUPLICATES$10);
                }
                target.set(scrubBroadcastDuplicates);
            }
        }
        
        /**
         * Unsets the "ScrubBroadcastDuplicates" element
         */
        public void unsetScrubBroadcastDuplicates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCRUBBROADCASTDUPLICATES$10, 0);
            }
        }
    }
}
