/*
 * XML Type:  ActionQuery
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.ActionQuery
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML ActionQuery(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class ActionQueryImpl extends com.callfire.api.service.xsd.impl.QueryImpl implements com.callfire.api.service.xsd.ActionQuery
{
    
    public ActionQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastId");
    private static final javax.xml.namespace.QName BATCHID$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BatchId");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "State");
    private static final javax.xml.namespace.QName RESULT$6 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Result");
    private static final javax.xml.namespace.QName INBOUND$8 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Inbound");
    private static final javax.xml.namespace.QName INTERVALBEGIN$10 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "IntervalBegin");
    private static final javax.xml.namespace.QName INTERVALEND$12 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "IntervalEnd");
    private static final javax.xml.namespace.QName FROMNUMBER$14 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "FromNumber");
    private static final javax.xml.namespace.QName TONUMBER$16 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ToNumber");
    private static final javax.xml.namespace.QName LABELNAME$18 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "LabelName");
    
    
    /**
     * Gets the "BroadcastId" element
     */
    public long getBroadcastId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$0, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$0, 0);
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
            return get_store().count_elements(BROADCASTID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTID$0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BROADCASTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BROADCASTID$0);
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
            get_store().remove_element(BROADCASTID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$2, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$2, 0);
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
            return get_store().count_elements(BATCHID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHID$2);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BATCHID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BATCHID$2);
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
            get_store().remove_element(BATCHID$2, 0);
        }
    }
    
    /**
     * Gets the "State" element
     */
    public java.util.List getState()
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
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.callfire.api.service.xsd.ActionQuery.State xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery.State target = null;
            target = (com.callfire.api.service.xsd.ActionQuery.State)get_store().find_element_user(STATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "State" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$4) != 0;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(java.util.List state)
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
            target.setListValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.callfire.api.service.xsd.ActionQuery.State state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery.State target = null;
            target = (com.callfire.api.service.xsd.ActionQuery.State)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ActionQuery.State)get_store().add_element_user(STATE$4);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "State" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$4, 0);
        }
    }
    
    /**
     * Gets the "Result" element
     */
    public java.util.List getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Result" element
     */
    public com.callfire.api.service.xsd.ActionQuery.Result xgetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery.Result target = null;
            target = (com.callfire.api.service.xsd.ActionQuery.Result)get_store().find_element_user(RESULT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Result" element
     */
    public boolean isSetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$6) != 0;
        }
    }
    
    /**
     * Sets the "Result" element
     */
    public void setResult(java.util.List result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$6);
            }
            target.setListValue(result);
        }
    }
    
    /**
     * Sets (as xml) the "Result" element
     */
    public void xsetResult(com.callfire.api.service.xsd.ActionQuery.Result result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.ActionQuery.Result target = null;
            target = (com.callfire.api.service.xsd.ActionQuery.Result)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.ActionQuery.Result)get_store().add_element_user(RESULT$6);
            }
            target.set(result);
        }
    }
    
    /**
     * Unsets the "Result" element
     */
    public void unsetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$8, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Inbound" element
     */
    public boolean isSetInbound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INBOUND$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUND$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOUND$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INBOUND$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INBOUND$8);
            }
            target.set(inbound);
        }
    }
    
    /**
     * Unsets the "Inbound" element
     */
    public void unsetInbound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INBOUND$8, 0);
        }
    }
    
    /**
     * Gets the "IntervalBegin" element
     */
    public java.util.Calendar getIntervalBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBEGIN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntervalBegin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetIntervalBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALBEGIN$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntervalBegin" element
     */
    public boolean isSetIntervalBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVALBEGIN$10) != 0;
        }
    }
    
    /**
     * Sets the "IntervalBegin" element
     */
    public void setIntervalBegin(java.util.Calendar intervalBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBEGIN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALBEGIN$10);
            }
            target.setCalendarValue(intervalBegin);
        }
    }
    
    /**
     * Sets (as xml) the "IntervalBegin" element
     */
    public void xsetIntervalBegin(org.apache.xmlbeans.XmlDateTime intervalBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALBEGIN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(INTERVALBEGIN$10);
            }
            target.set(intervalBegin);
        }
    }
    
    /**
     * Unsets the "IntervalBegin" element
     */
    public void unsetIntervalBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVALBEGIN$10, 0);
        }
    }
    
    /**
     * Gets the "IntervalEnd" element
     */
    public java.util.Calendar getIntervalEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALEND$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntervalEnd" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetIntervalEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALEND$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntervalEnd" element
     */
    public boolean isSetIntervalEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVALEND$12) != 0;
        }
    }
    
    /**
     * Sets the "IntervalEnd" element
     */
    public void setIntervalEnd(java.util.Calendar intervalEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALEND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALEND$12);
            }
            target.setCalendarValue(intervalEnd);
        }
    }
    
    /**
     * Sets (as xml) the "IntervalEnd" element
     */
    public void xsetIntervalEnd(org.apache.xmlbeans.XmlDateTime intervalEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INTERVALEND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(INTERVALEND$12);
            }
            target.set(intervalEnd);
        }
    }
    
    /**
     * Unsets the "IntervalEnd" element
     */
    public void unsetIntervalEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVALEND$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$14, 0);
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
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$14, 0);
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
            return get_store().count_elements(FROMNUMBER$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNUMBER$14);
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
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(FROMNUMBER$14, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(FROMNUMBER$14);
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
            get_store().remove_element(FROMNUMBER$14, 0);
        }
    }
    
    /**
     * Gets the "ToNumber" element
     */
    public java.lang.String getToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ToNumber" element
     */
    public com.callfire.api.data.PhoneNumber xgetToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ToNumber" element
     */
    public boolean isSetToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TONUMBER$16) != 0;
        }
    }
    
    /**
     * Sets the "ToNumber" element
     */
    public void setToNumber(java.lang.String toNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TONUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TONUMBER$16);
            }
            target.setStringValue(toNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ToNumber" element
     */
    public void xsetToNumber(com.callfire.api.data.PhoneNumber toNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.PhoneNumber target = null;
            target = (com.callfire.api.data.PhoneNumber)get_store().find_element_user(TONUMBER$16, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.PhoneNumber)get_store().add_element_user(TONUMBER$16);
            }
            target.set(toNumber);
        }
    }
    
    /**
     * Unsets the "ToNumber" element
     */
    public void unsetToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TONUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "LabelName" element
     */
    public java.lang.String getLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LabelName" element
     */
    public org.apache.xmlbeans.XmlString xgetLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "LabelName" element
     */
    public boolean isSetLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABELNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "LabelName" element
     */
    public void setLabelName(java.lang.String labelName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELNAME$18);
            }
            target.setStringValue(labelName);
        }
    }
    
    /**
     * Sets (as xml) the "LabelName" element
     */
    public void xsetLabelName(org.apache.xmlbeans.XmlString labelName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELNAME$18);
            }
            target.set(labelName);
        }
    }
    
    /**
     * Unsets the "LabelName" element
     */
    public void unsetLabelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABELNAME$18, 0);
        }
    }
    /**
     * An XML State(@http://api.callfire.com/service/xsd).
     *
     * This is a list type whose items are com.callfire.api.data.ActionState.
     */
    public static class StateImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.service.xsd.ActionQuery.State
    {
        
        public StateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Result(@http://api.callfire.com/service/xsd).
     *
     * This is a list type whose items are com.callfire.api.data.Result.
     */
    public static class ResultImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.callfire.api.service.xsd.ActionQuery.Result
    {
        
        public ResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ResultImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
