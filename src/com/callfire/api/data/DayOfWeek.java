/*
 * XML Type:  DayOfWeek
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.DayOfWeek
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * An XML DayOfWeek(@http://api.callfire.com/data).
 *
 * This is an atomic type that is a restriction of com.callfire.api.data.DayOfWeek.
 */
public interface DayOfWeek extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DayOfWeek.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("dayofweekc92etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SUNDAY = Enum.forString("SUNDAY");
    static final Enum MONDAY = Enum.forString("MONDAY");
    static final Enum TUESDAY = Enum.forString("TUESDAY");
    static final Enum WEDNESDAY = Enum.forString("WEDNESDAY");
    static final Enum THURSDAY = Enum.forString("THURSDAY");
    static final Enum FRIDAY = Enum.forString("FRIDAY");
    static final Enum SATURDAY = Enum.forString("SATURDAY");
    
    static final int INT_SUNDAY = Enum.INT_SUNDAY;
    static final int INT_MONDAY = Enum.INT_MONDAY;
    static final int INT_TUESDAY = Enum.INT_TUESDAY;
    static final int INT_WEDNESDAY = Enum.INT_WEDNESDAY;
    static final int INT_THURSDAY = Enum.INT_THURSDAY;
    static final int INT_FRIDAY = Enum.INT_FRIDAY;
    static final int INT_SATURDAY = Enum.INT_SATURDAY;
    
    /**
     * Enumeration value class for com.callfire.api.data.DayOfWeek.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SUNDAY
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
        
        static final int INT_SUNDAY = 1;
        static final int INT_MONDAY = 2;
        static final int INT_TUESDAY = 3;
        static final int INT_WEDNESDAY = 4;
        static final int INT_THURSDAY = 5;
        static final int INT_FRIDAY = 6;
        static final int INT_SATURDAY = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("SUNDAY", INT_SUNDAY),
                new Enum("MONDAY", INT_MONDAY),
                new Enum("TUESDAY", INT_TUESDAY),
                new Enum("WEDNESDAY", INT_WEDNESDAY),
                new Enum("THURSDAY", INT_THURSDAY),
                new Enum("FRIDAY", INT_FRIDAY),
                new Enum("SATURDAY", INT_SATURDAY),
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
        public static com.callfire.api.data.DayOfWeek newValue(java.lang.Object obj) {
          return (com.callfire.api.data.DayOfWeek) type.newValue( obj ); }
        
        public static com.callfire.api.data.DayOfWeek newInstance() {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.DayOfWeek newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.DayOfWeek parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.DayOfWeek parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.DayOfWeek parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.DayOfWeek parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.DayOfWeek parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.DayOfWeek parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.DayOfWeek parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.DayOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
