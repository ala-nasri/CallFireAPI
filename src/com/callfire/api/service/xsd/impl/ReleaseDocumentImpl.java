/*
 * An XML document type.
 * Localname: Release
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ReleaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one Release(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class ReleaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ReleaseDocument
{
    
    public ReleaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELEASE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Release");
    
    
    /**
     * Gets the "Release" element
     */
    public com.callfire.api.service.xsd.ReleaseDocument.Release getRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ReleaseDocument.Release target = null;
            target = (com.callfire.api.service.xsd.ReleaseDocument.Release)get_store().find_element_user(RELEASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Release" element
     */
    public void setRelease(com.callfire.api.service.xsd.ReleaseDocument.Release release)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ReleaseDocument.Release target = null;
            target = (com.callfire.api.service.xsd.ReleaseDocument.Release)get_store().find_element_user(RELEASE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ReleaseDocument.Release)get_store().add_element_user(RELEASE$0);
            }
            target.set(release);
        }
    }
    
    /**
     * Appends and returns a new empty "Release" element
     */
    public com.callfire.api.service.xsd.ReleaseDocument.Release addNewRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ReleaseDocument.Release target = null;
            target = (com.callfire.api.service.xsd.ReleaseDocument.Release)get_store().add_element_user(RELEASE$0);
            return target;
        }
    }
    /**
     * An XML Release(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class ReleaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.ReleaseDocument.Release
    {
        
        public ReleaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBERS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Numbers");
        private static final javax.xml.namespace.QName KEYWORDS$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Keywords");
        
        
        /**
         * Gets the "Numbers" element
         */
        public java.util.List getNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Numbers" element
         */
        public com.callfire.api.data.PhoneNumberList xgetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumberList target = null;
                target = (com.callfire.api.data.PhoneNumberList)get_store().find_element_user(NUMBERS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Numbers" element
         */
        public boolean isSetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBERS$0) != 0;
            }
        }
        
        /**
         * Sets the "Numbers" element
         */
        public void setNumbers(java.util.List numbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERS$0);
                }
                target.setListValue(numbers);
            }
        }
        
        /**
         * Sets (as xml) the "Numbers" element
         */
        public void xsetNumbers(com.callfire.api.data.PhoneNumberList numbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumberList target = null;
                target = (com.callfire.api.data.PhoneNumberList)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumberList)get_store().add_element_user(NUMBERS$0);
                }
                target.set(numbers);
            }
        }
        
        /**
         * Unsets the "Numbers" element
         */
        public void unsetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBERS$0, 0);
            }
        }
        
        /**
         * Gets the "Keywords" element
         */
        public java.util.List getKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Keywords" element
         */
        public com.callfire.api.data.KeywordList xgetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Keywords" element
         */
        public boolean isSetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORDS$2) != 0;
            }
        }
        
        /**
         * Sets the "Keywords" element
         */
        public void setKeywords(java.util.List keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$2);
                }
                target.setListValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) the "Keywords" element
         */
        public void xsetKeywords(com.callfire.api.data.KeywordList keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.KeywordList)get_store().add_element_user(KEYWORDS$2);
                }
                target.set(keywords);
            }
        }
        
        /**
         * Unsets the "Keywords" element
         */
        public void unsetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORDS$2, 0);
            }
        }
    }
}
