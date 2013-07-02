/*
 * An XML document type.
 * Localname: Broadcast
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one Broadcast(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface BroadcastDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcast19e4doctype");
    
    /**
     * Gets the "Broadcast" element
     */
    com.callfire.api.data.BroadcastDocument.Broadcast getBroadcast();
    
    /**
     * Sets the "Broadcast" element
     */
    void setBroadcast(com.callfire.api.data.BroadcastDocument.Broadcast broadcast);
    
    /**
     * Appends and returns a new empty "Broadcast" element
     */
    com.callfire.api.data.BroadcastDocument.Broadcast addNewBroadcast();
    
    /**
     * An XML Broadcast(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface Broadcast extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Broadcast.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcast0177elemtype");
        
        /**
         * Gets the "Name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "Name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "Name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "Name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "Name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "Name" element
         */
        void unsetName();
        
        /**
         * Gets the "Status" element
         */
        com.callfire.api.data.BroadcastStatus.Enum getStatus();
        
        /**
         * Gets (as xml) the "Status" element
         */
        com.callfire.api.data.BroadcastStatus xgetStatus();
        
        /**
         * True if has "Status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.callfire.api.data.BroadcastStatus.Enum status);
        
        /**
         * Sets (as xml) the "Status" element
         */
        void xsetStatus(com.callfire.api.data.BroadcastStatus status);
        
        /**
         * Unsets the "Status" element
         */
        void unsetStatus();
        
        /**
         * Gets the "LastModified" element
         */
        java.util.Calendar getLastModified();
        
        /**
         * Gets (as xml) the "LastModified" element
         */
        org.apache.xmlbeans.XmlDateTime xgetLastModified();
        
        /**
         * True if has "LastModified" element
         */
        boolean isSetLastModified();
        
        /**
         * Sets the "LastModified" element
         */
        void setLastModified(java.util.Calendar lastModified);
        
        /**
         * Sets (as xml) the "LastModified" element
         */
        void xsetLastModified(org.apache.xmlbeans.XmlDateTime lastModified);
        
        /**
         * Unsets the "LastModified" element
         */
        void unsetLastModified();
        
        /**
         * Gets the "Type" element
         */
        com.callfire.api.data.BroadcastType.Enum getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        com.callfire.api.data.BroadcastType xgetType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(com.callfire.api.data.BroadcastType.Enum type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(com.callfire.api.data.BroadcastType type);
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets the "VoiceBroadcastConfig" element
         */
        com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig getVoiceBroadcastConfig();
        
        /**
         * True if has "VoiceBroadcastConfig" element
         */
        boolean isSetVoiceBroadcastConfig();
        
        /**
         * Sets the "VoiceBroadcastConfig" element
         */
        void setVoiceBroadcastConfig(com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig voiceBroadcastConfig);
        
        /**
         * Appends and returns a new empty "VoiceBroadcastConfig" element
         */
        com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig addNewVoiceBroadcastConfig();
        
        /**
         * Unsets the "VoiceBroadcastConfig" element
         */
        void unsetVoiceBroadcastConfig();
        
        /**
         * Gets the "TextBroadcastConfig" element
         */
        com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig getTextBroadcastConfig();
        
        /**
         * True if has "TextBroadcastConfig" element
         */
        boolean isSetTextBroadcastConfig();
        
        /**
         * Sets the "TextBroadcastConfig" element
         */
        void setTextBroadcastConfig(com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig textBroadcastConfig);
        
        /**
         * Appends and returns a new empty "TextBroadcastConfig" element
         */
        com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig addNewTextBroadcastConfig();
        
        /**
         * Unsets the "TextBroadcastConfig" element
         */
        void unsetTextBroadcastConfig();
        
        /**
         * Gets the "IvrBroadcastConfig" element
         */
        com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig getIvrBroadcastConfig();
        
        /**
         * True if has "IvrBroadcastConfig" element
         */
        boolean isSetIvrBroadcastConfig();
        
        /**
         * Sets the "IvrBroadcastConfig" element
         */
        void setIvrBroadcastConfig(com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig ivrBroadcastConfig);
        
        /**
         * Appends and returns a new empty "IvrBroadcastConfig" element
         */
        com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig addNewIvrBroadcastConfig();
        
        /**
         * Unsets the "IvrBroadcastConfig" element
         */
        void unsetIvrBroadcastConfig();
        
        /**
         * Gets the "id" attribute
         */
        long getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlLong xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(long id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlLong id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.BroadcastDocument.Broadcast newInstance() {
              return (com.callfire.api.data.BroadcastDocument.Broadcast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.BroadcastDocument.Broadcast newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.BroadcastDocument.Broadcast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.BroadcastDocument newInstance() {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.BroadcastDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.BroadcastDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.BroadcastDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
