/*
 * An XML document type.
 * Localname: QueryCalls
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryCallsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryCalls(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryCallsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryCallsDocument
{
    
    public QueryCallsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCALLS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryCalls");
    
    
    /**
     * Gets the "QueryCalls" element
     */
    public com.callfire.api.service.xsd.ActionQuery getQueryCalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().find_element_user(QUERYCALLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryCalls" element
     */
    public void setQueryCalls(com.callfire.api.service.xsd.ActionQuery queryCalls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().find_element_user(QUERYCALLS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ActionQuery)get_store().add_element_user(QUERYCALLS$0);
            }
            target.set(queryCalls);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryCalls" element
     */
    public com.callfire.api.service.xsd.ActionQuery addNewQueryCalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().add_element_user(QUERYCALLS$0);
            return target;
        }
    }
}
