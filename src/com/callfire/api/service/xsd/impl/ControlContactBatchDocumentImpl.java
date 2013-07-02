/*
 * An XML document type.
 * Localname: ControlContactBatch
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ControlContactBatchDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one ControlContactBatch(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ControlContactBatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ControlContactBatchDocument
{
    
    public ControlContactBatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLCONTACTBATCH$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ControlContactBatch");
    
    
    /**
     * Gets the "ControlContactBatch" element
     */
    public com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch getControlContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch target = null;
            target = (com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch)get_store().find_element_user(CONTROLCONTACTBATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ControlContactBatch" element
     */
    public void setControlContactBatch(com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch controlContactBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch target = null;
            target = (com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch)get_store().find_element_user(CONTROLCONTACTBATCH$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch)get_store().add_element_user(CONTROLCONTACTBATCH$0);
            }
            target.set(controlContactBatch);
        }
    }
    
    /**
     * Appends and returns a new empty "ControlContactBatch" element
     */
    public com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch addNewControlContactBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch target = null;
            target = (com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch)get_store().add_element_user(CONTROLCONTACTBATCH$0);
            return target;
        }
    }
    /**
     * An XML ControlContactBatch(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ControlContactBatchImpl extends com.callfire.api.service.xsd.impl.IdRequestImpl implements com.callfire.api.service.xsd.ControlContactBatchDocument.ControlContactBatch
    {
        
        public ControlContactBatchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Name");
        private static final javax.xml.namespace.QName ENABLED$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Enabled");
        
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "Name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
        
        /**
         * Gets the "Enabled" element
         */
        public boolean getEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Enabled" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Enabled" element
         */
        public boolean isSetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENABLED$2) != 0;
            }
        }
        
        /**
         * Sets the "Enabled" element
         */
        public void setEnabled(boolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLED$2);
                }
                target.setBooleanValue(enabled);
            }
        }
        
        /**
         * Sets (as xml) the "Enabled" element
         */
        public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENABLED$2);
                }
                target.set(enabled);
            }
        }
        
        /**
         * Unsets the "Enabled" element
         */
        public void unsetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENABLED$2, 0);
            }
        }
    }
}
