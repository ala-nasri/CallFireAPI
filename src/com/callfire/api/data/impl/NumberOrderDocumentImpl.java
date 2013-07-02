/*
 * An XML document type.
 * Localname: NumberOrder
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one NumberOrder(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class NumberOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberOrderDocument
{
    
    public NumberOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERORDER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "NumberOrder");
    
    
    /**
     * Gets the "NumberOrder" element
     */
    public com.callfire.api.data.NumberOrderDocument.NumberOrder getNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberOrderDocument.NumberOrder target = null;
            target = (com.callfire.api.data.NumberOrderDocument.NumberOrder)get_store().find_element_user(NUMBERORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NumberOrder" element
     */
    public void setNumberOrder(com.callfire.api.data.NumberOrderDocument.NumberOrder numberOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberOrderDocument.NumberOrder target = null;
            target = (com.callfire.api.data.NumberOrderDocument.NumberOrder)get_store().find_element_user(NUMBERORDER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.NumberOrderDocument.NumberOrder)get_store().add_element_user(NUMBERORDER$0);
            }
            target.set(numberOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "NumberOrder" element
     */
    public com.callfire.api.data.NumberOrderDocument.NumberOrder addNewNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberOrderDocument.NumberOrder target = null;
            target = (com.callfire.api.data.NumberOrderDocument.NumberOrder)get_store().add_element_user(NUMBERORDER$0);
            return target;
        }
    }
    /**
     * An XML NumberOrder(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class NumberOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberOrderDocument.NumberOrder
    {
        
        public NumberOrderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Status");
        private static final javax.xml.namespace.QName CREATED$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
        private static final javax.xml.namespace.QName TOTALCOST$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TotalCost");
        private static final javax.xml.namespace.QName LOCALNUMBERS$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "LocalNumbers");
        private static final javax.xml.namespace.QName TOLLFREENUMBERS$8 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "TollFreeNumbers");
        private static final javax.xml.namespace.QName KEYWORDS$10 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Keywords");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Status" element
         */
        public com.callfire.api.data.OrderStatus.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.data.OrderStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public com.callfire.api.data.OrderStatus xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.OrderStatus target = null;
                target = (com.callfire.api.data.OrderStatus)get_store().find_element_user(STATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.callfire.api.data.OrderStatus.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(com.callfire.api.data.OrderStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.OrderStatus target = null;
                target = (com.callfire.api.data.OrderStatus)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.OrderStatus)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "Created" element
         */
        public java.util.Calendar getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Created" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Created" element
         */
        public void setCreated(java.util.Calendar created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$2);
                }
                target.setCalendarValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "Created" element
         */
        public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$2);
                }
                target.set(created);
            }
        }
        
        /**
         * Gets the "TotalCost" element
         */
        public float getTotalCost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCOST$4, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "TotalCost" element
         */
        public org.apache.xmlbeans.XmlFloat xgetTotalCost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TOTALCOST$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TotalCost" element
         */
        public void setTotalCost(float totalCost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCOST$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCOST$4);
                }
                target.setFloatValue(totalCost);
            }
        }
        
        /**
         * Sets (as xml) the "TotalCost" element
         */
        public void xsetTotalCost(org.apache.xmlbeans.XmlFloat totalCost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TOTALCOST$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(TOTALCOST$4);
                }
                target.set(totalCost);
            }
        }
        
        /**
         * Gets the "LocalNumbers" element
         */
        public com.callfire.api.data.NumberOrderItem getLocalNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(LOCALNUMBERS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LocalNumbers" element
         */
        public boolean isSetLocalNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALNUMBERS$6) != 0;
            }
        }
        
        /**
         * Sets the "LocalNumbers" element
         */
        public void setLocalNumbers(com.callfire.api.data.NumberOrderItem localNumbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(LOCALNUMBERS$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(LOCALNUMBERS$6);
                }
                target.set(localNumbers);
            }
        }
        
        /**
         * Appends and returns a new empty "LocalNumbers" element
         */
        public com.callfire.api.data.NumberOrderItem addNewLocalNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(LOCALNUMBERS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "LocalNumbers" element
         */
        public void unsetLocalNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALNUMBERS$6, 0);
            }
        }
        
        /**
         * Gets the "TollFreeNumbers" element
         */
        public com.callfire.api.data.NumberOrderItem getTollFreeNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(TOLLFREENUMBERS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TollFreeNumbers" element
         */
        public boolean isSetTollFreeNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOLLFREENUMBERS$8) != 0;
            }
        }
        
        /**
         * Sets the "TollFreeNumbers" element
         */
        public void setTollFreeNumbers(com.callfire.api.data.NumberOrderItem tollFreeNumbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(TOLLFREENUMBERS$8, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(TOLLFREENUMBERS$8);
                }
                target.set(tollFreeNumbers);
            }
        }
        
        /**
         * Appends and returns a new empty "TollFreeNumbers" element
         */
        public com.callfire.api.data.NumberOrderItem addNewTollFreeNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(TOLLFREENUMBERS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "TollFreeNumbers" element
         */
        public void unsetTollFreeNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOLLFREENUMBERS$8, 0);
            }
        }
        
        /**
         * Gets the "Keywords" element
         */
        public com.callfire.api.data.NumberOrderItem getKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(KEYWORDS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Keywords" element
         */
        public boolean isSetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORDS$10) != 0;
            }
        }
        
        /**
         * Sets the "Keywords" element
         */
        public void setKeywords(com.callfire.api.data.NumberOrderItem keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().find_element_user(KEYWORDS$10, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(KEYWORDS$10);
                }
                target.set(keywords);
            }
        }
        
        /**
         * Appends and returns a new empty "Keywords" element
         */
        public com.callfire.api.data.NumberOrderItem addNewKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.NumberOrderItem target = null;
                target = (com.callfire.api.data.NumberOrderItem)get_store().add_element_user(KEYWORDS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Keywords" element
         */
        public void unsetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORDS$10, 0);
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
    }
}
