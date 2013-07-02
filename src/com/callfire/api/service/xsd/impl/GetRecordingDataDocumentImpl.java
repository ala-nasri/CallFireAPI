/*
 * An XML document type.
 * Localname: GetRecordingData
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetRecordingDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetRecordingData(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetRecordingDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetRecordingDataDocument
{
    
    public GetRecordingDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRECORDINGDATA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetRecordingData");
    
    
    /**
     * Gets the "GetRecordingData" element
     */
    public com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData getGetRecordingData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData target = null;
            target = (com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData)get_store().find_element_user(GETRECORDINGDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRecordingData" element
     */
    public void setGetRecordingData(com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData getRecordingData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData target = null;
            target = (com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData)get_store().find_element_user(GETRECORDINGDATA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData)get_store().add_element_user(GETRECORDINGDATA$0);
            }
            target.set(getRecordingData);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRecordingData" element
     */
    public com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData addNewGetRecordingData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData target = null;
            target = (com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData)get_store().add_element_user(GETRECORDINGDATA$0);
            return target;
        }
    }
    /**
     * An XML GetRecordingData(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class GetRecordingDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetRecordingDataDocument.GetRecordingData
    {
        
        public GetRecordingDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALLID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CallId");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Name");
        private static final javax.xml.namespace.QName RECORDINGID$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RecordingId");
        private static final javax.xml.namespace.QName FORMAT$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Format");
        
        
        /**
         * Gets the "CallId" element
         */
        public long getCallId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLID$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "CallId" element
         */
        public org.apache.xmlbeans.XmlLong xgetCallId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CALLID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CallId" element
         */
        public boolean isSetCallId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALLID$0) != 0;
            }
        }
        
        /**
         * Sets the "CallId" element
         */
        public void setCallId(long callId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLID$0);
                }
                target.setLongValue(callId);
            }
        }
        
        /**
         * Sets (as xml) the "CallId" element
         */
        public void xsetCallId(org.apache.xmlbeans.XmlLong callId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CALLID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CALLID$0);
                }
                target.set(callId);
            }
        }
        
        /**
         * Unsets the "CallId" element
         */
        public void unsetCallId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALLID$0, 0);
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
         * True if has "Name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2) != 0;
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
         * Unsets the "Name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, 0);
            }
        }
        
        /**
         * Gets the "RecordingId" element
         */
        public long getRecordingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINGID$4, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordingId" element
         */
        public org.apache.xmlbeans.XmlLong xgetRecordingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RECORDINGID$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "RecordingId" element
         */
        public boolean isSetRecordingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINGID$4) != 0;
            }
        }
        
        /**
         * Sets the "RecordingId" element
         */
        public void setRecordingId(long recordingId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINGID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDINGID$4);
                }
                target.setLongValue(recordingId);
            }
        }
        
        /**
         * Sets (as xml) the "RecordingId" element
         */
        public void xsetRecordingId(org.apache.xmlbeans.XmlLong recordingId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RECORDINGID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(RECORDINGID$4);
                }
                target.set(recordingId);
            }
        }
        
        /**
         * Unsets the "RecordingId" element
         */
        public void unsetRecordingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINGID$4, 0);
            }
        }
        
        /**
         * Gets the "Format" element
         */
        public com.callfire.api.service.xsd.SoundFormat.Enum getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.service.xsd.SoundFormat.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Format" element
         */
        public com.callfire.api.service.xsd.SoundFormat xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.SoundFormat target = null;
                target = (com.callfire.api.service.xsd.SoundFormat)get_store().find_element_user(FORMAT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Format" element
         */
        public boolean isSetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMAT$6) != 0;
            }
        }
        
        /**
         * Sets the "Format" element
         */
        public void setFormat(com.callfire.api.service.xsd.SoundFormat.Enum format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$6);
                }
                target.setEnumValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "Format" element
         */
        public void xsetFormat(com.callfire.api.service.xsd.SoundFormat format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.SoundFormat target = null;
                target = (com.callfire.api.service.xsd.SoundFormat)get_store().find_element_user(FORMAT$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.SoundFormat)get_store().add_element_user(FORMAT$6);
                }
                target.set(format);
            }
        }
        
        /**
         * Unsets the "Format" element
         */
        public void unsetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMAT$6, 0);
            }
        }
    }
}
