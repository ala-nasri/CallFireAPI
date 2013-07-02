/*
 * An XML document type.
 * Localname: QueryContactBatches
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryContactBatchesDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryContactBatches(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryContactBatchesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryContactBatchesDocument
{
    
    public QueryContactBatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCONTACTBATCHES$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryContactBatches");
    
    
    /**
     * Gets the "QueryContactBatches" element
     */
    public com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches getQueryContactBatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches target = null;
            target = (com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches)get_store().find_element_user(QUERYCONTACTBATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryContactBatches" element
     */
    public void setQueryContactBatches(com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches queryContactBatches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches target = null;
            target = (com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches)get_store().find_element_user(QUERYCONTACTBATCHES$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches)get_store().add_element_user(QUERYCONTACTBATCHES$0);
            }
            target.set(queryContactBatches);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryContactBatches" element
     */
    public com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches addNewQueryContactBatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches target = null;
            target = (com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches)get_store().add_element_user(QUERYCONTACTBATCHES$0);
            return target;
        }
    }
    /**
     * An XML QueryContactBatches(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class QueryContactBatchesImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.QueryContactBatchesDocument.QueryContactBatches
    {
        
        public QueryContactBatchesImpl(org.apache.xmlbeans.SchemaType sType)
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
