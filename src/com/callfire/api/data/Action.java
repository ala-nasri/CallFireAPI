/*
 * XML Type:  Action
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.Action
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * An XML Action(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public interface Action extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("action9f8dtype");
    
    /**
     * Gets the "FromNumber" element
     */
    java.lang.String getFromNumber();
    
    /**
     * Gets (as xml) the "FromNumber" element
     */
    com.callfire.api.data.PhoneNumber xgetFromNumber();
    
    /**
     * Sets the "FromNumber" element
     */
    void setFromNumber(java.lang.String fromNumber);
    
    /**
     * Sets (as xml) the "FromNumber" element
     */
    void xsetFromNumber(com.callfire.api.data.PhoneNumber fromNumber);
    
    /**
     * Gets the "ToNumber" element
     */
    com.callfire.api.data.ToNumber getToNumber();
    
    /**
     * Sets the "ToNumber" element
     */
    void setToNumber(com.callfire.api.data.ToNumber toNumber);
    
    /**
     * Appends and returns a new empty "ToNumber" element
     */
    com.callfire.api.data.ToNumber addNewToNumber();
    
    /**
     * Gets the "State" element
     */
    com.callfire.api.data.ActionState.Enum getState();
    
    /**
     * Gets (as xml) the "State" element
     */
    com.callfire.api.data.ActionState xgetState();
    
    /**
     * Sets the "State" element
     */
    void setState(com.callfire.api.data.ActionState.Enum state);
    
    /**
     * Sets (as xml) the "State" element
     */
    void xsetState(com.callfire.api.data.ActionState state);
    
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
     * Gets the "ContactId" element
     */
    long getContactId();
    
    /**
     * Gets (as xml) the "ContactId" element
     */
    org.apache.xmlbeans.XmlLong xgetContactId();
    
    /**
     * Sets the "ContactId" element
     */
    void setContactId(long contactId);
    
    /**
     * Sets (as xml) the "ContactId" element
     */
    void xsetContactId(org.apache.xmlbeans.XmlLong contactId);
    
    /**
     * Gets the "Inbound" element
     */
    boolean getInbound();
    
    /**
     * Gets (as xml) the "Inbound" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInbound();
    
    /**
     * Sets the "Inbound" element
     */
    void setInbound(boolean inbound);
    
    /**
     * Sets (as xml) the "Inbound" element
     */
    void xsetInbound(org.apache.xmlbeans.XmlBoolean inbound);
    
    /**
     * Gets the "Created" element
     */
    java.util.Calendar getCreated();
    
    /**
     * Gets (as xml) the "Created" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreated();
    
    /**
     * Sets the "Created" element
     */
    void setCreated(java.util.Calendar created);
    
    /**
     * Sets (as xml) the "Created" element
     */
    void xsetCreated(org.apache.xmlbeans.XmlDateTime created);
    
    /**
     * Gets the "Modified" element
     */
    java.util.Calendar getModified();
    
    /**
     * Gets (as xml) the "Modified" element
     */
    org.apache.xmlbeans.XmlDateTime xgetModified();
    
    /**
     * Sets the "Modified" element
     */
    void setModified(java.util.Calendar modified);
    
    /**
     * Sets (as xml) the "Modified" element
     */
    void xsetModified(org.apache.xmlbeans.XmlDateTime modified);
    
    /**
     * Gets the "FinalResult" element
     */
    com.callfire.api.data.Result.Enum getFinalResult();
    
    /**
     * Gets (as xml) the "FinalResult" element
     */
    com.callfire.api.data.Result xgetFinalResult();
    
    /**
     * True if has "FinalResult" element
     */
    boolean isSetFinalResult();
    
    /**
     * Sets the "FinalResult" element
     */
    void setFinalResult(com.callfire.api.data.Result.Enum finalResult);
    
    /**
     * Sets (as xml) the "FinalResult" element
     */
    void xsetFinalResult(com.callfire.api.data.Result finalResult);
    
    /**
     * Unsets the "FinalResult" element
     */
    void unsetFinalResult();
    
    /**
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlLong xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlLong id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.Action newInstance() {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.Action parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.Action parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.Action parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.Action parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.Action parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.Action parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.Action parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.Action parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.Action parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.Action parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.Action parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.Action parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.Action parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.Action parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.Action parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.Action parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
