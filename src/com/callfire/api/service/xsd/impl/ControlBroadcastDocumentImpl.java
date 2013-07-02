/*
 * An XML document type.
 * Localname: ControlBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ControlBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ControlBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ControlBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ControlBroadcastDocument
{
    
    public ControlBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ControlBroadcast");
    
    
    /**
     * Gets the "ControlBroadcast" element
     */
    public com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast getControlBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast target = null;
            target = (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast)get_store().find_element_user(CONTROLBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ControlBroadcast" element
     */
    public void setControlBroadcast(com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast controlBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast target = null;
            target = (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast)get_store().find_element_user(CONTROLBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast)get_store().add_element_user(CONTROLBROADCAST$0);
            }
            target.set(controlBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "ControlBroadcast" element
     */
    public com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast addNewControlBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast target = null;
            target = (com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast)get_store().add_element_user(CONTROLBROADCAST$0);
            return target;
        }
    }
    /**
     * An XML ControlBroadcast(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ControlBroadcastImpl extends com.callfire.api.service.xsd.impl.IdRequestImpl implements com.callfire.api.service.xsd.ControlBroadcastDocument.ControlBroadcast
    {
        
        public ControlBroadcastImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
        private static final javax.xml.namespace.QName COMMAND$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Command");
        private static final javax.xml.namespace.QName MAXACTIVE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "MaxActive");
        
        
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
         * Gets the "Command" element
         */
        public com.callfire.api.service.xsd.BroadcastCommand.Enum getCommand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMAND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.service.xsd.BroadcastCommand.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Command" element
         */
        public com.callfire.api.service.xsd.BroadcastCommand xgetCommand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.BroadcastCommand target = null;
                target = (com.callfire.api.service.xsd.BroadcastCommand)get_store().find_element_user(COMMAND$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Command" element
         */
        public boolean isSetCommand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMAND$2) != 0;
            }
        }
        
        /**
         * Sets the "Command" element
         */
        public void setCommand(com.callfire.api.service.xsd.BroadcastCommand.Enum command)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMAND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMAND$2);
                }
                target.setEnumValue(command);
            }
        }
        
        /**
         * Sets (as xml) the "Command" element
         */
        public void xsetCommand(com.callfire.api.service.xsd.BroadcastCommand command)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.BroadcastCommand target = null;
                target = (com.callfire.api.service.xsd.BroadcastCommand)get_store().find_element_user(COMMAND$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.BroadcastCommand)get_store().add_element_user(COMMAND$2);
                }
                target.set(command);
            }
        }
        
        /**
         * Unsets the "Command" element
         */
        public void unsetCommand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMAND$2, 0);
            }
        }
        
        /**
         * Gets the "MaxActive" element
         */
        public int getMaxActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXACTIVE$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaxActive" element
         */
        public org.apache.xmlbeans.XmlInt xgetMaxActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXACTIVE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "MaxActive" element
         */
        public boolean isSetMaxActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXACTIVE$4) != 0;
            }
        }
        
        /**
         * Sets the "MaxActive" element
         */
        public void setMaxActive(int maxActive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXACTIVE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXACTIVE$4);
                }
                target.setIntValue(maxActive);
            }
        }
        
        /**
         * Sets (as xml) the "MaxActive" element
         */
        public void xsetMaxActive(org.apache.xmlbeans.XmlInt maxActive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXACTIVE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXACTIVE$4);
                }
                target.set(maxActive);
            }
        }
        
        /**
         * Unsets the "MaxActive" element
         */
        public void unsetMaxActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXACTIVE$4, 0);
            }
        }
    }
}
