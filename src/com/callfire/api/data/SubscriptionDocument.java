/*
 * An XML document type.
 * Localname: Subscription
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.SubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data;


/**
 * A document containing one Subscription(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public interface SubscriptionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("subscriptionb8b6doctype");
    
    /**
     * Gets the "Subscription" element
     */
    com.callfire.api.data.SubscriptionDocument.Subscription getSubscription();
    
    /**
     * Sets the "Subscription" element
     */
    void setSubscription(com.callfire.api.data.SubscriptionDocument.Subscription subscription);
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    com.callfire.api.data.SubscriptionDocument.Subscription addNewSubscription();
    
    /**
     * An XML Subscription(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public interface Subscription extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subscription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("subscriptiona90felemtype");
        
        /**
         * Gets the "Enabled" element
         */
        boolean getEnabled();
        
        /**
         * Gets (as xml) the "Enabled" element
         */
        org.apache.xmlbeans.XmlBoolean xgetEnabled();
        
        /**
         * True if has "Enabled" element
         */
        boolean isSetEnabled();
        
        /**
         * Sets the "Enabled" element
         */
        void setEnabled(boolean enabled);
        
        /**
         * Sets (as xml) the "Enabled" element
         */
        void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
        
        /**
         * Unsets the "Enabled" element
         */
        void unsetEnabled();
        
        /**
         * Gets the "Endpoint" element
         */
        java.lang.String getEndpoint();
        
        /**
         * Gets (as xml) the "Endpoint" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetEndpoint();
        
        /**
         * True if has "Endpoint" element
         */
        boolean isSetEndpoint();
        
        /**
         * Sets the "Endpoint" element
         */
        void setEndpoint(java.lang.String endpoint);
        
        /**
         * Sets (as xml) the "Endpoint" element
         */
        void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint);
        
        /**
         * Unsets the "Endpoint" element
         */
        void unsetEndpoint();
        
        /**
         * Gets the "NotificationFormat" element
         */
        com.callfire.api.data.NotificationFormat.Enum getNotificationFormat();
        
        /**
         * Gets (as xml) the "NotificationFormat" element
         */
        com.callfire.api.data.NotificationFormat xgetNotificationFormat();
        
        /**
         * True if has "NotificationFormat" element
         */
        boolean isSetNotificationFormat();
        
        /**
         * Sets the "NotificationFormat" element
         */
        void setNotificationFormat(com.callfire.api.data.NotificationFormat.Enum notificationFormat);
        
        /**
         * Sets (as xml) the "NotificationFormat" element
         */
        void xsetNotificationFormat(com.callfire.api.data.NotificationFormat notificationFormat);
        
        /**
         * Unsets the "NotificationFormat" element
         */
        void unsetNotificationFormat();
        
        /**
         * Gets the "SubscriptionFilter" element
         */
        com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter getSubscriptionFilter();
        
        /**
         * True if has "SubscriptionFilter" element
         */
        boolean isSetSubscriptionFilter();
        
        /**
         * Sets the "SubscriptionFilter" element
         */
        void setSubscriptionFilter(com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter subscriptionFilter);
        
        /**
         * Appends and returns a new empty "SubscriptionFilter" element
         */
        com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter addNewSubscriptionFilter();
        
        /**
         * Unsets the "SubscriptionFilter" element
         */
        void unsetSubscriptionFilter();
        
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
         * An XML SubscriptionFilter(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public interface SubscriptionFilter extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF5862003E60B0EFBE9BF7C4370E02CB6").resolveHandle("subscriptionfilter50beelemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter newInstance() {
                  return (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.callfire.api.data.SubscriptionDocument.Subscription.SubscriptionFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.callfire.api.data.SubscriptionDocument.Subscription newInstance() {
              return (com.callfire.api.data.SubscriptionDocument.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.callfire.api.data.SubscriptionDocument.Subscription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.callfire.api.data.SubscriptionDocument.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.callfire.api.data.SubscriptionDocument newInstance() {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.callfire.api.data.SubscriptionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.callfire.api.data.SubscriptionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.SubscriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.callfire.api.data.SubscriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.callfire.api.data.SubscriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
