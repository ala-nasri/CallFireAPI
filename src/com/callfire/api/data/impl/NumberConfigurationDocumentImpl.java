/*
 * An XML document type.
 * Localname: NumberConfiguration
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one NumberConfiguration(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class NumberConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberConfigurationDocument
{
    
    public NumberConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "NumberConfiguration");
    
    
    /**
     * Gets the "NumberConfiguration" element
     */
    public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration getNumberConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration target = null;
            target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$0, 0);
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
            target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().find_element_user(NUMBERCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$0);
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
            target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration)get_store().add_element_user(NUMBERCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML NumberConfiguration(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class NumberConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration
    {
        
        public NumberConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALLFEATURE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "CallFeature");
        private static final javax.xml.namespace.QName TEXTFEATURE$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TextFeature");
        private static final javax.xml.namespace.QName INBOUNDCALLCONFIGURATIONTYPE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "InboundCallConfigurationType");
        private static final javax.xml.namespace.QName INBOUNDCALLCONFIGURATION$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "InboundCallConfiguration");
        
        
        /**
         * Gets the "CallFeature" element
         */
        public com.callfire.api.data.NumberFeature.Enum getCallFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLFEATURE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.NumberFeature.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CallFeature" element
         */
        public com.callfire.api.data.NumberFeature xgetCallFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberFeature target = null;
                target = (com.callfire.api.data.NumberFeature)get_store().find_element_user(CALLFEATURE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CallFeature" element
         */
        public boolean isSetCallFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALLFEATURE$0) != 0;
            }
        }
        
        /**
         * Sets the "CallFeature" element
         */
        public void setCallFeature(com.callfire.api.data.NumberFeature.Enum callFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLFEATURE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLFEATURE$0);
                }
                target.setEnumValue(callFeature);
            }
        }
        
        /**
         * Sets (as xml) the "CallFeature" element
         */
        public void xsetCallFeature(com.callfire.api.data.NumberFeature callFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberFeature target = null;
                target = (com.callfire.api.data.NumberFeature)get_store().find_element_user(CALLFEATURE$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberFeature)get_store().add_element_user(CALLFEATURE$0);
                }
                target.set(callFeature);
            }
        }
        
        /**
         * Unsets the "CallFeature" element
         */
        public void unsetCallFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALLFEATURE$0, 0);
            }
        }
        
        /**
         * Gets the "TextFeature" element
         */
        public com.callfire.api.data.NumberFeature.Enum getTextFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTFEATURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.NumberFeature.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "TextFeature" element
         */
        public com.callfire.api.data.NumberFeature xgetTextFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberFeature target = null;
                target = (com.callfire.api.data.NumberFeature)get_store().find_element_user(TEXTFEATURE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "TextFeature" element
         */
        public boolean isSetTextFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTFEATURE$2) != 0;
            }
        }
        
        /**
         * Sets the "TextFeature" element
         */
        public void setTextFeature(com.callfire.api.data.NumberFeature.Enum textFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTFEATURE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXTFEATURE$2);
                }
                target.setEnumValue(textFeature);
            }
        }
        
        /**
         * Sets (as xml) the "TextFeature" element
         */
        public void xsetTextFeature(com.callfire.api.data.NumberFeature textFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberFeature target = null;
                target = (com.callfire.api.data.NumberFeature)get_store().find_element_user(TEXTFEATURE$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberFeature)get_store().add_element_user(TEXTFEATURE$2);
                }
                target.set(textFeature);
            }
        }
        
        /**
         * Unsets the "TextFeature" element
         */
        public void unsetTextFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTFEATURE$2, 0);
            }
        }
        
        /**
         * Gets the "InboundCallConfigurationType" element
         */
        public com.callfire.api.data.InboundType.Enum getInboundCallConfigurationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUNDCALLCONFIGURATIONTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.InboundType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "InboundCallConfigurationType" element
         */
        public com.callfire.api.data.InboundType xgetInboundCallConfigurationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.InboundType target = null;
                target = (com.callfire.api.data.InboundType)get_store().find_element_user(INBOUNDCALLCONFIGURATIONTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "InboundCallConfigurationType" element
         */
        public boolean isSetInboundCallConfigurationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INBOUNDCALLCONFIGURATIONTYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "InboundCallConfigurationType" element
         */
        public void setInboundCallConfigurationType(com.callfire.api.data.InboundType.Enum inboundCallConfigurationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUNDCALLCONFIGURATIONTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOUNDCALLCONFIGURATIONTYPE$4);
                }
                target.setEnumValue(inboundCallConfigurationType);
            }
        }
        
        /**
         * Sets (as xml) the "InboundCallConfigurationType" element
         */
        public void xsetInboundCallConfigurationType(com.callfire.api.data.InboundType inboundCallConfigurationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.InboundType target = null;
                target = (com.callfire.api.data.InboundType)get_store().find_element_user(INBOUNDCALLCONFIGURATIONTYPE$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.InboundType)get_store().add_element_user(INBOUNDCALLCONFIGURATIONTYPE$4);
                }
                target.set(inboundCallConfigurationType);
            }
        }
        
        /**
         * Unsets the "InboundCallConfigurationType" element
         */
        public void unsetInboundCallConfigurationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INBOUNDCALLCONFIGURATIONTYPE$4, 0);
            }
        }
        
        /**
         * Gets the "InboundCallConfiguration" element
         */
        public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration getInboundCallConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration)get_store().find_element_user(INBOUNDCALLCONFIGURATION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "InboundCallConfiguration" element
         */
        public boolean isSetInboundCallConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INBOUNDCALLCONFIGURATION$6) != 0;
            }
        }
        
        /**
         * Sets the "InboundCallConfiguration" element
         */
        public void setInboundCallConfiguration(com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration inboundCallConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration)get_store().find_element_user(INBOUNDCALLCONFIGURATION$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration)get_store().add_element_user(INBOUNDCALLCONFIGURATION$6);
                }
                target.set(inboundCallConfiguration);
            }
        }
        
        /**
         * Appends and returns a new empty "InboundCallConfiguration" element
         */
        public com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration addNewInboundCallConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration target = null;
                target = (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration)get_store().add_element_user(INBOUNDCALLCONFIGURATION$6);
                return target;
            }
        }
        
        /**
         * Unsets the "InboundCallConfiguration" element
         */
        public void unsetInboundCallConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INBOUNDCALLCONFIGURATION$6, 0);
            }
        }
        /**
         * An XML InboundCallConfiguration(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public static class InboundCallConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration
        {
            
            public InboundCallConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CALLTRACKINGCONFIG$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "CallTrackingConfig");
            private static final javax.xml.namespace.QName IVRINBOUNDCONFIG$2 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "IvrInboundConfig");
            
            
            /**
             * Gets the "CallTrackingConfig" element
             */
            public com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig getCallTrackingConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
                    target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().find_element_user(CALLTRACKINGCONFIG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "CallTrackingConfig" element
             */
            public boolean isSetCallTrackingConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CALLTRACKINGCONFIG$0) != 0;
                }
            }
            
            /**
             * Sets the "CallTrackingConfig" element
             */
            public void setCallTrackingConfig(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig callTrackingConfig)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
                    target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().find_element_user(CALLTRACKINGCONFIG$0, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().add_element_user(CALLTRACKINGCONFIG$0);
                    }
                    target.set(callTrackingConfig);
                }
            }
            
            /**
             * Appends and returns a new empty "CallTrackingConfig" element
             */
            public com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig addNewCallTrackingConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
                    target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().add_element_user(CALLTRACKINGCONFIG$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "CallTrackingConfig" element
             */
            public void unsetCallTrackingConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CALLTRACKINGCONFIG$0, 0);
                }
            }
            
            /**
             * Gets the "IvrInboundConfig" element
             */
            public com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig getIvrInboundConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
                    target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().find_element_user(IVRINBOUNDCONFIG$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "IvrInboundConfig" element
             */
            public boolean isSetIvrInboundConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IVRINBOUNDCONFIG$2) != 0;
                }
            }
            
            /**
             * Sets the "IvrInboundConfig" element
             */
            public void setIvrInboundConfig(com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig ivrInboundConfig)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
                    target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().find_element_user(IVRINBOUNDCONFIG$2, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().add_element_user(IVRINBOUNDCONFIG$2);
                    }
                    target.set(ivrInboundConfig);
                }
            }
            
            /**
             * Appends and returns a new empty "IvrInboundConfig" element
             */
            public com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig addNewIvrInboundConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
                    target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().add_element_user(IVRINBOUNDCONFIG$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "IvrInboundConfig" element
             */
            public void unsetIvrInboundConfig()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IVRINBOUNDCONFIG$2, 0);
                }
            }
        }
    }
}
