/*
 * An XML document type.
 * Localname: DeleteBroadcastSchedule
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.DeleteBroadcastScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one DeleteBroadcastSchedule(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class DeleteBroadcastScheduleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.DeleteBroadcastScheduleDocument
{
    
    public DeleteBroadcastScheduleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEBROADCASTSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "DeleteBroadcastSchedule");
    
    
    /**
     * Gets the "DeleteBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.IdRequest getDeleteBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETEBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteBroadcastSchedule" element
     */
    public void setDeleteBroadcastSchedule(com.callfire.api.service.xsd.IdRequest deleteBroadcastSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().find_element_user(DELETEBROADCASTSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETEBROADCASTSCHEDULE$0);
            }
            target.set(deleteBroadcastSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteBroadcastSchedule" element
     */
    public com.callfire.api.service.xsd.IdRequest addNewDeleteBroadcastSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.IdRequest target = null;
            target = (com.callfire.api.service.xsd.IdRequest)get_store().add_element_user(DELETEBROADCASTSCHEDULE$0);
            return target;
        }
    }
}
