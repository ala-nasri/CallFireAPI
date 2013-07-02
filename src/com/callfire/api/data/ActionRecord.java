/*
 * XML Type:  ActionRecord
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ActionRecord
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * An XML ActionRecord(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public interface ActionRecord extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActionRecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("actionrecordfbfctype");
    
    /**
     * Gets the "Result" element
     */
    com.callfire.api.data.Result.Enum getResult();
    
    /**
     * Gets (as xml) the "Result" element
     */
    com.callfire.api.data.Result xgetResult();
    
    /**
     * Sets the "Result" element
     */
    void setResult(com.callfire.api.data.Result.Enum result);
    
    /**
     * Sets (as xml) the "Result" element
     */
    void xsetResult(com.callfire.api.data.Result result);
    
    /**
     * Gets the "FinishTime" element
     */
    java.util.Calendar getFinishTime();
    
    /**
     * Gets (as xml) the "FinishTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetFinishTime();
    
    /**
     * Sets the "FinishTime" element
     */
    void setFinishTime(java.util.Calendar finishTime);
    
    /**
     * Sets (as xml) the "FinishTime" element
     */
    void xsetFinishTime(org.apache.xmlbeans.XmlDateTime finishTime);
    
    /**
     * Gets the "BilledAmount" element
     */
    float getBilledAmount();
    
    /**
     * Gets (as xml) the "BilledAmount" element
     */
    org.apache.xmlbeans.XmlFloat xgetBilledAmount();
    
    /**
     * Sets the "BilledAmount" element
     */
    void setBilledAmount(float billedAmount);
    
    /**
     * Sets (as xml) the "BilledAmount" element
     */
    void xsetBilledAmount(org.apache.xmlbeans.XmlFloat billedAmount);
    
    /**
     * Gets array of all "QuestionResponse" elements
     */
    com.callfire.api.data.ActionRecord.QuestionResponse[] getQuestionResponseArray();
    
    /**
     * Gets ith "QuestionResponse" element
     */
    com.callfire.api.data.ActionRecord.QuestionResponse getQuestionResponseArray(int i);
    
    /**
     * Returns number of "QuestionResponse" element
     */
    int sizeOfQuestionResponseArray();
    
    /**
     * Sets array of all "QuestionResponse" element
     */
    void setQuestionResponseArray(com.callfire.api.data.ActionRecord.QuestionResponse[] questionResponseArray);
    
    /**
     * Sets ith "QuestionResponse" element
     */
    void setQuestionResponseArray(int i, com.callfire.api.data.ActionRecord.QuestionResponse questionResponse);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuestionResponse" element
     */
    com.callfire.api.data.ActionRecord.QuestionResponse insertNewQuestionResponse(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuestionResponse" element
     */
    com.callfire.api.data.ActionRecord.QuestionResponse addNewQuestionResponse();
    
    /**
     * Removes the ith "QuestionResponse" element
     */
    void removeQuestionResponse(int i);
    
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
     * An XML QuestionResponse(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface QuestionResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("questionresponse4e7felemtype");
        
        /**
         * Gets the "Question" element
         */
        java.lang.String getQuestion();
        
        /**
         * Gets (as xml) the "Question" element
         */
        org.apache.xmlbeans.XmlString xgetQuestion();
        
        /**
         * Sets the "Question" element
         */
        void setQuestion(java.lang.String question);
        
        /**
         * Sets (as xml) the "Question" element
         */
        void xsetQuestion(org.apache.xmlbeans.XmlString question);
        
        /**
         * Gets the "Response" element
         */
        java.lang.String getResponse();
        
        /**
         * Gets (as xml) the "Response" element
         */
        org.apache.xmlbeans.XmlString xgetResponse();
        
        /**
         * Sets the "Response" element
         */
        void setResponse(java.lang.String response);
        
        /**
         * Sets (as xml) the "Response" element
         */
        void xsetResponse(org.apache.xmlbeans.XmlString response);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.ActionRecord.QuestionResponse newInstance() {
              return (com.callfire.api.data.ActionRecord.QuestionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.ActionRecord.QuestionResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.ActionRecord.QuestionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.callfire.api.data.ActionRecord newInstance() {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.callfire.api.data.ActionRecord newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.ActionRecord parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.ActionRecord parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.ActionRecord parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.ActionRecord parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.ActionRecord parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ActionRecord parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.ActionRecord parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.ActionRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
