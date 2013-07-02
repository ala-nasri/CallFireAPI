/*
 * An XML document type.
 * Localname: Contact
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one Contact(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface ContactDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contact1125doctype");
    
    /**
     * Gets the "Contact" element
     */
    com.callfire.api.data.ContactDocument.Contact getContact();
    
    /**
     * Sets the "Contact" element
     */
    void setContact(com.callfire.api.data.ContactDocument.Contact contact);
    
    /**
     * Appends and returns a new empty "Contact" element
     */
    com.callfire.api.data.ContactDocument.Contact addNewContact();
    
    /**
     * An XML Contact(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface Contact extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contact.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("contact5739elemtype");
        
        /**
         * Gets the "id" attribute
         */
        long getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlLong xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(long id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlLong id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "firstName" attribute
         */
        java.lang.String getFirstName();
        
        /**
         * Gets (as xml) the "firstName" attribute
         */
        org.apache.xmlbeans.XmlString xgetFirstName();
        
        /**
         * True if has "firstName" attribute
         */
        boolean isSetFirstName();
        
        /**
         * Sets the "firstName" attribute
         */
        void setFirstName(java.lang.String firstName);
        
        /**
         * Sets (as xml) the "firstName" attribute
         */
        void xsetFirstName(org.apache.xmlbeans.XmlString firstName);
        
        /**
         * Unsets the "firstName" attribute
         */
        void unsetFirstName();
        
        /**
         * Gets the "lastName" attribute
         */
        java.lang.String getLastName();
        
        /**
         * Gets (as xml) the "lastName" attribute
         */
        org.apache.xmlbeans.XmlString xgetLastName();
        
        /**
         * True if has "lastName" attribute
         */
        boolean isSetLastName();
        
        /**
         * Sets the "lastName" attribute
         */
        void setLastName(java.lang.String lastName);
        
        /**
         * Sets (as xml) the "lastName" attribute
         */
        void xsetLastName(org.apache.xmlbeans.XmlString lastName);
        
        /**
         * Unsets the "lastName" attribute
         */
        void unsetLastName();
        
        /**
         * Gets the "zipcode" attribute
         */
        java.lang.String getZipcode();
        
        /**
         * Gets (as xml) the "zipcode" attribute
         */
        org.apache.xmlbeans.XmlString xgetZipcode();
        
        /**
         * True if has "zipcode" attribute
         */
        boolean isSetZipcode();
        
        /**
         * Sets the "zipcode" attribute
         */
        void setZipcode(java.lang.String zipcode);
        
        /**
         * Sets (as xml) the "zipcode" attribute
         */
        void xsetZipcode(org.apache.xmlbeans.XmlString zipcode);
        
        /**
         * Unsets the "zipcode" attribute
         */
        void unsetZipcode();
        
        /**
         * Gets the "homePhone" attribute
         */
        java.lang.String getHomePhone();
        
        /**
         * Gets (as xml) the "homePhone" attribute
         */
        com.callfire.api.data.PhoneNumber xgetHomePhone();
        
        /**
         * True if has "homePhone" attribute
         */
        boolean isSetHomePhone();
        
        /**
         * Sets the "homePhone" attribute
         */
        void setHomePhone(java.lang.String homePhone);
        
        /**
         * Sets (as xml) the "homePhone" attribute
         */
        void xsetHomePhone(com.callfire.api.data.PhoneNumber homePhone);
        
        /**
         * Unsets the "homePhone" attribute
         */
        void unsetHomePhone();
        
        /**
         * Gets the "workPhone" attribute
         */
        java.lang.String getWorkPhone();
        
        /**
         * Gets (as xml) the "workPhone" attribute
         */
        com.callfire.api.data.PhoneNumber xgetWorkPhone();
        
        /**
         * True if has "workPhone" attribute
         */
        boolean isSetWorkPhone();
        
        /**
         * Sets the "workPhone" attribute
         */
        void setWorkPhone(java.lang.String workPhone);
        
        /**
         * Sets (as xml) the "workPhone" attribute
         */
        void xsetWorkPhone(com.callfire.api.data.PhoneNumber workPhone);
        
        /**
         * Unsets the "workPhone" attribute
         */
        void unsetWorkPhone();
        
        /**
         * Gets the "mobilePhone" attribute
         */
        java.lang.String getMobilePhone();
        
        /**
         * Gets (as xml) the "mobilePhone" attribute
         */
        com.callfire.api.data.PhoneNumber xgetMobilePhone();
        
        /**
         * True if has "mobilePhone" attribute
         */
        boolean isSetMobilePhone();
        
        /**
         * Sets the "mobilePhone" attribute
         */
        void setMobilePhone(java.lang.String mobilePhone);
        
        /**
         * Sets (as xml) the "mobilePhone" attribute
         */
        void xsetMobilePhone(com.callfire.api.data.PhoneNumber mobilePhone);
        
        /**
         * Unsets the "mobilePhone" attribute
         */
        void unsetMobilePhone();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.ContactDocument.Contact newInstance() {
              return (com.callfire.api.data.ContactDocument.Contact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.ContactDocument.Contact newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.ContactDocument.Contact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.ContactDocument newInstance() {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.ContactDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.ContactDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.ContactDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.ContactDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.ContactDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.ContactDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ContactDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
