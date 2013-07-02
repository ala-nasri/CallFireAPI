/*
 * An XML document type.
 * Localname: GetBroadcastStats
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetBroadcastStatsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetBroadcastStats(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetBroadcastStatsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetBroadcastStatsDocument
{
    
    public GetBroadcastStatsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBROADCASTSTATS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetBroadcastStats");
    
    
    /**
     * Gets the "GetBroadcastStats" element
     */
    public com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats getGetBroadcastStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats target = null;
            target = (com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats)get_store().find_element_user(GETBROADCASTSTATS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBroadcastStats" element
     */
    public void setGetBroadcastStats(com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats getBroadcastStats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats target = null;
            target = (com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats)get_store().find_element_user(GETBROADCASTSTATS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats)get_store().add_element_user(GETBROADCASTSTATS$0);
            }
            target.set(getBroadcastStats);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBroadcastStats" element
     */
    public com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats addNewGetBroadcastStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats target = null;
            target = (com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats)get_store().add_element_user(GETBROADCASTSTATS$0);
            return target;
        }
    }
    /**
     * An XML GetBroadcastStats(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class GetBroadcastStatsImpl extends com.callfire.api.service.xsd.impl.IdRequestImpl implements com.callfire.api.service.xsd.GetBroadcastStatsDocument.GetBroadcastStats
    {
        
        public GetBroadcastStatsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERVALBEGIN$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "IntervalBegin");
        private static final javax.xml.namespace.QName INTERVALEND$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "IntervalEnd");
        
        
        /**
         * Gets the "IntervalBegin" element
         */
        public java.util.Calendar getIntervalBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBEGIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntervalBegin" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetIntervalBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALBEGIN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntervalBegin" element
         */
        public boolean isSetIntervalBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERVALBEGIN$0) != 0;
            }
        }
        
        /**
         * Sets the "IntervalBegin" element
         */
        public void setIntervalBegin(java.util.Calendar intervalBegin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBEGIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALBEGIN$0);
                }
                target.setCalendarValue(intervalBegin);
            }
        }
        
        /**
         * Sets (as xml) the "IntervalBegin" element
         */
        public void xsetIntervalBegin(org.apache.xmlbeans.XmlDateTime intervalBegin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALBEGIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(INTERVALBEGIN$0);
                }
                target.set(intervalBegin);
            }
        }
        
        /**
         * Unsets the "IntervalBegin" element
         */
        public void unsetIntervalBegin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERVALBEGIN$0, 0);
            }
        }
        
        /**
         * Gets the "IntervalEnd" element
         */
        public java.util.Calendar getIntervalEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALEND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntervalEnd" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetIntervalEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALEND$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntervalEnd" element
         */
        public boolean isSetIntervalEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERVALEND$2) != 0;
            }
        }
        
        /**
         * Sets the "IntervalEnd" element
         */
        public void setIntervalEnd(java.util.Calendar intervalEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALEND$2);
                }
                target.setCalendarValue(intervalEnd);
            }
        }
        
        /**
         * Sets (as xml) the "IntervalEnd" element
         */
        public void xsetIntervalEnd(org.apache.xmlbeans.XmlDateTime intervalEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(INTERVALEND$2);
                }
                target.set(intervalEnd);
            }
        }
        
        /**
         * Unsets the "IntervalEnd" element
         */
        public void unsetIntervalEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERVALEND$2, 0);
            }
        }
    }
}
