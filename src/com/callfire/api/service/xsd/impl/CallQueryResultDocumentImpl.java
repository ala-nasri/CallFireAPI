/*
 * An XML document type.
 * Localname: CallQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CallQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CallQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CallQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CallQueryResultDocument
{
    
    public CallQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CallQueryResult");
    
    
    /**
     * Gets the "CallQueryResult" element
     */
    public com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult getCallQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult target = null;
            target = (com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult)get_store().find_element_user(CALLQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CallQueryResult" element
     */
    public void setCallQueryResult(com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult callQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult target = null;
            target = (com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult)get_store().find_element_user(CALLQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult)get_store().add_element_user(CALLQUERYRESULT$0);
            }
            target.set(callQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "CallQueryResult" element
     */
    public com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult addNewCallQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult target = null;
            target = (com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult)get_store().add_element_user(CALLQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML CallQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CallQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.CallQueryResultDocument.CallQueryResult
    {
        
        public CallQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALL$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Call");
        
        
        /**
         * Gets array of all "Call" elements
         */
        public com.callfire.api.data.CallDocument.Call[] getCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CALL$0, targetList);
                com.callfire.api.data.CallDocument.Call[] result = new com.callfire.api.data.CallDocument.Call[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Call" element
         */
        public com.callfire.api.data.CallDocument.Call getCallArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Call" element
         */
        public int sizeOfCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALL$0);
            }
        }
        
        /**
         * Sets array of all "Call" element
         */
        public void setCallArray(com.callfire.api.data.CallDocument.Call[] callArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(callArray, CALL$0);
            }
        }
        
        /**
         * Sets ith "Call" element
         */
        public void setCallArray(int i, com.callfire.api.data.CallDocument.Call call)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(call);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Call" element
         */
        public com.callfire.api.data.CallDocument.Call insertNewCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().insert_element_user(CALL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Call" element
         */
        public com.callfire.api.data.CallDocument.Call addNewCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().add_element_user(CALL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Call" element
         */
        public void removeCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALL$0, i);
            }
        }
    }
}
