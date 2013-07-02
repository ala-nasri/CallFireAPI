/*
 * An XML document type.
 * Localname: VoiceBroadcastConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.VoiceBroadcastConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one VoiceBroadcastConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class VoiceBroadcastConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.VoiceBroadcastConfigDocument
{
    
    public VoiceBroadcastConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOICEBROADCASTCONFIG$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "VoiceBroadcastConfig");
    
    
    /**
     * Gets the "VoiceBroadcastConfig" element
     */
    public com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig getVoiceBroadcastConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig target = null;
            target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().find_element_user(VOICEBROADCASTCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().find_element_user(VOICEBROADCASTCONFIG$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().add_element_user(VOICEBROADCASTCONFIG$0);
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
            target = (com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig)get_store().add_element_user(VOICEBROADCASTCONFIG$0);
            return target;
        }
    }
    /**
     * An XML VoiceBroadcastConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class VoiceBroadcastConfigImpl extends com.callfire.api.data.impl.BroadcastConfigImpl implements com.callfire.api.data.VoiceBroadcastConfigDocument.VoiceBroadcastConfig
    {
        
        public VoiceBroadcastConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANSWERINGMACHINECONFIG$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "AnsweringMachineConfig");
        private static final javax.xml.namespace.QName LIVESOUNDID$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LiveSoundId");
        private static final javax.xml.namespace.QName MACHINESOUNDID$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "MachineSoundId");
        private static final javax.xml.namespace.QName TRANSFERSOUNDID$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TransferSoundId");
        private static final javax.xml.namespace.QName TRANSFERDIGIT$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TransferDigit");
        private static final javax.xml.namespace.QName TRANSFERNUMBER$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TransferNumber");
        private static final javax.xml.namespace.QName DNCSOUNDID$12 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "DncSoundId");
        private static final javax.xml.namespace.QName DNCDIGIT$14 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "DncDigit");
        private static final javax.xml.namespace.QName MAXACTIVETRANSFERS$16 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "MaxActiveTransfers");
        
        
        /**
         * Gets the "AnsweringMachineConfig" element
         */
        public com.callfire.api.data.AnsweringMachineConfig.Enum getAnsweringMachineConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWERINGMACHINECONFIG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.AnsweringMachineConfig.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AnsweringMachineConfig" element
         */
        public com.callfire.api.data.AnsweringMachineConfig xgetAnsweringMachineConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AnsweringMachineConfig target = null;
                target = (com.callfire.api.data.AnsweringMachineConfig)get_store().find_element_user(ANSWERINGMACHINECONFIG$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AnsweringMachineConfig" element
         */
        public boolean isSetAnsweringMachineConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANSWERINGMACHINECONFIG$0) != 0;
            }
        }
        
        /**
         * Sets the "AnsweringMachineConfig" element
         */
        public void setAnsweringMachineConfig(com.callfire.api.data.AnsweringMachineConfig.Enum answeringMachineConfig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWERINGMACHINECONFIG$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANSWERINGMACHINECONFIG$0);
                }
                target.setEnumValue(answeringMachineConfig);
            }
        }
        
        /**
         * Sets (as xml) the "AnsweringMachineConfig" element
         */
        public void xsetAnsweringMachineConfig(com.callfire.api.data.AnsweringMachineConfig answeringMachineConfig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AnsweringMachineConfig target = null;
                target = (com.callfire.api.data.AnsweringMachineConfig)get_store().find_element_user(ANSWERINGMACHINECONFIG$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.AnsweringMachineConfig)get_store().add_element_user(ANSWERINGMACHINECONFIG$0);
                }
                target.set(answeringMachineConfig);
            }
        }
        
        /**
         * Unsets the "AnsweringMachineConfig" element
         */
        public void unsetAnsweringMachineConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANSWERINGMACHINECONFIG$0, 0);
            }
        }
        
        /**
         * Gets the "LiveSoundId" element
         */
        public long getLiveSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVESOUNDID$2, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "LiveSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetLiveSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LIVESOUNDID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "LiveSoundId" element
         */
        public boolean isSetLiveSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIVESOUNDID$2) != 0;
            }
        }
        
        /**
         * Sets the "LiveSoundId" element
         */
        public void setLiveSoundId(long liveSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVESOUNDID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVESOUNDID$2);
                }
                target.setLongValue(liveSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "LiveSoundId" element
         */
        public void xsetLiveSoundId(org.apache.xmlbeans.XmlLong liveSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LIVESOUNDID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LIVESOUNDID$2);
                }
                target.set(liveSoundId);
            }
        }
        
        /**
         * Unsets the "LiveSoundId" element
         */
        public void unsetLiveSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIVESOUNDID$2, 0);
            }
        }
        
        /**
         * Gets the "MachineSoundId" element
         */
        public long getMachineSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MACHINESOUNDID$4, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "MachineSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetMachineSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MACHINESOUNDID$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "MachineSoundId" element
         */
        public boolean isSetMachineSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MACHINESOUNDID$4) != 0;
            }
        }
        
        /**
         * Sets the "MachineSoundId" element
         */
        public void setMachineSoundId(long machineSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MACHINESOUNDID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MACHINESOUNDID$4);
                }
                target.setLongValue(machineSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "MachineSoundId" element
         */
        public void xsetMachineSoundId(org.apache.xmlbeans.XmlLong machineSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MACHINESOUNDID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MACHINESOUNDID$4);
                }
                target.set(machineSoundId);
            }
        }
        
        /**
         * Unsets the "MachineSoundId" element
         */
        public void unsetMachineSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MACHINESOUNDID$4, 0);
            }
        }
        
        /**
         * Gets the "TransferSoundId" element
         */
        public long getTransferSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERSOUNDID$6, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransferSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetTransferSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TRANSFERSOUNDID$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "TransferSoundId" element
         */
        public boolean isSetTransferSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSFERSOUNDID$6) != 0;
            }
        }
        
        /**
         * Sets the "TransferSoundId" element
         */
        public void setTransferSoundId(long transferSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERSOUNDID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERSOUNDID$6);
                }
                target.setLongValue(transferSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "TransferSoundId" element
         */
        public void xsetTransferSoundId(org.apache.xmlbeans.XmlLong transferSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TRANSFERSOUNDID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TRANSFERSOUNDID$6);
                }
                target.set(transferSoundId);
            }
        }
        
        /**
         * Unsets the "TransferSoundId" element
         */
        public void unsetTransferSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSFERSOUNDID$6, 0);
            }
        }
        
        /**
         * Gets the "TransferDigit" element
         */
        public java.lang.String getTransferDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERDIGIT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransferDigit" element
         */
        public com.callfire.api.data.PhoneDigit xgetTransferDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneDigit target = null;
                target = (com.callfire.api.data.PhoneDigit)get_store().find_element_user(TRANSFERDIGIT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "TransferDigit" element
         */
        public boolean isSetTransferDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSFERDIGIT$8) != 0;
            }
        }
        
        /**
         * Sets the "TransferDigit" element
         */
        public void setTransferDigit(java.lang.String transferDigit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERDIGIT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERDIGIT$8);
                }
                target.setStringValue(transferDigit);
            }
        }
        
        /**
         * Sets (as xml) the "TransferDigit" element
         */
        public void xsetTransferDigit(com.callfire.api.data.PhoneDigit transferDigit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneDigit target = null;
                target = (com.callfire.api.data.PhoneDigit)get_store().find_element_user(TRANSFERDIGIT$8, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneDigit)get_store().add_element_user(TRANSFERDIGIT$8);
                }
                target.set(transferDigit);
            }
        }
        
        /**
         * Unsets the "TransferDigit" element
         */
        public void unsetTransferDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSFERDIGIT$8, 0);
            }
        }
        
        /**
         * Gets the "TransferNumber" element
         */
        public java.lang.String getTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransferNumber" element
         */
        public com.callfire.api.data.PhoneNumber xgetTransferNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TRANSFERNUMBER$10, 0);
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
                return get_store().count_elements(TRANSFERNUMBER$10) != 0;
            }
        }
        
        /**
         * Sets the "TransferNumber" element
         */
        public void setTransferNumber(java.lang.String transferNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERNUMBER$10);
                }
                target.setStringValue(transferNumber);
            }
        }
        
        /**
         * Sets (as xml) the "TransferNumber" element
         */
        public void xsetTransferNumber(com.callfire.api.data.PhoneNumber transferNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TRANSFERNUMBER$10, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(TRANSFERNUMBER$10);
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
                get_store().remove_element(TRANSFERNUMBER$10, 0);
            }
        }
        
        /**
         * Gets the "DncSoundId" element
         */
        public long getDncSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNCSOUNDID$12, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "DncSoundId" element
         */
        public org.apache.xmlbeans.XmlLong xgetDncSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DNCSOUNDID$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "DncSoundId" element
         */
        public boolean isSetDncSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DNCSOUNDID$12) != 0;
            }
        }
        
        /**
         * Sets the "DncSoundId" element
         */
        public void setDncSoundId(long dncSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNCSOUNDID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DNCSOUNDID$12);
                }
                target.setLongValue(dncSoundId);
            }
        }
        
        /**
         * Sets (as xml) the "DncSoundId" element
         */
        public void xsetDncSoundId(org.apache.xmlbeans.XmlLong dncSoundId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DNCSOUNDID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DNCSOUNDID$12);
                }
                target.set(dncSoundId);
            }
        }
        
        /**
         * Unsets the "DncSoundId" element
         */
        public void unsetDncSoundId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DNCSOUNDID$12, 0);
            }
        }
        
        /**
         * Gets the "DncDigit" element
         */
        public java.lang.String getDncDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNCDIGIT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DncDigit" element
         */
        public com.callfire.api.data.PhoneDigit xgetDncDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneDigit target = null;
                target = (com.callfire.api.data.PhoneDigit)get_store().find_element_user(DNCDIGIT$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "DncDigit" element
         */
        public boolean isSetDncDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DNCDIGIT$14) != 0;
            }
        }
        
        /**
         * Sets the "DncDigit" element
         */
        public void setDncDigit(java.lang.String dncDigit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNCDIGIT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DNCDIGIT$14);
                }
                target.setStringValue(dncDigit);
            }
        }
        
        /**
         * Sets (as xml) the "DncDigit" element
         */
        public void xsetDncDigit(com.callfire.api.data.PhoneDigit dncDigit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneDigit target = null;
                target = (com.callfire.api.data.PhoneDigit)get_store().find_element_user(DNCDIGIT$14, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneDigit)get_store().add_element_user(DNCDIGIT$14);
                }
                target.set(dncDigit);
            }
        }
        
        /**
         * Unsets the "DncDigit" element
         */
        public void unsetDncDigit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DNCDIGIT$14, 0);
            }
        }
        
        /**
         * Gets the "MaxActiveTransfers" element
         */
        public int getMaxActiveTransfers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXACTIVETRANSFERS$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaxActiveTransfers" element
         */
        public org.apache.xmlbeans.XmlInt xgetMaxActiveTransfers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXACTIVETRANSFERS$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "MaxActiveTransfers" element
         */
        public boolean isSetMaxActiveTransfers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXACTIVETRANSFERS$16) != 0;
            }
        }
        
        /**
         * Sets the "MaxActiveTransfers" element
         */
        public void setMaxActiveTransfers(int maxActiveTransfers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXACTIVETRANSFERS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXACTIVETRANSFERS$16);
                }
                target.setIntValue(maxActiveTransfers);
            }
        }
        
        /**
         * Sets (as xml) the "MaxActiveTransfers" element
         */
        public void xsetMaxActiveTransfers(org.apache.xmlbeans.XmlInt maxActiveTransfers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXACTIVETRANSFERS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXACTIVETRANSFERS$16);
                }
                target.set(maxActiveTransfers);
            }
        }
        
        /**
         * Unsets the "MaxActiveTransfers" element
         */
        public void unsetMaxActiveTransfers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXACTIVETRANSFERS$16, 0);
            }
        }
    }
}
