/*
 * An XML document type.
 * Localname: BroadcastScheduleQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one BroadcastScheduleQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class BroadcastScheduleQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument
{
    
    public BroadcastScheduleQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTSCHEDULEQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastScheduleQueryResult");
    
    
    /**
     * Gets the "BroadcastScheduleQueryResult" element
     */
    public com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult getBroadcastScheduleQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult)get_store().find_element_user(BROADCASTSCHEDULEQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastScheduleQueryResult" element
     */
    public void setBroadcastScheduleQueryResult(com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult broadcastScheduleQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult)get_store().find_element_user(BROADCASTSCHEDULEQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult)get_store().add_element_user(BROADCASTSCHEDULEQUERYRESULT$0);
            }
            target.set(broadcastScheduleQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastScheduleQueryResult" element
     */
    public com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult addNewBroadcastScheduleQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult target = null;
            target = (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult)get_store().add_element_user(BROADCASTSCHEDULEQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML BroadcastScheduleQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class BroadcastScheduleQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult
    {
        
        public BroadcastScheduleQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BROADCASTSCHEDULE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastSchedule");
        
        
        /**
         * Gets array of all "BroadcastSchedule" elements
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[] getBroadcastScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BROADCASTSCHEDULE$0, targetList);
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[] result = new com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BroadcastSchedule" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BroadcastSchedule" element
         */
        public int sizeOfBroadcastScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BROADCASTSCHEDULE$0);
            }
        }
        
        /**
         * Sets array of all "BroadcastSchedule" element
         */
        public void setBroadcastScheduleArray(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[] broadcastScheduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(broadcastScheduleArray, BROADCASTSCHEDULE$0);
            }
        }
        
        /**
         * Sets ith "BroadcastSchedule" element
         */
        public void setBroadcastScheduleArray(int i, com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(broadcastSchedule);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BroadcastSchedule" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule insertNewBroadcastSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().insert_element_user(BROADCASTSCHEDULE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BroadcastSchedule" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().add_element_user(BROADCASTSCHEDULE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BroadcastSchedule" element
         */
        public void removeBroadcastSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BROADCASTSCHEDULE$0, i);
            }
        }
    }
}
