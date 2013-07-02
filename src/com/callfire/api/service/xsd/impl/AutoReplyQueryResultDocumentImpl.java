/*
 * An XML document type.
 * Localname: AutoReplyQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.AutoReplyQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one AutoReplyQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class AutoReplyQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.AutoReplyQueryResultDocument
{
    
    public AutoReplyQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOREPLYQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "AutoReplyQueryResult");
    
    
    /**
     * Gets the "AutoReplyQueryResult" element
     */
    public com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult getAutoReplyQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult target = null;
            target = (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult)get_store().find_element_user(AUTOREPLYQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AutoReplyQueryResult" element
     */
    public void setAutoReplyQueryResult(com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult autoReplyQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult target = null;
            target = (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult)get_store().find_element_user(AUTOREPLYQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult)get_store().add_element_user(AUTOREPLYQUERYRESULT$0);
            }
            target.set(autoReplyQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "AutoReplyQueryResult" element
     */
    public com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult addNewAutoReplyQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult target = null;
            target = (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult)get_store().add_element_user(AUTOREPLYQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML AutoReplyQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class AutoReplyQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult
    {
        
        public AutoReplyQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTOREPLY$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "AutoReply");
        
        
        /**
         * Gets array of all "AutoReply" elements
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply[] getAutoReplyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTOREPLY$0, targetList);
                com.callfire.api.data.AutoReplyDocument.AutoReply[] result = new com.callfire.api.data.AutoReplyDocument.AutoReply[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AutoReply" element
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply getAutoReplyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AutoReply" element
         */
        public int sizeOfAutoReplyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTOREPLY$0);
            }
        }
        
        /**
         * Sets array of all "AutoReply" element
         */
        public void setAutoReplyArray(com.callfire.api.data.AutoReplyDocument.AutoReply[] autoReplyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(autoReplyArray, AUTOREPLY$0);
            }
        }
        
        /**
         * Sets ith "AutoReply" element
         */
        public void setAutoReplyArray(int i, com.callfire.api.data.AutoReplyDocument.AutoReply autoReply)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(autoReply);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AutoReply" element
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply insertNewAutoReply(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().insert_element_user(AUTOREPLY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AutoReply" element
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply addNewAutoReply()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().add_element_user(AUTOREPLY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AutoReply" element
         */
        public void removeAutoReply(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTOREPLY$0, i);
            }
        }
    }
}
