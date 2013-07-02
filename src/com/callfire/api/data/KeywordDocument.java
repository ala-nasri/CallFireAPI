/*
 * An XML document type.
 * Localname: Keyword
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.KeywordDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one Keyword(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface KeywordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeywordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("keyword77fcdoctype");
    
    /**
     * Gets the "Keyword" element
     */
    com.callfire.api.data.KeywordDocument.Keyword getKeyword();
    
    /**
     * Sets the "Keyword" element
     */
    void setKeyword(com.callfire.api.data.KeywordDocument.Keyword keyword);
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    com.callfire.api.data.KeywordDocument.Keyword addNewKeyword();
    
    /**
     * An XML Keyword(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface Keyword extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Keyword.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("keywordc427elemtype");
        
        /**
         * Gets the "ShortCode" element
         */
        java.lang.String getShortCode();
        
        /**
         * Gets (as xml) the "ShortCode" element
         */
        com.callfire.api.data.PhoneNumber xgetShortCode();
        
        /**
         * Sets the "ShortCode" element
         */
        void setShortCode(java.lang.String shortCode);
        
        /**
         * Sets (as xml) the "ShortCode" element
         */
        void xsetShortCode(com.callfire.api.data.PhoneNumber shortCode);
        
        /**
         * Gets the "Keyword" element
         */
        java.lang.String getKeyword();
        
        /**
         * Gets (as xml) the "Keyword" element
         */
        org.apache.xmlbeans.XmlString xgetKeyword();
        
        /**
         * Sets the "Keyword" element
         */
        void setKeyword(java.lang.String keyword);
        
        /**
         * Sets (as xml) the "Keyword" element
         */
        void xsetKeyword(org.apache.xmlbeans.XmlString keyword);
        
        /**
         * Gets the "Status" element
         */
        com.callfire.api.data.NumberStatus.Enum getStatus();
        
        /**
         * Gets (as xml) the "Status" element
         */
        com.callfire.api.data.NumberStatus xgetStatus();
        
        /**
         * True if has "Status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.callfire.api.data.NumberStatus.Enum status);
        
        /**
         * Sets (as xml) the "Status" element
         */
        void xsetStatus(com.callfire.api.data.NumberStatus status);
        
        /**
         * Unsets the "Status" element
         */
        void unsetStatus();
        
        /**
         * Gets the "LeaseInfo" element
         */
        com.callfire.api.data.LeaseInfoDocument.LeaseInfo getLeaseInfo();
        
        /**
         * True if has "LeaseInfo" element
         */
        boolean isSetLeaseInfo();
        
        /**
         * Sets the "LeaseInfo" element
         */
        void setLeaseInfo(com.callfire.api.data.LeaseInfoDocument.LeaseInfo leaseInfo);
        
        /**
         * Appends and returns a new empty "LeaseInfo" element
         */
        com.callfire.api.data.LeaseInfoDocument.LeaseInfo addNewLeaseInfo();
        
        /**
         * Unsets the "LeaseInfo" element
         */
        void unsetLeaseInfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.KeywordDocument.Keyword newInstance() {
              return (com.callfire.api.data.KeywordDocument.Keyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.KeywordDocument.Keyword newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.KeywordDocument.Keyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.KeywordDocument newInstance() {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.KeywordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.KeywordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.KeywordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.KeywordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.KeywordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.KeywordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.KeywordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.KeywordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.KeywordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
