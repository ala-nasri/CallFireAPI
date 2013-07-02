/*
 * XML Type:  SubscriptionTriggerEvent
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.SubscriptionTriggerEvent
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * An XML SubscriptionTriggerEvent(@http://api.callfire.com/data).
 *
 * This is an atomic type that is a restriction of com.callfire.api.data.SubscriptionTriggerEvent.
 */
public interface SubscriptionTriggerEvent extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionTriggerEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("subscriptiontriggerevent1d24type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UNDEFINED_EVENT = Enum.forString("UNDEFINED_EVENT");
    static final Enum INBOUND_CALL_FINISHED = Enum.forString("INBOUND_CALL_FINISHED");
    static final Enum INBOUND_TEXT_FINISHED = Enum.forString("INBOUND_TEXT_FINISHED");
    static final Enum OUTBOUND_CALL_FINISHED = Enum.forString("OUTBOUND_CALL_FINISHED");
    static final Enum OUTBOUND_TEXT_FINISHED = Enum.forString("OUTBOUND_TEXT_FINISHED");
    static final Enum CAMPAIGN_STARTED = Enum.forString("CAMPAIGN_STARTED");
    static final Enum CAMPAIGN_STOPPED = Enum.forString("CAMPAIGN_STOPPED");
    static final Enum CAMPAIGN_FINISHED = Enum.forString("CAMPAIGN_FINISHED");
    
    static final int INT_UNDEFINED_EVENT = Enum.INT_UNDEFINED_EVENT;
    static final int INT_INBOUND_CALL_FINISHED = Enum.INT_INBOUND_CALL_FINISHED;
    static final int INT_INBOUND_TEXT_FINISHED = Enum.INT_INBOUND_TEXT_FINISHED;
    static final int INT_OUTBOUND_CALL_FINISHED = Enum.INT_OUTBOUND_CALL_FINISHED;
    static final int INT_OUTBOUND_TEXT_FINISHED = Enum.INT_OUTBOUND_TEXT_FINISHED;
    static final int INT_CAMPAIGN_STARTED = Enum.INT_CAMPAIGN_STARTED;
    static final int INT_CAMPAIGN_STOPPED = Enum.INT_CAMPAIGN_STOPPED;
    static final int INT_CAMPAIGN_FINISHED = Enum.INT_CAMPAIGN_FINISHED;
    
    /**
     * Enumeration value class for com.callfire.api.data.SubscriptionTriggerEvent.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UNDEFINED_EVENT
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
        
        static final int INT_UNDEFINED_EVENT = 1;
        static final int INT_INBOUND_CALL_FINISHED = 2;
        static final int INT_INBOUND_TEXT_FINISHED = 3;
        static final int INT_OUTBOUND_CALL_FINISHED = 4;
        static final int INT_OUTBOUND_TEXT_FINISHED = 5;
        static final int INT_CAMPAIGN_STARTED = 6;
        static final int INT_CAMPAIGN_STOPPED = 7;
        static final int INT_CAMPAIGN_FINISHED = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("UNDEFINED_EVENT", INT_UNDEFINED_EVENT),
                new Enum("INBOUND_CALL_FINISHED", INT_INBOUND_CALL_FINISHED),
                new Enum("INBOUND_TEXT_FINISHED", INT_INBOUND_TEXT_FINISHED),
                new Enum("OUTBOUND_CALL_FINISHED", INT_OUTBOUND_CALL_FINISHED),
                new Enum("OUTBOUND_TEXT_FINISHED", INT_OUTBOUND_TEXT_FINISHED),
                new Enum("CAMPAIGN_STARTED", INT_CAMPAIGN_STARTED),
                new Enum("CAMPAIGN_STOPPED", INT_CAMPAIGN_STOPPED),
                new Enum("CAMPAIGN_FINISHED", INT_CAMPAIGN_FINISHED),
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
        public static com.callfire.api.data.SubscriptionTriggerEvent newValue(java.lang.Object obj) {
          return (com.callfire.api.data.SubscriptionTriggerEvent) type.newValue( obj ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent newInstance() {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.SubscriptionTriggerEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.SubscriptionTriggerEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
