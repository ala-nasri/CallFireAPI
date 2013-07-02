/*
 * An XML document type.
 * Localname: CreateSound
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateSoundDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateSound(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateSoundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateSoundDocument
{
    
    public CreateSoundDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATESOUND$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateSound");
    
    
    /**
     * Gets the "CreateSound" element
     */
    public com.callfire.api.service.xsd.CreateSoundDocument.CreateSound getCreateSound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateSoundDocument.CreateSound target = null;
            target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound)get_store().find_element_user(CREATESOUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateSound" element
     */
    public void setCreateSound(com.callfire.api.service.xsd.CreateSoundDocument.CreateSound createSound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateSoundDocument.CreateSound target = null;
            target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound)get_store().find_element_user(CREATESOUND$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound)get_store().add_element_user(CREATESOUND$0);
            }
            target.set(createSound);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateSound" element
     */
    public com.callfire.api.service.xsd.CreateSoundDocument.CreateSound addNewCreateSound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateSoundDocument.CreateSound target = null;
            target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound)get_store().add_element_user(CREATESOUND$0);
            return target;
        }
    }
    /**
     * An XML CreateSound(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateSoundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateSoundDocument.CreateSound
    {
        
        public CreateSoundImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Name");
        private static final javax.xml.namespace.QName DATA$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Data");
        private static final javax.xml.namespace.QName RECORDINGCALL$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RecordingCall");
        
        
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
         * Gets the "Data" element
         */
        public byte[] getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "Data" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Data" element
         */
        public boolean isSetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATA$2) != 0;
            }
        }
        
        /**
         * Sets the "Data" element
         */
        public void setData(byte[] data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$2);
                }
                target.setByteArrayValue(data);
            }
        }
        
        /**
         * Sets (as xml) the "Data" element
         */
        public void xsetData(org.apache.xmlbeans.XmlBase64Binary data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Unsets the "Data" element
         */
        public void unsetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATA$2, 0);
            }
        }
        
        /**
         * Gets the "RecordingCall" element
         */
        public com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall getRecordingCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall target = null;
                target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall)get_store().find_element_user(RECORDINGCALL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RecordingCall" element
         */
        public boolean isSetRecordingCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINGCALL$4) != 0;
            }
        }
        
        /**
         * Sets the "RecordingCall" element
         */
        public void setRecordingCall(com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall recordingCall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall target = null;
                target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall)get_store().find_element_user(RECORDINGCALL$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall)get_store().add_element_user(RECORDINGCALL$4);
                }
                target.set(recordingCall);
            }
        }
        
        /**
         * Appends and returns a new empty "RecordingCall" element
         */
        public com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall addNewRecordingCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall target = null;
                target = (com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall)get_store().add_element_user(RECORDINGCALL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "RecordingCall" element
         */
        public void unsetRecordingCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINGCALL$4, 0);
            }
        }
        /**
         * An XML RecordingCall(@http://api.callfire.com/service/xsd).
         *
         * This is a complex type.
         */
        public static class RecordingCallImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateSoundDocument.CreateSound.RecordingCall
        {
            
            public RecordingCallImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TONUMBER$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ToNumber");
            
            
            /**
             * Gets the "ToNumber" element
             */
            public java.lang.String getToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ToNumber" element
             */
            public com.callfire.api.data.PhoneNumber xgetToNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ToNumber" element
             */
            public void setToNumber(java.lang.String toNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TONUMBER$0);
                    }
                    target.setStringValue(toNumber);
                }
            }
            
            /**
             * Sets (as xml) the "ToNumber" element
             */
            public void xsetToNumber(com.callfire.api.data.PhoneNumber toNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.PhoneNumber target = null;
                    target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$0, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(TONUMBER$0);
                    }
                    target.set(toNumber);
                }
            }
        }
    }
}
