/*
 * An XML document type.
 * Localname: Broadcast
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Broadcast(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class BroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastDocument
{
    
    public BroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Broadcast");
    
    
    /**
     * Gets the "Broadcast" element
     */
    public com.callfire.api.data.BroadcastDocument.Broadcast getBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Broadcast" element
     */
    public void setBroadcast(com.callfire.api.data.BroadcastDocument.Broadcast broadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().find_element_user(BROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().add_element_user(BROADCAST$0);
            }
            target.set(broadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "Broadcast" element
     */
    public com.callfire.api.data.BroadcastDocument.Broadcast addNewBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastDocument.Broadcast target = null;
            target = (com.callfire.api.data.BroadcastDocument.Broadcast)get_store().add_element_user(BROADCAST$0);
            return target;
        }
    }
    /**
     * An XML Broadcast(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class BroadcastImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastDocument.Broadcast
    {
        
        public BroadcastImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        private static final javax.xml.namespace.QName STATUS$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName LASTMODIFIED$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LastModified");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Type");
        private static final javax.xml.namespace.QName VOICEBROADCASTCONFIG$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "VoiceBroadcastConfig");
        private static final javax.xml.namespace.QName TEXTBROADCASTCONFIG$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TextBroadcastConfig");
        private static final javax.xml.namespace.QName IVRBROADCASTCONFIG$12 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "IvrBroadcastConfig");
        private static final javax.xml.namespace.QName ID$14 = 
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
         * True if has "Name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
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
         * Unsets the "Name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.callfire.api.data.BroadcastStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.BroadcastStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.BroadcastStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatus target = null;
                target = (com.callfire.api.data.BroadcastStatus)get_store().find_element_user(STATUS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$2) != 0;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.BroadcastStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.BroadcastStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatus target = null;
                target = (com.callfire.api.data.BroadcastStatus)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BroadcastStatus)get_store().add_element_user(STATUS$2);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "Status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$2, 0);
            }
        }
        
        /**
         * Gets the "LastModified" element
         */
        public java.util.Calendar getLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastModified" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "LastModified" element
         */
        public boolean isSetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTMODIFIED$4) != 0;
            }
        }
        
        /**
         * Sets the "LastModified" element
         */
        public void setLastModified(java.util.Calendar lastModified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIED$4);
                }
                target.setCalendarValue(lastModified);
            }
        }
        
        /**
         * Sets (as xml) the "LastModified" element
         */
        public void xsetLastModified(org.apache.xmlbeans.XmlDateTime lastModified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTMODIFIED$4);
                }
                target.set(lastModified);
            }
        }
        
        /**
         * Unsets the "LastModified" element
         */
        public void unsetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTMODIFIED$4, 0);
            }
        }
        
        /**
         * Gets the "Type" element
         */
        public com.callfire.api.data.BroadcastType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.BroadcastType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" element
         */
        public com.callfire.api.data.BroadcastType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastType target = null;
                target = (com.callfire.api.data.BroadcastType)get_store().find_element_user(TYPE$6, 0);
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
                return get_store().count_elements(TYPE$6) != 0;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(com.callfire.api.data.BroadcastType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$6);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" element
         */
        public void xsetType(com.callfire.api.data.BroadcastType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastType target = null;
                target = (com.callfire.api.data.BroadcastType)get_store().find_element_user(TYPE$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BroadcastType)get_store().add_element_user(TYPE$6);
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
                get_store().remove_element(TYPE$6, 0);
            }
        }
        
        /**
         * Gets the "VoiceBroadcastConfig" element
         */
        public com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig getVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig target = null;
                target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().find_element_user(VOICEBROADCASTCONFIG$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "VoiceBroadcastConfig" element
         */
        public boolean isSetVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOICEBROADCASTCONFIG$8) != 0;
            }
        }
        
        /**
         * Sets the "VoiceBroadcastConfig" element
         */
        public void setVoiceBroadcastConfig(com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig voiceBroadcastConfig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig target = null;
                target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().find_element_user(VOICEBROADCASTCONFIG$8, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().add_element_user(VOICEBROADCASTCONFIG$8);
                }
                target.set(voiceBroadcastConfig);
            }
        }
        
        /**
         * Appends and returns a new empty "VoiceBroadcastConfig" element
         */
        public com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig addNewVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig target = null;
                target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().add_element_user(VOICEBROADCASTCONFIG$8);
                return target;
            }
        }
        
        /**
         * Unsets the "VoiceBroadcastConfig" element
         */
        public void unsetVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOICEBROADCASTCONFIG$8, 0);
            }
        }
        
        /**
         * Gets the "TextBroadcastConfig" element
         */
        public com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig getTextBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig target = null;
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().find_element_user(TEXTBROADCASTCONFIG$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TextBroadcastConfig" element
         */
        public boolean isSetTextBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTBROADCASTCONFIG$10) != 0;
            }
        }
        
        /**
         * Sets the "TextBroadcastConfig" element
         */
        public void setTextBroadcastConfig(com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig textBroadcastConfig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig target = null;
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().find_element_user(TEXTBROADCASTCONFIG$10, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().add_element_user(TEXTBROADCASTCONFIG$10);
                }
                target.set(textBroadcastConfig);
            }
        }
        
        /**
         * Appends and returns a new empty "TextBroadcastConfig" element
         */
        public com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig addNewTextBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig target = null;
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().add_element_user(TEXTBROADCASTCONFIG$10);
                return target;
            }
        }
        
        /**
         * Unsets the "TextBroadcastConfig" element
         */
        public void unsetTextBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTBROADCASTCONFIG$10, 0);
            }
        }
        
        /**
         * Gets the "IvrBroadcastConfig" element
         */
        public com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig getIvrBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig target = null;
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "IvrBroadcastConfig" element
         */
        public boolean isSetIvrBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IVRBROADCASTCONFIG$12) != 0;
            }
        }
        
        /**
         * Sets the "IvrBroadcastConfig" element
         */
        public void setIvrBroadcastConfig(com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig ivrBroadcastConfig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig target = null;
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$12, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$12);
                }
                target.set(ivrBroadcastConfig);
            }
        }
        
        /**
         * Appends and returns a new empty "IvrBroadcastConfig" element
         */
        public com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig addNewIvrBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig target = null;
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$12);
                return target;
            }
        }
        
        /**
         * Unsets the "IvrBroadcastConfig" element
         */
        public void unsetIvrBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IVRBROADCASTCONFIG$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$14);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$14);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$14);
            }
        }
    }
}
