/*
 * An XML document type.
 * Localname: Call
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.CallDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Call(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class CallDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.CallDocument
{
    
    public CallDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Call");
    
    
    /**
     * Gets the "Call" element
     */
    public com.callfire.api.data.CallDocument.Call getCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallDocument.Call target = null;
            target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Call" element
     */
    public void setCall(com.callfire.api.data.CallDocument.Call call)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallDocument.Call target = null;
            target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.CallDocument.Call)get_store().add_element_user(CALL$0);
            }
            target.set(call);
        }
    }
    
    /**
     * Appends and returns a new empty "Call" element
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
     * An XML Call(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class CallImpl extends com.callfire.api.data.impl.ActionImpl implements com.callfire.api.data.CallDocument.Call
    {
        
        public CallImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALLRECORD$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "CallRecord");
        
        
        /**
         * Gets array of all "CallRecord" elements
         */
        public com.callfire.api.data.CallRecordDocument.CallRecord[] getCallRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CALLRECORD$0, targetList);
                com.callfire.api.data.CallRecordDocument.CallRecord[] result = new com.callfire.api.data.CallRecordDocument.CallRecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CallRecord" element
         */
        public com.callfire.api.data.CallRecordDocument.CallRecord getCallRecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallRecordDocument.CallRecord target = null;
                target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().find_element_user(CALLRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CallRecord" element
         */
        public int sizeOfCallRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALLRECORD$0);
            }
        }
        
        /**
         * Sets array of all "CallRecord" element
         */
        public void setCallRecordArray(com.callfire.api.data.CallRecordDocument.CallRecord[] callRecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(callRecordArray, CALLRECORD$0);
            }
        }
        
        /**
         * Sets ith "CallRecord" element
         */
        public void setCallRecordArray(int i, com.callfire.api.data.CallRecordDocument.CallRecord callRecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallRecordDocument.CallRecord target = null;
                target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().find_element_user(CALLRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(callRecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CallRecord" element
         */
        public com.callfire.api.data.CallRecordDocument.CallRecord insertNewCallRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallRecordDocument.CallRecord target = null;
                target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().insert_element_user(CALLRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CallRecord" element
         */
        public com.callfire.api.data.CallRecordDocument.CallRecord addNewCallRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallRecordDocument.CallRecord target = null;
                target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().add_element_user(CALLRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CallRecord" element
         */
        public void removeCallRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALLRECORD$0, i);
            }
        }
    }
}
