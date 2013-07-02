/*
 * An XML document type.
 * Localname: CallTrackingConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.CallTrackingConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one CallTrackingConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface CallTrackingConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallTrackingConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("calltrackingconfig2ffcdoctype");
    
    /**
     * Gets the "CallTrackingConfig" element
     */
    com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig getCallTrackingConfig();
    
    /**
     * Sets the "CallTrackingConfig" element
     */
    void setCallTrackingConfig(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig callTrackingConfig);
    
    /**
     * Appends and returns a new empty "CallTrackingConfig" element
     */
    com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig addNewCallTrackingConfig();
    
    /**
     * An XML CallTrackingConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface CallTrackingConfig extends com.callfire.api.data.InboundConfig
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallTrackingConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("calltrackingconfig06cfelemtype");
        
        /**
         * Gets the "TransferNumber" element
         */
        java.util.List getTransferNumber();
        
        /**
         * Gets (as xml) the "TransferNumber" element
         */
        com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber xgetTransferNumber();
        
        /**
         * True if has "TransferNumber" element
         */
        boolean isSetTransferNumber();
        
        /**
         * Sets the "TransferNumber" element
         */
        void setTransferNumber(java.util.List transferNumber);
        
        /**
         * Sets (as xml) the "TransferNumber" element
         */
        void xsetTransferNumber(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber transferNumber);
        
        /**
         * Unsets the "TransferNumber" element
         */
        void unsetTransferNumber();
        
        /**
         * Gets the "Screen" element
         */
        boolean getScreen();
        
        /**
         * Gets (as xml) the "Screen" element
         */
        org.apache.xmlbeans.XmlBoolean xgetScreen();
        
        /**
         * True if has "Screen" element
         */
        boolean isSetScreen();
        
        /**
         * Sets the "Screen" element
         */
        void setScreen(boolean screen);
        
        /**
         * Sets (as xml) the "Screen" element
         */
        void xsetScreen(org.apache.xmlbeans.XmlBoolean screen);
        
        /**
         * Unsets the "Screen" element
         */
        void unsetScreen();
        
        /**
         * Gets the "Record" element
         */
        boolean getRecord();
        
        /**
         * Gets (as xml) the "Record" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRecord();
        
        /**
         * True if has "Record" element
         */
        boolean isSetRecord();
        
        /**
         * Sets the "Record" element
         */
        void setRecord(boolean record);
        
        /**
         * Sets (as xml) the "Record" element
         */
        void xsetRecord(org.apache.xmlbeans.XmlBoolean record);
        
        /**
         * Unsets the "Record" element
         */
        void unsetRecord();
        
        /**
         * Gets the "IntroSoundId" element
         */
        long getIntroSoundId();
        
        /**
         * Gets (as xml) the "IntroSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetIntroSoundId();
        
        /**
         * True if has "IntroSoundId" element
         */
        boolean isSetIntroSoundId();
        
        /**
         * Sets the "IntroSoundId" element
         */
        void setIntroSoundId(long introSoundId);
        
        /**
         * Sets (as xml) the "IntroSoundId" element
         */
        void xsetIntroSoundId(org.apache.xmlbeans.XmlLong introSoundId);
        
        /**
         * Unsets the "IntroSoundId" element
         */
        void unsetIntroSoundId();
        
        /**
         * Gets the "WhisperSoundId" element
         */
        long getWhisperSoundId();
        
        /**
         * Gets (as xml) the "WhisperSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetWhisperSoundId();
        
        /**
         * True if has "WhisperSoundId" element
         */
        boolean isSetWhisperSoundId();
        
        /**
         * Sets the "WhisperSoundId" element
         */
        void setWhisperSoundId(long whisperSoundId);
        
        /**
         * Sets (as xml) the "WhisperSoundId" element
         */
        void xsetWhisperSoundId(org.apache.xmlbeans.XmlLong whisperSoundId);
        
        /**
         * Unsets the "WhisperSoundId" element
         */
        void unsetWhisperSoundId();
        
        /**
         * An XML TransferNumber(@http://api.callfire.com/data).
         *
         * This is a list type whose items are com.callfire.api.data.PhoneNumber.
         */
        public interface TransferNumber extends org.apache.xmlbeans.XmlAnySimpleType
        {
            java.util.List getListValue();
            java.util.List xgetListValue();
            void setListValue(java.util.List list);
            /** @deprecated */
            java.util.List listValue();
            /** @deprecated */
            java.util.List xlistValue();
            /** @deprecated */
            void set(java.util.List list);
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransferNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("transfernumberceffelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber newValue(java.lang.Object obj) {
                  return (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber) type.newValue( obj ); }
                
                public static com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber newInstance() {
                  return (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig newInstance() {
              return (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.CallTrackingConfigDocument newInstance() {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.CallTrackingConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.CallTrackingConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.CallTrackingConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.CallTrackingConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
