/*
 * An XML document type.
 * Localname: ContactHistory
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ContactHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one ContactHistory(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class ContactHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactHistoryDocument
{
    
    public ContactHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTHISTORY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactHistory");
    
    
    /**
     * Gets the "ContactHistory" element
     */
    public com.callfire.api.data.ContactHistoryDocument.ContactHistory getContactHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactHistoryDocument.ContactHistory target = null;
            target = (com.callfire.api.data.ContactHistoryDocument.ContactHistory)get_store().find_element_user(CONTACTHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactHistory" element
     */
    public void setContactHistory(com.callfire.api.data.ContactHistoryDocument.ContactHistory contactHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactHistoryDocument.ContactHistory target = null;
            target = (com.callfire.api.data.ContactHistoryDocument.ContactHistory)get_store().find_element_user(CONTACTHISTORY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ContactHistoryDocument.ContactHistory)get_store().add_element_user(CONTACTHISTORY$0);
            }
            target.set(contactHistory);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactHistory" element
     */
    public com.callfire.api.data.ContactHistoryDocument.ContactHistory addNewContactHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ContactHistoryDocument.ContactHistory target = null;
            target = (com.callfire.api.data.ContactHistoryDocument.ContactHistory)get_store().add_element_user(CONTACTHISTORY$0);
            return target;
        }
    }
    /**
     * An XML ContactHistory(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class ContactHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ContactHistoryDocument.ContactHistory
    {
        
        public ContactHistoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALL$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Call");
        private static final javax.xml.namespace.QName TEXT$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Text");
        
        
        /**
         * Gets array of all "Call" elements
         */
        public com.callfire.api.data.CallDocument.Call[] getCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CALL$0, targetList);
                com.callfire.api.data.CallDocument.Call[] result = new com.callfire.api.data.CallDocument.Call[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Call" element
         */
        public com.callfire.api.data.CallDocument.Call getCallArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Call" element
         */
        public int sizeOfCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALL$0);
            }
        }
        
        /**
         * Sets array of all "Call" element
         */
        public void setCallArray(com.callfire.api.data.CallDocument.Call[] callArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(callArray, CALL$0);
            }
        }
        
        /**
         * Sets ith "Call" element
         */
        public void setCallArray(int i, com.callfire.api.data.CallDocument.Call call)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().find_element_user(CALL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(call);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Call" element
         */
        public com.callfire.api.data.CallDocument.Call insertNewCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().insert_element_user(CALL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Call" element
         */
        public com.callfire.api.data.CallDocument.Call addNewCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.CallDocument.Call target = null;
                target = (com.callfire.api.data.CallDocument.Call)get_store().add_element_user(CALL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Call" element
         */
        public void removeCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALL$0, i);
            }
        }
        
        /**
         * Gets array of all "Text" elements
         */
        public com.callfire.api.data.TextDocument.Text[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$2, targetList);
                com.callfire.api.data.TextDocument.Text[] result = new com.callfire.api.data.TextDocument.Text[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Text" element
         */
        public com.callfire.api.data.TextDocument.Text getTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Text" element
         */
        public int sizeOfTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$2);
            }
        }
        
        /**
         * Sets array of all "Text" element
         */
        public void setTextArray(com.callfire.api.data.TextDocument.Text[] textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$2);
            }
        }
        
        /**
         * Sets ith "Text" element
         */
        public void setTextArray(int i, com.callfire.api.data.TextDocument.Text text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().find_element_user(TEXT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(text);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Text" element
         */
        public com.callfire.api.data.TextDocument.Text insertNewText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().insert_element_user(TEXT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Text" element
         */
        public com.callfire.api.data.TextDocument.Text addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.TextDocument.Text target = null;
                target = (com.callfire.api.data.TextDocument.Text)get_store().add_element_user(TEXT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Text" element
         */
        public void removeText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$2, i);
            }
        }
    }
}
