/*
 * An XML document type.
 * Localname: GetContact
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetContact(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetContactDocument
{
    
    public GetContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCONTACT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetContact");
    
    
    /**
     * Gets the "GetContact" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetContact" element
     */
    public void setGetContact(com.callfire.api.service.xsd.IdRequest getContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCONTACT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACT$0);
            }
            target.set(getContact);
        }
    }
    
    /**
     * Appends and returns a new empty "GetContact" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCONTACT$0);
            return target;
        }
    }
}
