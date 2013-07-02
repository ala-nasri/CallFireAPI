/*
 * An XML document type.
 * Localname: ContactSource
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ContactSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * A document containing one ContactSource(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public interface ContactSourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactSourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactsourceaa0fdoctype");
    
    /**
     * Gets the "ContactSource" element
     */
    com.callfire.api.service.xsd.ContactSourceDocument.ContactSource getContactSource();
    
    /**
     * Sets the "ContactSource" element
     */
    void setContactSource(com.callfire.api.service.xsd.ContactSourceDocument.ContactSource contactSource);
    
    /**
     * Appends and returns a new empty "ContactSource" element
     */
    com.callfire.api.service.xsd.ContactSourceDocument.ContactSource addNewContactSource();
    
    /**
     * An XML ContactSource(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public interface ContactSource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contactsource3336elemtype");
        
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
         * Gets the "ContactId" element
         */
        java.util.List getContactId();
        
        /**
         * Gets (as xml) the "ContactId" element
         */
        com.callfire.api.service.xsd.IdList xgetContactId();
        
        /**
         * True if has "ContactId" element
         */
        boolean isSetContactId();
        
        /**
         * Sets the "ContactId" element
         */
        void setContactId(java.util.List contactId);
        
        /**
         * Sets (as xml) the "ContactId" element
         */
        void xsetContactId(com.callfire.api.service.xsd.IdList contactId);
        
        /**
         * Unsets the "ContactId" element
         */
        void unsetContactId();
        
        /**
         * Gets the "File" element
         */
        byte[] getFile();
        
        /**
         * Gets (as xml) the "File" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetFile();
        
        /**
         * True if has "File" element
         */
        boolean isSetFile();
        
        /**
         * Sets the "File" element
         */
        void setFile(byte[] file);
        
        /**
         * Sets (as xml) the "File" element
         */
        void xsetFile(org.apache.xmlbeans.XmlBase64Binary file);
        
        /**
         * Unsets the "File" element
         */
        void unsetFile();
        
        /**
         * Gets the "Numbers" element
         */
        com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers getNumbers();
        
        /**
         * True if has "Numbers" element
         */
        boolean isSetNumbers();
        
        /**
         * Sets the "Numbers" element
         */
        void setNumbers(com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers numbers);
        
        /**
         * Appends and returns a new empty "Numbers" element
         */
        com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers addNewNumbers();
        
        /**
         * Unsets the "Numbers" element
         */
        void unsetNumbers();
        
        /**
         * An XML Numbers(@http://api.callfire.com/service/xsd).
         *
         * This is a list type whose items are com.callfire.api.data.PhoneNumber.
         */
        public interface Numbers extends com.callfire.api.data.PhoneNumberList
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Numbers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("numbers0accelemtype");
            
            /**
             * Gets the "fieldName" attribute
             */
            java.lang.String getFieldName();
            
            /**
             * Gets (as xml) the "fieldName" attribute
             */
            org.apache.xmlbeans.XmlString xgetFieldName();
            
            /**
             * True if has "fieldName" attribute
             */
            boolean isSetFieldName();
            
            /**
             * Sets the "fieldName" attribute
             */
            void setFieldName(java.lang.String fieldName);
            
            /**
             * Sets (as xml) the "fieldName" attribute
             */
            void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
            
            /**
             * Unsets the "fieldName" attribute
             */
            void unsetFieldName();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers newInstance() {
                  return (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource.Numbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ContactSourceDocument.ContactSource newInstance() {
              return (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ContactSourceDocument.ContactSource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ContactSourceDocument.ContactSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.ContactSourceDocument newInstance() {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ContactSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ContactSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
