/*
 * An XML document type.
 * Localname: SoundMeta
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.SoundMetaDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one SoundMeta(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class SoundMetaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.SoundMetaDocument
{
    
    public SoundMetaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOUNDMETA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "SoundMeta");
    
    
    /**
     * Gets the "SoundMeta" element
     */
    public com.callfire.api.data.SoundMetaDocument.SoundMeta getSoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
            target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().find_element_user(SOUNDMETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SoundMeta" element
     */
    public void setSoundMeta(com.callfire.api.data.SoundMetaDocument.SoundMeta soundMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
            target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().find_element_user(SOUNDMETA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().add_element_user(SOUNDMETA$0);
            }
            target.set(soundMeta);
        }
    }
    
    /**
     * Appends and returns a new empty "SoundMeta" element
     */
    public com.callfire.api.data.SoundMetaDocument.SoundMeta addNewSoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
            target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().add_element_user(SOUNDMETA$0);
            return target;
        }
    }
    /**
     * An XML SoundMeta(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class SoundMetaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.SoundMetaDocument.SoundMeta
    {
        
        public SoundMetaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        private static final javax.xml.namespace.QName CREATED$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
        private static final javax.xml.namespace.QName LENGTHINSECONDS$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LengthInSeconds");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Status" element
         */
        public com.callfire.api.data.SoundStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.SoundStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.SoundStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundStatus target = null;
                target = (com.callfire.api.data.SoundStatus)get_store().find_element_user(STATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.SoundStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.SoundStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundStatus target = null;
                target = (com.callfire.api.data.SoundStatus)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.SoundStatus)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$4);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHINSECONDS$6, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LENGTHINSECONDS$6, 0);
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
                return get_store().count_elements(LENGTHINSECONDS$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHINSECONDS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTHINSECONDS$6);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LENGTHINSECONDS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LENGTHINSECONDS$6);
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
                get_store().remove_element(LENGTHINSECONDS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
    }
}
