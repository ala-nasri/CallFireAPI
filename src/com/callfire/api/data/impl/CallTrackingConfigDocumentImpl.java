/*
 * An XML document type.
 * Localname: CallTrackingConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.CallTrackingConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one CallTrackingConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class CallTrackingConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.CallTrackingConfigDocument
{
    
    public CallTrackingConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLTRACKINGCONFIG$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "CallTrackingConfig");
    
    
    /**
     * Gets the "CallTrackingConfig" element
     */
    public com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig getCallTrackingConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
            target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().find_element_user(CALLTRACKINGCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CallTrackingConfig" element
     */
    public void setCallTrackingConfig(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig callTrackingConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
            target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().find_element_user(CALLTRACKINGCONFIG$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().add_element_user(CALLTRACKINGCONFIG$0);
            }
            target.set(callTrackingConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "CallTrackingConfig" element
     */
    public com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig addNewCallTrackingConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig target = null;
            target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig)get_store().add_element_user(CALLTRACKINGCONFIG$0);
            return target;
        }
    }
    /**
     * An XML CallTrackingConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class CallTrackingConfigImpl extends com.callfire.api.data.impl.InboundConfigImpl implements com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig
    {
        
        public CallTrackingConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRANSFERNUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TransferNumber");
        private static final javax.xml.namespace.QName SCREEN$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Screen");
        private static final javax.xml.namespace.QName RECORD$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Record");
        private static final javax.xml.namespace.QName INTROSOUNDID$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "IntroSoundId");
        private static final javax.xml.namespace.QName WHISPERSOUNDID$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "WhisperSoundId");
        
        
        /**
         * Gets the "TransferNumber" element
         */
        public java.util.List getTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransferNumber" element
         */
        public com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber xgetTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber target = null;
                target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber)get_store().find_element_user(TRANSFERNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "TransferNumber" element
         */
        public boolean isSetTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSFERNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "TransferNumber" element
         */
        public void setTransferNumber(java.util.List transferNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERNUMBER$0);
                }
                target.setListValue(transferNumber);
            }
        }
        
        /**
         * Sets (as xml) the "TransferNumber" element
         */
        public void xsetTransferNumber(com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber transferNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber target = null;
                target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber)get_store().find_element_user(TRANSFERNUMBER$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber)get_store().add_element_user(TRANSFERNUMBER$0);
                }
                target.set(transferNumber);
            }
        }
        
        /**
         * Unsets the "TransferNumber" element
         */
        public void unsetTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSFERNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "Screen" element
         */
        public boolean getScreen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCREEN$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Screen" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetScreen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCREEN$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Screen" element
         */
        public boolean isSetScreen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCREEN$2) != 0;
            }
        }
        
        /**
         * Sets the "Screen" element
         */
        public void setScreen(boolean screen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCREEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCREEN$2);
                }
                target.setBooleanValue(screen);
            }
        }
        
        /**
         * Sets (as xml) the "Screen" element
         */
        public void xsetScreen(org.apache.xmlbeans.XmlBoolean screen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCREEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SCREEN$2);
                }
                target.set(screen);
            }
        }
        
        /**
         * Unsets the "Screen" element
         */
        public void unsetScreen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCREEN$2, 0);
            }
        }
        
        /**
         * Gets the "Record" element
         */
        public boolean getRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORD$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Record" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RECORD$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Record" element
         */
        public boolean isSetRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORD$4) != 0;
            }
        }
        
        /**
         * Sets the "Record" element
         */
        public void setRecord(boolean record)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORD$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORD$4);
                }
                target.setBooleanValue(record);
            }
        }
        
        /**
         * Sets (as xml) the "Record" element
         */
        public void xsetRecord(org.apache.xmlbeans.XmlBoolean record)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RECORD$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RECORD$4);
                }
                target.set(record);
            }
        }
        
        /**
         * Unsets the "Record" element
         */
        public void unsetRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORD$4, 0);
            }
        }
        
        /**
         * Gets the "IntroSoundId" element
         */
        public long getIntroSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTROSOUNDID$6, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntroSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetIntroSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INTROSOUNDID$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntroSoundId" element
         */
        public boolean isSetIntroSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTROSOUNDID$6) != 0;
            }
        }
        
        /**
         * Sets the "IntroSoundId" element
         */
        public void setIntroSoundId(long introSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTROSOUNDID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTROSOUNDID$6);
                }
                target.setLongValue(introSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "IntroSoundId" element
         */
        public void xsetIntroSoundId(org.apache.xmlbeans.XmlLong introSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INTROSOUNDID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(INTROSOUNDID$6);
                }
                target.set(introSoundId);
            }
        }
        
        /**
         * Unsets the "IntroSoundId" element
         */
        public void unsetIntroSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTROSOUNDID$6, 0);
            }
        }
        
        /**
         * Gets the "WhisperSoundId" element
         */
        public long getWhisperSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHISPERSOUNDID$8, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "WhisperSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetWhisperSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(WHISPERSOUNDID$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "WhisperSoundId" element
         */
        public boolean isSetWhisperSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WHISPERSOUNDID$8) != 0;
            }
        }
        
        /**
         * Sets the "WhisperSoundId" element
         */
        public void setWhisperSoundId(long whisperSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHISPERSOUNDID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHISPERSOUNDID$8);
                }
                target.setLongValue(whisperSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "WhisperSoundId" element
         */
        public void xsetWhisperSoundId(org.apache.xmlbeans.XmlLong whisperSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(WHISPERSOUNDID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(WHISPERSOUNDID$8);
                }
                target.set(whisperSoundId);
            }
        }
        
        /**
         * Unsets the "WhisperSoundId" element
         */
        public void unsetWhisperSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WHISPERSOUNDID$8, 0);
            }
        }
        /**
         * An XML TransferNumber(@http://api.callfire.com/data).
         *
         * This is a list type whose items are com.callfire.api.data.PhoneNumber.
         */
        public static class TransferNumberImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.data.CallTrackingConfigDocument.CallTrackingConfig.TransferNumber
        {
            
            public TransferNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TransferNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
