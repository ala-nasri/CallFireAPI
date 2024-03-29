/*
 * An XML document type.
 * Localname: ContactBatchQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactBatchQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one ContactBatchQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface ContactBatchQueryResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactBatchQueryResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactbatchqueryresultcc9fdoctype");
    
    /**
     * Gets the "ContactBatchQueryResult" element
     */
    com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult getContactBatchQueryResult();
    
    /**
     * Sets the "ContactBatchQueryResult" element
     */
    void setContactBatchQueryResult(com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult contactBatchQueryResult);
    
    /**
     * Appends and returns a new empty "ContactBatchQueryResult" element
     */
    com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult addNewContactBatchQueryResult();
    
    /**
     * An XML ContactBatchQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface ContactBatchQueryResult extends com.callfire.api.service.xsd.QueryResult
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactBatchQueryResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactbatchqueryresultf256elemtype");
        
        /**
         * Gets array of all "ContactBatch" elements
         */
        com.callfire.api.data.ContactBatchDocument.ContactBatch[] getContactBatchArray();
        
        /**
         * Gets ith "ContactBatch" element
         */
        com.callfire.api.data.ContactBatchDocument.ContactBatch getContactBatchArray(int i);
        
        /**
         * Returns number of "ContactBatch" element
         */
        int sizeOfContactBatchArray();
        
        /**
         * Sets array of all "ContactBatch" element
         */
        void setContactBatchArray(com.callfire.api.data.ContactBatchDocument.ContactBatch[] contactBatchArray);
        
        /**
         * Sets ith "ContactBatch" element
         */
        void setContactBatchArray(int i, com.callfire.api.data.ContactBatchDocument.ContactBatch contactBatch);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactBatch" element
         */
        com.callfire.api.data.ContactBatchDocument.ContactBatch insertNewContactBatch(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactBatch" element
         */
        com.callfire.api.data.ContactBatchDocument.ContactBatch addNewContactBatch();
        
        /**
         * Removes the ith "ContactBatch" element
         */
        void removeContactBatch(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult newInstance() {
              return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument.ContactBatchQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument newInstance() {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactBatchQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactBatchQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
