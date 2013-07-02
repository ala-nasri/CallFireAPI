/*
 * An XML document type.
 * Localname: NumberOrder
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one NumberOrder(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface NumberOrderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberOrderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("numberorderf560doctype");
    
    /**
     * Gets the "NumberOrder" element
     */
    com.callfire.api.data.NumberOrderDocument.NumberOrder getNumberOrder();
    
    /**
     * Sets the "NumberOrder" element
     */
    void setNumberOrder(com.callfire.api.data.NumberOrderDocument.NumberOrder numberOrder);
    
    /**
     * Appends and returns a new empty "NumberOrder" element
     */
    com.callfire.api.data.NumberOrderDocument.NumberOrder addNewNumberOrder();
    
    /**
     * An XML NumberOrder(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface NumberOrder extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("numberorder2aefelemtype");
        
        /**
         * Gets the "Status" element
         */
        com.callfire.api.data.OrderStatus.Enum getStatus();
        
        /**
         * Gets (as xml) the "Status" element
         */
        com.callfire.api.data.OrderStatus xgetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.callfire.api.data.OrderStatus.Enum status);
        
        /**
         * Sets (as xml) the "Status" element
         */
        void xsetStatus(com.callfire.api.data.OrderStatus status);
        
        /**
         * Gets the "Created" element
         */
        java.util.Calendar getCreated();
        
        /**
         * Gets (as xml) the "Created" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCreated();
        
        /**
         * Sets the "Created" element
         */
        void setCreated(java.util.Calendar created);
        
        /**
         * Sets (as xml) the "Created" element
         */
        void xsetCreated(org.apache.xmlbeans.XmlDateTime created);
        
        /**
         * Gets the "TotalCost" element
         */
        float getTotalCost();
        
        /**
         * Gets (as xml) the "TotalCost" element
         */
        org.apache.xmlbeans.XmlFloat xgetTotalCost();
        
        /**
         * Sets the "TotalCost" element
         */
        void setTotalCost(float totalCost);
        
        /**
         * Sets (as xml) the "TotalCost" element
         */
        void xsetTotalCost(org.apache.xmlbeans.XmlFloat totalCost);
        
        /**
         * Gets the "LocalNumbers" element
         */
        com.callfire.api.data.NumberOrderItem getLocalNumbers();
        
        /**
         * True if has "LocalNumbers" element
         */
        boolean isSetLocalNumbers();
        
        /**
         * Sets the "LocalNumbers" element
         */
        void setLocalNumbers(com.callfire.api.data.NumberOrderItem localNumbers);
        
        /**
         * Appends and returns a new empty "LocalNumbers" element
         */
        com.callfire.api.data.NumberOrderItem addNewLocalNumbers();
        
        /**
         * Unsets the "LocalNumbers" element
         */
        void unsetLocalNumbers();
        
        /**
         * Gets the "TollFreeNumbers" element
         */
        com.callfire.api.data.NumberOrderItem getTollFreeNumbers();
        
        /**
         * True if has "TollFreeNumbers" element
         */
        boolean isSetTollFreeNumbers();
        
        /**
         * Sets the "TollFreeNumbers" element
         */
        void setTollFreeNumbers(com.callfire.api.data.NumberOrderItem tollFreeNumbers);
        
        /**
         * Appends and returns a new empty "TollFreeNumbers" element
         */
        com.callfire.api.data.NumberOrderItem addNewTollFreeNumbers();
        
        /**
         * Unsets the "TollFreeNumbers" element
         */
        void unsetTollFreeNumbers();
        
        /**
         * Gets the "Keywords" element
         */
        com.callfire.api.data.NumberOrderItem getKeywords();
        
        /**
         * True if has "Keywords" element
         */
        boolean isSetKeywords();
        
        /**
         * Sets the "Keywords" element
         */
        void setKeywords(com.callfire.api.data.NumberOrderItem keywords);
        
        /**
         * Appends and returns a new empty "Keywords" element
         */
        com.callfire.api.data.NumberOrderItem addNewKeywords();
        
        /**
         * Unsets the "Keywords" element
         */
        void unsetKeywords();
        
        /**
         * Gets the "id" attribute
         */
        long getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlLong xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(long id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlLong id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.NumberOrderDocument.NumberOrder newInstance() {
              return (com.callfire.api.data.NumberOrderDocument.NumberOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.NumberOrderDocument.NumberOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.NumberOrderDocument.NumberOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.NumberOrderDocument newInstance() {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.NumberOrderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.NumberOrderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.NumberOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.NumberOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.NumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
