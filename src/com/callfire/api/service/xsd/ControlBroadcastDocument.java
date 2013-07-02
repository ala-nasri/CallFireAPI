/*
 * An XML document type.
 * Localname: ControlBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ControlBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one ControlBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface ControlBroadcastDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlBroadcastDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("controlbroadcast3aaadoctype");
    
    /**
     * Gets the "ControlBroadcast" element
     */
    com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast getControlBroadcast();
    
    /**
     * Sets the "ControlBroadcast" element
     */
    void setControlBroadcast(com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast controlBroadcast);
    
    /**
     * Appends and returns a new empty "ControlBroadcast" element
     */
    com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast addNewControlBroadcast();
    
    /**
     * An XML ControlBroadcast(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface ControlBroadcast extends com.callfire.api.service.xsd.IdRequest
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlBroadcast.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("controlbroadcast8e0aelemtype");
        
        /**
         * Gets the "RequestId" element
         */
        java.lang.String getRequestId();
        
        /**
         * Gets (as xml) the "RequestId" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetRequestId();
        
        /**
         * True if has "RequestId" element
         */
        boolean isSetRequestId();
        
        /**
         * Sets the "RequestId" element
         */
        void setRequestId(java.lang.String requestId);
        
        /**
         * Sets (as xml) the "RequestId" element
         */
        void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId);
        
        /**
         * Unsets the "RequestId" element
         */
        void unsetRequestId();
        
        /**
         * Gets the "Command" element
         */
        com.callfire.api.service.xsd.BroadcastCommand.Enum getCommand();
        
        /**
         * Gets (as xml) the "Command" element
         */
        com.callfire.api.service.xsd.BroadcastCommand xgetCommand();
        
        /**
         * True if has "Command" element
         */
        boolean isSetCommand();
        
        /**
         * Sets the "Command" element
         */
        void setCommand(com.callfire.api.service.xsd.BroadcastCommand.Enum command);
        
        /**
         * Sets (as xml) the "Command" element
         */
        void xsetCommand(com.callfire.api.service.xsd.BroadcastCommand command);
        
        /**
         * Unsets the "Command" element
         */
        void unsetCommand();
        
        /**
         * Gets the "MaxActive" element
         */
        int getMaxActive();
        
        /**
         * Gets (as xml) the "MaxActive" element
         */
        org.apache.xmlbeans.XmlInt xgetMaxActive();
        
        /**
         * True if has "MaxActive" element
         */
        boolean isSetMaxActive();
        
        /**
         * Sets the "MaxActive" element
         */
        void setMaxActive(int maxActive);
        
        /**
         * Sets (as xml) the "MaxActive" element
         */
        void xsetMaxActive(org.apache.xmlbeans.XmlInt maxActive);
        
        /**
         * Unsets the "MaxActive" element
         */
        void unsetMaxActive();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast newInstance() {
              return (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.ControlBroadcastDocument newInstance() {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ControlBroadcastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ControlBroadcastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
