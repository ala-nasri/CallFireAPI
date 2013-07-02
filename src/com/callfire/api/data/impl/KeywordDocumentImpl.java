/*
 * An XML document type.
 * Localname: Keyword
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.KeywordDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Keyword(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class KeywordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.KeywordDocument
{
    
    public KeywordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Keyword");
    
    
    /**
     * Gets the "Keyword" element
     */
    public com.callfire.api.data.KeywordDocument.Keyword getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.KeywordDocument.Keyword target = null;
            target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Keyword" element
     */
    public void setKeyword(com.callfire.api.data.KeywordDocument.Keyword keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.KeywordDocument.Keyword target = null;
            target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().add_element_user(KEYWORD$0);
            }
            target.set(keyword);
        }
    }
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    public com.callfire.api.data.KeywordDocument.Keyword addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.KeywordDocument.Keyword target = null;
            target = (com.callfire.api.data.KeywordDocument.Keyword)get_store().add_element_user(KEYWORD$0);
            return target;
        }
    }
    /**
     * An XML Keyword(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class KeywordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.KeywordDocument.Keyword
    {
        
        public KeywordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SHORTCODE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "ShortCode");
        private static final javax.xml.namespace.QName KEYWORD$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Keyword");
        private static final javax.xml.namespace.QName STATUS$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName LEASEINFO$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LeaseInfo");
        
        
        /**
         * Gets the "ShortCode" element
         */
        public java.lang.String getShortCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ShortCode" element
         */
        public com.callfire.api.data.PhoneNumber xgetShortCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(SHORTCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ShortCode" element
         */
        public void setShortCode(java.lang.String shortCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTCODE$0);
                }
                target.setStringValue(shortCode);
            }
        }
        
        /**
         * Sets (as xml) the "ShortCode" element
         */
        public void xsetShortCode(com.callfire.api.data.PhoneNumber shortCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(SHORTCODE$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(SHORTCODE$0);
                }
                target.set(shortCode);
            }
        }
        
        /**
         * Gets the "Keyword" element
         */
        public java.lang.String getKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Keyword" element
         */
        public org.apache.xmlbeans.XmlString xgetKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Keyword" element
         */
        public void setKeyword(java.lang.String keyword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORD$2);
                }
                target.setStringValue(keyword);
            }
        }
        
        /**
         * Sets (as xml) the "Keyword" element
         */
        public void xsetKeyword(org.apache.xmlbeans.XmlString keyword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORD$2);
                }
                target.set(keyword);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.callfire.api.data.NumberStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.NumberStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.NumberStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberStatus target = null;
                target = (com.callfire.api.data.NumberStatus)get_store().find_element_user(STATUS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$4) != 0;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.NumberStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$4);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.NumberStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberStatus target = null;
                target = (com.callfire.api.data.NumberStatus)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberStatus)get_store().add_element_user(STATUS$4);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "Status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$4, 0);
            }
        }
        
        /**
         * Gets the "LeaseInfo" element
         */
        public com.callfire.api.data.LeaseInfoDocument.LeaseInfo getLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LeaseInfo" element
         */
        public boolean isSetLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEASEINFO$6) != 0;
            }
        }
        
        /**
         * Sets the "LeaseInfo" element
         */
        public void setLeaseInfo(com.callfire.api.data.LeaseInfoDocument.LeaseInfo leaseInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$6);
                }
                target.set(leaseInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "LeaseInfo" element
         */
        public com.callfire.api.data.LeaseInfoDocument.LeaseInfo addNewLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$6);
                return target;
            }
        }
        
        /**
         * Unsets the "LeaseInfo" element
         */
        public void unsetLeaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEASEINFO$6, 0);
            }
        }
    }
}
