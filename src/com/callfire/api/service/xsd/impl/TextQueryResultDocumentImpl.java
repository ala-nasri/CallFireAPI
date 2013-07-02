/*
 * An XML document type.
 * Localname: TextQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.TextQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one TextQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class TextQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.TextQueryResultDocument
{
    
    public TextQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "TextQueryResult");
    
    
    /**
     * Gets the "TextQueryResult" element
     */
    public com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult getTextQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult target = null;
            target = (com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult)get_store().find_element_user(TEXTQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TextQueryResult" element
     */
    public void setTextQueryResult(com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult textQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult target = null;
            target = (com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult)get_store().find_element_user(TEXTQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult)get_store().add_element_user(TEXTQUERYRESULT$0);
            }
            target.set(textQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "TextQueryResult" element
     */
    public com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult addNewTextQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult target = null;
            target = (com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult)get_store().add_element_user(TEXTQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML TextQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class TextQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.TextQueryResultDocument.TextQueryResult
    {
        
        public TextQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Text");
        
        
        /**
         * Gets array of all "Text" elements
         */
        public com.callfire.api.data.TextDocument.Text[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$0, targetList);
                com.callfire.api.data.TextDocument.Text[] result = new com.callfire.api.data.TextDocument.Text[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Text" element
         */
        public com.callfire.api.data.TextDocument.Text getTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Text" element
         */
        public int sizeOfTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$0);
            }
        }
        
        /**
         * Sets array of all "Text" element
         */
        public void setTextArray(com.callfire.api.data.TextDocument.Text[] textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$0);
            }
        }
        
        /**
         * Sets ith "Text" element
         */
        public void setTextArray(int i, com.callfire.api.data.TextDocument.Text text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(text);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Text" element
         */
        public com.callfire.api.data.TextDocument.Text insertNewText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().insert_element_user(TEXT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Text" element
         */
        public com.callfire.api.data.TextDocument.Text addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().add_element_user(TEXT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Text" element
         */
        public void removeText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$0, i);
            }
        }
    }
}
