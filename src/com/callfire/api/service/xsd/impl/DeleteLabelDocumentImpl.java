/*
 * An XML document type.
 * Localname: DeleteLabel
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.DeleteLabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one DeleteLabel(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class DeleteLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteLabelDocument
{
    
    public DeleteLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETELABEL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "DeleteLabel");
    
    
    /**
     * Gets the "DeleteLabel" element
     */
    public com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel getDeleteLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel target = null;
            target = (com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel)get_store().find_element_user(DELETELABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteLabel" element
     */
    public void setDeleteLabel(com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel deleteLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel target = null;
            target = (com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel)get_store().find_element_user(DELETELABEL$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel)get_store().add_element_user(DELETELABEL$0);
            }
            target.set(deleteLabel);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteLabel" element
     */
    public com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel addNewDeleteLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel target = null;
            target = (com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel)get_store().add_element_user(DELETELABEL$0);
            return target;
        }
    }
    /**
     * An XML DeleteLabel(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class DeleteLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteLabelDocument.DeleteLabel
    {
        
        public DeleteLabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LABELNAME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
        
        
        /**
         * Gets the "LabelName" element
         */
        public java.lang.String getLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LabelName" element
         */
        public org.apache.xmlbeans.XmlString xgetLabelName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LabelName" element
         */
        public void setLabelName(java.lang.String labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$0);
                }
                target.setStringValue(labelName);
            }
        }
        
        /**
         * Sets (as xml) the "LabelName" element
         */
        public void xsetLabelName(org.apache.xmlbeans.XmlString labelName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$0);
                }
                target.set(labelName);
            }
        }
    }
}
