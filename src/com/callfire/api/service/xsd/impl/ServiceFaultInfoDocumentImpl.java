/*
 * An XML document type.
 * Localname: ServiceFaultInfo
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ServiceFaultInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ServiceFaultInfo(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ServiceFaultInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ServiceFaultInfoDocument
{
    
    public ServiceFaultInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEFAULTINFO$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ServiceFaultInfo");
    
    
    /**
     * Gets the "ServiceFaultInfo" element
     */
    public com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo getServiceFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo target = null;
            target = (com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo)get_store().find_element_user(SERVICEFAULTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceFaultInfo" element
     */
    public void setServiceFaultInfo(com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo serviceFaultInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo target = null;
            target = (com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo)get_store().find_element_user(SERVICEFAULTINFO$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo)get_store().add_element_user(SERVICEFAULTINFO$0);
            }
            target.set(serviceFaultInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceFaultInfo" element
     */
    public com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo addNewServiceFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo target = null;
            target = (com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo)get_store().add_element_user(SERVICEFAULTINFO$0);
            return target;
        }
    }
    /**
     * An XML ServiceFaultInfo(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ServiceFaultInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ServiceFaultInfoDocument.ServiceFaultInfo
    {
        
        public ServiceFaultInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAULTCODE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "FaultCode");
        private static final javax.xml.namespace.QName MESSAGE$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Message");
        private static final javax.xml.namespace.QName DETAIL$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Detail");
        
        
        /**
         * Gets the "FaultCode" element
         */
        public com.callfire.api.service.xsd.FaultCode.Enum getFaultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.service.xsd.FaultCode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "FaultCode" element
         */
        public com.callfire.api.service.xsd.FaultCode xgetFaultCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.FaultCode target = null;
                target = (com.callfire.api.service.xsd.FaultCode)get_store().find_element_user(FAULTCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FaultCode" element
         */
        public void setFaultCode(com.callfire.api.service.xsd.FaultCode.Enum faultCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTCODE$0);
                }
                target.setEnumValue(faultCode);
            }
        }
        
        /**
         * Sets (as xml) the "FaultCode" element
         */
        public void xsetFaultCode(com.callfire.api.service.xsd.FaultCode faultCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.FaultCode target = null;
                target = (com.callfire.api.service.xsd.FaultCode)get_store().find_element_user(FAULTCODE$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.FaultCode)get_store().add_element_user(FAULTCODE$0);
                }
                target.set(faultCode);
            }
        }
        
        /**
         * Gets the "Message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
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
                return get_store().count_elements(MESSAGE$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
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
                get_store().remove_element(MESSAGE$2, 0);
            }
        }
        
        /**
         * Gets the "Detail" element
         */
        public java.lang.String getDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAIL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Detail" element
         */
        public org.apache.xmlbeans.XmlString xgetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAIL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Detail" element
         */
        public boolean isSetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DETAIL$4) != 0;
            }
        }
        
        /**
         * Sets the "Detail" element
         */
        public void setDetail(java.lang.String detail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAIL$4);
                }
                target.setStringValue(detail);
            }
        }
        
        /**
         * Sets (as xml) the "Detail" element
         */
        public void xsetDetail(org.apache.xmlbeans.XmlString detail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETAIL$4);
                }
                target.set(detail);
            }
        }
        
        /**
         * Unsets the "Detail" element
         */
        public void unsetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DETAIL$4, 0);
            }
        }
    }
}
