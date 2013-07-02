/*
 * XML Type:  Result
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.Result
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * An XML Result(@http://api.callfire.com/data).
 *
 * This is an atomic type that is a restriction of com.callfire.api.data.Result.
 */
public interface Result extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("resultd306type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LA = Enum.forString("LA");
    static final Enum AM = Enum.forString("AM");
    static final Enum BUSY = Enum.forString("BUSY");
    static final Enum DNC = Enum.forString("DNC");
    static final Enum XFER = Enum.forString("XFER");
    static final Enum XFER_LEG = Enum.forString("XFER_LEG");
    static final Enum NO_ANS = Enum.forString("NO_ANS");
    static final Enum UNDIALED = Enum.forString("UNDIALED");
    static final Enum SENT = Enum.forString("SENT");
    static final Enum RECEIVED = Enum.forString("RECEIVED");
    static final Enum DNT = Enum.forString("DNT");
    static final Enum TOO_BIG = Enum.forString("TOO_BIG");
    static final Enum INTERNAL_ERROR = Enum.forString("INTERNAL_ERROR");
    static final Enum CARRIER_ERROR = Enum.forString("CARRIER_ERROR");
    static final Enum CARRIER_TEMP_ERROR = Enum.forString("CARRIER_TEMP_ERROR");
    
    static final int INT_LA = Enum.INT_LA;
    static final int INT_AM = Enum.INT_AM;
    static final int INT_BUSY = Enum.INT_BUSY;
    static final int INT_DNC = Enum.INT_DNC;
    static final int INT_XFER = Enum.INT_XFER;
    static final int INT_XFER_LEG = Enum.INT_XFER_LEG;
    static final int INT_NO_ANS = Enum.INT_NO_ANS;
    static final int INT_UNDIALED = Enum.INT_UNDIALED;
    static final int INT_SENT = Enum.INT_SENT;
    static final int INT_RECEIVED = Enum.INT_RECEIVED;
    static final int INT_DNT = Enum.INT_DNT;
    static final int INT_TOO_BIG = Enum.INT_TOO_BIG;
    static final int INT_INTERNAL_ERROR = Enum.INT_INTERNAL_ERROR;
    static final int INT_CARRIER_ERROR = Enum.INT_CARRIER_ERROR;
    static final int INT_CARRIER_TEMP_ERROR = Enum.INT_CARRIER_TEMP_ERROR;
    
    /**
     * Enumeration value class for com.callfire.api.data.Result.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LA
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_LA = 1;
        static final int INT_AM = 2;
        static final int INT_BUSY = 3;
        static final int INT_DNC = 4;
        static final int INT_XFER = 5;
        static final int INT_XFER_LEG = 6;
        static final int INT_NO_ANS = 7;
        static final int INT_UNDIALED = 8;
        static final int INT_SENT = 9;
        static final int INT_RECEIVED = 10;
        static final int INT_DNT = 11;
        static final int INT_TOO_BIG = 12;
        static final int INT_INTERNAL_ERROR = 13;
        static final int INT_CARRIER_ERROR = 14;
        static final int INT_CARRIER_TEMP_ERROR = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("LA", INT_LA),
                new Enum("AM", INT_AM),
                new Enum("BUSY", INT_BUSY),
                new Enum("DNC", INT_DNC),
                new Enum("XFER", INT_XFER),
                new Enum("XFER_LEG", INT_XFER_LEG),
                new Enum("NO_ANS", INT_NO_ANS),
                new Enum("UNDIALED", INT_UNDIALED),
                new Enum("SENT", INT_SENT),
                new Enum("RECEIVED", INT_RECEIVED),
                new Enum("DNT", INT_DNT),
                new Enum("TOO_BIG", INT_TOO_BIG),
                new Enum("INTERNAL_ERROR", INT_INTERNAL_ERROR),
                new Enum("CARRIER_ERROR", INT_CARRIER_ERROR),
                new Enum("CARRIER_TEMP_ERROR", INT_CARRIER_TEMP_ERROR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.Result newValue(java.lang.Object obj) {
          return (com.callfire.api.data.Result) type.newValue( obj ); }
        
        public static com.callfire.api.data.Result newInstance() {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.Result parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.Result parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.Result parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.Result parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.Result parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.Result parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.Result parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.Result parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.Result parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.Result parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.Result parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.Result parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.Result parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.Result parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
