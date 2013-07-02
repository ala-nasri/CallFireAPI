/*
 * An XML document type.
 * Localname: CallRecord
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.CallRecordDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one CallRecord(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class CallRecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.CallRecordDocument
{
    
    public CallRecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLRECORD$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "CallRecord");
    
    
    /**
     * Gets the "CallRecord" element
     */
    public com.callfire.api.data.CallRecordDocument.CallRecord getCallRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallRecordDocument.CallRecord target = null;
            target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().find_element_user(CALLRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CallRecord" element
     */
    public void setCallRecord(com.callfire.api.data.CallRecordDocument.CallRecord callRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallRecordDocument.CallRecord target = null;
            target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().find_element_user(CALLRECORD$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().add_element_user(CALLRECORD$0);
            }
            target.set(callRecord);
        }
    }
    
    /**
     * Appends and returns a new empty "CallRecord" element
     */
    public com.callfire.api.data.CallRecordDocument.CallRecord addNewCallRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.CallRecordDocument.CallRecord target = null;
            target = (com.callfire.api.data.CallRecordDocument.CallRecord)get_store().add_element_user(CALLRECORD$0);
            return target;
        }
    }
    /**
     * An XML CallRecord(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class CallRecordImpl extends com.callfire.api.data.impl.ActionRecordImpl implements com.callfire.api.data.CallRecordDocument.CallRecord
    {
        
        public CallRecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORIGINATETIME$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "OriginateTime");
        private static final javax.xml.namespace.QName ANSWERTIME$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "AnswerTime");
        private static final javax.xml.namespace.QName DURATION$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Duration");
        private static final javax.xml.namespace.QName RECORDINGMETA$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "RecordingMeta");
        
        
        /**
         * Gets the "OriginateTime" element
         */
        public java.util.Calendar getOriginateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATETIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OriginateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetOriginateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORIGINATETIME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OriginateTime" element
         */
        public boolean isSetOriginateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGINATETIME$0) != 0;
            }
        }
        
        /**
         * Sets the "OriginateTime" element
         */
        public void setOriginateTime(java.util.Calendar originateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATETIME$0);
                }
                target.setCalendarValue(originateTime);
            }
        }
        
        /**
         * Sets (as xml) the "OriginateTime" element
         */
        public void xsetOriginateTime(org.apache.xmlbeans.XmlDateTime originateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORIGINATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORIGINATETIME$0);
                }
                target.set(originateTime);
            }
        }
        
        /**
         * Unsets the "OriginateTime" element
         */
        public void unsetOriginateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGINATETIME$0, 0);
            }
        }
        
        /**
         * Gets the "AnswerTime" element
         */
        public java.util.Calendar getAnswerTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWERTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AnswerTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetAnswerTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ANSWERTIME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "AnswerTime" element
         */
        public boolean isSetAnswerTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANSWERTIME$2) != 0;
            }
        }
        
        /**
         * Sets the "AnswerTime" element
         */
        public void setAnswerTime(java.util.Calendar answerTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWERTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANSWERTIME$2);
                }
                target.setCalendarValue(answerTime);
            }
        }
        
        /**
         * Sets (as xml) the "AnswerTime" element
         */
        public void xsetAnswerTime(org.apache.xmlbeans.XmlDateTime answerTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ANSWERTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ANSWERTIME$2);
                }
                target.set(answerTime);
            }
        }
        
        /**
         * Unsets the "AnswerTime" element
         */
        public void unsetAnswerTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANSWERTIME$2, 0);
            }
        }
        
        /**
         * Gets the "Duration" element
         */
        public int getDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Duration" element
         */
        public org.apache.xmlbeans.XmlInt xgetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Duration" element
         */
        public void setDuration(int duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$4);
                }
                target.setIntValue(duration);
            }
        }
        
        /**
         * Sets (as xml) the "Duration" element
         */
        public void xsetDuration(org.apache.xmlbeans.XmlInt duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DURATION$4);
                }
                target.set(duration);
            }
        }
        
        /**
         * Gets array of all "RecordingMeta" elements
         */
        public com.callfire.api.data.RecordingMetaDocument.RecordingMeta[] getRecordingMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RECORDINGMETA$6, targetList);
                com.callfire.api.data.RecordingMetaDocument.RecordingMeta[] result = new com.callfire.api.data.RecordingMetaDocument.RecordingMeta[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RecordingMeta" element
         */
        public com.callfire.api.data.RecordingMetaDocument.RecordingMeta getRecordingMetaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
                target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().find_element_user(RECORDINGMETA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RecordingMeta" element
         */
        public int sizeOfRecordingMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINGMETA$6);
            }
        }
        
        /**
         * Sets array of all "RecordingMeta" element
         */
        public void setRecordingMetaArray(com.callfire.api.data.RecordingMetaDocument.RecordingMeta[] recordingMetaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recordingMetaArray, RECORDINGMETA$6);
            }
        }
        
        /**
         * Sets ith "RecordingMeta" element
         */
        public void setRecordingMetaArray(int i, com.callfire.api.data.RecordingMetaDocument.RecordingMeta recordingMeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
                target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().find_element_user(RECORDINGMETA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(recordingMeta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RecordingMeta" element
         */
        public com.callfire.api.data.RecordingMetaDocument.RecordingMeta insertNewRecordingMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
                target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().insert_element_user(RECORDINGMETA$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RecordingMeta" element
         */
        public com.callfire.api.data.RecordingMetaDocument.RecordingMeta addNewRecordingMeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.RecordingMetaDocument.RecordingMeta target = null;
                target = (com.callfire.api.data.RecordingMetaDocument.RecordingMeta)get_store().add_element_user(RECORDINGMETA$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "RecordingMeta" element
         */
        public void removeRecordingMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINGMETA$6, i);
            }
        }
    }
}
