/*
 * An XML document type.
 * Localname: CreateBroadcastSchedule
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateBroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateBroadcastSchedule(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateBroadcastScheduleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateBroadcastScheduleDocument
{
    
    public CreateBroadcastScheduleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEBROADCASTSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateBroadcastSchedule");
    
    
    /**
     * Gets the "CreateBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule getCreateBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule target = null;
            target = (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule)get_store().find_element_user(CREATEBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateBroadcastSchedule" element
     */
    public void setCreateBroadcastSchedule(com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule createBroadcastSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule target = null;
            target = (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule)get_store().find_element_user(CREATEBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule)get_store().add_element_user(CREATEBROADCASTSCHEDULE$0);
            }
            target.set(createBroadcastSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule addNewCreateBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule target = null;
            target = (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule)get_store().add_element_user(CREATEBROADCASTSCHEDULE$0);
            return target;
        }
    }
    /**
     * An XML CreateBroadcastSchedule(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateBroadcastScheduleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule
    {
        
        public CreateBroadcastScheduleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
        private static final javax.xml.namespace.QName BROADCASTID$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastId");
        private static final javax.xml.namespace.QName BROADCASTSCHEDULE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastSchedule");
        
        
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
         * Gets the "BroadcastSchedule" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "BroadcastSchedule" element
         */
        public void setBroadcastSchedule(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().add_element_user(BROADCASTSCHEDULE$4);
                }
                target.set(broadcastSchedule);
            }
        }
        
        /**
         * Appends and returns a new empty "BroadcastSchedule" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().add_element_user(BROADCASTSCHEDULE$4);
                return target;
            }
        }
    }
}
