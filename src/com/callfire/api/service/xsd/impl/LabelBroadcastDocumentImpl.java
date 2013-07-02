/*
 * An XML document type.
 * Localname: LabelBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.LabelBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one LabelBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class LabelBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.LabelBroadcastDocument
{
    
    public LabelBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelBroadcast");
    
    
    /**
     * Gets the "LabelBroadcast" element
     */
    public com.callfire.api.service.xsd.IdLabelRequest getLabelBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().find_element_user(LABELBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabelBroadcast" element
     */
    public void setLabelBroadcast(com.callfire.api.service.xsd.IdLabelRequest labelBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().find_element_user(LABELBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().add_element_user(LABELBROADCAST$0);
            }
            target.set(labelBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "LabelBroadcast" element
     */
    public com.callfire.api.service.xsd.IdLabelRequest addNewLabelBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().add_element_user(LABELBROADCAST$0);
            return target;
        }
    }
}
