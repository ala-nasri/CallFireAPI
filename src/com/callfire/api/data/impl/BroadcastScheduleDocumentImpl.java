/*
 * An XML document type.
 * Localname: BroadcastSchedule
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one BroadcastSchedule(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class BroadcastScheduleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastScheduleDocument
{
    
    public BroadcastScheduleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastSchedule");
    
    
    /**
     * Gets the "BroadcastSchedule" element
     */
    public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule getBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
            target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastSchedule" element
     */
    public void setBroadcastSchedule(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule broadcastSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
            target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().find_element_user(BROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().add_element_user(BROADCASTSCHEDULE$0);
            }
            target.set(broadcastSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastSchedule" element
     */
    public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule addNewBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule target = null;
            target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule)get_store().add_element_user(BROADCASTSCHEDULE$0);
            return target;
        }
    }
    /**
     * An XML BroadcastSchedule(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class BroadcastScheduleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule
    {
        
        public BroadcastScheduleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTTIMEOFDAY$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "StartTimeOfDay");
        private static final javax.xml.namespace.QName STOPTIMEOFDAY$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "StopTimeOfDay");
        private static final javax.xml.namespace.QName TIMEZONE$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TimeZone");
        private static final javax.xml.namespace.QName BEGINDATE$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "BeginDate");
        private static final javax.xml.namespace.QName ENDDATE$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "EndDate");
        private static final javax.xml.namespace.QName DAYSOFWEEK$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "DaysOfWeek");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "StartTimeOfDay" element
         */
        public java.util.Calendar getStartTimeOfDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEOFDAY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartTimeOfDay" element
         */
        public org.apache.xmlbeans.XmlTime xgetStartTimeOfDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(STARTTIMEOFDAY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartTimeOfDay" element
         */
        public void setStartTimeOfDay(java.util.Calendar startTimeOfDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEOFDAY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIMEOFDAY$0);
                }
                target.setCalendarValue(startTimeOfDay);
            }
        }
        
        /**
         * Sets (as xml) the "StartTimeOfDay" element
         */
        public void xsetStartTimeOfDay(org.apache.xmlbeans.XmlTime startTimeOfDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(STARTTIMEOFDAY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(STARTTIMEOFDAY$0);
                }
                target.set(startTimeOfDay);
            }
        }
        
        /**
         * Gets the "StopTimeOfDay" element
         */
        public java.util.Calendar getStopTimeOfDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOPTIMEOFDAY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StopTimeOfDay" element
         */
        public org.apache.xmlbeans.XmlTime xgetStopTimeOfDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(STOPTIMEOFDAY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StopTimeOfDay" element
         */
        public void setStopTimeOfDay(java.util.Calendar stopTimeOfDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOPTIMEOFDAY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOPTIMEOFDAY$2);
                }
                target.setCalendarValue(stopTimeOfDay);
            }
        }
        
        /**
         * Sets (as xml) the "StopTimeOfDay" element
         */
        public void xsetStopTimeOfDay(org.apache.xmlbeans.XmlTime stopTimeOfDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(STOPTIMEOFDAY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(STOPTIMEOFDAY$2);
                }
                target.set(stopTimeOfDay);
            }
        }
        
        /**
         * Gets the "TimeZone" element
         */
        public java.lang.String getTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TimeZone" element
         */
        public org.apache.xmlbeans.XmlString xgetTimeZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TimeZone" element
         */
        public void setTimeZone(java.lang.String timeZone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$4);
                }
                target.setStringValue(timeZone);
            }
        }
        
        /**
         * Sets (as xml) the "TimeZone" element
         */
        public void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$4);
                }
                target.set(timeZone);
            }
        }
        
        /**
         * Gets the "BeginDate" element
         */
        public java.util.Calendar getBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "BeginDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(BEGINDATE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "BeginDate" element
         */
        public boolean isSetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEGINDATE$6) != 0;
            }
        }
        
        /**
         * Sets the "BeginDate" element
         */
        public void setBeginDate(java.util.Calendar beginDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINDATE$6);
                }
                target.setCalendarValue(beginDate);
            }
        }
        
        /**
         * Sets (as xml) the "BeginDate" element
         */
        public void xsetBeginDate(org.apache.xmlbeans.XmlDate beginDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(BEGINDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(BEGINDATE$6);
                }
                target.set(beginDate);
            }
        }
        
        /**
         * Unsets the "BeginDate" element
         */
        public void unsetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEGINDATE$6, 0);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "EndDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$8);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$8);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Unsets the "EndDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$8, 0);
            }
        }
        
        /**
         * Gets the "DaysOfWeek" element
         */
        public java.util.List getDaysOfWeek()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSOFWEEK$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "DaysOfWeek" element
         */
        public com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek xgetDaysOfWeek()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek)get_store().find_element_user(DAYSOFWEEK$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DaysOfWeek" element
         */
        public void setDaysOfWeek(java.util.List daysOfWeek)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSOFWEEK$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSOFWEEK$10);
                }
                target.setListValue(daysOfWeek);
            }
        }
        
        /**
         * Sets (as xml) the "DaysOfWeek" element
         */
        public void xsetDaysOfWeek(com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek daysOfWeek)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek target = null;
                target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek)get_store().find_element_user(DAYSOFWEEK$10, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek)get_store().add_element_user(DAYSOFWEEK$10);
                }
                target.set(daysOfWeek);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public long getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$12);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$12) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(long id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
                }
                target.setLongValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlLong id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$12);
            }
        }
        /**
         * An XML DaysOfWeek(@http://api.callfire.com/data).
         *
         * This is a list type whose items are com.callfire.api.data.DayOfWeek.
         */
        public static class DaysOfWeekImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.data.BroadcastScheduleDocument.BroadcastSchedule.DaysOfWeek
        {
            
            public DaysOfWeekImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DaysOfWeekImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
