/*
 * An XML document type.
 * Localname: QueryBroadcasts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryBroadcastsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one QueryBroadcasts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface QueryBroadcastsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryBroadcastsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("querybroadcasts0b2edoctype");
    
    /**
     * Gets the "QueryBroadcasts" element
     */
    com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts getQueryBroadcasts();
    
    /**
     * Sets the "QueryBroadcasts" element
     */
    void setQueryBroadcasts(com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts queryBroadcasts);
    
    /**
     * Appends and returns a new empty "QueryBroadcasts" element
     */
    com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts addNewQueryBroadcasts();
    
    /**
     * An XML QueryBroadcasts(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface QueryBroadcasts extends com.callfire.api.service.xsd.Query
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryBroadcasts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("querybroadcasts01b4elemtype");
        
        /**
         * Gets the "Type" element
         */
        java.util.List getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type xgetType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(java.util.List type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type type);
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets the "Running" element
         */
        boolean getRunning();
        
        /**
         * Gets (as xml) the "Running" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRunning();
        
        /**
         * True if has "Running" element
         */
        boolean isSetRunning();
        
        /**
         * Sets the "Running" element
         */
        void setRunning(boolean running);
        
        /**
         * Sets (as xml) the "Running" element
         */
        void xsetRunning(org.apache.xmlbeans.XmlBoolean running);
        
        /**
         * Unsets the "Running" element
         */
        void unsetRunning();
        
        /**
         * Gets the "LabelName" element
         */
        java.lang.String getLabelName();
        
        /**
         * Gets (as xml) the "LabelName" element
         */
        org.apache.xmlbeans.XmlString xgetLabelName();
        
        /**
         * True if has "LabelName" element
         */
        boolean isSetLabelName();
        
        /**
         * Sets the "LabelName" element
         */
        void setLabelName(java.lang.String labelName);
        
        /**
         * Sets (as xml) the "LabelName" element
         */
        void xsetLabelName(org.apache.xmlbeans.XmlString labelName);
        
        /**
         * Unsets the "LabelName" element
         */
        void unsetLabelName();
        
        /**
         * An XML Type(@http://api.callfire.com/service/xsd).
         *
         * This is a list type whose items are com.callfire.api.data.BroadcastType.
         */
        public interface Type extends org.apache.xmlbeans.XmlAnySimpleType
        {
            java.util.List getListValue();
            java.util.List xgetListValue();
            void setListValue(java.util.List list);
            /** @deprecated */
            java.util.List listValue();
            /** @deprecated */
            java.util.List xlistValue();
            /** @deprecated */
            void set(java.util.List list);
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("typefbaaelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type newValue(java.lang.Object obj) {
                  return (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type) type.newValue( obj ); }
                
                public static com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type newInstance() {
                  return (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts newInstance() {
              return (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument newInstance() {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.QueryBroadcastsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.QueryBroadcastsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
