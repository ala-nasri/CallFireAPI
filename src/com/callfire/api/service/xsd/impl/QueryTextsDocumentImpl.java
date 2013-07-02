/*
 * An XML document type.
 * Localname: QueryTexts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryTextsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryTexts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryTextsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryTextsDocument
{
    
    public QueryTextsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTEXTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryTexts");
    
    
    /**
     * Gets the "QueryTexts" element
     */
    public com.callfire.api.service.xsd.ActionQuery getQueryTexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().find_element_user(QUERYTEXTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryTexts" element
     */
    public void setQueryTexts(com.callfire.api.service.xsd.ActionQuery queryTexts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().find_element_user(QUERYTEXTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ActionQuery)get_store().add_element_user(QUERYTEXTS$0);
            }
            target.set(queryTexts);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryTexts" element
     */
    public com.callfire.api.service.xsd.ActionQuery addNewQueryTexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery target = null;
            target = (com.callfire.api.service.xsd.ActionQuery)get_store().add_element_user(QUERYTEXTS$0);
            return target;
        }
    }
}
