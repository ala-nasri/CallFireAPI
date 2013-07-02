/*
 * An XML document type.
 * Localname: LeaseInfo
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.LeaseInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one LeaseInfo(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class LeaseInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LeaseInfoDocument
{
    
    public LeaseInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEASEINFO$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "LeaseInfo");
    
    
    /**
     * Gets the "LeaseInfo" element
     */
    public com.callfire.api.data.LeaseInfoDocument.LeaseInfo getLeaseInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LeaseInfoDocument.LeaseInfo target = null;
            target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().find_element_user(LEASEINFO$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$0);
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
            target = (com.callfire.api.data.LeaseInfoDocument.LeaseInfo)get_store().add_element_user(LEASEINFO$0);
            return target;
        }
    }
    /**
     * An XML LeaseInfo(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class LeaseInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LeaseInfoDocument.LeaseInfo
    {
        
        public LeaseInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEASEBEGIN$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LeaseBegin");
        private static final javax.xml.namespace.QName LEASEEND$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LeaseEnd");
        private static final javax.xml.namespace.QName AUTORENEW$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "AutoRenew");
        
        
        /**
         * Gets the "LeaseBegin" element
         */
        public java.util.Calendar getLeaseBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEASEBEGIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "LeaseBegin" element
         */
        public org.apache.xmlbeans.XmlDate xgetLeaseBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LEASEBEGIN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LeaseBegin" element
         */
        public boolean isSetLeaseBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEASEBEGIN$0) != 0;
            }
        }
        
        /**
         * Sets the "LeaseBegin" element
         */
        public void setLeaseBegin(java.util.Calendar leaseBegin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEASEBEGIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEASEBEGIN$0);
                }
                target.setCalendarValue(leaseBegin);
            }
        }
        
        /**
         * Sets (as xml) the "LeaseBegin" element
         */
        public void xsetLeaseBegin(org.apache.xmlbeans.XmlDate leaseBegin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LEASEBEGIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LEASEBEGIN$0);
                }
                target.set(leaseBegin);
            }
        }
        
        /**
         * Unsets the "LeaseBegin" element
         */
        public void unsetLeaseBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEASEBEGIN$0, 0);
            }
        }
        
        /**
         * Gets the "LeaseEnd" element
         */
        public java.util.Calendar getLeaseEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEASEEND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "LeaseEnd" element
         */
        public org.apache.xmlbeans.XmlDate xgetLeaseEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LEASEEND$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "LeaseEnd" element
         */
        public boolean isSetLeaseEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEASEEND$2) != 0;
            }
        }
        
        /**
         * Sets the "LeaseEnd" element
         */
        public void setLeaseEnd(java.util.Calendar leaseEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEASEEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEASEEND$2);
                }
                target.setCalendarValue(leaseEnd);
            }
        }
        
        /**
         * Sets (as xml) the "LeaseEnd" element
         */
        public void xsetLeaseEnd(org.apache.xmlbeans.XmlDate leaseEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LEASEEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LEASEEND$2);
                }
                target.set(leaseEnd);
            }
        }
        
        /**
         * Unsets the "LeaseEnd" element
         */
        public void unsetLeaseEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEASEEND$2, 0);
            }
        }
        
        /**
         * Gets the "AutoRenew" element
         */
        public boolean getAutoRenew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTORENEW$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "AutoRenew" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAutoRenew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTORENEW$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AutoRenew" element
         */
        public void setAutoRenew(boolean autoRenew)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTORENEW$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTORENEW$4);
                }
                target.setBooleanValue(autoRenew);
            }
        }
        
        /**
         * Sets (as xml) the "AutoRenew" element
         */
        public void xsetAutoRenew(org.apache.xmlbeans.XmlBoolean autoRenew)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTORENEW$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTORENEW$4);
                }
                target.set(autoRenew);
            }
        }
    }
}
