/*
 * An XML document type.
 * Localname: AutoReply
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.AutoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one AutoReply(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class AutoReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.AutoReplyDocument
{
    
    public AutoReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOREPLY$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "AutoReply");
    
    
    /**
     * Gets the "AutoReply" element
     */
    public com.callfire.api.data.AutoReplyDocument.AutoReply getAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
            target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AutoReply" element
     */
    public void setAutoReply(com.callfire.api.data.AutoReplyDocument.AutoReply autoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
            target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().find_element_user(AUTOREPLY$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().add_element_user(AUTOREPLY$0);
            }
            target.set(autoReply);
        }
    }
    
    /**
     * Appends and returns a new empty "AutoReply" element
     */
    public com.callfire.api.data.AutoReplyDocument.AutoReply addNewAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.AutoReplyDocument.AutoReply target = null;
            target = (com.callfire.api.data.AutoReplyDocument.AutoReply)get_store().add_element_user(AUTOREPLY$0);
            return target;
        }
    }
    /**
     * An XML AutoReply(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class AutoReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.AutoReplyDocument.AutoReply
    {
        
        public AutoReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Number");
        private static final javax.xml.namespace.QName KEYWORD$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Keyword");
        private static final javax.xml.namespace.QName MATCH$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Match");
        private static final javax.xml.namespace.QName MESSAGE$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Message");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Number" element
         */
        public com.callfire.api.data.PhoneNumber xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Number" element
         */
        public boolean isSetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "Number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "Number" element
         */
        public void xsetNumber(com.callfire.api.data.PhoneNumber number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumber target = null;
                target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(NUMBER$0);
                }
                target.set(number);
            }
        }
        
        /**
         * Unsets the "Number" element
         */
        public void unsetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBER$0, 0);
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
         * True if has "Keyword" element
         */
        public boolean isSetKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$2) != 0;
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
         * Unsets the "Keyword" element
         */
        public void unsetKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$2, 0);
            }
        }
        
        /**
         * Gets the "Match" element
         */
        public java.lang.String getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Match" element
         */
        public org.apache.xmlbeans.XmlString xgetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Match" element
         */
        public void setMatch(java.lang.String match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCH$4);
                }
                target.setStringValue(match);
            }
        }
        
        /**
         * Sets (as xml) the "Match" element
         */
        public void xsetMatch(org.apache.xmlbeans.XmlString match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCH$4);
                }
                target.set(match);
            }
        }
        
        /**
         * Gets the "Message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$6);
                }
                target.set(message);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
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
                return get_store().find_attribute_user(ID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$8);
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
                get_store().remove_attribute(ID$8);
            }
        }
    }
}
