/*
 * An XML document type.
 * Localname: GetText
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetTextDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetText(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetTextDocument
{
    
    public GetTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTEXT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetText");
    
    
    /**
     * Gets the "GetText" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetText" element
     */
    public void setGetText(com.callfire.api.service.xsd.IdRequest getText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETTEXT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETTEXT$0);
            }
            target.set(getText);
        }
    }
    
    /**
     * Appends and returns a new empty "GetText" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETTEXT$0);
            return target;
        }
    }
}
