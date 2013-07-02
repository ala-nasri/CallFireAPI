/*
 * An XML document type.
 * Localname: RecordingMeta
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.RecordingMetaDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one RecordingMeta(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class RecordingMetaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.RecordingMetaDocument
{
    
    public RecordingMetaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINGMETA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "RecordingMeta");
    
    
    /**
     * Gets the "RecordingMeta" element
     */
    public com.callfire.api.data.RecordingMetaDocument.RecordingMeta getRecordingMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
            target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().find_element_user(RECORDINGMETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RecordingMeta" element
     */
    public void setRecordingMeta(com.callfire.api.data.RecordingMetaDocument.RecordingMeta recordingMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
            target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().find_element_user(RECORDINGMETA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().add_element_user(RECORDINGMETA$0);
            }
            target.set(recordingMeta);
        }
    }
    
    /**
     * Appends and returns a new empty "RecordingMeta" element
     */
    public com.callfire.api.data.RecordingMetaDocument.RecordingMeta addNewRecordingMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
            target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().add_element_user(RECORDINGMETA$0);
            return target;
        }
    }
    /**
     * An XML RecordingMeta(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class RecordingMetaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.RecordingMetaDocument.RecordingMeta
    {
        
        public RecordingMetaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        private static final javax.xml.namespace.QName CREATED$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
        private static final javax.xml.namespace.QName LENGTHINSECONDS$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LengthInSeconds");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "Created" element
         */
        public java.util.Calendar getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Created" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Created" element
         */
        public void setCreated(java.util.Calendar created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$2);
                }
                target.setCalendarValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "Created" element
         */
        public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$2);
                }
                target.set(created);
            }
        }
        
        /**
         * Gets the "LengthInSeconds" element
         */
        public int getLengthInSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHINSECONDS$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "LengthInSeconds" element
         */
        public org.apache.xmlbeans.XmlInt xgetLengthInSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LENGTHINSECONDS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "LengthInSeconds" element
         */
        public boolean isSetLengthInSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LENGTHINSECONDS$4) != 0;
            }
        }
        
        /**
         * Sets the "LengthInSeconds" element
         */
        public void setLengthInSeconds(int lengthInSeconds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHINSECONDS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTHINSECONDS$4);
                }
                target.setIntValue(lengthInSeconds);
            }
        }
        
        /**
         * Sets (as xml) the "LengthInSeconds" element
         */
        public void xsetLengthInSeconds(org.apache.xmlbeans.XmlInt lengthInSeconds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LENGTHINSECONDS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LENGTHINSECONDS$4);
                }
                target.set(lengthInSeconds);
            }
        }
        
        /**
         * Unsets the "LengthInSeconds" element
         */
        public void unsetLengthInSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LENGTHINSECONDS$4, 0);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public long getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(long id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setLongValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlLong id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
    }
}
