/*
 * An XML document type.
 * Localname: CreateContactBatch
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one CreateContactBatch(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface CreateContactBatchDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateContactBatchDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createcontactbatchbd9cdoctype");
    
    /**
     * Gets the "CreateContactBatch" element
     */
    com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch getCreateContactBatch();
    
    /**
     * Sets the "CreateContactBatch" element
     */
    void setCreateContactBatch(com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch createContactBatch);
    
    /**
     * Appends and returns a new empty "CreateContactBatch" element
     */
    com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch addNewCreateContactBatch();
    
    /**
     * An XML CreateContactBatch(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface CreateContactBatch extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateContactBatch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("createcontactbatch350aelemtype");
        
        /**
         * Gets the "RequestId" element
         */
        java.lang.String getRequestId();
        
        /**
         * Gets (as xml) the "RequestId" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetRequestId();
        
        /**
         * True if has "RequestId" element
         */
        boolean isSetRequestId();
        
        /**
         * Sets the "RequestId" element
         */
        void setRequestId(java.lang.String requestId);
        
        /**
         * Sets (as xml) the "RequestId" element
         */
        void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId);
        
        /**
         * Unsets the "RequestId" element
         */
        void unsetRequestId();
        
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
         * Gets the "Name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "Name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "Name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "Name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "Name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "Name" element
         */
        void unsetName();
        
        /**
         * Gets array of all "ToNumber" elements
         */
        com.callfire.api.data.ToNumber[] getToNumberArray();
        
        /**
         * Gets ith "ToNumber" element
         */
        com.callfire.api.data.ToNumber getToNumberArray(int i);
        
        /**
         * Returns number of "ToNumber" element
         */
        int sizeOfToNumberArray();
        
        /**
         * Sets array of all "ToNumber" element
         */
        void setToNumberArray(com.callfire.api.data.ToNumber[] toNumberArray);
        
        /**
         * Sets ith "ToNumber" element
         */
        void setToNumberArray(int i, com.callfire.api.data.ToNumber toNumber);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ToNumber" element
         */
        com.callfire.api.data.ToNumber insertNewToNumber(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ToNumber" element
         */
        com.callfire.api.data.ToNumber addNewToNumber();
        
        /**
         * Removes the ith "ToNumber" element
         */
        void removeToNumber(int i);
        
        /**
         * Gets the "ContactListId" element
         */
        long getContactListId();
        
        /**
         * Gets (as xml) the "ContactListId" element
         */
        org.apache.xmlbeans.XmlLong xgetContactListId();
        
        /**
         * True if has "ContactListId" element
         */
        boolean isSetContactListId();
        
        /**
         * Sets the "ContactListId" element
         */
        void setContactListId(long contactListId);
        
        /**
         * Sets (as xml) the "ContactListId" element
         */
        void xsetContactListId(org.apache.xmlbeans.XmlLong contactListId);
        
        /**
         * Unsets the "ContactListId" element
         */
        void unsetContactListId();
        
        /**
         * Gets the "ScrubBroadcastDuplicates" element
         */
        boolean getScrubBroadcastDuplicates();
        
        /**
         * Gets (as xml) the "ScrubBroadcastDuplicates" element
         */
        org.apache.xmlbeans.XmlBoolean xgetScrubBroadcastDuplicates();
        
        /**
         * True if has "ScrubBroadcastDuplicates" element
         */
        boolean isSetScrubBroadcastDuplicates();
        
        /**
         * Sets the "ScrubBroadcastDuplicates" element
         */
        void setScrubBroadcastDuplicates(boolean scrubBroadcastDuplicates);
        
        /**
         * Sets (as xml) the "ScrubBroadcastDuplicates" element
         */
        void xsetScrubBroadcastDuplicates(org.apache.xmlbeans.XmlBoolean scrubBroadcastDuplicates);
        
        /**
         * Unsets the "ScrubBroadcastDuplicates" element
         */
        void unsetScrubBroadcastDuplicates();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch newInstance() {
              return (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.CreateContactBatchDocument.CreateContactBatch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.CreateContactBatchDocument newInstance() {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.CreateContactBatchDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.CreateContactBatchDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
