/*
 * An XML document type.
 * Localname: ContactBatchQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactBatchQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ContactBatchQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ContactBatchQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ContactBatchQueryResultDocument
{
    
    public ContactBatchQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTBATCHQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ContactBatchQueryResult");
    
    
    /**
     * Gets the "ContactBatchQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult getContactBatchQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult)get_store().find_element_user(CONTACTBATCHQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactBatchQueryResult" element
     */
    public void setContactBatchQueryResult(com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult contactBatchQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult)get_store().find_element_user(CONTACTBATCHQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult)get_store().add_element_user(CONTACTBATCHQUERYRESULT$0);
            }
            target.set(contactBatchQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactBatchQueryResult" element
     */
    public com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult addNewContactBatchQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult target = null;
            target = (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult)get_store().add_element_user(CONTACTBATCHQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML ContactBatchQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ContactBatchQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult
    {
        
        public ContactBatchQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTBATCH$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactBatch");
        
        
        /**
         * Gets array of all "ContactBatch" elements
         */
        public com.callfire.api.data.ContactBatchDocument.ContactBatch[] getContactBatchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTBATCH$0, targetList);
                com.callfire.api.data.ContactBatchDocument.ContactBatch[] result = new com.callfire.api.data.ContactBatchDocument.ContactBatch[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ContactBatch" element
         */
        public com.callfire.api.data.ContactBatchDocument.ContactBatch getContactBatchArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
                target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().find_element_user(CONTACTBATCH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ContactBatch" element
         */
        public int sizeOfContactBatchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTBATCH$0);
            }
        }
        
        /**
         * Sets array of all "ContactBatch" element
         */
        public void setContactBatchArray(com.callfire.api.data.ContactBatchDocument.ContactBatch[] contactBatchArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactBatchArray, CONTACTBATCH$0);
            }
        }
        
        /**
         * Sets ith "ContactBatch" element
         */
        public void setContactBatchArray(int i, com.callfire.api.data.ContactBatchDocument.ContactBatch contactBatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
                target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().find_element_user(CONTACTBATCH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactBatch);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactBatch" element
         */
        public com.callfire.api.data.ContactBatchDocument.ContactBatch insertNewContactBatch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.ContactBatchDocument.ContactBatch target = null;
                target = (com.callfire.api.data.ContactBatchDocument.ContactBatch)get_store().insert_element_user(CONTACTBATCH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactBatch" element
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
         * Removes the ith "ContactBatch" element
         */
        public void removeContactBatch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTBATCH$0, i);
            }
        }
    }
}
