/*
 * An XML document type.
 * Localname: Number
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Number(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class NumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberDocument
{
    
    public NumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Number");
    
    
    /**
     * Gets the "Number" element
     */
    public com.callfire.api.data.NumberDocument.Number getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberDocument.Number target = null;
            target = (com.callfire.api.data.NumberDocument.Number)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(com.callfire.api.data.NumberDocument.Number number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberDocument.Number target = null;
            target = (com.callfire.api.data.NumberDocument.Number)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.NumberDocument.Number)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Appends and returns a new empty "Number" element
     */
    public com.callfire.api.data.NumberDocument.Number addNewNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberDocument.Number target = null;
            target = (com.callfire.api.data.NumberDocument.Number)get_store().add_element_user(NUMBER$0);
            return target;
        }
    }
    /**
     * An XML Number(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class NumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberDocument.Number
    {
        
        public NumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Number");
        private static final javax.xml.namespace.QName NATIONALFORMAT$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "NationalFormat");
        private static final javax.xml.namespace.QName TOLLFREE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TollFree");
        private static final javax.xml.namespace.QName REGION$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Region");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName LEASEINFO$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LeaseInfo");
        private static final javax.xml.namespace.QName NUMBERCONFIGURATION$12 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "NumberConfiguration");
        
        
        /**
         * Gets the "Number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Number" element
         */
        public com.callfire.api.data.PhoneNumber xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "Number" element
         */
        public void xsetNumber(com.callfire.api.data.PhoneNumber number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(NUMBER$0);
                }
                target.set(number);
            }
        }
        
        /**
         * Gets the "NationalFormat" element
         */
        public java.lang.String getNationalFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALFORMAT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NationalFormat" element
         */
        public org.apache.xmlbeans.XmlString xgetNationalFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALFORMAT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NationalFormat" element
         */
        public void setNationalFormat(java.lang.String nationalFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALFORMAT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALFORMAT$2);
                }
                target.setStringValue(nationalFormat);
            }
        }
        
        /**
         * Sets (as xml) the "NationalFormat" element
         */
        public void xsetNationalFormat(org.apache.xmlbeans.XmlString nationalFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALFORMAT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALFORMAT$2);
                }
                target.set(nationalFormat);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOLLFREE$4, 0);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOLLFREE$4, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOLLFREE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOLLFREE$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOLLFREE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TOLLFREE$4);
                }
                target.set(tollFree);
            }
        }
        
        /**
         * Gets the "Region" element
         */
        public com.callfire.api.data.RegionDocument.Region getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RegionDocument.Region target = null;
                target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$6, 0);
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
                return get_store().count_elements(REGION$6) != 0;
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
                target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$6);
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
                target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$6);
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
                get_store().remove_element(REGION$6, 0);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.callfire.api.data.NumberStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.NumberStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.NumberStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberStatus target = null;
                target = (com.callfire.api.data.NumberStatus)get_store().find_element_user(STATUS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$8) != 0;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.NumberStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.NumberStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberStatus target = null;
                target = (com.callfire.api.data.NumberStatus)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberStatus)get_store().add_element_user(STATUS$8);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "Status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$8, 0);
            }
        }
        
        /**
         * Gets the "LeaseInfo" element
         */
        public com.callfire.api.data.LeaseInfoDocument.LeaseInfo getLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LeaseInfo" element
         */
        public boolean isSetLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEASEINFO$10) != 0;
            }
        }
        
        /**
         * Sets the "LeaseInfo" element
         */
        public void setLeaseInfo(com.callfire.api.data.LeaseInfoDocument.LeaseInfo leaseInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$10, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$10);
                }
                target.set(leaseInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "LeaseInfo" element
         */
        public com.callfire.api.data.LeaseInfoDocument.LeaseInfo addNewLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$10);
                return target;
            }
        }
        
        /**
         * Unsets the "LeaseInfo" element
         */
        public void unsetLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEASEINFO$10, 0);
            }
        }
        
        /**
         * Gets the "NumberConfiguration" element
         */
        public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration getNumberConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "NumberConfiguration" element
         */
        public boolean isSetNumberConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBERCONFIGURATION$12) != 0;
            }
        }
        
        /**
         * Sets the "NumberConfiguration" element
         */
        public void setNumberConfiguration(com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration numberConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$12, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$12);
                }
                target.set(numberConfiguration);
            }
        }
        
        /**
         * Appends and returns a new empty "NumberConfiguration" element
         */
        public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration addNewNumberConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$12);
                return target;
            }
        }
        
        /**
         * Unsets the "NumberConfiguration" element
         */
        public void unsetNumberConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBERCONFIGURATION$12, 0);
            }
        }
    }
}
