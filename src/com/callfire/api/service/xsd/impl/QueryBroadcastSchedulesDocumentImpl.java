/*
 * An XML document type.
 * Localname: QueryBroadcastSchedules
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryBroadcastSchedules(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryBroadcastSchedulesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument
{
    
    public QueryBroadcastSchedulesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBROADCASTSCHEDULES$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryBroadcastSchedules");
    
    
    /**
     * Gets the "QueryBroadcastSchedules" element
     */
    public com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules getQueryBroadcastSchedules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules)get_store().find_element_user(QUERYBROADCASTSCHEDULES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryBroadcastSchedules" element
     */
    public void setQueryBroadcastSchedules(com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules queryBroadcastSchedules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules)get_store().find_element_user(QUERYBROADCASTSCHEDULES$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules)get_store().add_element_user(QUERYBROADCASTSCHEDULES$0);
            }
            target.set(queryBroadcastSchedules);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryBroadcastSchedules" element
     */
    public com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules addNewQueryBroadcastSchedules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules)get_store().add_element_user(QUERYBROADCASTSCHEDULES$0);
            return target;
        }
    }
    /**
     * An XML QueryBroadcastSchedules(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class QueryBroadcastSchedulesImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.QueryBroadcastSchedulesDocument.QueryBroadcastSchedules
    {
        
        public QueryBroadcastSchedulesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BROADCASTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastId");
        
        
        /**
         * Gets the "BroadcastId" element
         */
        public long getBroadcastId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$0, 0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTID$0);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BROADCASTID$0);
                }
                target.set(broadcastId);
            }
        }
    }
}
