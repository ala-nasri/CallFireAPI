/*
 * An XML document type.
 * Localname: UnlabelBroadcast
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.UnlabelBroadcastDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one UnlabelBroadcast(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class UnlabelBroadcastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.UnlabelBroadcastDocument
{
    
    public UnlabelBroadcastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNLABELBROADCAST$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "UnlabelBroadcast");
    
    
    /**
     * Gets the "UnlabelBroadcast" element
     */
    public com.callfire.api.service.xsd.IdLabelRequest getUnlabelBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().find_element_user(UNLABELBROADCAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnlabelBroadcast" element
     */
    public void setUnlabelBroadcast(com.callfire.api.service.xsd.IdLabelRequest unlabelBroadcast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().find_element_user(UNLABELBROADCAST$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().add_element_user(UNLABELBROADCAST$0);
            }
            target.set(unlabelBroadcast);
        }
    }
    
    /**
     * Appends and returns a new empty "UnlabelBroadcast" element
     */
    public com.callfire.api.service.xsd.IdLabelRequest addNewUnlabelBroadcast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdLabelRequest target = null;
            target = (com.callfire.api.service.xsd.IdLabelRequest)get_store().add_element_user(UNLABELBROADCAST$0);
            return target;
        }
    }
}
