/*
 * XML Type:  ActionQuery
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ActionQuery
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd;


/**
 * An XML ActionQuery(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public interface ActionQuery extends com.callfire.api.service.xsd.Query
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActionQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("actionquery1c36type");
    
    /**
     * Gets the "BroadcastId" element
     */
    long getBroadcastId();
    
    /**
     * Gets (as xml) the "BroadcastId" element
     */
    org.apache.xmlbeans.XmlLong xgetBroadcastId();
    
    /**
     * True if has "BroadcastId" element
     */
    boolean isSetBroadcastId();
    
    /**
     * Sets the "BroadcastId" element
     */
    void setBroadcastId(long broadcastId);
    
    /**
     * Sets (as xml) the "BroadcastId" element
     */
    void xsetBroadcastId(org.apache.xmlbeans.XmlLong broadcastId);
    
    /**
     * Unsets the "BroadcastId" element
     */
    void unsetBroadcastId();
    
    /**
     * Gets the "BatchId" element
     */
    long getBatchId();
    
    /**
     * Gets (as xml) the "BatchId" element
     */
    org.apache.xmlbeans.XmlLong xgetBatchId();
    
    /**
     * True if has "BatchId" element
     */
    boolean isSetBatchId();
    
    /**
     * Sets the "BatchId" element
     */
    void setBatchId(long batchId);
    
    /**
     * Sets (as xml) the "BatchId" element
     */
    void xsetBatchId(org.apache.xmlbeans.XmlLong batchId);
    
    /**
     * Unsets the "BatchId" element
     */
    void unsetBatchId();
    
    /**
     * Gets the "State" element
     */
    java.util.List getState();
    
    /**
     * Gets (as xml) the "State" element
     */
    com.callfire.api.service.xsd.ActionQuery.State xgetState();
    
    /**
     * True if has "State" element
     */
    boolean isSetState();
    
    /**
     * Sets the "State" element
     */
    void setState(java.util.List state);
    
    /**
     * Sets (as xml) the "State" element
     */
    void xsetState(com.callfire.api.service.xsd.ActionQuery.State state);
    
    /**
     * Unsets the "State" element
     */
    void unsetState();
    
    /**
     * Gets the "Result" element
     */
    java.util.List getResult();
    
    /**
     * Gets (as xml) the "Result" element
     */
    com.callfire.api.service.xsd.ActionQuery.Result xgetResult();
    
    /**
     * True if has "Result" element
     */
    boolean isSetResult();
    
    /**
     * Sets the "Result" element
     */
    void setResult(java.util.List result);
    
    /**
     * Sets (as xml) the "Result" element
     */
    void xsetResult(com.callfire.api.service.xsd.ActionQuery.Result result);
    
    /**
     * Unsets the "Result" element
     */
    void unsetResult();
    
    /**
     * Gets the "Inbound" element
     */
    boolean getInbound();
    
    /**
     * Gets (as xml) the "Inbound" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInbound();
    
    /**
     * True if has "Inbound" element
     */
    boolean isSetInbound();
    
    /**
     * Sets the "Inbound" element
     */
    void setInbound(boolean inbound);
    
    /**
     * Sets (as xml) the "Inbound" element
     */
    void xsetInbound(org.apache.xmlbeans.XmlBoolean inbound);
    
    /**
     * Unsets the "Inbound" element
     */
    void unsetInbound();
    
    /**
     * Gets the "IntervalBegin" element
     */
    java.util.Calendar getIntervalBegin();
    
    /**
     * Gets (as xml) the "IntervalBegin" element
     */
    org.apache.xmlbeans.XmlDateTime xgetIntervalBegin();
    
    /**
     * True if has "IntervalBegin" element
     */
    boolean isSetIntervalBegin();
    
    /**
     * Sets the "IntervalBegin" element
     */
    void setIntervalBegin(java.util.Calendar intervalBegin);
    
    /**
     * Sets (as xml) the "IntervalBegin" element
     */
    void xsetIntervalBegin(org.apache.xmlbeans.XmlDateTime intervalBegin);
    
    /**
     * Unsets the "IntervalBegin" element
     */
    void unsetIntervalBegin();
    
    /**
     * Gets the "IntervalEnd" element
     */
    java.util.Calendar getIntervalEnd();
    
    /**
     * Gets (as xml) the "IntervalEnd" element
     */
    org.apache.xmlbeans.XmlDateTime xgetIntervalEnd();
    
    /**
     * True if has "IntervalEnd" element
     */
    boolean isSetIntervalEnd();
    
    /**
     * Sets the "IntervalEnd" element
     */
    void setIntervalEnd(java.util.Calendar intervalEnd);
    
    /**
     * Sets (as xml) the "IntervalEnd" element
     */
    void xsetIntervalEnd(org.apache.xmlbeans.XmlDateTime intervalEnd);
    
    /**
     * Unsets the "IntervalEnd" element
     */
    void unsetIntervalEnd();
    
    /**
     * Gets the "FromNumber" element
     */
    java.lang.String getFromNumber();
    
    /**
     * Gets (as xml) the "FromNumber" element
     */
    com.callfire.api.data.PhoneNumber xgetFromNumber();
    
    /**
     * True if has "FromNumber" element
     */
    boolean isSetFromNumber();
    
    /**
     * Sets the "FromNumber" element
     */
    void setFromNumber(java.lang.String fromNumber);
    
    /**
     * Sets (as xml) the "FromNumber" element
     */
    void xsetFromNumber(com.callfire.api.data.PhoneNumber fromNumber);
    
    /**
     * Unsets the "FromNumber" element
     */
    void unsetFromNumber();
    
    /**
     * Gets the "ToNumber" element
     */
    java.lang.String getToNumber();
    
    /**
     * Gets (as xml) the "ToNumber" element
     */
    com.callfire.api.data.PhoneNumber xgetToNumber();
    
    /**
     * True if has "ToNumber" element
     */
    boolean isSetToNumber();
    
    /**
     * Sets the "ToNumber" element
     */
    void setToNumber(java.lang.String toNumber);
    
    /**
     * Sets (as xml) the "ToNumber" element
     */
    void xsetToNumber(com.callfire.api.data.PhoneNumber toNumber);
    
    /**
     * Unsets the "ToNumber" element
     */
    void unsetToNumber();
    
    /**
     * Gets the "LabelName" element
     */
    java.lang.String getLabelName();
    
    /**
     * Gets (as xml) the "LabelName" element
     */
    org.apache.xmlbeans.XmlString xgetLabelName();
    
    /**
     * True if has "LabelName" element
     */
    boolean isSetLabelName();
    
    /**
     * Sets the "LabelName" element
     */
    void setLabelName(java.lang.String labelName);
    
    /**
     * Sets (as xml) the "LabelName" element
     */
    void xsetLabelName(org.apache.xmlbeans.XmlString labelName);
    
    /**
     * Unsets the "LabelName" element
     */
    void unsetLabelName();
    
    /**
     * An XML State(@http://api.callfire.com/service/xsd).
     *
     * This is a list type whose items are com.callfire.api.data.ActionState.
     */
    public interface State extends org.apache.xmlbeans.XmlAnySimpleType
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(State.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("stateb5d3elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ActionQuery.State newValue(java.lang.Object obj) {
              return (com.callfire.api.service.xsd.ActionQuery.State) type.newValue( obj ); }
            
            public static com.callfire.api.service.xsd.ActionQuery.State newInstance() {
              return (com.callfire.api.service.xsd.ActionQuery.State) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ActionQuery.State newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ActionQuery.State) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Result(@http://api.callfire.com/service/xsd).
     *
     * This is a list type whose items are com.callfire.api.data.Result.
     */
    public interface Result extends org.apache.xmlbeans.XmlAnySimpleType
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("resultbecfelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.service.xsd.ActionQuery.Result newValue(java.lang.Object obj) {
              return (com.callfire.api.service.xsd.ActionQuery.Result) type.newValue( obj ); }
            
            public static com.callfire.api.service.xsd.ActionQuery.Result newInstance() {
              return (com.callfire.api.service.xsd.ActionQuery.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.service.xsd.ActionQuery.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.service.xsd.ActionQuery.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.service.xsd.ActionQuery newInstance() {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.service.xsd.ActionQuery parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.service.xsd.ActionQuery parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ActionQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.service.xsd.ActionQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.service.xsd.ActionQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
