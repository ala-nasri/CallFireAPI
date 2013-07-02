/*
 * An XML document type.
 * Localname: Label
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.LabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Label(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class LabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LabelDocument
{
    
    public LabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Label");
    
    
    /**
     * Gets the "Label" element
     */
    public com.callfire.api.data.LabelDocument.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LabelDocument.Label target = null;
            target = (com.callfire.api.data.LabelDocument.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(com.callfire.api.data.LabelDocument.Label label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LabelDocument.Label target = null;
            target = (com.callfire.api.data.LabelDocument.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.LabelDocument.Label)get_store().add_element_user(LABEL$0);
            }
            target.set(label);
        }
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public com.callfire.api.data.LabelDocument.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LabelDocument.Label target = null;
            target = (com.callfire.api.data.LabelDocument.Label)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
    /**
     * An XML Label(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class LabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LabelDocument.Label
    {
        
        public LabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Name");
        
        
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
    }
}
