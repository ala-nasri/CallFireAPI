/*
 * An XML document type.
 * Localname: NumberQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.NumberQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one NumberQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class NumberQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.NumberQueryResultDocument
{
    
    public NumberQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "NumberQueryResult");
    
    
    /**
     * Gets the "NumberQueryResult" element
     */
    public com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult getNumberQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult target = null;
            target = (com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult)get_store().find_element_user(NUMBERQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NumberQueryResult" element
     */
    public void setNumberQueryResult(com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult numberQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult target = null;
            target = (com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult)get_store().find_element_user(NUMBERQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult)get_store().add_element_user(NUMBERQUERYRESULT$0);
            }
            target.set(numberQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "NumberQueryResult" element
     */
    public com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult addNewNumberQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult target = null;
            target = (com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult)get_store().add_element_user(NUMBERQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML NumberQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class NumberQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.NumberQueryResultDocument.NumberQueryResult
    {
        
        public NumberQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Number");
        
        
        /**
         * Gets array of all "Number" elements
         */
        public com.callfire.api.data.NumberDocument.Number[] getNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NUMBER$0, targetList);
                com.callfire.api.data.NumberDocument.Number[] result = new com.callfire.api.data.NumberDocument.Number[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Number" element
         */
        public com.callfire.api.data.NumberDocument.Number getNumberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberDocument.Number target = null;
                target = (com.callfire.api.data.NumberDocument.Number)get_store().find_element_user(NUMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Number" element
         */
        public int sizeOfNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBER$0);
            }
        }
        
        /**
         * Sets array of all "Number" element
         */
        public void setNumberArray(com.callfire.api.data.NumberDocument.Number[] numberArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(numberArray, NUMBER$0);
            }
        }
        
        /**
         * Sets ith "Number" element
         */
        public void setNumberArray(int i, com.callfire.api.data.NumberDocument.Number number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberDocument.Number target = null;
                target = (com.callfire.api.data.NumberDocument.Number)get_store().find_element_user(NUMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(number);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Number" element
         */
        public com.callfire.api.data.NumberDocument.Number insertNewNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberDocument.Number target = null;
                target = (com.callfire.api.data.NumberDocument.Number)get_store().insert_element_user(NUMBER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Number" element
         */
        public com.callfire.api.data.NumberDocument.Number addNewNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberDocument.Number target = null;
                target = (com.callfire.api.data.NumberDocument.Number)get_store().add_element_user(NUMBER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Number" element
         */
        public void removeNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBER$0, i);
            }
        }
    }
}
