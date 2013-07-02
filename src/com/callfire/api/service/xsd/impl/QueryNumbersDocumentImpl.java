/*
 * An XML document type.
 * Localname: QueryNumbers
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryNumbersDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryNumbers(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryNumbersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryNumbersDocument
{
    
    public QueryNumbersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYNUMBERS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryNumbers");
    
    
    /**
     * Gets the "QueryNumbers" element
     */
    public com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers getQueryNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers target = null;
            target = (com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers)get_store().find_element_user(QUERYNUMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryNumbers" element
     */
    public void setQueryNumbers(com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers queryNumbers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers target = null;
            target = (com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers)get_store().find_element_user(QUERYNUMBERS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers)get_store().add_element_user(QUERYNUMBERS$0);
            }
            target.set(queryNumbers);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryNumbers" element
     */
    public com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers addNewQueryNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers target = null;
            target = (com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers)get_store().add_element_user(QUERYNUMBERS$0);
            return target;
        }
    }
    /**
     * An XML QueryNumbers(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class QueryNumbersImpl extends com.callfire.api.service.xsd.impl.RegionQueryImpl implements com.callfire.api.service.xsd.QueryNumbersDocument.QueryNumbers
    {
        
        public QueryNumbersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LABELNAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
        
        
        /**
         * Gets the "LabelName" element
         */
        public java.lang.String getLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LabelName" element
         */
        public org.apache.xmlbeans.XmlString xgetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LabelName" element
         */
        public boolean isSetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "LabelName" element
         */
        public void setLabelName(java.lang.String labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$0);
                }
                target.setStringValue(labelName);
            }
        }
        
        /**
         * Sets (as xml) the "LabelName" element
         */
        public void xsetLabelName(org.apache.xmlbeans.XmlString labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$0);
                }
                target.set(labelName);
            }
        }
        
        /**
         * Unsets the "LabelName" element
         */
        public void unsetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELNAME$0, 0);
            }
        }
    }
}
