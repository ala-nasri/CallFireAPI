/*
 * XML Type:  BroadcastConfig
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastConfig
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * An XML BroadcastConfig(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public class BroadcastConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastConfig
{
    
    public BroadcastConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
    private static final javax.xml.namespace.QName FROMNUMBER$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "FromNumber");
    private static final javax.xml.namespace.QName LOCALTIMEZONERESTRICTION$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "LocalTimeZoneRestriction");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "Created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$0, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "Created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$0, 0);
        }
    }
    
    /**
     * Gets the "FromNumber" element
     */
    public java.lang.String getFromNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromNumber" element
     */
    public com.callfire.api.data.PhoneNumber xgetFromNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromNumber" element
     */
    public boolean isSetFromNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "FromNumber" element
     */
    public void setFromNumber(java.lang.String fromNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNUMBER$2);
            }
            target.setStringValue(fromNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FromNumber" element
     */
    public void xsetFromNumber(com.callfire.api.data.PhoneNumber fromNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$2, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(FROMNUMBER$2);
            }
            target.set(fromNumber);
        }
    }
    
    /**
     * Unsets the "FromNumber" element
     */
    public void unsetFromNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "LocalTimeZoneRestriction" element
     */
    public com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction getLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().find_element_user(LOCALTIMEZONERESTRICTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocalTimeZoneRestriction" element
     */
    public boolean isSetLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALTIMEZONERESTRICTION$4) != 0;
        }
    }
    
    /**
     * Sets the "LocalTimeZoneRestriction" element
     */
    public void setLocalTimeZoneRestriction(com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction localTimeZoneRestriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().find_element_user(LOCALTIMEZONERESTRICTION$4, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().add_element_user(LOCALTIMEZONERESTRICTION$4);
            }
            target.set(localTimeZoneRestriction);
        }
    }
    
    /**
     * Appends and returns a new empty "LocalTimeZoneRestriction" element
     */
    public com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction addNewLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction target = null;
            target = (com.callfire.api.data.LocalTimeZoneRestrictionDocument.LocalTimeZoneRestriction)get_store().add_element_user(LOCALTIMEZONERESTRICTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LocalTimeZoneRestriction" element
     */
    public void unsetLocalTimeZoneRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALTIMEZONERESTRICTION$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
