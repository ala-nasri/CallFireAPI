/*
 * An XML document type.
 * Localname: SearchAvailableNumbers
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SearchAvailableNumbersDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one SearchAvailableNumbers(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface SearchAvailableNumbersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchAvailableNumbersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("searchavailablenumbers2a8fdoctype");
    
    /**
     * Gets the "SearchAvailableNumbers" element
     */
    com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers getSearchAvailableNumbers();
    
    /**
     * Sets the "SearchAvailableNumbers" element
     */
    void setSearchAvailableNumbers(com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers searchAvailableNumbers);
    
    /**
     * Appends and returns a new empty "SearchAvailableNumbers" element
     */
    com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers addNewSearchAvailableNumbers();
    
    /**
     * An XML SearchAvailableNumbers(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface SearchAvailableNumbers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchAvailableNumbers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("searchavailablenumbers4ceaelemtype");
        
        /**
         * Gets the "Region" element
         */
        com.callfire.api.data.RegionDocument.Region getRegion();
        
        /**
         * True if has "Region" element
         */
        boolean isSetRegion();
        
        /**
         * Sets the "Region" element
         */
        void setRegion(com.callfire.api.data.RegionDocument.Region region);
        
        /**
         * Appends and returns a new empty "Region" element
         */
        com.callfire.api.data.RegionDocument.Region addNewRegion();
        
        /**
         * Unsets the "Region" element
         */
        void unsetRegion();
        
        /**
         * Gets the "TollFree" element
         */
        boolean getTollFree();
        
        /**
         * Gets (as xml) the "TollFree" element
         */
        org.apache.xmlbeans.XmlBoolean xgetTollFree();
        
        /**
         * True if has "TollFree" element
         */
        boolean isSetTollFree();
        
        /**
         * Sets the "TollFree" element
         */
        void setTollFree(boolean tollFree);
        
        /**
         * Sets (as xml) the "TollFree" element
         */
        void xsetTollFree(org.apache.xmlbeans.XmlBoolean tollFree);
        
        /**
         * Unsets the "TollFree" element
         */
        void unsetTollFree();
        
        /**
         * Gets the "Count" element
         */
        int getCount();
        
        /**
         * Gets (as xml) the "Count" element
         */
        org.apache.xmlbeans.XmlInt xgetCount();
        
        /**
         * Sets the "Count" element
         */
        void setCount(int count);
        
        /**
         * Sets (as xml) the "Count" element
         */
        void xsetCount(org.apache.xmlbeans.XmlInt count);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers newInstance() {
              return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument.SearchAvailableNumbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument newInstance() {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.SearchAvailableNumbersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.SearchAvailableNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
