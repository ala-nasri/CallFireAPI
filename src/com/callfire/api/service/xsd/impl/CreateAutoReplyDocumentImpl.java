/*
 * An XML document type.
 * Localname: CreateAutoReply
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateAutoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateAutoReply(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateAutoReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateAutoReplyDocument
{
    
    public CreateAutoReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEAUTOREPLY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateAutoReply");
    
    
    /**
     * Gets the "CreateAutoReply" element
     */
    public com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply getCreateAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply target = null;
            target = (com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply)get_store().find_element_user(CREATEAUTOREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAutoReply" element
     */
    public void setCreateAutoReply(com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply createAutoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply target = null;
            target = (com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply)get_store().find_element_user(CREATEAUTOREPLY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply)get_store().add_element_user(CREATEAUTOREPLY$0);
            }
            target.set(createAutoReply);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAutoReply" element
     */
    public com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply addNewCreateAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply target = null;
            target = (com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply)get_store().add_element_user(CREATEAUTOREPLY$0);
            return target;
        }
    }
    /**
     * An XML CreateAutoReply(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateAutoReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateAutoReplyDocument.CreateAutoReply
    {
        
        public CreateAutoReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
        private static final javax.xml.namespace.QName AUTOREPLY$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "AutoReply");
        
        
        /**
         * Gets the "RequestId" element
         */
        public java.lang.String getRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestId" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestId" element
         */
        public boolean isSetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$0) != 0;
            }
        }
        
        /**
         * Sets the "RequestId" element
         */
        public void setRequestId(java.lang.String requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
                }
                target.setStringValue(requestId);
            }
        }
        
        /**
         * Sets (as xml) the "RequestId" element
         */
        public void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REQUESTID$0);
                }
                target.set(requestId);
            }
        }
        
        /**
         * Unsets the "RequestId" element
         */
        public void unsetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$0, 0);
            }
        }
        
        /**
         * Gets the "AutoReply" element
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply getAutoReply()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AutoReply" element
         */
        public void setAutoReply(com.callfire.api.data.AutoReplyDocument.AutoReply autoReply)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().add_element_user(AUTOREPLY$2);
                }
                target.set(autoReply);
            }
        }
        
        /**
         * Appends and returns a new empty "AutoReply" element
         */
        public com.callfire.api.data.AutoReplyDocument.AutoReply addNewAutoReply()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().add_element_user(AUTOREPLY$2);
                return target;
            }
        }
    }
}
