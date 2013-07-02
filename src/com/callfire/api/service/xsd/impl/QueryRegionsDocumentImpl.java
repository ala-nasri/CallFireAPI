/*
 * An XML document type.
 * Localname: QueryRegions
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryRegionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryRegions(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryRegionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryRegionsDocument
{
    
    public QueryRegionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREGIONS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryRegions");
    
    
    /**
     * Gets the "QueryRegions" element
     */
    public com.callfire.api.service.xsd.RegionQuery getQueryRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQuery target = null;
            target = (com.callfire.api.service.xsd.RegionQuery)get_store().find_element_user(QUERYREGIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryRegions" element
     */
    public void setQueryRegions(com.callfire.api.service.xsd.RegionQuery queryRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQuery target = null;
            target = (com.callfire.api.service.xsd.RegionQuery)get_store().find_element_user(QUERYREGIONS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.RegionQuery)get_store().add_element_user(QUERYREGIONS$0);
            }
            target.set(queryRegions);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegions" element
     */
    public com.callfire.api.service.xsd.RegionQuery addNewQueryRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQuery target = null;
            target = (com.callfire.api.service.xsd.RegionQuery)get_store().add_element_user(QUERYREGIONS$0);
            return target;
        }
    }
}
