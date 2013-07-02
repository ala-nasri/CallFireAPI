/*
 * XML Type:  RegionQuery
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.RegionQuery
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML RegionQuery(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class RegionQueryImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.RegionQuery
{
    
    public RegionQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Region");
    
    
    /**
     * Gets the "Region" element
     */
    public com.callfire.api.data.RegionDocument.Region getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RegionDocument.Region target = null;
            target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Region" element
     */
    public void setRegion(com.callfire.api.data.RegionDocument.Region region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RegionDocument.Region target = null;
            target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$0);
            }
            target.set(region);
        }
    }
    
    /**
     * Appends and returns a new empty "Region" element
     */
    public com.callfire.api.data.RegionDocument.Region addNewRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RegionDocument.Region target = null;
            target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$0);
            return target;
        }
    }
}
