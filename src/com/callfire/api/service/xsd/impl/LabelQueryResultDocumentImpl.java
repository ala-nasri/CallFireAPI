/*
 * An XML document type.
 * Localname: LabelQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.LabelQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one LabelQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class LabelQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.LabelQueryResultDocument
{
    
    public LabelQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelQueryResult");
    
    
    /**
     * Gets the "LabelQueryResult" element
     */
    public com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult getLabelQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult target = null;
            target = (com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult)get_store().find_element_user(LABELQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabelQueryResult" element
     */
    public void setLabelQueryResult(com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult labelQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult target = null;
            target = (com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult)get_store().find_element_user(LABELQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult)get_store().add_element_user(LABELQUERYRESULT$0);
            }
            target.set(labelQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "LabelQueryResult" element
     */
    public com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult addNewLabelQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult target = null;
            target = (com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult)get_store().add_element_user(LABELQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML LabelQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class LabelQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.LabelQueryResultDocument.LabelQueryResult
    {
        
        public LabelQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LABEL$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Label");
        
        
        /**
         * Gets array of all "Label" elements
         */
        public com.callfire.api.data.LabelDocument.Label[] getLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LABEL$0, targetList);
                com.callfire.api.data.LabelDocument.Label[] result = new com.callfire.api.data.LabelDocument.Label[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Label" element
         */
        public com.callfire.api.data.LabelDocument.Label getLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LabelDocument.Label target = null;
                target = (com.callfire.api.data.LabelDocument.Label)get_store().find_element_user(LABEL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Label" element
         */
        public int sizeOfLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABEL$0);
            }
        }
        
        /**
         * Sets array of all "Label" element
         */
        public void setLabelArray(com.callfire.api.data.LabelDocument.Label[] labelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(labelArray, LABEL$0);
            }
        }
        
        /**
         * Sets ith "Label" element
         */
        public void setLabelArray(int i, com.callfire.api.data.LabelDocument.Label label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LabelDocument.Label target = null;
                target = (com.callfire.api.data.LabelDocument.Label)get_store().find_element_user(LABEL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(label);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Label" element
         */
        public com.callfire.api.data.LabelDocument.Label insertNewLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LabelDocument.Label target = null;
                target = (com.callfire.api.data.LabelDocument.Label)get_store().insert_element_user(LABEL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Label" element
         */
        public com.callfire.api.data.LabelDocument.Label addNewLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LabelDocument.Label target = null;
                target = (com.callfire.api.data.LabelDocument.Label)get_store().add_element_user(LABEL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Label" element
         */
        public void removeLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABEL$0, i);
            }
        }
    }
}
