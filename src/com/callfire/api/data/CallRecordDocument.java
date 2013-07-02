/*
 * An XML document type.
 * Localname: CallRecord
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.CallRecordDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one CallRecord(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface CallRecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallRecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("callrecord9884doctype");
    
    /**
     * Gets the "CallRecord" element
     */
    com.callfire.api.data.CallRecordDocument.CallRecord getCallRecord();
    
    /**
     * Sets the "CallRecord" element
     */
    void setCallRecord(com.callfire.api.data.CallRecordDocument.CallRecord callRecord);
    
    /**
     * Appends and returns a new empty "CallRecord" element
     */
    com.callfire.api.data.CallRecordDocument.CallRecord addNewCallRecord();
    
    /**
     * An XML CallRecord(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface CallRecord extends com.callfire.api.data.ActionRecord
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallRecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("callrecordb5cfelemtype");
        
        /**
         * Gets the "OriginateTime" element
         */
        java.util.Calendar getOriginateTime();
        
        /**
         * Gets (as xml) the "OriginateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetOriginateTime();
        
        /**
         * True if has "OriginateTime" element
         */
        boolean isSetOriginateTime();
        
        /**
         * Sets the "OriginateTime" element
         */
        void setOriginateTime(java.util.Calendar originateTime);
        
        /**
         * Sets (as xml) the "OriginateTime" element
         */
        void xsetOriginateTime(org.apache.xmlbeans.XmlDateTime originateTime);
        
        /**
         * Unsets the "OriginateTime" element
         */
        void unsetOriginateTime();
        
        /**
         * Gets the "AnswerTime" element
         */
        java.util.Calendar getAnswerTime();
        
        /**
         * Gets (as xml) the "AnswerTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetAnswerTime();
        
        /**
         * True if has "AnswerTime" element
         */
        boolean isSetAnswerTime();
        
        /**
         * Sets the "AnswerTime" element
         */
        void setAnswerTime(java.util.Calendar answerTime);
        
        /**
         * Sets (as xml) the "AnswerTime" element
         */
        void xsetAnswerTime(org.apache.xmlbeans.XmlDateTime answerTime);
        
        /**
         * Unsets the "AnswerTime" element
         */
        void unsetAnswerTime();
        
        /**
         * Gets the "Duration" element
         */
        int getDuration();
        
        /**
         * Gets (as xml) the "Duration" element
         */
        org.apache.xmlbeans.XmlInt xgetDuration();
        
        /**
         * Sets the "Duration" element
         */
        void setDuration(int duration);
        
        /**
         * Sets (as xml) the "Duration" element
         */
        void xsetDuration(org.apache.xmlbeans.XmlInt duration);
        
        /**
         * Gets array of all "RecordingMeta" elements
         */
        com.callfire.api.data.RecordingMetaDocument.RecordingMeta[] getRecordingMetaArray();
        
        /**
         * Gets ith "RecordingMeta" element
         */
        com.callfire.api.data.RecordingMetaDocument.RecordingMeta getRecordingMetaArray(int i);
        
        /**
         * Returns number of "RecordingMeta" element
         */
        int sizeOfRecordingMetaArray();
        
        /**
         * Sets array of all "RecordingMeta" element
         */
        void setRecordingMetaArray(com.callfire.api.data.RecordingMetaDocument.RecordingMeta[] recordingMetaArray);
        
        /**
         * Sets ith "RecordingMeta" element
         */
        void setRecordingMetaArray(int i, com.callfire.api.data.RecordingMetaDocument.RecordingMeta recordingMeta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RecordingMeta" element
         */
        com.callfire.api.data.RecordingMetaDocument.RecordingMeta insertNewRecordingMeta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RecordingMeta" element
         */
        com.callfire.api.data.RecordingMetaDocument.RecordingMeta addNewRecordingMeta();
        
        /**
         * Removes the ith "RecordingMeta" element
         */
        void removeRecordingMeta(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.CallRecordDocument.CallRecord newInstance() {
              return (com.callfire.api.data.CallRecordDocument.CallRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.CallRecordDocument.CallRecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.CallRecordDocument.CallRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.CallRecordDocument newInstance() {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.CallRecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.CallRecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.CallRecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.CallRecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.CallRecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.CallRecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
