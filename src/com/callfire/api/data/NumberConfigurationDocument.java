/*
 * An XML document type.
 * Localname: NumberConfiguration
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one NumberConfiguration(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface NumberConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("numberconfiguratione6b8doctype");
    
    /**
     * Gets the "NumberConfiguration" element
     */
    com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration getNumberConfiguration();
    
    /**
     * Sets the "NumberConfiguration" element
     */
    void setNumberConfiguration(com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration numberConfiguration);
    
    /**
     * Appends and returns a new empty "NumberConfiguration" element
     */
    com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration addNewNumberConfiguration();
    
    /**
     * An XML NumberConfiguration(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface NumberConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("numberconfigurationad9felemtype");
        
        /**
         * Gets the "CallFeature" element
         */
        com.callfire.api.data.NumberFeature.Enum getCallFeature();
        
        /**
         * Gets (as xml) the "CallFeature" element
         */
        com.callfire.api.data.NumberFeature xgetCallFeature();
        
        /**
         * True if has "CallFeature" element
         */
        boolean isSetCallFeature();
        
        /**
         * Sets the "CallFeature" element
         */
        void setCallFeature(com.callfire.api.data.NumberFeature.Enum callFeature);
        
        /**
         * Sets (as xml) the "CallFeature" element
         */
        void xsetCallFeature(com.callfire.api.data.NumberFeature callFeature);
        
        /**
         * Unsets the "CallFeature" element
         */
        void unsetCallFeature();
        
        /**
         * Gets the "TextFeature" element
         */
        com.callfire.api.data.NumberFeature.Enum getTextFeature();
        
        /**
         * Gets (as xml) the "TextFeature" element
         */
        com.callfire.api.data.NumberFeature xgetTextFeature();
        
        /**
         * True if has "TextFeature" element
         */
        boolean isSetTextFeature();
        
        /**
         * Sets the "TextFeature" element
         */
        void setTextFeature(com.callfire.api.data.NumberFeature.Enum textFeature);
        
        /**
         * Sets (as xml) the "TextFeature" element
         */
        void xsetTextFeature(com.callfire.api.data.NumberFeature textFeature);
        
        /**
         * Unsets the "TextFeature" element
         */
        void unsetTextFeature();
        
        /**
         * Gets the "InboundCallConfigurationType" element
         */
        com.callfire.api.data.InboundType.Enum getInboundCallConfigurationType();
        
        /**
         * Gets (as xml) the "InboundCallConfigurationType" element
         */
        com.callfire.api.data.InboundType xgetInboundCallConfigurationType();
        
        /**
         * True if has "InboundCallConfigurationType" element
         */
        boolean isSetInboundCallConfigurationType();
        
        /**
         * Sets the "InboundCallConfigurationType" element
         */
        void setInboundCallConfigurationType(com.callfire.api.data.InboundType.Enum inboundCallConfigurationType);
        
        /**
         * Sets (as xml) the "InboundCallConfigurationType" element
         */
        void xsetInboundCallConfigurationType(com.callfire.api.data.InboundType inboundCallConfigurationType);
        
        /**
         * Unsets the "InboundCallConfigurationType" element
         */
        void unsetInboundCallConfigurationType();
        
        /**
         * Gets the "InboundCallConfiguration" element
         */
        com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration getInboundCallConfiguration();
        
        /**
         * True if has "InboundCallConfiguration" element
         */
        boolean isSetInboundCallConfiguration();
        
        /**
         * Sets the "InboundCallConfiguration" element
         */
        void setInboundCallConfiguration(com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration inboundCallConfiguration);
        
        /**
         * Appends and returns a new empty "InboundCallConfiguration" element
         */
        com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration addNewInboundCallConfiguration();
        
        /**
         * Unsets the "InboundCallConfiguration" element
         */
        void unsetInboundCallConfiguration();
        
        /**
         * An XML InboundCallConfiguration(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public interface InboundCallConfiguration extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InboundCallConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("inboundcallconfigurationc284elemtype");
            
            /**
             * Gets the "CallTrackingConfig" element
             */
            com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig getCallTrackingConfig();
            
            /**
             * True if has "CallTrackingConfig" element
             */
            boolean isSetCallTrackingConfig();
            
            /**
             * Sets the "CallTrackingConfig" element
             */
            void setCallTrackingConfig(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig callTrackingConfig);
            
            /**
             * Appends and returns a new empty "CallTrackingConfig" element
             */
            com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig addNewCallTrackingConfig();
            
            /**
             * Unsets the "CallTrackingConfig" element
             */
            void unsetCallTrackingConfig();
            
            /**
             * Gets the "IvrInboundConfig" element
             */
            com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig getIvrInboundConfig();
            
            /**
             * True if has "IvrInboundConfig" element
             */
            boolean isSetIvrInboundConfig();
            
            /**
             * Sets the "IvrInboundConfig" element
             */
            void setIvrInboundConfig(com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig ivrInboundConfig);
            
            /**
             * Appends and returns a new empty "IvrInboundConfig" element
             */
            com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig addNewIvrInboundConfig();
            
            /**
             * Unsets the "IvrInboundConfig" element
             */
            void unsetIvrInboundConfig();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration newInstance() {
                  return (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration.InboundCallConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration newInstance() {
              return (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.NumberConfigurationDocument.NumberConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.NumberConfigurationDocument newInstance() {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.NumberConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.NumberConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.NumberConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.NumberConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
