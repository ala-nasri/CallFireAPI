/*
 * An XML document type.
 * Localname: GetSoundMeta
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetSoundMetaDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetSoundMeta(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetSoundMetaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetSoundMetaDocument
{
    
    public GetSoundMetaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOUNDMETA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetSoundMeta");
    
    
    /**
     * Gets the "GetSoundMeta" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetSoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETSOUNDMETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSoundMeta" element
     */
    public void setGetSoundMeta(com.callfire.api.service.xsd.IdRequest getSoundMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETSOUNDMETA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETSOUNDMETA$0);
            }
            target.set(getSoundMeta);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSoundMeta" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetSoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETSOUNDMETA$0);
            return target;
        }
    }
}
