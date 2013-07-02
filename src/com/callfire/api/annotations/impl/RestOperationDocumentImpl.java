/*
 * An XML document type.
 * Localname: restOperation
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.RestOperationDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one restOperation(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class RestOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.RestOperationDocument
{
    
    public RestOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOPERATION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "restOperation");
    
    
    /**
     * Gets the "restOperation" element
     */
    public com.callfire.api.annotations.RestOperationDocument.RestOperation getRestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.RestOperationDocument.RestOperation target = null;
            target = (com.callfire.api.annotations.RestOperationDocument.RestOperation)get_store().find_element_user(RESTOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restOperation" element
     */
    public void setRestOperation(com.callfire.api.annotations.RestOperationDocument.RestOperation restOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.RestOperationDocument.RestOperation target = null;
            target = (com.callfire.api.annotations.RestOperationDocument.RestOperation)get_store().find_element_user(RESTOPERATION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.annotations.RestOperationDocument.RestOperation)get_store().add_element_user(RESTOPERATION$0);
            }
            target.set(restOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "restOperation" element
     */
    public com.callfire.api.annotations.RestOperationDocument.RestOperation addNewRestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.RestOperationDocument.RestOperation target = null;
            target = (com.callfire.api.annotations.RestOperationDocument.RestOperation)get_store().add_element_user(RESTOPERATION$0);
            return target;
        }
    }
    /**
     * An XML restOperation(@http://api.callfire.com/annotations).
     *
     * This is a complex type.
     */
    public static class RestOperationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.RestOperationDocument.RestOperation
    {
        
        public RestOperationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATH$0 = 
            new javax.xml.namespace.QName("", "path");
        private static final javax.xml.namespace.QName METHOD$2 = 
            new javax.xml.namespace.QName("", "method");
        
        
        /**
         * Gets the "path" attribute
         */
        public java.lang.String getPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "path" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$0);
                return target;
            }
        }
        
        /**
         * True if has "path" attribute
         */
        public boolean isSetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PATH$0) != null;
            }
        }
        
        /**
         * Sets the "path" attribute
         */
        public void setPath(java.lang.String path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$0);
                }
                target.setStringValue(path);
            }
        }
        
        /**
         * Sets (as xml) the "path" attribute
         */
        public void xsetPath(org.apache.xmlbeans.XmlString path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$0);
                }
                target.set(path);
            }
        }
        
        /**
         * Unsets the "path" attribute
         */
        public void unsetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PATH$0);
            }
        }
        
        /**
         * Gets the "method" attribute
         */
        public com.callfire.api.annotations.RestMethod.Enum getMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$2);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.annotations.RestMethod.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "method" attribute
         */
        public com.callfire.api.annotations.RestMethod xgetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.annotations.RestMethod target = null;
                target = (com.callfire.api.annotations.RestMethod)get_store().find_attribute_user(METHOD$2);
                return target;
            }
        }
        
        /**
         * True if has "method" attribute
         */
        public boolean isSetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(METHOD$2) != null;
            }
        }
        
        /**
         * Sets the "method" attribute
         */
        public void setMethod(com.callfire.api.annotations.RestMethod.Enum method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$2);
                }
                target.setEnumValue(method);
            }
        }
        
        /**
         * Sets (as xml) the "method" attribute
         */
        public void xsetMethod(com.callfire.api.annotations.RestMethod method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.annotations.RestMethod target = null;
                target = (com.callfire.api.annotations.RestMethod)get_store().find_attribute_user(METHOD$2);
                if (target == null)
                {
                    target = (com.callfire.api.annotations.RestMethod)get_store().add_attribute_user(METHOD$2);
                }
                target.set(method);
            }
        }
        
        /**
         * Unsets the "method" attribute
         */
        public void unsetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(METHOD$2);
            }
        }
    }
}
