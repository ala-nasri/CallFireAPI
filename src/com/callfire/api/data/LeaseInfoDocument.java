/*
 * An XML document type.
 * Localname: LeaseInfo
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.LeaseInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one LeaseInfo(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface LeaseInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeaseInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("leaseinfo45dddoctype");
    
    /**
     * Gets the "LeaseInfo" element
     */
    com.callfire.api.data.LeaseInfoDocument.LeaseInfo getLeaseInfo();
    
    /**
     * Sets the "LeaseInfo" element
     */
    void setLeaseInfo(com.callfire.api.data.LeaseInfoDocument.LeaseInfo leaseInfo);
    
    /**
     * Appends and returns a new empty "LeaseInfo" element
     */
    com.callfire.api.data.LeaseInfoDocument.LeaseInfo addNewLeaseInfo();
    
    /**
     * An XML LeaseInfo(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface LeaseInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeaseInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("leaseinfo2be9elemtype");
        
        /**
         * Gets the "LeaseBegin" element
         */
        java.util.Calendar getLeaseBegin();
        
        /**
         * Gets (as xml) the "LeaseBegin" element
         */
        org.apache.xmlbeans.XmlDate xgetLeaseBegin();
        
        /**
         * True if has "LeaseBegin" element
         */
        boolean isSetLeaseBegin();
        
        /**
         * Sets the "LeaseBegin" element
         */
        void setLeaseBegin(java.util.Calendar leaseBegin);
        
        /**
         * Sets (as xml) the "LeaseBegin" element
         */
        void xsetLeaseBegin(org.apache.xmlbeans.XmlDate leaseBegin);
        
        /**
         * Unsets the "LeaseBegin" element
         */
        void unsetLeaseBegin();
        
        /**
         * Gets the "LeaseEnd" element
         */
        java.util.Calendar getLeaseEnd();
        
        /**
         * Gets (as xml) the "LeaseEnd" element
         */
        org.apache.xmlbeans.XmlDate xgetLeaseEnd();
        
        /**
         * True if has "LeaseEnd" element
         */
        boolean isSetLeaseEnd();
        
        /**
         * Sets the "LeaseEnd" element
         */
        void setLeaseEnd(java.util.Calendar leaseEnd);
        
        /**
         * Sets (as xml) the "LeaseEnd" element
         */
        void xsetLeaseEnd(org.apache.xmlbeans.XmlDate leaseEnd);
        
        /**
         * Unsets the "LeaseEnd" element
         */
        void unsetLeaseEnd();
        
        /**
         * Gets the "AutoRenew" element
         */
        boolean getAutoRenew();
        
        /**
         * Gets (as xml) the "AutoRenew" element
         */
        org.apache.xmlbeans.XmlBoolean xgetAutoRenew();
        
        /**
         * Sets the "AutoRenew" element
         */
        void setAutoRenew(boolean autoRenew);
        
        /**
         * Sets (as xml) the "AutoRenew" element
         */
        void xsetAutoRenew(org.apache.xmlbeans.XmlBoolean autoRenew);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.LeaseInfoDocument.LeaseInfo newInstance() {
              return (com.callfire.api.data.LeaseInfoDocument.LeaseInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.LeaseInfoDocument.LeaseInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.LeaseInfoDocument.LeaseInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.LeaseInfoDocument newInstance() {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.LeaseInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.LeaseInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.LeaseInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.LeaseInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.LeaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
