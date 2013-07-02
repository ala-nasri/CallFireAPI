/*
 * An XML document type.
 * Localname: Region
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.RegionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one Region(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface RegionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("region1f7fdoctype");
    
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
     * An XML Region(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface Region extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Region.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("regiona52felemtype");
        
        /**
         * Gets the "Prefix" element
         */
        java.lang.String getPrefix();
        
        /**
         * Gets (as xml) the "Prefix" element
         */
        org.apache.xmlbeans.XmlString xgetPrefix();
        
        /**
         * True if has "Prefix" element
         */
        boolean isSetPrefix();
        
        /**
         * Sets the "Prefix" element
         */
        void setPrefix(java.lang.String prefix);
        
        /**
         * Sets (as xml) the "Prefix" element
         */
        void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
        
        /**
         * Unsets the "Prefix" element
         */
        void unsetPrefix();
        
        /**
         * Gets the "City" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "City" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * True if has "City" element
         */
        boolean isSetCity();
        
        /**
         * Sets the "City" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "City" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Unsets the "City" element
         */
        void unsetCity();
        
        /**
         * Gets the "State" element
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "State" element
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "State" element
         */
        boolean isSetState();
        
        /**
         * Sets the "State" element
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "State" element
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "State" element
         */
        void unsetState();
        
        /**
         * Gets the "Zipcode" element
         */
        java.lang.String getZipcode();
        
        /**
         * Gets (as xml) the "Zipcode" element
         */
        org.apache.xmlbeans.XmlString xgetZipcode();
        
        /**
         * True if has "Zipcode" element
         */
        boolean isSetZipcode();
        
        /**
         * Sets the "Zipcode" element
         */
        void setZipcode(java.lang.String zipcode);
        
        /**
         * Sets (as xml) the "Zipcode" element
         */
        void xsetZipcode(org.apache.xmlbeans.XmlString zipcode);
        
        /**
         * Unsets the "Zipcode" element
         */
        void unsetZipcode();
        
        /**
         * Gets the "Country" element
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "Country" element
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * True if has "Country" element
         */
        boolean isSetCountry();
        
        /**
         * Sets the "Country" element
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "Country" element
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Unsets the "Country" element
         */
        void unsetCountry();
        
        /**
         * Gets the "Lata" element
         */
        java.lang.String getLata();
        
        /**
         * Gets (as xml) the "Lata" element
         */
        org.apache.xmlbeans.XmlString xgetLata();
        
        /**
         * True if has "Lata" element
         */
        boolean isSetLata();
        
        /**
         * Sets the "Lata" element
         */
        void setLata(java.lang.String lata);
        
        /**
         * Sets (as xml) the "Lata" element
         */
        void xsetLata(org.apache.xmlbeans.XmlString lata);
        
        /**
         * Unsets the "Lata" element
         */
        void unsetLata();
        
        /**
         * Gets the "RateCenter" element
         */
        java.lang.String getRateCenter();
        
        /**
         * Gets (as xml) the "RateCenter" element
         */
        org.apache.xmlbeans.XmlString xgetRateCenter();
        
        /**
         * True if has "RateCenter" element
         */
        boolean isSetRateCenter();
        
        /**
         * Sets the "RateCenter" element
         */
        void setRateCenter(java.lang.String rateCenter);
        
        /**
         * Sets (as xml) the "RateCenter" element
         */
        void xsetRateCenter(org.apache.xmlbeans.XmlString rateCenter);
        
        /**
         * Unsets the "RateCenter" element
         */
        void unsetRateCenter();
        
        /**
         * Gets the "Latitude" element
         */
        float getLatitude();
        
        /**
         * Gets (as xml) the "Latitude" element
         */
        org.apache.xmlbeans.XmlFloat xgetLatitude();
        
        /**
         * True if has "Latitude" element
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "Latitude" element
         */
        void setLatitude(float latitude);
        
        /**
         * Sets (as xml) the "Latitude" element
         */
        void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude);
        
        /**
         * Unsets the "Latitude" element
         */
        void unsetLatitude();
        
        /**
         * Gets the "Longitude" element
         */
        float getLongitude();
        
        /**
         * Gets (as xml) the "Longitude" element
         */
        org.apache.xmlbeans.XmlFloat xgetLongitude();
        
        /**
         * True if has "Longitude" element
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "Longitude" element
         */
        void setLongitude(float longitude);
        
        /**
         * Sets (as xml) the "Longitude" element
         */
        void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude);
        
        /**
         * Unsets the "Longitude" element
         */
        void unsetLongitude();
        
        /**
         * Gets the "TimeZone" element
         */
        java.lang.String getTimeZone();
        
        /**
         * Gets (as xml) the "TimeZone" element
         */
        org.apache.xmlbeans.XmlString xgetTimeZone();
        
        /**
         * True if has "TimeZone" element
         */
        boolean isSetTimeZone();
        
        /**
         * Sets the "TimeZone" element
         */
        void setTimeZone(java.lang.String timeZone);
        
        /**
         * Sets (as xml) the "TimeZone" element
         */
        void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone);
        
        /**
         * Unsets the "TimeZone" element
         */
        void unsetTimeZone();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.RegionDocument.Region newInstance() {
              return (com.callfire.api.data.RegionDocument.Region) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.RegionDocument.Region newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.RegionDocument.Region) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.RegionDocument newInstance() {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.RegionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.RegionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.RegionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.RegionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.RegionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.RegionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.RegionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.RegionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.RegionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
