/*
 * An XML document type.
 * Localname: RegionQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.RegionQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one RegionQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class RegionQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.RegionQueryResultDocument
{
    
    public RegionQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGIONQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RegionQueryResult");
    
    
    /**
     * Gets the "RegionQueryResult" element
     */
    public com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult getRegionQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult target = null;
            target = (com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult)get_store().find_element_user(REGIONQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegionQueryResult" element
     */
    public void setRegionQueryResult(com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult regionQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult target = null;
            target = (com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult)get_store().find_element_user(REGIONQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult)get_store().add_element_user(REGIONQUERYRESULT$0);
            }
            target.set(regionQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "RegionQueryResult" element
     */
    public com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult addNewRegionQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult target = null;
            target = (com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult)get_store().add_element_user(REGIONQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML RegionQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class RegionQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.RegionQueryResultDocument.RegionQueryResult
    {
        
        public RegionQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REGION$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Region");
        
        
        /**
         * Gets array of all "Region" elements
         */
        public com.callfire.api.data.RegionDocument.Region[] getRegionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REGION$0, targetList);
                com.callfire.api.data.RegionDocument.Region[] result = new com.callfire.api.data.RegionDocument.Region[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Region" element
         */
        public com.callfire.api.data.RegionDocument.Region getRegionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RegionDocument.Region target = null;
                target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Region" element
         */
        public int sizeOfRegionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$0);
            }
        }
        
        /**
         * Sets array of all "Region" element
         */
        public void setRegionArray(com.callfire.api.data.RegionDocument.Region[] regionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(regionArray, REGION$0);
            }
        }
        
        /**
         * Sets ith "Region" element
         */
        public void setRegionArray(int i, com.callfire.api.data.RegionDocument.Region region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RegionDocument.Region target = null;
                target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(region);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Region" element
         */
        public com.callfire.api.data.RegionDocument.Region insertNewRegion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RegionDocument.Region target = null;
                target = (com.callfire.api.data.RegionDocument.Region)get_store().insert_element_user(REGION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Region" element
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
        
        /**
         * Removes the ith "Region" element
         */
        public void removeRegion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$0, i);
            }
        }
    }
}
