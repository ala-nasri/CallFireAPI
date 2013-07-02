/*
 * An XML document type.
 * Localname: RecordingData
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.RecordingDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one RecordingData(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class RecordingDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.RecordingDataDocument
{
    
    public RecordingDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINGDATA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "RecordingData");
    
    
    /**
     * Gets the "RecordingData" element
     */
    public byte[] getRecordingData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINGDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordingData" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetRecordingData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECORDINGDATA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecordingData" element
     */
    public void setRecordingData(byte[] recordingData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINGDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDINGDATA$0);
            }
            target.setByteArrayValue(recordingData);
        }
    }
    
    /**
     * Sets (as xml) the "RecordingData" element
     */
    public void xsetRecordingData(org.apache.xmlbeans.XmlBase64Binary recordingData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECORDINGDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(RECORDINGDATA$0);
            }
            target.set(recordingData);
        }
    }
}
