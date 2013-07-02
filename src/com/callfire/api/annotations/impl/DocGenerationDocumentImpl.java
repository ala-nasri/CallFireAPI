/*
 * An XML document type.
 * Localname: docGeneration
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.DocGenerationDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one docGeneration(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class DocGenerationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DocGenerationDocument
{
    
    public DocGenerationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCGENERATION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "docGeneration");
    
    
    /**
     * Gets the "docGeneration" element
     */
    public com.callfire.api.annotations.DocGenerationDocument.DocGeneration getDocGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DocGenerationDocument.DocGeneration target = null;
            target = (com.callfire.api.annotations.DocGenerationDocument.DocGeneration)get_store().find_element_user(DOCGENERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "docGeneration" element
     */
    public void setDocGeneration(com.callfire.api.annotations.DocGenerationDocument.DocGeneration docGeneration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DocGenerationDocument.DocGeneration target = null;
            target = (com.callfire.api.annotations.DocGenerationDocument.DocGeneration)get_store().find_element_user(DOCGENERATION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.annotations.DocGenerationDocument.DocGeneration)get_store().add_element_user(DOCGENERATION$0);
            }
            target.set(docGeneration);
        }
    }
    
    /**
     * Appends and returns a new empty "docGeneration" element
     */
    public com.callfire.api.annotations.DocGenerationDocument.DocGeneration addNewDocGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.DocGenerationDocument.DocGeneration target = null;
            target = (com.callfire.api.annotations.DocGenerationDocument.DocGeneration)get_store().add_element_user(DOCGENERATION$0);
            return target;
        }
    }
    /**
     * An XML docGeneration(@http://api.callfire.com/annotations).
     *
     * This is a complex type.
     */
    public static class DocGenerationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.DocGenerationDocument.DocGeneration
    {
        
        public DocGenerationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HIDEDOC$0 = 
            new javax.xml.namespace.QName("", "hideDoc");
        
        
        /**
         * Gets the "hideDoc" attribute
         */
        public boolean getHideDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEDOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDEDOC$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "hideDoc" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetHideDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEDOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDEDOC$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "hideDoc" attribute
         */
        public boolean isSetHideDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HIDEDOC$0) != null;
            }
        }
        
        /**
         * Sets the "hideDoc" attribute
         */
        public void setHideDoc(boolean hideDoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEDOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDEDOC$0);
                }
                target.setBooleanValue(hideDoc);
            }
        }
        
        /**
         * Sets (as xml) the "hideDoc" attribute
         */
        public void xsetHideDoc(org.apache.xmlbeans.XmlBoolean hideDoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEDOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDEDOC$0);
                }
                target.set(hideDoc);
            }
        }
        
        /**
         * Unsets the "hideDoc" attribute
         */
        public void unsetHideDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HIDEDOC$0);
            }
        }
    }
}
