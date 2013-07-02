/*
 * An XML document type.
 * Localname: LocalTimeZoneRestriction
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.LocalTimeZoneRestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one LocalTimeZoneRestriction(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class LocalTimeZoneRestrictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LocalTimeZoneRestrictionDocument
{
    
    public LocalTimeZoneRestrictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALTIMEZONERESTRICTION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "LocalTimeZoneRestriction");
    
    
    /**
     * Gets the "LocalTimeZoneRestriction" element
     */
    public com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction getLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().find_element_user(LOCALTIMEZONERESTRICTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocalTimeZoneRestriction" element
     */
    public void setLocalTimeZoneRestriction(com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction localTimeZoneRestriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().find_element_user(LOCALTIMEZONERESTRICTION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().add_element_user(LOCALTIMEZONERESTRICTION$0);
            }
            target.set(localTimeZoneRestriction);
        }
    }
    
    /**
     * Appends and returns a new empty "LocalTimeZoneRestriction" element
     */
    public com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction addNewLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().add_element_user(LOCALTIMEZONERESTRICTION$0);
            return target;
        }
    }
    /**
     * An XML LocalTimeZoneRestriction(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class LocalTimeZoneRestrictionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction
    {
        
        public LocalTimeZoneRestrictionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEGINTIME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BeginTime");
        private static final javax.xml.namespace.QName ENDTIME$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "EndTime");
        
        
        /**
         * Gets the "BeginTime" element
         */
        public java.util.Calendar getBeginTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINTIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "BeginTime" element
         */
        public org.apache.xmlbeans.XmlTime xgetBeginTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(BEGINTIME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "BeginTime" element
         */
        public boolean isSetBeginTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEGINTIME$0) != 0;
            }
        }
        
        /**
         * Sets the "BeginTime" element
         */
        public void setBeginTime(java.util.Calendar beginTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINTIME$0);
                }
                target.setCalendarValue(beginTime);
            }
        }
        
        /**
         * Sets (as xml) the "BeginTime" element
         */
        public void xsetBeginTime(org.apache.xmlbeans.XmlTime beginTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(BEGINTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(BEGINTIME$0);
                }
                target.set(beginTime);
            }
        }
        
        /**
         * Unsets the "BeginTime" element
         */
        public void unsetBeginTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEGINTIME$0, 0);
            }
        }
        
        /**
         * Gets the "EndTime" element
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndTime" element
         */
        public org.apache.xmlbeans.XmlTime xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(ENDTIME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "EndTime" element
         */
        public boolean isSetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDTIME$2) != 0;
            }
        }
        
        /**
         * Sets the "EndTime" element
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$2);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "EndTime" element
         */
        public void xsetEndTime(org.apache.xmlbeans.XmlTime endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(ENDTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(ENDTIME$2);
                }
                target.set(endTime);
            }
        }
        
        /**
         * Unsets the "EndTime" element
         */
        public void unsetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDTIME$2, 0);
            }
        }
    }
}
