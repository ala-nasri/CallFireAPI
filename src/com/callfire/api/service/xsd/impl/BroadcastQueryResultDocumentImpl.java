/*
 * An XML document type.
 * Localname: BroadcastQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.BroadcastQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one BroadcastQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class BroadcastQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.BroadcastQueryResultDocument
{
    
    public BroadcastQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastQueryResult");
    
    
    /**
     * Gets the "BroadcastQueryResult" element
     */
    public com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult getBroadcastQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult)get_store().find_element_user(BROADCASTQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastQueryResult" element
     */
    public void setBroadcastQueryResult(com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult broadcastQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult)get_store().find_element_user(BROADCASTQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult)get_store().add_element_user(BROADCASTQUERYRESULT$0);
            }
            target.set(broadcastQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastQueryResult" element
     */
    public com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult addNewBroadcastQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult)get_store().add_element_user(BROADCASTQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML BroadcastQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class BroadcastQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.BroadcastQueryResultDocument.BroadcastQueryResult
    {
        
        public BroadcastQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BROADCAST$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Broadcast");
        
        
        /**
         * Gets array of all "Broadcast" elements
         */
        public com.callfire.api.data.BroadcastDocument.Broadcast[] getBroadcastArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BROADCAST$0, targetList);
                com.callfire.api.data.BroadcastDocument.Broadcast[] result = new com.callfire.api.data.BroadcastDocument.Broadcast[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Broadcast" element
         */
        public com.callfire.api.data.BroadcastDocument.Broadcast getBroadcastArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastDocument.Broadcast target = null;
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Broadcast" element
         */
        public int sizeOfBroadcastArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BROADCAST$0);
            }
        }
        
        /**
         * Sets array of all "Broadcast" element
         */
        public void setBroadcastArray(com.callfire.api.data.BroadcastDocument.Broadcast[] broadcastArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(broadcastArray, BROADCAST$0);
            }
        }
        
        /**
         * Sets ith "Broadcast" element
         */
        public void setBroadcastArray(int i, com.callfire.api.data.BroadcastDocument.Broadcast broadcast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastDocument.Broadcast target = null;
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(broadcast);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Broadcast" element
         */
        public com.callfire.api.data.BroadcastDocument.Broadcast insertNewBroadcast(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastDocument.Broadcast target = null;
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().insert_element_user(BROADCAST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Broadcast" element
         */
        public com.callfire.api.data.BroadcastDocument.Broadcast addNewBroadcast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastDocument.Broadcast target = null;
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().add_element_user(BROADCAST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Broadcast" element
         */
        public void removeBroadcast(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BROADCAST$0, i);
            }
        }
    }
}
