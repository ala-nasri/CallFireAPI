/*
 * An XML document type.
 * Localname: BroadcastStats
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastStatsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one BroadcastStats(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface BroadcastStatsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastStatsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcaststats8355doctype");
    
    /**
     * Gets the "BroadcastStats" element
     */
    com.callfire.api.data.BroadcastStatsDocument.BroadcastStats getBroadcastStats();
    
    /**
     * Sets the "BroadcastStats" element
     */
    void setBroadcastStats(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats broadcastStats);
    
    /**
     * Appends and returns a new empty "BroadcastStats" element
     */
    com.callfire.api.data.BroadcastStatsDocument.BroadcastStats addNewBroadcastStats();
    
    /**
     * An XML BroadcastStats(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface BroadcastStats extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastStats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcaststats4cefelemtype");
        
        /**
         * Gets the "UsageStats" element
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats getUsageStats();
        
        /**
         * Sets the "UsageStats" element
         */
        void setUsageStats(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats usageStats);
        
        /**
         * Appends and returns a new empty "UsageStats" element
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats addNewUsageStats();
        
        /**
         * Gets array of all "ResultStat" elements
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[] getResultStatArray();
        
        /**
         * Gets ith "ResultStat" element
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat getResultStatArray(int i);
        
        /**
         * Returns number of "ResultStat" element
         */
        int sizeOfResultStatArray();
        
        /**
         * Sets array of all "ResultStat" element
         */
        void setResultStatArray(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[] resultStatArray);
        
        /**
         * Sets ith "ResultStat" element
         */
        void setResultStatArray(int i, com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat resultStat);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResultStat" element
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat insertNewResultStat(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResultStat" element
         */
        com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat addNewResultStat();
        
        /**
         * Removes the ith "ResultStat" element
         */
        void removeResultStat(int i);
        
        /**
         * An XML UsageStats(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public interface UsageStats extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsageStats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("usagestats3375elemtype");
            
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
             * Gets the "BilledDuration" element
             */
            int getBilledDuration();
            
            /**
             * Gets (as xml) the "BilledDuration" element
             */
            org.apache.xmlbeans.XmlInt xgetBilledDuration();
            
            /**
             * Sets the "BilledDuration" element
             */
            void setBilledDuration(int billedDuration);
            
            /**
             * Sets (as xml) the "BilledDuration" element
             */
            void xsetBilledDuration(org.apache.xmlbeans.XmlInt billedDuration);
            
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
             * Gets the "Attempts" element
             */
            int getAttempts();
            
            /**
             * Gets (as xml) the "Attempts" element
             */
            org.apache.xmlbeans.XmlInt xgetAttempts();
            
            /**
             * Sets the "Attempts" element
             */
            void setAttempts(int attempts);
            
            /**
             * Sets (as xml) the "Attempts" element
             */
            void xsetAttempts(org.apache.xmlbeans.XmlInt attempts);
            
            /**
             * Gets the "Actions" element
             */
            int getActions();
            
            /**
             * Gets (as xml) the "Actions" element
             */
            org.apache.xmlbeans.XmlInt xgetActions();
            
            /**
             * Sets the "Actions" element
             */
            void setActions(int actions);
            
            /**
             * Sets (as xml) the "Actions" element
             */
            void xsetActions(org.apache.xmlbeans.XmlInt actions);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats newInstance() {
                  return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ResultStat(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public interface ResultStat extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultStat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("resultstat3482elemtype");
            
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
             * Gets the "Attempts" element
             */
            int getAttempts();
            
            /**
             * Gets (as xml) the "Attempts" element
             */
            org.apache.xmlbeans.XmlInt xgetAttempts();
            
            /**
             * Sets the "Attempts" element
             */
            void setAttempts(int attempts);
            
            /**
             * Sets (as xml) the "Attempts" element
             */
            void xsetAttempts(org.apache.xmlbeans.XmlInt attempts);
            
            /**
             * Gets the "Actions" element
             */
            int getActions();
            
            /**
             * Gets (as xml) the "Actions" element
             */
            org.apache.xmlbeans.XmlInt xgetActions();
            
            /**
             * Sets the "Actions" element
             */
            void setActions(int actions);
            
            /**
             * Sets (as xml) the "Actions" element
             */
            void xsetActions(org.apache.xmlbeans.XmlInt actions);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat newInstance() {
                  return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats newInstance() {
              return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.BroadcastStatsDocument.BroadcastStats newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.BroadcastStatsDocument newInstance() {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.BroadcastStatsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastStatsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastStatsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastStatsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
