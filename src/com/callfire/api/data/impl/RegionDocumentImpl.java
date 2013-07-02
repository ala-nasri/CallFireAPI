/*
 * An XML document type.
 * Localname: Region
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.RegionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Region(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class RegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.RegionDocument
{
    
    public RegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Region(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class RegionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.RegionDocument.Region
    {
        
        public RegionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREFIX$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Prefix");
        private static final javax.xml.namespace.QName CITY$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "City");
        private static final javax.xml.namespace.QName STATE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "State");
        private static final javax.xml.namespace.QName ZIPCODE$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Zipcode");
        private static final javax.xml.namespace.QName COUNTRY$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Country");
        private static final javax.xml.namespace.QName LATA$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Lata");
        private static final javax.xml.namespace.QName RATECENTER$12 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "RateCenter");
        private static final javax.xml.namespace.QName LATITUDE$14 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Latitude");
        private static final javax.xml.namespace.QName LONGITUDE$16 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Longitude");
        private static final javax.xml.namespace.QName TIMEZONE$18 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TimeZone");
        
        
        /**
         * Gets the "Prefix" element
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Prefix" element
         */
        public org.apache.xmlbeans.XmlString xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Prefix" element
         */
        public boolean isSetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREFIX$0) != 0;
            }
        }
        
        /**
         * Sets the "Prefix" element
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "Prefix" element
         */
        public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREFIX$0);
                }
                target.set(prefix);
            }
        }
        
        /**
         * Unsets the "Prefix" element
         */
        public void unsetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREFIX$0, 0);
            }
        }
        
        /**
         * Gets the "City" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "City" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "City" element
         */
        public boolean isSetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CITY$2) != 0;
            }
        }
        
        /**
         * Sets the "City" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$2);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "City" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$2);
                }
                target.set(city);
            }
        }
        
        /**
         * Unsets the "City" element
         */
        public void unsetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CITY$2, 0);
            }
        }
        
        /**
         * Gets the "State" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "State" element
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "State" element
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATE$4) != 0;
            }
        }
        
        /**
         * Sets the "State" element
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "State" element
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$4);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "State" element
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATE$4, 0);
            }
        }
        
        /**
         * Gets the "Zipcode" element
         */
        public java.lang.String getZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Zipcode" element
         */
        public org.apache.xmlbeans.XmlString xgetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Zipcode" element
         */
        public boolean isSetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZIPCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "Zipcode" element
         */
        public void setZipcode(java.lang.String zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$6);
                }
                target.setStringValue(zipcode);
            }
        }
        
        /**
         * Sets (as xml) the "Zipcode" element
         */
        public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$6);
                }
                target.set(zipcode);
            }
        }
        
        /**
         * Unsets the "Zipcode" element
         */
        public void unsetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZIPCODE$6, 0);
            }
        }
        
        /**
         * Gets the "Country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Country" element
         */
        public boolean isSetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRY$8) != 0;
            }
        }
        
        /**
         * Sets the "Country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$8);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "Country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$8);
                }
                target.set(country);
            }
        }
        
        /**
         * Unsets the "Country" element
         */
        public void unsetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRY$8, 0);
            }
        }
        
        /**
         * Gets the "Lata" element
         */
        public java.lang.String getLata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Lata" element
         */
        public org.apache.xmlbeans.XmlString xgetLata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATA$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "Lata" element
         */
        public boolean isSetLata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LATA$10) != 0;
            }
        }
        
        /**
         * Sets the "Lata" element
         */
        public void setLata(java.lang.String lata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATA$10);
                }
                target.setStringValue(lata);
            }
        }
        
        /**
         * Sets (as xml) the "Lata" element
         */
        public void xsetLata(org.apache.xmlbeans.XmlString lata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATA$10);
                }
                target.set(lata);
            }
        }
        
        /**
         * Unsets the "Lata" element
         */
        public void unsetLata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LATA$10, 0);
            }
        }
        
        /**
         * Gets the "RateCenter" element
         */
        public java.lang.String getRateCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATECENTER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RateCenter" element
         */
        public org.apache.xmlbeans.XmlString xgetRateCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATECENTER$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "RateCenter" element
         */
        public boolean isSetRateCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RATECENTER$12) != 0;
            }
        }
        
        /**
         * Sets the "RateCenter" element
         */
        public void setRateCenter(java.lang.String rateCenter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATECENTER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RATECENTER$12);
                }
                target.setStringValue(rateCenter);
            }
        }
        
        /**
         * Sets (as xml) the "RateCenter" element
         */
        public void xsetRateCenter(org.apache.xmlbeans.XmlString rateCenter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATECENTER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RATECENTER$12);
                }
                target.set(rateCenter);
            }
        }
        
        /**
         * Unsets the "RateCenter" element
         */
        public void unsetRateCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RATECENTER$12, 0);
            }
        }
        
        /**
         * Gets the "Latitude" element
         */
        public float getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "Latitude" element
         */
        public org.apache.xmlbeans.XmlFloat xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "Latitude" element
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LATITUDE$14) != 0;
            }
        }
        
        /**
         * Sets the "Latitude" element
         */
        public void setLatitude(float latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$14);
                }
                target.setFloatValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "Latitude" element
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$14);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "Latitude" element
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LATITUDE$14, 0);
            }
        }
        
        /**
         * Gets the "Longitude" element
         */
        public float getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "Longitude" element
         */
        public org.apache.xmlbeans.XmlFloat xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "Longitude" element
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONGITUDE$16) != 0;
            }
        }
        
        /**
         * Sets the "Longitude" element
         */
        public void setLongitude(float longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$16);
                }
                target.setFloatValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "Longitude" element
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$16);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "Longitude" element
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONGITUDE$16, 0);
            }
        }
        
        /**
         * Gets the "TimeZone" element
         */
        public java.lang.String getTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TimeZone" element
         */
        public org.apache.xmlbeans.XmlString xgetTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "TimeZone" element
         */
        public boolean isSetTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TIMEZONE$18) != 0;
            }
        }
        
        /**
         * Sets the "TimeZone" element
         */
        public void setTimeZone(java.lang.String timeZone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$18);
                }
                target.setStringValue(timeZone);
            }
        }
        
        /**
         * Sets (as xml) the "TimeZone" element
         */
        public void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$18);
                }
                target.set(timeZone);
            }
        }
        
        /**
         * Unsets the "TimeZone" element
         */
        public void unsetTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TIMEZONE$18, 0);
            }
        }
    }
}
