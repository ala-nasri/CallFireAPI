/*
 * An XML document type.
 * Localname: ContactHistory
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one ContactHistory(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface ContactHistoryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactHistoryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contacthistory971fdoctype");
    
    /**
     * Gets the "ContactHistory" element
     */
    com.callfire.api.data.ContactHistoryDocument.ContactHistory getContactHistory();
    
    /**
     * Sets the "ContactHistory" element
     */
    void setContactHistory(com.callfire.api.data.ContactHistoryDocument.ContactHistory contactHistory);
    
    /**
     * Appends and returns a new empty "ContactHistory" element
     */
    com.callfire.api.data.ContactHistoryDocument.ContactHistory addNewContactHistory();
    
    /**
     * An XML ContactHistory(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface ContactHistory extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contacthistory1a2felemtype");
        
        /**
         * Gets array of all "Call" elements
         */
        com.callfire.api.data.CallDocument.Call[] getCallArray();
        
        /**
         * Gets ith "Call" element
         */
        com.callfire.api.data.CallDocument.Call getCallArray(int i);
        
        /**
         * Returns number of "Call" element
         */
        int sizeOfCallArray();
        
        /**
         * Sets array of all "Call" element
         */
        void setCallArray(com.callfire.api.data.CallDocument.Call[] callArray);
        
        /**
         * Sets ith "Call" element
         */
        void setCallArray(int i, com.callfire.api.data.CallDocument.Call call);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Call" element
         */
        com.callfire.api.data.CallDocument.Call insertNewCall(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Call" element
         */
        com.callfire.api.data.CallDocument.Call addNewCall();
        
        /**
         * Removes the ith "Call" element
         */
        void removeCall(int i);
        
        /**
         * Gets array of all "Text" elements
         */
        com.callfire.api.data.TextDocument.Text[] getTextArray();
        
        /**
         * Gets ith "Text" element
         */
        com.callfire.api.data.TextDocument.Text getTextArray(int i);
        
        /**
         * Returns number of "Text" element
         */
        int sizeOfTextArray();
        
        /**
         * Sets array of all "Text" element
         */
        void setTextArray(com.callfire.api.data.TextDocument.Text[] textArray);
        
        /**
         * Sets ith "Text" element
         */
        void setTextArray(int i, com.callfire.api.data.TextDocument.Text text);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Text" element
         */
        com.callfire.api.data.TextDocument.Text insertNewText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Text" element
         */
        com.callfire.api.data.TextDocument.Text addNewText();
        
        /**
         * Removes the ith "Text" element
         */
        void removeText(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.ContactHistoryDocument.ContactHistory newInstance() {
              return (com.callfire.api.data.ContactHistoryDocument.ContactHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.ContactHistoryDocument.ContactHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.ContactHistoryDocument.ContactHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.ContactHistoryDocument newInstance() {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.ContactHistoryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.ContactHistoryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
