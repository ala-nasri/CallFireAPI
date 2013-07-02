/*
 * An XML document type.
 * Localname: QueryKeywords
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryKeywordsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryKeywords(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryKeywordsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryKeywordsDocument
{
    
    public QueryKeywordsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYKEYWORDS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryKeywords");
    
    
    /**
     * Gets the "QueryKeywords" element
     */
    public com.callfire.api.service.xsd.Query getQueryKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYKEYWORDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryKeywords" element
     */
    public void setQueryKeywords(com.callfire.api.service.xsd.Query queryKeywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYKEYWORDS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYKEYWORDS$0);
            }
            target.set(queryKeywords);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryKeywords" element
     */
    public com.callfire.api.service.xsd.Query addNewQueryKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYKEYWORDS$0);
            return target;
        }
    }
}
