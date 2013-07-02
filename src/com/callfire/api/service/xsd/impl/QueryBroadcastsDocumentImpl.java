/*
 * An XML document type.
 * Localname: QueryBroadcasts
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QueryBroadcastsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QueryBroadcasts(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QueryBroadcastsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QueryBroadcastsDocument
{
    
    public QueryBroadcastsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBROADCASTS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QueryBroadcasts");
    
    
    /**
     * Gets the "QueryBroadcasts" element
     */
    public com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts getQueryBroadcasts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts)get_store().find_element_user(QUERYBROADCASTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryBroadcasts" element
     */
    public void setQueryBroadcasts(com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts queryBroadcasts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts)get_store().find_element_user(QUERYBROADCASTS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts)get_store().add_element_user(QUERYBROADCASTS$0);
            }
            target.set(queryBroadcasts);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryBroadcasts" element
     */
    public com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts addNewQueryBroadcasts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts target = null;
            target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts)get_store().add_element_user(QUERYBROADCASTS$0);
            return target;
        }
    }
    /**
     * An XML QueryBroadcasts(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class QueryBroadcastsImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts
    {
        
        public QueryBroadcastsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Type");
        private static final javax.xml.namespace.QName RUNNING$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Running");
        private static final javax.xml.namespace.QName LABELNAME$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
        
        
        /**
         * Gets the "Type" element
         */
        public java.util.List getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" element
         */
        public com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type target = null;
                target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type)get_store().find_element_user(TYPE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(java.util.List type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
                }
                target.setListValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" element
         */
        public void xsetType(com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type target = null;
                target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, 0);
            }
        }
        
        /**
         * Gets the "Running" element
         */
        public boolean getRunning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNING$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Running" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRunning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RUNNING$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Running" element
         */
        public boolean isSetRunning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RUNNING$2) != 0;
            }
        }
        
        /**
         * Sets the "Running" element
         */
        public void setRunning(boolean running)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNNING$2);
                }
                target.setBooleanValue(running);
            }
        }
        
        /**
         * Sets (as xml) the "Running" element
         */
        public void xsetRunning(org.apache.xmlbeans.XmlBoolean running)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RUNNING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RUNNING$2);
                }
                target.set(running);
            }
        }
        
        /**
         * Unsets the "Running" element
         */
        public void unsetRunning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RUNNING$2, 0);
            }
        }
        
        /**
         * Gets the "LabelName" element
         */
        public java.lang.String getLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LabelName" element
         */
        public org.apache.xmlbeans.XmlString xgetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "LabelName" element
         */
        public boolean isSetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELNAME$4) != 0;
            }
        }
        
        /**
         * Sets the "LabelName" element
         */
        public void setLabelName(java.lang.String labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$4);
                }
                target.setStringValue(labelName);
            }
        }
        
        /**
         * Sets (as xml) the "LabelName" element
         */
        public void xsetLabelName(org.apache.xmlbeans.XmlString labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$4);
                }
                target.set(labelName);
            }
        }
        
        /**
         * Unsets the "LabelName" element
         */
        public void unsetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELNAME$4, 0);
            }
        }
        /**
         * An XML Type(@http://api.callfire.com/service/xsd).
         *
         * This is a list type whose items are com.callfire.api.data.BroadcastType.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.service.xsd.QueryBroadcastsDocument.QueryBroadcasts.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
