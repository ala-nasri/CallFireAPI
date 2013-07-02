/*
 * An XML document type.
 * Localname: QuerySoundMeta
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.QuerySoundMetaDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one QuerySoundMeta(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class QuerySoundMetaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.QuerySoundMetaDocument
{
    
    public QuerySoundMetaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSOUNDMETA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "QuerySoundMeta");
    
    
    /**
     * Gets the "QuerySoundMeta" element
     */
    public com.callfire.api.service.xsd.Query getQuerySoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYSOUNDMETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuerySoundMeta" element
     */
    public void setQuerySoundMeta(com.callfire.api.service.xsd.Query querySoundMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().find_element_user(QUERYSOUNDMETA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYSOUNDMETA$0);
            }
            target.set(querySoundMeta);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySoundMeta" element
     */
    public com.callfire.api.service.xsd.Query addNewQuerySoundMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.Query target = null;
            target = (com.callfire.api.service.xsd.Query)get_store().add_element_user(QUERYSOUNDMETA$0);
            return target;
        }
    }
}
