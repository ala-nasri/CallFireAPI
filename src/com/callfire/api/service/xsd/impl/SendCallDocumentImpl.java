/*
 * An XML document type.
 * Localname: SendCall
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SendCallDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SendCall(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SendCallDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SendCallDocument
{
    
    public SendCallDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDCALL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SendCall");
    
    
    /**
     * Gets the "SendCall" element
     */
    public com.callfire.api.service.xsd.SendCallDocument.SendCall getSendCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendCallDocument.SendCall target = null;
            target = (com.callfire.api.service.xsd.SendCallDocument.SendCall)get_store().find_element_user(SENDCALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendCall" element
     */
    public void setSendCall(com.callfire.api.service.xsd.SendCallDocument.SendCall sendCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendCallDocument.SendCall target = null;
            target = (com.callfire.api.service.xsd.SendCallDocument.SendCall)get_store().find_element_user(SENDCALL$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SendCallDocument.SendCall)get_store().add_element_user(SENDCALL$0);
            }
            target.set(sendCall);
        }
    }
    
    /**
     * Appends and returns a new empty "SendCall" element
     */
    public com.callfire.api.service.xsd.SendCallDocument.SendCall addNewSendCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendCallDocument.SendCall target = null;
            target = (com.callfire.api.service.xsd.SendCallDocument.SendCall)get_store().add_element_user(SENDCALL$0);
            return target;
        }
    }
    /**
     * An XML SendCall(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SendCallImpl extends com.callfire.api.service.xsd.impl.SendRequestImpl implements com.callfire.api.service.xsd.SendCallDocument.SendCall
    {
        
        public SendCallImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VOICEBROADCASTCONFIG$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "VoiceBroadcastConfig");
        private static final javax.xml.namespace.QName IVRBROADCASTCONFIG$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "IvrBroadcastConfig");
        
        
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
         * True if has "VoiceBroadcastConfig" element
         */
        public boolean isSetVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOICEBROADCASTCONFIG$0) != 0;
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
         * Unsets the "VoiceBroadcastConfig" element
         */
        public void unsetVoiceBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOICEBROADCASTCONFIG$0, 0);
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
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$2, 0);
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
                return get_store().count_elements(IVRBROADCASTCONFIG$2) != 0;
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
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$2);
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
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$2);
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
                get_store().remove_element(IVRBROADCASTCONFIG$2, 0);
            }
        }
    }
}
