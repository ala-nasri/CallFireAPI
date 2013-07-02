/*
 * An XML document type.
 * Localname: IvrBroadcastConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.IvrBroadcastConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one IvrBroadcastConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class IvrBroadcastConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.IvrBroadcastConfigDocument
{
    
    public IvrBroadcastConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IVRBROADCASTCONFIG$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "IvrBroadcastConfig");
    
    
    /**
     * Gets the "IvrBroadcastConfig" element
     */
    public com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig getIvrBroadcastConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig target = null;
            target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().find_element_user(IVRBROADCASTCONFIG$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$0);
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
            target = (com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig)get_store().add_element_user(IVRBROADCASTCONFIG$0);
            return target;
        }
    }
    /**
     * An XML IvrBroadcastConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class IvrBroadcastConfigImpl extends com.callfire.api.data.impl.BroadcastConfigImpl implements com.callfire.api.data.IvrBroadcastConfigDocument.IvrBroadcastConfig
    {
        
        public IvrBroadcastConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIALPLANXML$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "DialplanXml");
        
        
        /**
         * Gets the "DialplanXml" element
         */
        public java.lang.String getDialplanXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALPLANXML$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DialplanXml" element
         */
        public org.apache.xmlbeans.XmlString xgetDialplanXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIALPLANXML$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DialplanXml" element
         */
        public boolean isSetDialplanXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIALPLANXML$0) != 0;
            }
        }
        
        /**
         * Sets the "DialplanXml" element
         */
        public void setDialplanXml(java.lang.String dialplanXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALPLANXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIALPLANXML$0);
                }
                target.setStringValue(dialplanXml);
            }
        }
        
        /**
         * Sets (as xml) the "DialplanXml" element
         */
        public void xsetDialplanXml(org.apache.xmlbeans.XmlString dialplanXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIALPLANXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIALPLANXML$0);
                }
                target.set(dialplanXml);
            }
        }
        
        /**
         * Unsets the "DialplanXml" element
         */
        public void unsetDialplanXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIALPLANXML$0, 0);
            }
        }
    }
}
