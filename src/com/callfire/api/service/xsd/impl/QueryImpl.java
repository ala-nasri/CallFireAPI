/*
 * XML Type:  Query
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.Query
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML Query(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.Query
{
    
    public QueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXRESULTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "MaxResults");
    private static final javax.xml.namespace.QName FIRSTRESULT$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "FirstResult");
    
    
    /**
     * Gets the "MaxResults" element
     */
    public long getMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULTS$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxResults" element
     */
    public org.apache.xmlbeans.XmlLong xgetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRESULTS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxResults" element
     */
    public boolean isSetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXRESULTS$0) != 0;
        }
    }
    
    /**
     * Sets the "MaxResults" element
     */
    public void setMaxResults(long maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRESULTS$0);
            }
            target.setLongValue(maxResults);
        }
    }
    
    /**
     * Sets (as xml) the "MaxResults" element
     */
    public void xsetMaxResults(org.apache.xmlbeans.XmlLong maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXRESULTS$0);
            }
            target.set(maxResults);
        }
    }
    
    /**
     * Unsets the "MaxResults" element
     */
    public void unsetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXRESULTS$0, 0);
        }
    }
    
    /**
     * Gets the "FirstResult" element
     */
    public long getFirstResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTRESULT$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstResult" element
     */
    public org.apache.xmlbeans.XmlLong xgetFirstResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FIRSTRESULT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FirstResult" element
     */
    public boolean isSetFirstResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTRESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "FirstResult" element
     */
    public void setFirstResult(long firstResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTRESULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTRESULT$2);
            }
            target.setLongValue(firstResult);
        }
    }
    
    /**
     * Sets (as xml) the "FirstResult" element
     */
    public void xsetFirstResult(org.apache.xmlbeans.XmlLong firstResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FIRSTRESULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(FIRSTRESULT$2);
            }
            target.set(firstResult);
        }
    }
    
    /**
     * Unsets the "FirstResult" element
     */
    public void unsetFirstResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTRESULT$2, 0);
        }
    }
}
