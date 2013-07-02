/*
 * An XML document type.
 * Localname: QueryContactLists
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryContactListsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryContactLists(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryContactListsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryContactListsDocument
{
    
    public QueryContactListsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCONTACTLISTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryContactLists");
    
    
    /**
     * Gets the "QueryContactLists" element
     */
    public com.callfire.api.service.xsd.Query getQueryContactLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYCONTACTLISTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryContactLists" element
     */
    public void setQueryContactLists(com.callfire.api.service.xsd.Query queryContactLists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYCONTACTLISTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYCONTACTLISTS$0);
            }
            target.set(queryContactLists);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryContactLists" element
     */
    public com.callfire.api.service.xsd.Query addNewQueryContactLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYCONTACTLISTS$0);
            return target;
        }
    }
}
