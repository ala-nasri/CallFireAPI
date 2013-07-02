/*
 * An XML document type.
 * Localname: condition
 * Namespace: http://api.callfire.com/annotations
 * Java type: com.callfire.api.annotations.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.annotations.impl;
/**
 * A document containing one condition(@http://api.callfire.com/annotations) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.ConditionDocument
{
    
    public ConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/annotations", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public com.callfire.api.annotations.ConditionDocument.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.ConditionDocument.Condition target = null;
            target = (com.callfire.api.annotations.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(com.callfire.api.annotations.ConditionDocument.Condition condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.ConditionDocument.Condition target = null;
            target = (com.callfire.api.annotations.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.annotations.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
            }
            target.set(condition);
        }
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public com.callfire.api.annotations.ConditionDocument.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.annotations.ConditionDocument.Condition target = null;
            target = (com.callfire.api.annotations.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    /**
     * An XML condition(@http://api.callfire.com/annotations).
     *
     * This is a complex type.
     */
    public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.annotations.ConditionDocument.Condition
    {
        
        public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "field" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(org.apache.xmlbeans.XmlAnySimpleType field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FIELD$0);
                }
                target.set(field);
            }
        }
        
        /**
         * Appends and returns a new empty "field" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$2);
                return target;
            }
        }
    }
}
