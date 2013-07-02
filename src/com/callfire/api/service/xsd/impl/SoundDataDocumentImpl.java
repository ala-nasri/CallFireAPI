/*
 * An XML document type.
 * Localname: SoundData
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SoundDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SoundData(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SoundDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SoundDataDocument
{
    
    public SoundDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOUNDDATA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SoundData");
    
    
    /**
     * Gets the "SoundData" element
     */
    public byte[] getSoundData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUNDDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoundData" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSoundData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SOUNDDATA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SoundData" element
     */
    public void setSoundData(byte[] soundData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUNDDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUNDDATA$0);
            }
            target.setByteArrayValue(soundData);
        }
    }
    
    /**
     * Sets (as xml) the "SoundData" element
     */
    public void xsetSoundData(org.apache.xmlbeans.XmlBase64Binary soundData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SOUNDDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SOUNDDATA$0);
            }
            target.set(soundData);
        }
    }
}
