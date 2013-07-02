/*
 * An XML document type.
 * Localname: ConfigureNumber
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ConfigureNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ConfigureNumber(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ConfigureNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ConfigureNumberDocument
{
    
    public ConfigureNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURENUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ConfigureNumber");
    
    
    /**
     * Gets the "ConfigureNumber" element
     */
    public com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber getConfigureNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber target = null;
            target = (com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber)get_store().find_element_user(CONFIGURENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfigureNumber" element
     */
    public void setConfigureNumber(com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber configureNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber target = null;
            target = (com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber)get_store().find_element_user(CONFIGURENUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber)get_store().add_element_user(CONFIGURENUMBER$0);
            }
            target.set(configureNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfigureNumber" element
     */
    public com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber addNewConfigureNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber target = null;
            target = (com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber)get_store().add_element_user(CONFIGURENUMBER$0);
            return target;
        }
    }
    /**
     * An XML ConfigureNumber(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ConfigureNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ConfigureNumberDocument.ConfigureNumber
    {
        
        public ConfigureNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Number");
        private static final javax.xml.namespace.QName NUMBERCONFIGURATION$2 = 
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
         * Gets the "NumberConfiguration" element
         */
        public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration getNumberConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
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
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$2);
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
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$2);
                return target;
            }
        }
    }
}
