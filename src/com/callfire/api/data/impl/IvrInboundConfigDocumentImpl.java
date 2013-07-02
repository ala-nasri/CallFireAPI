/*
 * An XML document type.
 * Localname: IvrInboundConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.IvrInboundConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one IvrInboundConfig(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class IvrInboundConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.IvrInboundConfigDocument
{
    
    public IvrInboundConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IVRINBOUNDCONFIG$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "IvrInboundConfig");
    
    
    /**
     * Gets the "IvrInboundConfig" element
     */
    public com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig getIvrInboundConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
            target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().find_element_user(IVRINBOUNDCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IvrInboundConfig" element
     */
    public void setIvrInboundConfig(com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig ivrInboundConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
            target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().find_element_user(IVRINBOUNDCONFIG$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().add_element_user(IVRINBOUNDCONFIG$0);
            }
            target.set(ivrInboundConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "IvrInboundConfig" element
     */
    public com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig addNewIvrInboundConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig target = null;
            target = (com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig)get_store().add_element_user(IVRINBOUNDCONFIG$0);
            return target;
        }
    }
    /**
     * An XML IvrInboundConfig(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class IvrInboundConfigImpl extends com.callfire.api.data.impl.InboundConfigImpl implements com.callfire.api.data.IvrInboundConfigDocument.IvrInboundConfig
    {
        
        public IvrInboundConfigImpl(org.apache.xmlbeans.SchemaType sType)
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
