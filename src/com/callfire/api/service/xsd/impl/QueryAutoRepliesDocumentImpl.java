/*
 * An XML document type.
 * Localname: QueryAutoReplies
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryAutoRepliesDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryAutoReplies(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryAutoRepliesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryAutoRepliesDocument
{
    
    public QueryAutoRepliesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYAUTOREPLIES$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryAutoReplies");
    
    
    /**
     * Gets the "QueryAutoReplies" element
     */
    public com.callfire.api.service.xsd.Query getQueryAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYAUTOREPLIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryAutoReplies" element
     */
    public void setQueryAutoReplies(com.callfire.api.service.xsd.Query queryAutoReplies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYAUTOREPLIES$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYAUTOREPLIES$0);
            }
            target.set(queryAutoReplies);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryAutoReplies" element
     */
    public com.callfire.api.service.xsd.Query addNewQueryAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYAUTOREPLIES$0);
            return target;
        }
    }
}
