/*
 * XML Type:  NumberOrderItem
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.NumberOrderItem
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * An XML NumberOrderItem(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public class NumberOrderItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.NumberOrderItem
{
    
    public NumberOrderItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERED$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Ordered");
    private static final javax.xml.namespace.QName UNITCOST$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "UnitCost");
    private static final javax.xml.namespace.QName FULFILLED$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Fulfilled");
    
    
    /**
     * Gets the "Ordered" element
     */
    public int getOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERED$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ordered" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ordered" element
     */
    public void setOrdered(int ordered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERED$0);
            }
            target.setIntValue(ordered);
        }
    }
    
    /**
     * Sets (as xml) the "Ordered" element
     */
    public void xsetOrdered(org.apache.xmlbeans.XmlInt ordered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDERED$0);
            }
            target.set(ordered);
        }
    }
    
    /**
     * Gets the "UnitCost" element
     */
    public float getUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITCOST$2, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitCost" element
     */
    public org.apache.xmlbeans.XmlFloat xgetUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(UNITCOST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UnitCost" element
     */
    public void setUnitCost(float unitCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITCOST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITCOST$2);
            }
            target.setFloatValue(unitCost);
        }
    }
    
    /**
     * Sets (as xml) the "UnitCost" element
     */
    public void xsetUnitCost(org.apache.xmlbeans.XmlFloat unitCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(UNITCOST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(UNITCOST$2);
            }
            target.set(unitCost);
        }
    }
    
    /**
     * Gets the "Fulfilled" element
     */
    public java.util.List getFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILLED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fulfilled" element
     */
    public com.callfire.api.data.NumberOrderItem.Fulfilled xgetFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberOrderItem.Fulfilled target = null;
            target = (com.callfire.api.data.NumberOrderItem.Fulfilled)get_store().find_element_user(FULFILLED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Fulfilled" element
     */
    public boolean isSetFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILLED$4) != 0;
        }
    }
    
    /**
     * Sets the "Fulfilled" element
     */
    public void setFulfilled(java.util.List fulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILLED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULFILLED$4);
            }
            target.setListValue(fulfilled);
        }
    }
    
    /**
     * Sets (as xml) the "Fulfilled" element
     */
    public void xsetFulfilled(com.callfire.api.data.NumberOrderItem.Fulfilled fulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.NumberOrderItem.Fulfilled target = null;
            target = (com.callfire.api.data.NumberOrderItem.Fulfilled)get_store().find_element_user(FULFILLED$4, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.NumberOrderItem.Fulfilled)get_store().add_element_user(FULFILLED$4);
            }
            target.set(fulfilled);
        }
    }
    
    /**
     * Unsets the "Fulfilled" element
     */
    public void unsetFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILLED$4, 0);
        }
    }
    /**
     * An XML Fulfilled(@http://api.callfire.com/data).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlString.
     */
    public static class FulfilledImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.data.NumberOrderItem.Fulfilled
    {
        
        public FulfilledImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FulfilledImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
