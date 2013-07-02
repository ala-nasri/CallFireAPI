/*
 * An XML document type.
 * Localname: AutoReplyQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.AutoReplyQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one AutoReplyQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface AutoReplyQueryResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AutoReplyQueryResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("autoreplyqueryresult48d0doctype");
    
    /**
     * Gets the "AutoReplyQueryResult" element
     */
    com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult getAutoReplyQueryResult();
    
    /**
     * Sets the "AutoReplyQueryResult" element
     */
    void setAutoReplyQueryResult(com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult autoReplyQueryResult);
    
    /**
     * Appends and returns a new empty "AutoReplyQueryResult" element
     */
    com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult addNewAutoReplyQueryResult();
    
    /**
     * An XML AutoReplyQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface AutoReplyQueryResult extends com.callfire.api.service.xsd.QueryResult
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AutoReplyQueryResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("autoreplyqueryresult2acaelemtype");
        
        /**
         * Gets array of all "AutoReply" elements
         */
        com.callfire.api.data.AutoReplyDocument.AutoReply[] getAutoReplyArray();
        
        /**
         * Gets ith "AutoReply" element
         */
        com.callfire.api.data.AutoReplyDocument.AutoReply getAutoReplyArray(int i);
        
        /**
         * Returns number of "AutoReply" element
         */
        int sizeOfAutoReplyArray();
        
        /**
         * Sets array of all "AutoReply" element
         */
        void setAutoReplyArray(com.callfire.api.data.AutoReplyDocument.AutoReply[] autoReplyArray);
        
        /**
         * Sets ith "AutoReply" element
         */
        void setAutoReplyArray(int i, com.callfire.api.data.AutoReplyDocument.AutoReply autoReply);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AutoReply" element
         */
        com.callfire.api.data.AutoReplyDocument.AutoReply insertNewAutoReply(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AutoReply" element
         */
        com.callfire.api.data.AutoReplyDocument.AutoReply addNewAutoReply();
        
        /**
         * Removes the ith "AutoReply" element
         */
        void removeAutoReply(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult newInstance() {
              return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument.AutoReplyQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument newInstance() {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.AutoReplyQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.AutoReplyQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
