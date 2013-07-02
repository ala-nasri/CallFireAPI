/*
 * An XML document type.
 * Localname: CreateBroadcastSchedule
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateBroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one CreateBroadcastSchedule(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface CreateBroadcastScheduleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateBroadcastScheduleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createbroadcastschedule6550doctype");
    
    /**
     * Gets the "CreateBroadcastSchedule" element
     */
    com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule getCreateBroadcastSchedule();
    
    /**
     * Sets the "CreateBroadcastSchedule" element
     */
    void setCreateBroadcastSchedule(com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule createBroadcastSchedule);
    
    /**
     * Appends and returns a new empty "CreateBroadcastSchedule" element
     */
    com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule addNewCreateBroadcastSchedule();
    
    /**
     * An XML CreateBroadcastSchedule(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface CreateBroadcastSchedule extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateBroadcastSchedule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createbroadcastscheduleb878elemtype");
        
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
         * Gets the "BroadcastId" element
         */
        long getBroadcastId();
        
        /**
         * Gets (as xml) the "BroadcastId" element
         */
        org.apache.xmlbeans.XmlLong xgetBroadcastId();
        
        /**
         * Sets the "BroadcastId" element
         */
        void setBroadcastId(long broadcastId);
        
        /**
         * Sets (as xml) the "BroadcastId" element
         */
        void xsetBroadcastId(org.apache.xmlbeans.XmlLong broadcastId);
        
        /**
         * Gets the "BroadcastSchedule" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastSchedule();
        
        /**
         * Sets the "BroadcastSchedule" element
         */
        void setBroadcastSchedule(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule);
        
        /**
         * Appends and returns a new empty "BroadcastSchedule" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule newInstance() {
              return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument.CreateBroadcastSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument newInstance() {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateBroadcastScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateBroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
