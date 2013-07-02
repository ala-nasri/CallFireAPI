/*
 * An XML document type.
 * Localname: GetSoundData
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.GetSoundDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one GetSoundData(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class GetSoundDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.GetSoundDataDocument
{
    
    public GetSoundDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOUNDDATA$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "GetSoundData");
    
    
    /**
     * Gets the "GetSoundData" element
     */
    public com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData getGetSoundData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData target = null;
            target = (com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData)get_store().find_element_user(GETSOUNDDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSoundData" element
     */
    public void setGetSoundData(com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData getSoundData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData target = null;
            target = (com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData)get_store().find_element_user(GETSOUNDDATA$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData)get_store().add_element_user(GETSOUNDDATA$0);
            }
            target.set(getSoundData);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSoundData" element
     */
    public com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData addNewGetSoundData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData target = null;
            target = (com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData)get_store().add_element_user(GETSOUNDDATA$0);
            return target;
        }
    }
    /**
     * An XML GetSoundData(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class GetSoundDataImpl extends com.callfire.api.service.xsd.impl.IdRequestImpl implements com.callfire.api.service.xsd.GetSoundDataDocument.GetSoundData
    {
        
        public GetSoundDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORMAT$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "Format");
        
        
        /**
         * Gets the "Format" element
         */
        public com.callfire.api.service.xsd.SoundFormat.Enum getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.callfire.api.service.xsd.SoundFormat.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Format" element
         */
        public com.callfire.api.service.xsd.SoundFormat xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.SoundFormat target = null;
                target = (com.callfire.api.service.xsd.SoundFormat)get_store().find_element_user(FORMAT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Format" element
         */
        public boolean isSetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMAT$0) != 0;
            }
        }
        
        /**
         * Sets the "Format" element
         */
        public void setFormat(com.callfire.api.service.xsd.SoundFormat.Enum format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
                }
                target.setEnumValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "Format" element
         */
        public void xsetFormat(com.callfire.api.service.xsd.SoundFormat format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.service.xsd.SoundFormat target = null;
                target = (com.callfire.api.service.xsd.SoundFormat)get_store().find_element_user(FORMAT$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.service.xsd.SoundFormat)get_store().add_element_user(FORMAT$0);
                }
                target.set(format);
            }
        }
        
        /**
         * Unsets the "Format" element
         */
        public void unsetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMAT$0, 0);
            }
        }
    }
}
