/*
 * An XML document type.
 * Localname: CreateNumberOrder
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateNumberOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one CreateNumberOrder(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface CreateNumberOrderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateNumberOrderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createnumberorderb21ddoctype");
    
    /**
     * Gets the "CreateNumberOrder" element
     */
    com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder getCreateNumberOrder();
    
    /**
     * Sets the "CreateNumberOrder" element
     */
    void setCreateNumberOrder(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder createNumberOrder);
    
    /**
     * Appends and returns a new empty "CreateNumberOrder" element
     */
    com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder addNewCreateNumberOrder();
    
    /**
     * An XML CreateNumberOrder(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface CreateNumberOrder extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateNumberOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createnumberorder3c52elemtype");
        
        /**
         * Gets the "Numbers" element
         */
        java.util.List getNumbers();
        
        /**
         * Gets (as xml) the "Numbers" element
         */
        com.callfire.api.data.PhoneNumberList xgetNumbers();
        
        /**
         * True if has "Numbers" element
         */
        boolean isSetNumbers();
        
        /**
         * Sets the "Numbers" element
         */
        void setNumbers(java.util.List numbers);
        
        /**
         * Sets (as xml) the "Numbers" element
         */
        void xsetNumbers(com.callfire.api.data.PhoneNumberList numbers);
        
        /**
         * Unsets the "Numbers" element
         */
        void unsetNumbers();
        
        /**
         * Gets the "Keywords" element
         */
        java.util.List getKeywords();
        
        /**
         * Gets (as xml) the "Keywords" element
         */
        com.callfire.api.data.KeywordList xgetKeywords();
        
        /**
         * True if has "Keywords" element
         */
        boolean isSetKeywords();
        
        /**
         * Sets the "Keywords" element
         */
        void setKeywords(java.util.List keywords);
        
        /**
         * Sets (as xml) the "Keywords" element
         */
        void xsetKeywords(com.callfire.api.data.KeywordList keywords);
        
        /**
         * Unsets the "Keywords" element
         */
        void unsetKeywords();
        
        /**
         * Gets the "BulkLocal" element
         */
        com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal getBulkLocal();
        
        /**
         * True if has "BulkLocal" element
         */
        boolean isSetBulkLocal();
        
        /**
         * Sets the "BulkLocal" element
         */
        void setBulkLocal(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal bulkLocal);
        
        /**
         * Appends and returns a new empty "BulkLocal" element
         */
        com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal addNewBulkLocal();
        
        /**
         * Unsets the "BulkLocal" element
         */
        void unsetBulkLocal();
        
        /**
         * Gets the "BulkTollFree" element
         */
        com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree getBulkTollFree();
        
        /**
         * True if has "BulkTollFree" element
         */
        boolean isSetBulkTollFree();
        
        /**
         * Sets the "BulkTollFree" element
         */
        void setBulkTollFree(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree bulkTollFree);
        
        /**
         * Appends and returns a new empty "BulkTollFree" element
         */
        com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree addNewBulkTollFree();
        
        /**
         * Unsets the "BulkTollFree" element
         */
        void unsetBulkTollFree();
        
        /**
         * An XML BulkLocal(@http://api.callfire.com/service/xsd).
         *
         * This is a complex type.
         */
        public interface BulkLocal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BulkLocal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("bulklocald097elemtype");
            
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
             * Gets the "Region" element
             */
            com.callfire.api.data.RegionDocument.Region getRegion();
            
            /**
             * Sets the "Region" element
             */
            void setRegion(com.callfire.api.data.RegionDocument.Region region);
            
            /**
             * Appends and returns a new empty "Region" element
             */
            com.callfire.api.data.RegionDocument.Region addNewRegion();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal newInstance() {
                  return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML BulkTollFree(@http://api.callfire.com/service/xsd).
         *
         * This is a complex type.
         */
        public interface BulkTollFree extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BulkTollFree.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("bulktollfree0707elemtype");
            
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
                public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree newInstance() {
                  return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder newInstance() {
              return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument newInstance() {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateNumberOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateNumberOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
