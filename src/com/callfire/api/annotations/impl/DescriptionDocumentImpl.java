/*
 * An XML document type.
 * Localname: description
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one description(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DescriptionDocument
{
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "description");
    
    
    /**
     * Gets the "description" element
     */
    public com.callfire.api.annotations.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DescriptionDocument.Description target = null;
            target = (com.callfire.api.annotations.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.callfire.api.annotations.DescriptionDocument.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DescriptionDocument.Description target = null;
            target = (com.callfire.api.annotations.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.annotations.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public com.callfire.api.annotations.DescriptionDocument.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DescriptionDocument.Description target = null;
            target = (com.callfire.api.annotations.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML description(@http://api.callfire.com/annotations).
     *
     * This is a complex type.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DescriptionDocument.Description
    {
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
