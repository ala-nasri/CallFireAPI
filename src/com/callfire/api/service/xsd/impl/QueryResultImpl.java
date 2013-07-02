/*
 * XML Type:  QueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryResult
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML QueryResult(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class QueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryResult
{
    
    public QueryResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALRESULTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "TotalResults");
    
    
    /**
     * Gets the "TotalResults" element
     */
    public long getTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalResults" element
     */
    public org.apache.xmlbeans.XmlLong xgetTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALRESULTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalResults" element
     */
    public void setTotalResults(long totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRESULTS$0);
            }
            target.setLongValue(totalResults);
        }
    }
    
    /**
     * Sets (as xml) the "TotalResults" element
     */
    public void xsetTotalResults(org.apache.xmlbeans.XmlLong totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TOTALRESULTS$0);
            }
            target.set(totalResults);
        }
    }
}
