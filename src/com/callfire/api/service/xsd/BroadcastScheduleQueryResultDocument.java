/*
 * An XML document type.
 * Localname: BroadcastScheduleQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one BroadcastScheduleQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface BroadcastScheduleQueryResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastScheduleQueryResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcastschedulequeryresult2633doctype");
    
    /**
     * Gets the "BroadcastScheduleQueryResult" element
     */
    com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult getBroadcastScheduleQueryResult();
    
    /**
     * Sets the "BroadcastScheduleQueryResult" element
     */
    void setBroadcastScheduleQueryResult(com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult broadcastScheduleQueryResult);
    
    /**
     * Appends and returns a new empty "BroadcastScheduleQueryResult" element
     */
    com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult addNewBroadcastScheduleQueryResult();
    
    /**
     * An XML BroadcastScheduleQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface BroadcastScheduleQueryResult extends com.callfire.api.service.xsd.QueryResult
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastScheduleQueryResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcastschedulequeryresult136aelemtype");
        
        /**
         * Gets array of all "BroadcastSchedule" elements
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[] getBroadcastScheduleArray();
        
        /**
         * Gets ith "BroadcastSchedule" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastScheduleArray(int i);
        
        /**
         * Returns number of "BroadcastSchedule" element
         */
        int sizeOfBroadcastScheduleArray();
        
        /**
         * Sets array of all "BroadcastSchedule" element
         */
        void setBroadcastScheduleArray(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule[] broadcastScheduleArray);
        
        /**
         * Sets ith "BroadcastSchedule" element
         */
        void setBroadcastScheduleArray(int i, com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BroadcastSchedule" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule insertNewBroadcastSchedule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BroadcastSchedule" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule();
        
        /**
         * Removes the ith "BroadcastSchedule" element
         */
        void removeBroadcastSchedule(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult newInstance() {
              return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument.BroadcastScheduleQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument newInstance() {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.BroadcastScheduleQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
