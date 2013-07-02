/*
 * XML Type:  SendRequest
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SendRequest
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * An XML SendRequest(@http://api.callfire.com/service/xsd).
 *
 * This is a complex type.
 */
public class SendRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SendRequest
{
    
    public SendRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RequestId");
    private static final javax.xml.namespace.QName BROADCASTNAME$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "BroadcastName");
    private static final javax.xml.namespace.QName TONUMBER$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ToNumber");
    private static final javax.xml.namespace.QName SCRUBBROADCASTDUPLICATES$6 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "ScrubBroadcastDuplicates");
    
    
    /**
     * Gets the "RequestId" element
     */
    public java.lang.String getRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestId" element
     */
    public boolean isSetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTID$0) != 0;
        }
    }
    
    /**
     * Sets the "RequestId" element
     */
    public void setRequestId(java.lang.String requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
            }
            target.setStringValue(requestId);
        }
    }
    
    /**
     * Sets (as xml) the "RequestId" element
     */
    public void xsetRequestId(org.apache.xmlbeans.XmlAnyURI requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REQUESTID$0);
            }
            target.set(requestId);
        }
    }
    
    /**
     * Unsets the "RequestId" element
     */
    public void unsetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTID$0, 0);
        }
    }
    
    /**
     * Gets the "BroadcastName" element
     */
    public java.lang.String getBroadcastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BroadcastName" element
     */
    public org.apache.xmlbeans.XmlString xgetBroadcastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROADCASTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "BroadcastName" element
     */
    public boolean isSetBroadcastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BROADCASTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "BroadcastName" element
     */
    public void setBroadcastName(java.lang.String broadcastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADCASTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADCASTNAME$2);
            }
            target.setStringValue(broadcastName);
        }
    }
    
    /**
     * Sets (as xml) the "BroadcastName" element
     */
    public void xsetBroadcastName(org.apache.xmlbeans.XmlString broadcastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROADCASTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BROADCASTNAME$2);
            }
            target.set(broadcastName);
        }
    }
    
    /**
     * Unsets the "BroadcastName" element
     */
    public void unsetBroadcastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BROADCASTNAME$2, 0);
        }
    }
    
    /**
     * Gets array of all "ToNumber" elements
     */
    public com.callfire.api.data.ToNumber[] getToNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TONUMBER$4, targetList);
            com.callfire.api.data.ToNumber[] result = new com.callfire.api.data.ToNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ToNumber" element
     */
    public com.callfire.api.data.ToNumber getToNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ToNumber" element
     */
    public int sizeOfToNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TONUMBER$4);
        }
    }
    
    /**
     * Sets array of all "ToNumber" element
     */
    public void setToNumberArray(com.callfire.api.data.ToNumber[] toNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(toNumberArray, TONUMBER$4);
        }
    }
    
    /**
     * Sets ith "ToNumber" element
     */
    public void setToNumberArray(int i, com.callfire.api.data.ToNumber toNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().find_element_user(TONUMBER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(toNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ToNumber" element
     */
    public com.callfire.api.data.ToNumber insertNewToNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().insert_element_user(TONUMBER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ToNumber" element
     */
    public com.callfire.api.data.ToNumber addNewToNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ToNumber target = null;
            target = (com.callfire.api.data.ToNumber)get_store().add_element_user(TONUMBER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ToNumber" element
     */
    public void removeToNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TONUMBER$4, i);
        }
    }
    
    /**
     * Gets the "ScrubBroadcastDuplicates" element
     */
    public boolean getScrubBroadcastDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScrubBroadcastDuplicates" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetScrubBroadcastDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScrubBroadcastDuplicates" element
     */
    public boolean isSetScrubBroadcastDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRUBBROADCASTDUPLICATES$6) != 0;
        }
    }
    
    /**
     * Sets the "ScrubBroadcastDuplicates" element
     */
    public void setScrubBroadcastDuplicates(boolean scrubBroadcastDuplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRUBBROADCASTDUPLICATES$6);
            }
            target.setBooleanValue(scrubBroadcastDuplicates);
        }
    }
    
    /**
     * Sets (as xml) the "ScrubBroadcastDuplicates" element
     */
    public void xsetScrubBroadcastDuplicates(org.apache.xmlbeans.XmlBoolean scrubBroadcastDuplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCRUBBROADCASTDUPLICATES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SCRUBBROADCASTDUPLICATES$6);
            }
            target.set(scrubBroadcastDuplicates);
        }
    }
    
    /**
     * Unsets the "ScrubBroadcastDuplicates" element
     */
    public void unsetScrubBroadcastDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRUBBROADCASTDUPLICATES$6, 0);
        }
    }
}
