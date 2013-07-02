/*
 * An XML document type.
 * Localname: SoundMetaQueryResult
 * Namespace: http://api.callfire.com/service/xsd
 * Java type: com.callfire.api.service.xsd.SoundMetaQueryResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.service.xsd.impl;
/**
 * A document containing one SoundMetaQueryResult(@http://api.callfire.com/service/xsd) element.
 *
 * This is a complex type.
 */
public class SoundMetaQueryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.service.xsd.SoundMetaQueryResultDocument
{
    
    public SoundMetaQueryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOUNDMETAQUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/service/xsd", "SoundMetaQueryResult");
    
    
    /**
     * Gets the "SoundMetaQueryResult" element
     */
    public com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult getSoundMetaQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult target = null;
            target = (com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult)get_store().find_element_user(SOUNDMETAQUERYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SoundMetaQueryResult" element
     */
    public void setSoundMetaQueryResult(com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult soundMetaQueryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult target = null;
            target = (com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult)get_store().find_element_user(SOUNDMETAQUERYRESULT$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult)get_store().add_element_user(SOUNDMETAQUERYRESULT$0);
            }
            target.set(soundMetaQueryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "SoundMetaQueryResult" element
     */
    public com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult addNewSoundMetaQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult target = null;
            target = (com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult)get_store().add_element_user(SOUNDMETAQUERYRESULT$0);
            return target;
        }
    }
    /**
     * An XML SoundMetaQueryResult(@http://api.callfire.com/service/xsd).
     *
     * This is a complex type.
     */
    public static class SoundMetaQueryResultImpl extends com.callfire.api.service.xsd.impl.QueryResultImpl implements com.callfire.api.service.xsd.SoundMetaQueryResultDocument.SoundMetaQueryResult
    {
        
        public SoundMetaQueryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOUNDMETA$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "SoundMeta");
        
        
        /**
         * Gets array of all "SoundMeta" elements
         */
        public com.callfire.api.data.SoundMetaDocument.SoundMeta[] getSoundMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOUNDMETA$0, targetList);
                com.callfire.api.data.SoundMetaDocument.SoundMeta[] result = new com.callfire.api.data.SoundMetaDocument.SoundMeta[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SoundMeta" element
         */
        public com.callfire.api.data.SoundMetaDocument.SoundMeta getSoundMetaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
                target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().find_element_user(SOUNDMETA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SoundMeta" element
         */
        public int sizeOfSoundMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOUNDMETA$0);
            }
        }
        
        /**
         * Sets array of all "SoundMeta" element
         */
        public void setSoundMetaArray(com.callfire.api.data.SoundMetaDocument.SoundMeta[] soundMetaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(soundMetaArray, SOUNDMETA$0);
            }
        }
        
        /**
         * Sets ith "SoundMeta" element
         */
        public void setSoundMetaArray(int i, com.callfire.api.data.SoundMetaDocument.SoundMeta soundMeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
                target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().find_element_user(SOUNDMETA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(soundMeta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SoundMeta" element
         */
        public com.callfire.api.data.SoundMetaDocument.SoundMeta insertNewSoundMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
                target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().insert_element_user(SOUNDMETA$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SoundMeta" element
         */
        public com.callfire.api.data.SoundMetaDocument.SoundMeta addNewSoundMeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.SoundMetaDocument.SoundMeta target = null;
                target = (com.callfire.api.data.SoundMetaDocument.SoundMeta)get_store().add_element_user(SOUNDMETA$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SoundMeta" element
         */
        public void removeSoundMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOUNDMETA$0, i);
            }
        }
    }
}
