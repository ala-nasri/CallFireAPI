/*
 * An XML document type.
 * Localname: SearchAvailableNumbers
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SearchAvailableNumbersDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SearchAvailableNumbers(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SearchAvailableNumbersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SearchAvailableNumbersDocument
{
    
    public SearchAvailableNumbersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHAVAILABLENUMBERS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SearchAvailableNumbers");
    
    
    /**
     * Gets the "SearchAvailableNumbers" element
     */
    public com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers getSearchAvailableNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers)get_store().find_element_user(SEARCHAVAILABLENUMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchAvailableNumbers" element
     */
    public void setSearchAvailableNumbers(com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers searchAvailableNumbers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers)get_store().find_element_user(SEARCHAVAILABLENUMBERS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers)get_store().add_element_user(SEARCHAVAILABLENUMBERS$0);
            }
            target.set(searchAvailableNumbers);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchAvailableNumbers" element
     */
    public com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers addNewSearchAvailableNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers target = null;
            target = (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers)get_store().add_element_user(SEARCHAVAILABLENUMBERS$0);
            return target;
        }
    }
    /**
     * An XML SearchAvailableNumbers(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SearchAvailableNumbersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers
    {
        
        public SearchAvailableNumbersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REGION$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Region");
        private static final javax.xml.namespace.QName TOLLFREE$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "TollFree");
        private static final javax.xml.namespace.QName COUNT$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Count");
        
        
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
         * True if has "Region" element
         */
        public boolean isSetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$0) != 0;
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
        
        /**
         * Unsets the "Region" element
         */
        public void unsetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$0, 0);
            }
        }
        
        /**
         * Gets the "TollFree" element
         */
        public boolean getTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOLLFREE$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "TollFree" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOLLFREE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "TollFree" element
         */
        public boolean isSetTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOLLFREE$2) != 0;
            }
        }
        
        /**
         * Sets the "TollFree" element
         */
        public void setTollFree(boolean tollFree)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOLLFREE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOLLFREE$2);
                }
                target.setBooleanValue(tollFree);
            }
        }
        
        /**
         * Sets (as xml) the "TollFree" element
         */
        public void xsetTollFree(org.apache.xmlbeans.XmlBoolean tollFree)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOLLFREE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TOLLFREE$2);
                }
                target.set(tollFree);
            }
        }
        
        /**
         * Unsets the "TollFree" element
         */
        public void unsetTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOLLFREE$2, 0);
            }
        }
        
        /**
         * Gets the "Count" element
         */
        public int getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Count" element
         */
        public org.apache.xmlbeans.XmlInt xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Count" element
         */
        public void setCount(int count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$4);
                }
                target.setIntValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "Count" element
         */
        public void xsetCount(org.apache.xmlbeans.XmlInt count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$4);
                }
                target.set(count);
            }
        }
    }
}
