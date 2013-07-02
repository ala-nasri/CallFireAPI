/*
 * An XML document type.
 * Localname: SearchAvailableKeywords
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SearchAvailableKeywordsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SearchAvailableKeywords(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SearchAvailableKeywordsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SearchAvailableKeywordsDocument
{
    
    public SearchAvailableKeywordsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHAVAILABLEKEYWORDS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SearchAvailableKeywords");
    
    
    /**
     * Gets the "SearchAvailableKeywords" element
     */
    public com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords getSearchAvailableKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords)get_store().find_element_user(SEARCHAVAILABLEKEYWORDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchAvailableKeywords" element
     */
    public void setSearchAvailableKeywords(com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords searchAvailableKeywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords)get_store().find_element_user(SEARCHAVAILABLEKEYWORDS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords)get_store().add_element_user(SEARCHAVAILABLEKEYWORDS$0);
            }
            target.set(searchAvailableKeywords);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchAvailableKeywords" element
     */
    public com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords addNewSearchAvailableKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords)get_store().add_element_user(SEARCHAVAILABLEKEYWORDS$0);
            return target;
        }
    }
    /**
     * An XML SearchAvailableKeywords(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SearchAvailableKeywordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SearchAvailableKeywordsDocument.SearchAvailableKeywords
    {
        
        public SearchAvailableKeywordsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYWORDS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Keywords");
        
        
        /**
         * Gets the "Keywords" element
         */
        public java.util.List getKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Keywords" element
         */
        public com.callfire.api.data.KeywordList xgetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Keywords" element
         */
        public void setKeywords(java.util.List keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$0);
                }
                target.setListValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) the "Keywords" element
         */
        public void xsetKeywords(com.callfire.api.data.KeywordList keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.KeywordList)get_store().add_element_user(KEYWORDS$0);
                }
                target.set(keywords);
            }
        }
    }
}
