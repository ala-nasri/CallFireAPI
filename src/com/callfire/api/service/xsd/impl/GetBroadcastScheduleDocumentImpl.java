/*
 * An XML document type.
 * Localname: GetBroadcastSchedule
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetBroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetBroadcastSchedule(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetBroadcastScheduleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetBroadcastScheduleDocument
{
    
    public GetBroadcastScheduleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBROADCASTSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetBroadcastSchedule");
    
    
    /**
     * Gets the "GetBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.IdRequest getGetBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBroadcastSchedule" element
     */
    public void setGetBroadcastSchedule(com.callfire.api.service.xsd.IdRequest getBroadcastSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(GETBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETBROADCASTSCHEDULE$0);
            }
            target.set(getBroadcastSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewGetBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(GETBROADCASTSCHEDULE$0);
            return target;
        }
    }
}
