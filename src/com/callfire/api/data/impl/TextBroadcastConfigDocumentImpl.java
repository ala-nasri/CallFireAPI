/*
 * An XML document type.
 * Localname: TextBroadcastConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.TextBroadcastConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one TextBroadcastConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class TextBroadcastConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.TextBroadcastConfigDocument
{
    
    public TextBroadcastConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML TextBroadcastConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class TextBroadcastConfigImpl extends com.callfire.api.data.impl.BroadcastConfigImpl implements com.callfire.api.data.TextBroadcastConfigDocument.TextBroadcastConfig
    {
        
        public TextBroadcastConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Message");
        private static final javax.xml.namespace.QName BIGMESSAGESTRATEGY$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BigMessageStrategy");
        
        
        /**
         * Gets the "Message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Message" element
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "Message" element
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "Message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "Message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "BigMessageStrategy" element
         */
        public com.callfire.api.data.BigMessageStrategy.Enum getBigMessageStrategy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGMESSAGESTRATEGY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.BigMessageStrategy.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "BigMessageStrategy" element
         */
        public com.callfire.api.data.BigMessageStrategy xgetBigMessageStrategy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BigMessageStrategy target = null;
                target = (com.callfire.api.data.BigMessageStrategy)get_store().find_element_user(BIGMESSAGESTRATEGY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "BigMessageStrategy" element
         */
        public boolean isSetBigMessageStrategy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIGMESSAGESTRATEGY$2) != 0;
            }
        }
        
        /**
         * Sets the "BigMessageStrategy" element
         */
        public void setBigMessageStrategy(com.callfire.api.data.BigMessageStrategy.Enum bigMessageStrategy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGMESSAGESTRATEGY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIGMESSAGESTRATEGY$2);
                }
                target.setEnumValue(bigMessageStrategy);
            }
        }
        
        /**
         * Sets (as xml) the "BigMessageStrategy" element
         */
        public void xsetBigMessageStrategy(com.callfire.api.data.BigMessageStrategy bigMessageStrategy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BigMessageStrategy target = null;
                target = (com.callfire.api.data.BigMessageStrategy)get_store().find_element_user(BIGMESSAGESTRATEGY$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BigMessageStrategy)get_store().add_element_user(BIGMESSAGESTRATEGY$2);
                }
                target.set(bigMessageStrategy);
            }
        }
        
        /**
         * Unsets the "BigMessageStrategy" element
         */
        public void unsetBigMessageStrategy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIGMESSAGESTRATEGY$2, 0);
            }
        }
    }
}
