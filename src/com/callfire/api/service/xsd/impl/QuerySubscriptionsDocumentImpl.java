/*
 * An XML document type.
 * Localname: QuerySubscriptions
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QuerySubscriptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QuerySubscriptions(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QuerySubscriptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QuerySubscriptionsDocument
{
    
    public QuerySubscriptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QuerySubscriptions");
    
    
    /**
     * Gets the "QuerySubscriptions" element
     */
    public com.callfire.api.service.xsd.Query getQuerySubscriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYSUBSCRIPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuerySubscriptions" element
     */
    public void setQuerySubscriptions(com.callfire.api.service.xsd.Query querySubscriptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYSUBSCRIPTIONS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYSUBSCRIPTIONS$0);
            }
            target.set(querySubscriptions);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptions" element
     */
    public com.callfire.api.service.xsd.Query addNewQuerySubscriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYSUBSCRIPTIONS$0);
            return target;
        }
    }
}
