/*
 * XML Type:  Action
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.Action
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * An XML Action(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public class ActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.Action
{
    
    public ActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROMNUMBER$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "FromNumber");
    private static final javax.xml.namespace.QName TONUMBER$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "ToNumber");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "State");
    private static final javax.xml.namespace.QName BATCHID$6 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "BatchId");
    private static final javax.xml.namespace.QName BROADCASTID$8 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastId");
    private static final javax.xml.namespace.QName CONTACTID$10 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "ContactId");
    private static final javax.xml.namespace.QName INBOUND$12 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Inbound");
    private static final javax.xml.namespace.QName CREATED$14 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Created");
    private static final javax.xml.namespace.QName MODIFIED$16 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Modified");
    private static final javax.xml.namespace.QName FINALRESULT$18 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "FinalResult");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "FromNumber" element
     */
    public java.lang.String getFromNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$0, 0);
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
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNUMBER$0);
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
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(FROMNUMBER$0);
            }
            target.set(fromNumber);
        }
    }
    
    /**
     * Gets the "ToNumber" element
     */
    public com.callfire.api.data.ToNumber getToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ToNumber" element
     */
    public void setToNumber(com.callfire.api.data.ToNumber toNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$2, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ToNumber)get_store().add_element_user(TONUMBER$2);
            }
            target.set(toNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "ToNumber" element
     */
    public com.callfire.api.data.ToNumber addNewToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().add_element_user(TONUMBER$2);
            return target;
        }
    }
    
    /**
     * Gets the "State" element
     */
    public com.callfire.api.data.ActionState.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.callfire.api.data.ActionState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.callfire.api.data.ActionState xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionState target = null;
            target = (com.callfire.api.data.ActionState)get_store().find_element_user(STATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(com.callfire.api.data.ActionState.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.callfire.api.data.ActionState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionState target = null;
            target = (com.callfire.api.data.ActionState)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.ActionState)get_store().add_element_user(STATE$4);
            }
            target.set(state);
        }
    }
    
    /**
     * Gets the "BatchId" element
     */
    public long getBatchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "BatchId" element
     */
    public org.apache.xmlbeans.XmlLong xgetBatchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "BatchId" element
     */
    public boolean isSetBatchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BATCHID$6) != 0;
        }
    }
    
    /**
     * Sets the "BatchId" element
     */
    public void setBatchId(long batchId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHID$6);
            }
            target.setLongValue(batchId);
        }
    }
    
    /**
     * Sets (as xml) the "BatchId" element
     */
    public void xsetBatchId(org.apache.xmlbeans.XmlLong batchId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BATCHID$6);
            }
            target.set(batchId);
        }
    }
    
    /**
     * Unsets the "BatchId" element
     */
    public void unsetBatchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BATCHID$6, 0);
        }
    }
    
    /**
     * Gets the "BroadcastId" element
     */
    public long getBroadcastId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "BroadcastId" element
     */
    public org.apache.xmlbeans.XmlLong xgetBroadcastId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "BroadcastId" element
     */
    public boolean isSetBroadcastId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BROADCASTID$8) != 0;
        }
    }
    
    /**
     * Sets the "BroadcastId" element
     */
    public void setBroadcastId(long broadcastId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTID$8);
            }
            target.setLongValue(broadcastId);
        }
    }
    
    /**
     * Sets (as xml) the "BroadcastId" element
     */
    public void xsetBroadcastId(org.apache.xmlbeans.XmlLong broadcastId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BROADCASTID$8);
            }
            target.set(broadcastId);
        }
    }
    
    /**
     * Unsets the "BroadcastId" element
     */
    public void unsetBroadcastId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BROADCASTID$8, 0);
        }
    }
    
    /**
     * Gets the "ContactId" element
     */
    public long getContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactId" element
     */
    public org.apache.xmlbeans.XmlLong xgetContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTID$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContactId" element
     */
    public void setContactId(long contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$10);
            }
            target.setLongValue(contactId);
        }
    }
    
    /**
     * Sets (as xml) the "ContactId" element
     */
    public void xsetContactId(org.apache.xmlbeans.XmlLong contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONTACTID$10);
            }
            target.set(contactId);
        }
    }
    
    /**
     * Gets the "Inbound" element
     */
    public boolean getInbound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Inbound" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInbound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Inbound" element
     */
    public void setInbound(boolean inbound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOUND$12);
            }
            target.setBooleanValue(inbound);
        }
    }
    
    /**
     * Sets (as xml) the "Inbound" element
     */
    public void xsetInbound(org.apache.xmlbeans.XmlBoolean inbound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INBOUND$12);
            }
            target.set(inbound);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$14, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$14);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$14);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "Modified" element
     */
    public java.util.Calendar getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Modified" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Modified" element
     */
    public void setModified(java.util.Calendar modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$16);
            }
            target.setCalendarValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "Modified" element
     */
    public void xsetModified(org.apache.xmlbeans.XmlDateTime modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIED$16);
            }
            target.set(modified);
        }
    }
    
    /**
     * Gets the "FinalResult" element
     */
    public com.callfire.api.data.Result.Enum getFinalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALRESULT$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.callfire.api.data.Result.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FinalResult" element
     */
    public com.callfire.api.data.Result xgetFinalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.Result target = null;
            target = (com.callfire.api.data.Result)get_store().find_element_user(FINALRESULT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "FinalResult" element
     */
    public boolean isSetFinalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINALRESULT$18) != 0;
        }
    }
    
    /**
     * Sets the "FinalResult" element
     */
    public void setFinalResult(com.callfire.api.data.Result.Enum finalResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALRESULT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINALRESULT$18);
            }
            target.setEnumValue(finalResult);
        }
    }
    
    /**
     * Sets (as xml) the "FinalResult" element
     */
    public void xsetFinalResult(com.callfire.api.data.Result finalResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.Result target = null;
            target = (com.callfire.api.data.Result)get_store().find_element_user(FINALRESULT$18, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.Result)get_store().add_element_user(FINALRESULT$18);
            }
            target.set(finalResult);
        }
    }
    
    /**
     * Unsets the "FinalResult" element
     */
    public void unsetFinalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINALRESULT$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$20);
            }
            target.set(id);
        }
    }
}
