/*
 * An XML document type.
 * Localname: ContactBatch
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one ContactBatch(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface ContactBatchDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactBatchDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactbatch03f9doctype");
    
    /**
     * Gets the "ContactBatch" element
     */
    com.callfire.api.data.ContactBatchDocument.ContactBatch getContactBatch();
    
    /**
     * Sets the "ContactBatch" element
     */
    void setContactBatch(com.callfire.api.data.ContactBatchDocument.ContactBatch contactBatch);
    
    /**
     * Appends and returns a new empty "ContactBatch" element
     */
    com.callfire.api.data.ContactBatchDocument.ContactBatch addNewContactBatch();
    
    /**
     * An XML ContactBatch(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface ContactBatch extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactBatch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactbatch5aafelemtype");
        
        /**
         * Gets the "Name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "Name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "Name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "Name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "Status" element
         */
        com.callfire.api.data.BatchStatus.Enum getStatus();
        
        /**
         * Gets (as xml) the "Status" element
         */
        com.callfire.api.data.BatchStatus xgetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.callfire.api.data.BatchStatus.Enum status);
        
        /**
         * Sets (as xml) the "Status" element
         */
        void xsetStatus(com.callfire.api.data.BatchStatus status);
        
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
         * Gets the "Size" element
         */
        int getSize();
        
        /**
         * Gets (as xml) the "Size" element
         */
        org.apache.xmlbeans.XmlInt xgetSize();
        
        /**
         * True if has "Size" element
         */
        boolean isSetSize();
        
        /**
         * Sets the "Size" element
         */
        void setSize(int size);
        
        /**
         * Sets (as xml) the "Size" element
         */
        void xsetSize(org.apache.xmlbeans.XmlInt size);
        
        /**
         * Unsets the "Size" element
         */
        void unsetSize();
        
        /**
         * Gets the "Remaining" element
         */
        int getRemaining();
        
        /**
         * Gets (as xml) the "Remaining" element
         */
        org.apache.xmlbeans.XmlInt xgetRemaining();
        
        /**
         * True if has "Remaining" element
         */
        boolean isSetRemaining();
        
        /**
         * Sets the "Remaining" element
         */
        void setRemaining(int remaining);
        
        /**
         * Sets (as xml) the "Remaining" element
         */
        void xsetRemaining(org.apache.xmlbeans.XmlInt remaining);
        
        /**
         * Unsets the "Remaining" element
         */
        void unsetRemaining();
        
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
            public static com.callfire.api.data.ContactBatchDocument.ContactBatch newInstance() {
              return (com.callfire.api.data.ContactBatchDocument.ContactBatch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.ContactBatchDocument.ContactBatch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.ContactBatchDocument.ContactBatch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.ContactBatchDocument newInstance() {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.ContactBatchDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.ContactBatchDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactBatchDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactBatchDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
