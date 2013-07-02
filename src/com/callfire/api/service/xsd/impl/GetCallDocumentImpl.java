/*
 * An XML document type.
 * Localname: GetCall
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetCallDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetCall(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetCallDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetCallDocument
{
    
    public GetCallDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCALL$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetCall");
    
    
    /**
     * Gets the "GetCall" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCall" element
     */
    public void setGetCall(com.callfire.api.service.xsd.IdRequest getCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETCALL$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCALL$0);
            }
            target.set(getCall);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCall" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETCALL$0);
            return target;
        }
    }
}
