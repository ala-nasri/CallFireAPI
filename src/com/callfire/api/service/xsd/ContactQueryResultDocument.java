/*
 * An XML document type.
 * Localname: ContactQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one ContactQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface ContactQueryResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactQueryResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactqueryresult66cbdoctype");
    
    /**
     * Gets the "ContactQueryResult" element
     */
    com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult getContactQueryResult();
    
    /**
     * Sets the "ContactQueryResult" element
     */
    void setContactQueryResult(com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult contactQueryResult);
    
    /**
     * Appends and returns a new empty "ContactQueryResult" element
     */
    com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult addNewContactQueryResult();
    
    /**
     * An XML ContactQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface ContactQueryResult extends com.callfire.api.service.xsd.QueryResult
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactQueryResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactqueryresult186aelemtype");
        
        /**
         * Gets the "ContactListName" element
         */
        java.lang.String getContactListName();
        
        /**
         * Gets (as xml) the "ContactListName" element
         */
        org.apache.xmlbeans.XmlString xgetContactListName();
        
        /**
         * True if has "ContactListName" element
         */
        boolean isSetContactListName();
        
        /**
         * Sets the "ContactListName" element
         */
        void setContactListName(java.lang.String contactListName);
        
        /**
         * Sets (as xml) the "ContactListName" element
         */
        void xsetContactListName(org.apache.xmlbeans.XmlString contactListName);
        
        /**
         * Unsets the "ContactListName" element
         */
        void unsetContactListName();
        
        /**
         * Gets array of all "Contact" elements
         */
        com.callfire.api.data.ContactDocument.Contact[] getContactArray();
        
        /**
         * Gets ith "Contact" element
         */
        com.callfire.api.data.ContactDocument.Contact getContactArray(int i);
        
        /**
         * Returns number of "Contact" element
         */
        int sizeOfContactArray();
        
        /**
         * Sets array of all "Contact" element
         */
        void setContactArray(com.callfire.api.data.ContactDocument.Contact[] contactArray);
        
        /**
         * Sets ith "Contact" element
         */
        void setContactArray(int i, com.callfire.api.data.ContactDocument.Contact contact);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contact" element
         */
        com.callfire.api.data.ContactDocument.Contact insertNewContact(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contact" element
         */
        com.callfire.api.data.ContactDocument.Contact addNewContact();
        
        /**
         * Removes the ith "Contact" element
         */
        void removeContact(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult newInstance() {
              return (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ContactQueryResultDocument.ContactQueryResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.ContactQueryResultDocument newInstance() {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactQueryResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactQueryResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
