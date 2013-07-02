/*
 * An XML document type.
 * Localname: BroadcastSchedule
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one BroadcastSchedule(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface BroadcastScheduleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastScheduleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcastschedule5a8ddoctype");
    
    /**
     * Gets the "BroadcastSchedule" element
     */
    com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastSchedule();
    
    /**
     * Sets the "BroadcastSchedule" element
     */
    void setBroadcastSchedule(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule);
    
    /**
     * Appends and returns a new empty "BroadcastSchedule" element
     */
    com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule();
    
    /**
     * An XML BroadcastSchedule(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface BroadcastSchedule extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BroadcastSchedule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("broadcastschedule8249elemtype");
        
        /**
         * Gets the "StartTimeOfDay" element
         */
        java.util.Calendar getStartTimeOfDay();
        
        /**
         * Gets (as xml) the "StartTimeOfDay" element
         */
        org.apache.xmlbeans.XmlTime xgetStartTimeOfDay();
        
        /**
         * Sets the "StartTimeOfDay" element
         */
        void setStartTimeOfDay(java.util.Calendar startTimeOfDay);
        
        /**
         * Sets (as xml) the "StartTimeOfDay" element
         */
        void xsetStartTimeOfDay(org.apache.xmlbeans.XmlTime startTimeOfDay);
        
        /**
         * Gets the "StopTimeOfDay" element
         */
        java.util.Calendar getStopTimeOfDay();
        
        /**
         * Gets (as xml) the "StopTimeOfDay" element
         */
        org.apache.xmlbeans.XmlTime xgetStopTimeOfDay();
        
        /**
         * Sets the "StopTimeOfDay" element
         */
        void setStopTimeOfDay(java.util.Calendar stopTimeOfDay);
        
        /**
         * Sets (as xml) the "StopTimeOfDay" element
         */
        void xsetStopTimeOfDay(org.apache.xmlbeans.XmlTime stopTimeOfDay);
        
        /**
         * Gets the "TimeZone" element
         */
        java.lang.String getTimeZone();
        
        /**
         * Gets (as xml) the "TimeZone" element
         */
        org.apache.xmlbeans.XmlString xgetTimeZone();
        
        /**
         * Sets the "TimeZone" element
         */
        void setTimeZone(java.lang.String timeZone);
        
        /**
         * Sets (as xml) the "TimeZone" element
         */
        void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone);
        
        /**
         * Gets the "BeginDate" element
         */
        java.util.Calendar getBeginDate();
        
        /**
         * Gets (as xml) the "BeginDate" element
         */
        org.apache.xmlbeans.XmlDate xgetBeginDate();
        
        /**
         * True if has "BeginDate" element
         */
        boolean isSetBeginDate();
        
        /**
         * Sets the "BeginDate" element
         */
        void setBeginDate(java.util.Calendar beginDate);
        
        /**
         * Sets (as xml) the "BeginDate" element
         */
        void xsetBeginDate(org.apache.xmlbeans.XmlDate beginDate);
        
        /**
         * Unsets the "BeginDate" element
         */
        void unsetBeginDate();
        
        /**
         * Gets the "EndDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        org.apache.xmlbeans.XmlDate xgetEndDate();
        
        /**
         * True if has "EndDate" element
         */
        boolean isSetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
        
        /**
         * Unsets the "EndDate" element
         */
        void unsetEndDate();
        
        /**
         * Gets the "DaysOfWeek" element
         */
        java.util.List getDaysOfWeek();
        
        /**
         * Gets (as xml) the "DaysOfWeek" element
         */
        com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek xgetDaysOfWeek();
        
        /**
         * Sets the "DaysOfWeek" element
         */
        void setDaysOfWeek(java.util.List daysOfWeek);
        
        /**
         * Sets (as xml) the "DaysOfWeek" element
         */
        void xsetDaysOfWeek(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek daysOfWeek);
        
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
         * An XML DaysOfWeek(@http://api.callfire.com/data).
         *
         * This is a list type whose items are com.callfire.api.data.DayOfWeek.
         */
        public interface DaysOfWeek extends org.apache.xmlbeans.XmlAnySimpleType
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DaysOfWeek.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("daysofweek18abelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek newValue(java.lang.Object obj) {
                  return (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek) type.newValue( obj ); }
                
                public static com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek newInstance() {
                  return (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule newInstance() {
              return (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.BroadcastScheduleDocument newInstance() {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.BroadcastScheduleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.BroadcastScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.BroadcastScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
