/*
 * An XML document type.
 * Localname: TextRecord
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.TextRecordDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one TextRecord(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class TextRecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.TextRecordDocument
{
    
    public TextRecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTRECORD$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "TextRecord");
    
    
    /**
     * Gets the "TextRecord" element
     */
    public com.callfire.api.data.TextRecordDocument.TextRecord getTextRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextRecordDocument.TextRecord target = null;
            target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().find_element_user(TEXTRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TextRecord" element
     */
    public void setTextRecord(com.callfire.api.data.TextRecordDocument.TextRecord textRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextRecordDocument.TextRecord target = null;
            target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().find_element_user(TEXTRECORD$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().add_element_user(TEXTRECORD$0);
            }
            target.set(textRecord);
        }
    }
    
    /**
     * Appends and returns a new empty "TextRecord" element
     */
    public com.callfire.api.data.TextRecordDocument.TextRecord addNewTextRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextRecordDocument.TextRecord target = null;
            target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().add_element_user(TEXTRECORD$0);
            return target;
        }
    }
    /**
     * An XML TextRecord(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class TextRecordImpl extends com.callfire.api.data.impl.ActionRecordImpl implements com.callfire.api.data.TextRecordDocument.TextRecord
    {
        
        public TextRecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Message");
        
        
        /**
         * Gets the "Message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Message" element
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Message" element
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "Message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
                }
                target.set(message);
            }
        }
    }
}
