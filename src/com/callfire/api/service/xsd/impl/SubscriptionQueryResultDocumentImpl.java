/*
 * An XML document type.
 * Localname: SubscriptionQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SubscriptionQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SubscriptionQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SubscriptionQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SubscriptionQueryResultDocument
{
    
    public SubscriptionQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SubscriptionQueryResult");
    
    
    /**
     * Gets the "SubscriptionQueryResult" element
     */
    public com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult getSubscriptionQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult target = null;
            target = (com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult)get_store().find_element_user(SUBSCRIPTIONQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionQueryResult" element
     */
    public void setSubscriptionQueryResult(com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult subscriptionQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult target = null;
            target = (com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult)get_store().find_element_user(SUBSCRIPTIONQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult)get_store().add_element_user(SUBSCRIPTIONQUERYRESULT$0);
            }
            target.set(subscriptionQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionQueryResult" element
     */
    public com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult addNewSubscriptionQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult target = null;
            target = (com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult)get_store().add_element_user(SUBSCRIPTIONQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML SubscriptionQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SubscriptionQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.SubscriptionQueryResultDocument.SubscriptionQueryResult
    {
        
        public SubscriptionQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBSCRIPTION$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Subscription");
        
        
        /**
         * Gets array of all "Subscription" elements
         */
        public com.callfire.api.data.SubscriptionDocument.Subscription[] getSubscriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBSCRIPTION$0, targetList);
                com.callfire.api.data.SubscriptionDocument.Subscription[] result = new com.callfire.api.data.SubscriptionDocument.Subscription[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subscription" element
         */
        public com.callfire.api.data.SubscriptionDocument.Subscription getSubscriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subscription" element
         */
        public int sizeOfSubscriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSCRIPTION$0);
            }
        }
        
        /**
         * Sets array of all "Subscription" element
         */
        public void setSubscriptionArray(com.callfire.api.data.SubscriptionDocument.Subscription[] subscriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subscriptionArray, SUBSCRIPTION$0);
            }
        }
        
        /**
         * Sets ith "Subscription" element
         */
        public void setSubscriptionArray(int i, com.callfire.api.data.SubscriptionDocument.Subscription subscription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().find_element_user(SUBSCRIPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subscription);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subscription" element
         */
        public com.callfire.api.data.SubscriptionDocument.Subscription insertNewSubscription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SubscriptionDocument.Subscription target = null;
                target = (com.callfire.api.data.SubscriptionDocument.Subscription)get_store().insert_element_user(SUBSCRIPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subscription" element
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
         * Removes the ith "Subscription" element
         */
        public void removeSubscription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSCRIPTION$0, i);
            }
        }
    }
}
