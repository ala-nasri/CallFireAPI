/*
 * An XML document type.
 * Localname: Text
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.TextDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one Text(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.TextDocument
{
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Text");
    
    
    /**
     * Gets the "Text" element
     */
    public com.callfire.api.data.TextDocument.Text getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextDocument.Text target = null;
            target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(com.callfire.api.data.TextDocument.Text text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextDocument.Text target = null;
            target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.TextDocument.Text)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "Text" element
     */
    public com.callfire.api.data.TextDocument.Text addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.TextDocument.Text target = null;
            target = (com.callfire.api.data.TextDocument.Text)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    /**
     * An XML Text(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class TextImpl extends com.callfire.api.data.impl.ActionImpl implements com.callfire.api.data.TextDocument.Text
    {
        
        public TextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Message");
        private static final javax.xml.namespace.QName TEXTRECORD$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TextRecord");
        
        
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
         * True if has "Message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$0) != 0;
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
        
        /**
         * Unsets the "Message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$0, 0);
            }
        }
        
        /**
         * Gets array of all "TextRecord" elements
         */
        public com.callfire.api.data.TextRecordDocument.TextRecord[] getTextRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXTRECORD$2, targetList);
                com.callfire.api.data.TextRecordDocument.TextRecord[] result = new com.callfire.api.data.TextRecordDocument.TextRecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TextRecord" element
         */
        public com.callfire.api.data.TextRecordDocument.TextRecord getTextRecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextRecordDocument.TextRecord target = null;
                target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().find_element_user(TEXTRECORD$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TextRecord" element
         */
        public int sizeOfTextRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTRECORD$2);
            }
        }
        
        /**
         * Sets array of all "TextRecord" element
         */
        public void setTextRecordArray(com.callfire.api.data.TextRecordDocument.TextRecord[] textRecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textRecordArray, TEXTRECORD$2);
            }
        }
        
        /**
         * Sets ith "TextRecord" element
         */
        public void setTextRecordArray(int i, com.callfire.api.data.TextRecordDocument.TextRecord textRecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextRecordDocument.TextRecord target = null;
                target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().find_element_user(TEXTRECORD$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(textRecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TextRecord" element
         */
        public com.callfire.api.data.TextRecordDocument.TextRecord insertNewTextRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextRecordDocument.TextRecord target = null;
                target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().insert_element_user(TEXTRECORD$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TextRecord" element
         */
        public com.callfire.api.data.TextRecordDocument.TextRecord addNewTextRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextRecordDocument.TextRecord target = null;
                target = (com.callfire.api.data.TextRecordDocument.TextRecord)get_store().add_element_user(TEXTRECORD$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "TextRecord" element
         */
        public void removeTextRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTRECORD$2, i);
            }
        }
    }
}
