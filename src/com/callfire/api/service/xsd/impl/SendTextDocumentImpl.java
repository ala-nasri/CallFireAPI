/*
 * An XML document type.
 * Localname: SendText
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SendTextDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SendText(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SendTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SendTextDocument
{
    
    public SendTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDTEXT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SendText");
    
    
    /**
     * Gets the "SendText" element
     */
    public com.callfire.api.service.xsd.SendTextDocument.SendText getSendText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendTextDocument.SendText target = null;
            target = (com.callfire.api.service.xsd.SendTextDocument.SendText)get_store().find_element_user(SENDTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendText" element
     */
    public void setSendText(com.callfire.api.service.xsd.SendTextDocument.SendText sendText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendTextDocument.SendText target = null;
            target = (com.callfire.api.service.xsd.SendTextDocument.SendText)get_store().find_element_user(SENDTEXT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SendTextDocument.SendText)get_store().add_element_user(SENDTEXT$0);
            }
            target.set(sendText);
        }
    }
    
    /**
     * Appends and returns a new empty "SendText" element
     */
    public com.callfire.api.service.xsd.SendTextDocument.SendText addNewSendText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SendTextDocument.SendText target = null;
            target = (com.callfire.api.service.xsd.SendTextDocument.SendText)get_store().add_element_user(SENDTEXT$0);
            return target;
        }
    }
    /**
     * An XML SendText(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SendTextImpl extends com.callfire.api.service.xsd.impl.SendRequestImpl implements com.callfire.api.service.xsd.SendTextDocument.SendText
    {
        
        public SendTextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXTBROADCASTCONFIG$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TextBroadcastConfig");
        
        
        /**
         * Gets the "TextBroadcastConfig" element
         */
        public com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig getTextBroadcastConfig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig target = null;
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().find_element_user(TEXTBROADCASTCONFIG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
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
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().find_element_user(TEXTBROADCASTCONFIG$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().add_element_user(TEXTBROADCASTCONFIG$0);
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
                target = (com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig)get_store().add_element_user(TEXTBROADCASTCONFIG$0);
                return target;
            }
        }
    }
}
