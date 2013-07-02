/*
 * An XML document type.
 * Localname: KeywordQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.KeywordQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one KeywordQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class KeywordQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.KeywordQueryResultDocument
{
    
    public KeywordQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORDQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "KeywordQueryResult");
    
    
    /**
     * Gets the "KeywordQueryResult" element
     */
    public com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult getKeywordQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult target = null;
            target = (com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult)get_store().find_element_user(KEYWORDQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeywordQueryResult" element
     */
    public void setKeywordQueryResult(com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult keywordQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult target = null;
            target = (com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult)get_store().find_element_user(KEYWORDQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult)get_store().add_element_user(KEYWORDQUERYRESULT$0);
            }
            target.set(keywordQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "KeywordQueryResult" element
     */
    public com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult addNewKeywordQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult target = null;
            target = (com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult)get_store().add_element_user(KEYWORDQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML KeywordQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class KeywordQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.KeywordQueryResultDocument.KeywordQueryResult
    {
        
        public KeywordQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYWORD$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Keyword");
        
        
        /**
         * Gets array of all "Keyword" elements
         */
        public com.callfire.api.data.KeywordDocument.Keyword[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$0, targetList);
                com.callfire.api.data.KeywordDocument.Keyword[] result = new com.callfire.api.data.KeywordDocument.Keyword[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Keyword" element
         */
        public com.callfire.api.data.KeywordDocument.Keyword getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordDocument.Keyword target = null;
                target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().find_element_user(KEYWORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$0);
            }
        }
        
        /**
         * Sets array of all "Keyword" element
         */
        public void setKeywordArray(com.callfire.api.data.KeywordDocument.Keyword[] keywordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordArray, KEYWORD$0);
            }
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, com.callfire.api.data.KeywordDocument.Keyword keyword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordDocument.Keyword target = null;
                target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().find_element_user(KEYWORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keyword);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        public com.callfire.api.data.KeywordDocument.Keyword insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordDocument.Keyword target = null;
                target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().insert_element_user(KEYWORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        public com.callfire.api.data.KeywordDocument.Keyword addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordDocument.Keyword target = null;
                target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().add_element_user(KEYWORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$0, i);
            }
        }
    }
}
