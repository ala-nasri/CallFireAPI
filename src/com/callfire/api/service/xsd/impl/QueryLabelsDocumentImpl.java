/*
 * An XML document type.
 * Localname: QueryLabels
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryLabelsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryLabels(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryLabelsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryLabelsDocument
{
    
    public QueryLabelsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYLABELS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryLabels");
    
    
    /**
     * Gets the "QueryLabels" element
     */
    public com.callfire.api.service.xsd.Query getQueryLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYLABELS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryLabels" element
     */
    public void setQueryLabels(com.callfire.api.service.xsd.Query queryLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYLABELS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYLABELS$0);
            }
            target.set(queryLabels);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryLabels" element
     */
    public com.callfire.api.service.xsd.Query addNewQueryLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYLABELS$0);
            return target;
        }
    }
}
