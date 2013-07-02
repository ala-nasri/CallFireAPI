/*
 * An XML document type.
 * Localname: Subscription
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.SubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Subscription(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class SubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.SubscriptionDocument
{
    
    public SubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Subscription");
    
    
    /**
     * Gets the "Subscription" element
     */
    public com.callfire.api.data.SubscriptionDocument.Subscription getSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscription" element
     */
    public void setSubscription(com.callfire.api.data.SubscriptionDocument.Subscription subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().add_element_user(SUBSCRIPTION$0);
            }
            target.set(subscription);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    public com.callfire.api.data.SubscriptionDocument.Subscription addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SubscriptionDocument.Subscription target = null;
            target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().add_element_user(SUBSCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML Subscription(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class SubscriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.SubscriptionDocument.Subscription
    {
        
        public SubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENABLED$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Enabled");
        private static final javax.xml.namespace.QName ENDPOINT$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Endpoint");
        private static final javax.xml.namespace.QName NOTIFICATIONFORMAT$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "NotificationFormat");
        private static final javax.xml.namespace.QName SUBSCRIPTIONFILTER$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "SubscriptionFilter");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Enabled" element
         */
        public boolean getEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Enabled" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Enabled" element
         */
        public boolean isSetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENABLED$0) != 0;
            }
        }
        
        /**
         * Sets the "Enabled" element
         */
        public void setEnabled(boolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLED$0);
                }
                target.setBooleanValue(enabled);
            }
        }
        
        /**
         * Sets (as xml) the "Enabled" element
         */
        public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENABLED$0);
                }
                target.set(enabled);
            }
        }
        
        /**
         * Unsets the "Enabled" element
         */
        public void unsetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENABLED$0, 0);
            }
        }
        
        /**
         * Gets the "Endpoint" element
         */
        public java.lang.String getEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Endpoint" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Endpoint" element
         */
        public boolean isSetEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDPOINT$2) != 0;
            }
        }
        
        /**
         * Sets the "Endpoint" element
         */
        public void setEndpoint(java.lang.String endpoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$2);
                }
                target.setStringValue(endpoint);
            }
        }
        
        /**
         * Sets (as xml) the "Endpoint" element
         */
        public void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$2);
                }
                target.set(endpoint);
            }
        }
        
        /**
         * Unsets the "Endpoint" element
         */
        public void unsetEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDPOINT$2, 0);
            }
        }
        
        /**
         * Gets the "NotificationFormat" element
         */
        public com.callfire.api.data.NotificationFormat.Enum getNotificationFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONFORMAT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.NotificationFormat.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NotificationFormat" element
         */
        public com.callfire.api.data.NotificationFormat xgetNotificationFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NotificationFormat target = null;
                target = (com.callfire.api.data.NotificationFormat)get_store().find_element_user(NOTIFICATIONFORMAT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "NotificationFormat" element
         */
        public boolean isSetNotificationFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTIFICATIONFORMAT$4) != 0;
            }
        }
        
        /**
         * Sets the "NotificationFormat" element
         */
        public void setNotificationFormat(com.callfire.api.data.NotificationFormat.Enum notificationFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONFORMAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONFORMAT$4);
                }
                target.setEnumValue(notificationFormat);
            }
        }
        
        /**
         * Sets (as xml) the "NotificationFormat" element
         */
        public void xsetNotificationFormat(com.callfire.api.data.NotificationFormat notificationFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NotificationFormat target = null;
                target = (com.callfire.api.data.NotificationFormat)get_store().find_element_user(NOTIFICATIONFORMAT$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NotificationFormat)get_store().add_element_user(NOTIFICATIONFORMAT$4);
                }
                target.set(notificationFormat);
            }
        }
        
        /**
         * Unsets the "NotificationFormat" element
         */
        public void unsetNotificationFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTIFICATIONFORMAT$4, 0);
            }
        }
        
        /**
         * Gets the "SubscriptionFilter" element
         */
        public com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter getSubscriptionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter)get_store().find_element_user(SUBSCRIPTIONFILTER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SubscriptionFilter" element
         */
        public boolean isSetSubscriptionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSCRIPTIONFILTER$6) != 0;
            }
        }
        
        /**
         * Sets the "SubscriptionFilter" element
         */
        public void setSubscriptionFilter(com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter subscriptionFilter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter)get_store().find_element_user(SUBSCRIPTIONFILTER$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter)get_store().add_element_user(SUBSCRIPTIONFILTER$6);
                }
                target.set(subscriptionFilter);
            }
        }
        
        /**
         * Appends and returns a new empty "SubscriptionFilter" element
         */
        public com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter addNewSubscriptionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter)get_store().add_element_user(SUBSCRIPTIONFILTER$6);
                return target;
            }
        }
        
        /**
         * Unsets the "SubscriptionFilter" element
         */
        public void unsetSubscriptionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSCRIPTIONFILTER$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$8);
            }
        }
        /**
         * An XML SubscriptionFilter(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public static class SubscriptionFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter
        {
            
            public SubscriptionFilterImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BROADCASTID$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastId");
            private static final javax.xml.namespace.QName BATCHID$2 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "BatchId");
            private static final javax.xml.namespace.QName FROMNUMBER$4 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "FromNumber");
            private static final javax.xml.namespace.QName TONUMBER$6 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "ToNumber");
            private static final javax.xml.namespace.QName INBOUND$8 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Inbound");
            
            
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
             * True if has "BroadcastId" element
             */
            public boolean isSetBroadcastId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BROADCASTID$0) != 0;
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
            
            /**
             * Unsets the "BroadcastId" element
             */
            public void unsetBroadcastId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BROADCASTID$0, 0);
                }
            }
            
            /**
             * Gets the "BatchId" element
             */
            public long getBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$2, 0);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "BatchId" element
             */
            public org.apache.xmlbeans.XmlLong xgetBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "BatchId" element
             */
            public boolean isSetBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BATCHID$2) != 0;
                }
            }
            
            /**
             * Sets the "BatchId" element
             */
            public void setBatchId(long batchId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHID$2);
                    }
                    target.setLongValue(batchId);
                }
            }
            
            /**
             * Sets (as xml) the "BatchId" element
             */
            public void xsetBatchId(org.apache.xmlbeans.XmlLong batchId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BATCHID$2);
                    }
                    target.set(batchId);
                }
            }
            
            /**
             * Unsets the "BatchId" element
             */
            public void unsetBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BATCHID$2, 0);
                }
            }
            
            /**
             * Gets the "FromNumber" element
             */
            public java.lang.String getFromNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "FromNumber" element
             */
            public com.callfire.api.data.PhoneNumber xgetFromNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "FromNumber" element
             */
            public boolean isSetFromNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FROMNUMBER$4) != 0;
                }
            }
            
            /**
             * Sets the "FromNumber" element
             */
            public void setFromNumber(java.lang.String fromNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNUMBER$4);
                    }
                    target.setStringValue(fromNumber);
                }
            }
            
            /**
             * Sets (as xml) the "FromNumber" element
             */
            public void xsetFromNumber(com.callfire.api.data.PhoneNumber fromNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$4, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(FROMNUMBER$4);
                    }
                    target.set(fromNumber);
                }
            }
            
            /**
             * Unsets the "FromNumber" element
             */
            public void unsetFromNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FROMNUMBER$4, 0);
                }
            }
            
            /**
             * Gets the "ToNumber" element
             */
            public java.lang.String getToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ToNumber" element
             */
            public com.callfire.api.data.PhoneNumber xgetToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ToNumber" element
             */
            public boolean isSetToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TONUMBER$6) != 0;
                }
            }
            
            /**
             * Sets the "ToNumber" element
             */
            public void setToNumber(java.lang.String toNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TONUMBER$6);
                    }
                    target.setStringValue(toNumber);
                }
            }
            
            /**
             * Sets (as xml) the "ToNumber" element
             */
            public void xsetToNumber(com.callfire.api.data.PhoneNumber toNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$6, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(TONUMBER$6);
                    }
                    target.set(toNumber);
                }
            }
            
            /**
             * Unsets the "ToNumber" element
             */
            public void unsetToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TONUMBER$6, 0);
                }
            }
            
            /**
             * Gets the "Inbound" element
             */
            public boolean getInbound()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$8, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Inbound" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetInbound()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Inbound" element
             */
            public boolean isSetInbound()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INBOUND$8) != 0;
                }
            }
            
            /**
             * Sets the "Inbound" element
             */
            public void setInbound(boolean inbound)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOUND$8);
                    }
                    target.setBooleanValue(inbound);
                }
            }
            
            /**
             * Sets (as xml) the "Inbound" element
             */
            public void xsetInbound(org.apache.xmlbeans.XmlBoolean inbound)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INBOUND$8);
                    }
                    target.set(inbound);
                }
            }
            
            /**
             * Unsets the "Inbound" element
             */
            public void unsetInbound()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INBOUND$8, 0);
                }
            }
        }
    }
}
