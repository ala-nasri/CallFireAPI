/*
 * An XML document type.
 * Localname: CreateNumberOrder
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.CreateNumberOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one CreateNumberOrder(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class CreateNumberOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateNumberOrderDocument
{
    
    public CreateNumberOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATENUMBERORDER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "CreateNumberOrder");
    
    
    /**
     * Gets the "CreateNumberOrder" element
     */
    public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder getCreateNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder target = null;
            target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder)get_store().find_element_user(CREATENUMBERORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateNumberOrder" element
     */
    public void setCreateNumberOrder(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder createNumberOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder target = null;
            target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder)get_store().find_element_user(CREATENUMBERORDER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder)get_store().add_element_user(CREATENUMBERORDER$0);
            }
            target.set(createNumberOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateNumberOrder" element
     */
    public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder addNewCreateNumberOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder target = null;
            target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder)get_store().add_element_user(CREATENUMBERORDER$0);
            return target;
        }
    }
    /**
     * An XML CreateNumberOrder(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class CreateNumberOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder
    {
        
        public CreateNumberOrderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBERS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Numbers");
        private static final javax.xml.namespace.QName KEYWORDS$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Keywords");
        private static final javax.xml.namespace.QName BULKLOCAL$4 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BulkLocal");
        private static final javax.xml.namespace.QName BULKTOLLFREE$6 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BulkTollFree");
        
        
        /**
         * Gets the "Numbers" element
         */
        public java.util.List getNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Numbers" element
         */
        public com.callfire.api.data.PhoneNumberList xgetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumberList target = null;
                target = (com.callfire.api.data.PhoneNumberList)get_store().find_element_user(NUMBERS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Numbers" element
         */
        public boolean isSetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBERS$0) != 0;
            }
        }
        
        /**
         * Sets the "Numbers" element
         */
        public void setNumbers(java.util.List numbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERS$0);
                }
                target.setListValue(numbers);
            }
        }
        
        /**
         * Sets (as xml) the "Numbers" element
         */
        public void xsetNumbers(com.callfire.api.data.PhoneNumberList numbers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.PhoneNumberList target = null;
                target = (com.callfire.api.data.PhoneNumberList)get_store().find_element_user(NUMBERS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.PhoneNumberList)get_store().add_element_user(NUMBERS$0);
                }
                target.set(numbers);
            }
        }
        
        /**
         * Unsets the "Numbers" element
         */
        public void unsetNumbers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBERS$0, 0);
            }
        }
        
        /**
         * Gets the "Keywords" element
         */
        public java.util.List getKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "Keywords" element
         */
        public com.callfire.api.data.KeywordList xgetKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$2, 0);
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
                return get_store().count_elements(KEYWORDS$2) != 0;
            }
        }
        
        /**
         * Sets the "Keywords" element
         */
        public void setKeywords(java.util.List keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$2);
                }
                target.setListValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) the "Keywords" element
         */
        public void xsetKeywords(com.callfire.api.data.KeywordList keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.KeywordList target = null;
                target = (com.callfire.api.data.KeywordList)get_store().find_element_user(KEYWORDS$2, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.KeywordList)get_store().add_element_user(KEYWORDS$2);
                }
                target.set(keywords);
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
                get_store().remove_element(KEYWORDS$2, 0);
            }
        }
        
        /**
         * Gets the "BulkLocal" element
         */
        public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal getBulkLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal)get_store().find_element_user(BULKLOCAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BulkLocal" element
         */
        public boolean isSetBulkLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BULKLOCAL$4) != 0;
            }
        }
        
        /**
         * Sets the "BulkLocal" element
         */
        public void setBulkLocal(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal bulkLocal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal)get_store().find_element_user(BULKLOCAL$4, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal)get_store().add_element_user(BULKLOCAL$4);
                }
                target.set(bulkLocal);
            }
        }
        
        /**
         * Appends and returns a new empty "BulkLocal" element
         */
        public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal addNewBulkLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal)get_store().add_element_user(BULKLOCAL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "BulkLocal" element
         */
        public void unsetBulkLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BULKLOCAL$4, 0);
            }
        }
        
        /**
         * Gets the "BulkTollFree" element
         */
        public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree getBulkTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree)get_store().find_element_user(BULKTOLLFREE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BulkTollFree" element
         */
        public boolean isSetBulkTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BULKTOLLFREE$6) != 0;
            }
        }
        
        /**
         * Sets the "BulkTollFree" element
         */
        public void setBulkTollFree(com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree bulkTollFree)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree)get_store().find_element_user(BULKTOLLFREE$6, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree)get_store().add_element_user(BULKTOLLFREE$6);
                }
                target.set(bulkTollFree);
            }
        }
        
        /**
         * Appends and returns a new empty "BulkTollFree" element
         */
        public com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree addNewBulkTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree target = null;
                target = (com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree)get_store().add_element_user(BULKTOLLFREE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "BulkTollFree" element
         */
        public void unsetBulkTollFree()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BULKTOLLFREE$6, 0);
            }
        }
        /**
         * An XML BulkLocal(@http://api.callfire.com/service/xsd).
         *
         * This is a complex type.
         */
        public static class BulkLocalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkLocal
        {
            
            public BulkLocalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COUNT$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Count");
            private static final javax.xml.namespace.QName REGION$2 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Region");
            
            
            /**
             * Gets the "Count" element
             */
            public int getCount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Count" element
             */
            public org.apache.xmlbeans.XmlInt xgetCount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Count" element
             */
            public void setCount(int count)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$0);
                    }
                    target.setIntValue(count);
                }
            }
            
            /**
             * Sets (as xml) the "Count" element
             */
            public void xsetCount(org.apache.xmlbeans.XmlInt count)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$0);
                    }
                    target.set(count);
                }
            }
            
            /**
             * Gets the "Region" element
             */
            public com.callfire.api.data.RegionDocument.Region getRegion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.RegionDocument.Region target = null;
                    target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Region" element
             */
            public void setRegion(com.callfire.api.data.RegionDocument.Region region)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.RegionDocument.Region target = null;
                    target = (com.callfire.api.data.RegionDocument.Region)get_store().find_element_user(REGION$2, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$2);
                    }
                    target.set(region);
                }
            }
            
            /**
             * Appends and returns a new empty "Region" element
             */
            public com.callfire.api.data.RegionDocument.Region addNewRegion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.RegionDocument.Region target = null;
                    target = (com.callfire.api.data.RegionDocument.Region)get_store().add_element_user(REGION$2);
                    return target;
                }
            }
        }
        /**
         * An XML BulkTollFree(@http://api.callfire.com/service/xsd).
         *
         * This is a complex type.
         */
        public static class BulkTollFreeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.CreateNumberOrderDocument.CreateNumberOrder.BulkTollFree
        {
            
            public BulkTollFreeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COUNT$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Count");
            
            
            /**
             * Gets the "Count" element
             */
            public int getCount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Count" element
             */
            public org.apache.xmlbeans.XmlInt xgetCount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Count" element
             */
            public void setCount(int count)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$0);
                    }
                    target.setIntValue(count);
                }
            }
            
            /**
             * Sets (as xml) the "Count" element
             */
            public void xsetCount(org.apache.xmlbeans.XmlInt count)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$0);
                    }
                    target.set(count);
                }
            }
        }
    }
}
