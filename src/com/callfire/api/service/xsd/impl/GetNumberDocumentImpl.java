/*
 * An XML document type.
 * Localname: GetNumber
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetNumber(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetNumberDocument
{
    
    public GetNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETNUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetNumber");
    
    
    /**
     * Gets the "GetNumber" element
     */
    public com.callfire.api.service.xsd.GetNumberDocument.GetNumber getGetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetNumberDocument.GetNumber target = null;
            target = (com.callfire.api.service.xsd.GetNumberDocument.GetNumber)get_store().find_element_user(GETNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetNumber" element
     */
    public void setGetNumber(com.callfire.api.service.xsd.GetNumberDocument.GetNumber getNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetNumberDocument.GetNumber target = null;
            target = (com.callfire.api.service.xsd.GetNumberDocument.GetNumber)get_store().find_element_user(GETNUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.GetNumberDocument.GetNumber)get_store().add_element_user(GETNUMBER$0);
            }
            target.set(getNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "GetNumber" element
     */
    public com.callfire.api.service.xsd.GetNumberDocument.GetNumber addNewGetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetNumberDocument.GetNumber target = null;
            target = (com.callfire.api.service.xsd.GetNumberDocument.GetNumber)get_store().add_element_user(GETNUMBER$0);
            return target;
        }
    }
    /**
     * An XML GetNumber(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class GetNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetNumberDocument.GetNumber
    {
        
        public GetNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Number");
        
        
        /**
         * Gets the "Number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Number" element
         */
        public com.callfire.api.data.PhoneNumber xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "Number" element
         */
        public void xsetNumber(com.callfire.api.data.PhoneNumber number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(NUMBER$0);
                }
                target.set(number);
            }
        }
    }
}
