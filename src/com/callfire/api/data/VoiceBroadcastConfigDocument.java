/*
 * An XML document type.
 * Localname: VoiceBroadcastConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.VoiceBroadcastConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one VoiceBroadcastConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface VoiceBroadcastConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VoiceBroadcastConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("voicebroadcastconfigf782doctype");
    
    /**
     * Gets the "VoiceBroadcastConfig" element
     */
    com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig getVoiceBroadcastConfig();
    
    /**
     * Sets the "VoiceBroadcastConfig" element
     */
    void setVoiceBroadcastConfig(com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig voiceBroadcastConfig);
    
    /**
     * Appends and returns a new empty "VoiceBroadcastConfig" element
     */
    com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig addNewVoiceBroadcastConfig();
    
    /**
     * An XML VoiceBroadcastConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface VoiceBroadcastConfig extends com.callfire.api.data.BroadcastConfig
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VoiceBroadcastConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("voicebroadcastconfigcb8felemtype");
        
        /**
         * Gets the "AnsweringMachineConfig" element
         */
        com.callfire.api.data.AnsweringMachineConfig.Enum getAnsweringMachineConfig();
        
        /**
         * Gets (as xml) the "AnsweringMachineConfig" element
         */
        com.callfire.api.data.AnsweringMachineConfig xgetAnsweringMachineConfig();
        
        /**
         * True if has "AnsweringMachineConfig" element
         */
        boolean isSetAnsweringMachineConfig();
        
        /**
         * Sets the "AnsweringMachineConfig" element
         */
        void setAnsweringMachineConfig(com.callfire.api.data.AnsweringMachineConfig.Enum answeringMachineConfig);
        
        /**
         * Sets (as xml) the "AnsweringMachineConfig" element
         */
        void xsetAnsweringMachineConfig(com.callfire.api.data.AnsweringMachineConfig answeringMachineConfig);
        
        /**
         * Unsets the "AnsweringMachineConfig" element
         */
        void unsetAnsweringMachineConfig();
        
        /**
         * Gets the "LiveSoundId" element
         */
        long getLiveSoundId();
        
        /**
         * Gets (as xml) the "LiveSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetLiveSoundId();
        
        /**
         * True if has "LiveSoundId" element
         */
        boolean isSetLiveSoundId();
        
        /**
         * Sets the "LiveSoundId" element
         */
        void setLiveSoundId(long liveSoundId);
        
        /**
         * Sets (as xml) the "LiveSoundId" element
         */
        void xsetLiveSoundId(org.apache.xmlbeans.XmlLong liveSoundId);
        
        /**
         * Unsets the "LiveSoundId" element
         */
        void unsetLiveSoundId();
        
        /**
         * Gets the "MachineSoundId" element
         */
        long getMachineSoundId();
        
        /**
         * Gets (as xml) the "MachineSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetMachineSoundId();
        
        /**
         * True if has "MachineSoundId" element
         */
        boolean isSetMachineSoundId();
        
        /**
         * Sets the "MachineSoundId" element
         */
        void setMachineSoundId(long machineSoundId);
        
        /**
         * Sets (as xml) the "MachineSoundId" element
         */
        void xsetMachineSoundId(org.apache.xmlbeans.XmlLong machineSoundId);
        
        /**
         * Unsets the "MachineSoundId" element
         */
        void unsetMachineSoundId();
        
        /**
         * Gets the "TransferSoundId" element
         */
        long getTransferSoundId();
        
        /**
         * Gets (as xml) the "TransferSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetTransferSoundId();
        
        /**
         * True if has "TransferSoundId" element
         */
        boolean isSetTransferSoundId();
        
        /**
         * Sets the "TransferSoundId" element
         */
        void setTransferSoundId(long transferSoundId);
        
        /**
         * Sets (as xml) the "TransferSoundId" element
         */
        void xsetTransferSoundId(org.apache.xmlbeans.XmlLong transferSoundId);
        
        /**
         * Unsets the "TransferSoundId" element
         */
        void unsetTransferSoundId();
        
        /**
         * Gets the "TransferDigit" element
         */
        java.lang.String getTransferDigit();
        
        /**
         * Gets (as xml) the "TransferDigit" element
         */
        com.callfire.api.data.PhoneDigit xgetTransferDigit();
        
        /**
         * True if has "TransferDigit" element
         */
        boolean isSetTransferDigit();
        
        /**
         * Sets the "TransferDigit" element
         */
        void setTransferDigit(java.lang.String transferDigit);
        
        /**
         * Sets (as xml) the "TransferDigit" element
         */
        void xsetTransferDigit(com.callfire.api.data.PhoneDigit transferDigit);
        
        /**
         * Unsets the "TransferDigit" element
         */
        void unsetTransferDigit();
        
        /**
         * Gets the "TransferNumber" element
         */
        java.lang.String getTransferNumber();
        
        /**
         * Gets (as xml) the "TransferNumber" element
         */
        com.callfire.api.data.PhoneNumber xgetTransferNumber();
        
        /**
         * True if has "TransferNumber" element
         */
        boolean isSetTransferNumber();
        
        /**
         * Sets the "TransferNumber" element
         */
        void setTransferNumber(java.lang.String transferNumber);
        
        /**
         * Sets (as xml) the "TransferNumber" element
         */
        void xsetTransferNumber(com.callfire.api.data.PhoneNumber transferNumber);
        
        /**
         * Unsets the "TransferNumber" element
         */
        void unsetTransferNumber();
        
        /**
         * Gets the "DncSoundId" element
         */
        long getDncSoundId();
        
        /**
         * Gets (as xml) the "DncSoundId" element
         */
        org.apache.xmlbeans.XmlLong xgetDncSoundId();
        
        /**
         * True if has "DncSoundId" element
         */
        boolean isSetDncSoundId();
        
        /**
         * Sets the "DncSoundId" element
         */
        void setDncSoundId(long dncSoundId);
        
        /**
         * Sets (as xml) the "DncSoundId" element
         */
        void xsetDncSoundId(org.apache.xmlbeans.XmlLong dncSoundId);
        
        /**
         * Unsets the "DncSoundId" element
         */
        void unsetDncSoundId();
        
        /**
         * Gets the "DncDigit" element
         */
        java.lang.String getDncDigit();
        
        /**
         * Gets (as xml) the "DncDigit" element
         */
        com.callfire.api.data.PhoneDigit xgetDncDigit();
        
        /**
         * True if has "DncDigit" element
         */
        boolean isSetDncDigit();
        
        /**
         * Sets the "DncDigit" element
         */
        void setDncDigit(java.lang.String dncDigit);
        
        /**
         * Sets (as xml) the "DncDigit" element
         */
        void xsetDncDigit(com.callfire.api.data.PhoneDigit dncDigit);
        
        /**
         * Unsets the "DncDigit" element
         */
        void unsetDncDigit();
        
        /**
         * Gets the "MaxActiveTransfers" element
         */
        int getMaxActiveTransfers();
        
        /**
         * Gets (as xml) the "MaxActiveTransfers" element
         */
        org.apache.xmlbeans.XmlInt xgetMaxActiveTransfers();
        
        /**
         * True if has "MaxActiveTransfers" element
         */
        boolean isSetMaxActiveTransfers();
        
        /**
         * Sets the "MaxActiveTransfers" element
         */
        void setMaxActiveTransfers(int maxActiveTransfers);
        
        /**
         * Sets (as xml) the "MaxActiveTransfers" element
         */
        void xsetMaxActiveTransfers(org.apache.xmlbeans.XmlInt maxActiveTransfers);
        
        /**
         * Unsets the "MaxActiveTransfers" element
         */
        void unsetMaxActiveTransfers();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig newInstance() {
              return (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.VoiceBroadcastConfigDocument newInstance() {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.VoiceBroadcastConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.VoiceBroadcastConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
