/*
 * An XML document type.
 * Localname: BroadcastStats
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.BroadcastStatsDocument
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * A document containing one BroadcastStats(@http://api.callfire.com/data) element.
 *
 * This is a complex type.
 */
public class BroadcastStatsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastStatsDocument
{
    
    public BroadcastStatsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTSTATS$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "BroadcastStats");
    
    
    /**
     * Gets the "BroadcastStats" element
     */
    public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats getBroadcastStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastStatsDocument.BroadcastStats target = null;
            target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats)get_store().find_element_user(BROADCASTSTATS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastStats" element
     */
    public void setBroadcastStats(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats broadcastStats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastStatsDocument.BroadcastStats target = null;
            target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats)get_store().find_element_user(BROADCASTSTATS$0, 0);
            if (target == null)
            {
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats)get_store().add_element_user(BROADCASTSTATS$0);
            }
            target.set(broadcastStats);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastStats" element
     */
    public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats addNewBroadcastStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.BroadcastStatsDocument.BroadcastStats target = null;
            target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats)get_store().add_element_user(BROADCASTSTATS$0);
            return target;
        }
    }
    /**
     * An XML BroadcastStats(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class BroadcastStatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastStatsDocument.BroadcastStats
    {
        
        public BroadcastStatsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USAGESTATS$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "UsageStats");
        private static final javax.xml.namespace.QName RESULTSTAT$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "ResultStat");
        
        
        /**
         * Gets the "UsageStats" element
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats getUsageStats()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats)get_store().find_element_user(USAGESTATS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "UsageStats" element
         */
        public void setUsageStats(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats usageStats)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats)get_store().find_element_user(USAGESTATS$0, 0);
                if (target == null)
                {
                    target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats)get_store().add_element_user(USAGESTATS$0);
                }
                target.set(usageStats);
            }
        }
        
        /**
         * Appends and returns a new empty "UsageStats" element
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats addNewUsageStats()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats)get_store().add_element_user(USAGESTATS$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "ResultStat" elements
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[] getResultStatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESULTSTAT$2, targetList);
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[] result = new com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ResultStat" element
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat getResultStatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat)get_store().find_element_user(RESULTSTAT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ResultStat" element
         */
        public int sizeOfResultStatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTSTAT$2);
            }
        }
        
        /**
         * Sets array of all "ResultStat" element
         */
        public void setResultStatArray(com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat[] resultStatArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultStatArray, RESULTSTAT$2);
            }
        }
        
        /**
         * Sets ith "ResultStat" element
         */
        public void setResultStatArray(int i, com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat resultStat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat)get_store().find_element_user(RESULTSTAT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resultStat);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResultStat" element
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat insertNewResultStat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat)get_store().insert_element_user(RESULTSTAT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResultStat" element
         */
        public com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat addNewResultStat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat target = null;
                target = (com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat)get_store().add_element_user(RESULTSTAT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ResultStat" element
         */
        public void removeResultStat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTSTAT$2, i);
            }
        }
        /**
         * An XML UsageStats(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public static class UsageStatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.UsageStats
        {
            
            public UsageStatsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DURATION$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Duration");
            private static final javax.xml.namespace.QName BILLEDDURATION$2 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "BilledDuration");
            private static final javax.xml.namespace.QName BILLEDAMOUNT$4 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "BilledAmount");
            private static final javax.xml.namespace.QName ATTEMPTS$6 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Attempts");
            private static final javax.xml.namespace.QName ACTIONS$8 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Actions");
            
            
            /**
             * Gets the "Duration" element
             */
            public int getDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Duration" element
             */
            public org.apache.xmlbeans.XmlInt xgetDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Duration" element
             */
            public void setDuration(int duration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$0);
                    }
                    target.setIntValue(duration);
                }
            }
            
            /**
             * Sets (as xml) the "Duration" element
             */
            public void xsetDuration(org.apache.xmlbeans.XmlInt duration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DURATION$0);
                    }
                    target.set(duration);
                }
            }
            
            /**
             * Gets the "BilledDuration" element
             */
            public int getBilledDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLEDDURATION$2, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "BilledDuration" element
             */
            public org.apache.xmlbeans.XmlInt xgetBilledDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BILLEDDURATION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "BilledDuration" element
             */
            public void setBilledDuration(int billedDuration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLEDDURATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLEDDURATION$2);
                    }
                    target.setIntValue(billedDuration);
                }
            }
            
            /**
             * Sets (as xml) the "BilledDuration" element
             */
            public void xsetBilledDuration(org.apache.xmlbeans.XmlInt billedDuration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BILLEDDURATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BILLEDDURATION$2);
                    }
                    target.set(billedDuration);
                }
            }
            
            /**
             * Gets the "BilledAmount" element
             */
            public float getBilledAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLEDAMOUNT$4, 0);
                    if (target == null)
                    {
                      return 0.0f;
                    }
                    return target.getFloatValue();
                }
            }
            
            /**
             * Gets (as xml) the "BilledAmount" element
             */
            public org.apache.xmlbeans.XmlFloat xgetBilledAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlFloat target = null;
                    target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BILLEDAMOUNT$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "BilledAmount" element
             */
            public void setBilledAmount(float billedAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLEDAMOUNT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLEDAMOUNT$4);
                    }
                    target.setFloatValue(billedAmount);
                }
            }
            
            /**
             * Sets (as xml) the "BilledAmount" element
             */
            public void xsetBilledAmount(org.apache.xmlbeans.XmlFloat billedAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlFloat target = null;
                    target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BILLEDAMOUNT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(BILLEDAMOUNT$4);
                    }
                    target.set(billedAmount);
                }
            }
            
            /**
             * Gets the "Attempts" element
             */
            public int getAttempts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTEMPTS$6, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Attempts" element
             */
            public org.apache.xmlbeans.XmlInt xgetAttempts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTEMPTS$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Attempts" element
             */
            public void setAttempts(int attempts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTEMPTS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTEMPTS$6);
                    }
                    target.setIntValue(attempts);
                }
            }
            
            /**
             * Sets (as xml) the "Attempts" element
             */
            public void xsetAttempts(org.apache.xmlbeans.XmlInt attempts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTEMPTS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ATTEMPTS$6);
                    }
                    target.set(attempts);
                }
            }
            
            /**
             * Gets the "Actions" element
             */
            public int getActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$8, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Actions" element
             */
            public org.apache.xmlbeans.XmlInt xgetActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIONS$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Actions" element
             */
            public void setActions(int actions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONS$8);
                    }
                    target.setIntValue(actions);
                }
            }
            
            /**
             * Sets (as xml) the "Actions" element
             */
            public void xsetActions(org.apache.xmlbeans.XmlInt actions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIONS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIONS$8);
                    }
                    target.set(actions);
                }
            }
        }
        /**
         * An XML ResultStat(@http://api.callfire.com/data).
         *
         * This is a complex type.
         */
        public static class ResultStatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.BroadcastStatsDocument.BroadcastStats.ResultStat
        {
            
            public ResultStatImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESULT$0 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Result");
            private static final javax.xml.namespace.QName ATTEMPTS$2 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Attempts");
            private static final javax.xml.namespace.QName ACTIONS$4 = 
                new javax.xml.namespace.QName("http://api.callfire.com/data", "Actions");
            
            
            /**
             * Gets the "Result" element
             */
            public com.callfire.api.data.Result.Enum getResult()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (com.callfire.api.data.Result.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Result" element
             */
            public com.callfire.api.data.Result xgetResult()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.Result target = null;
                    target = (com.callfire.api.data.Result)get_store().find_element_user(RESULT$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Result" element
             */
            public void setResult(com.callfire.api.data.Result.Enum result)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$0);
                    }
                    target.setEnumValue(result);
                }
            }
            
            /**
             * Sets (as xml) the "Result" element
             */
            public void xsetResult(com.callfire.api.data.Result result)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.callfire.api.data.Result target = null;
                    target = (com.callfire.api.data.Result)get_store().find_element_user(RESULT$0, 0);
                    if (target == null)
                    {
                      target = (com.callfire.api.data.Result)get_store().add_element_user(RESULT$0);
                    }
                    target.set(result);
                }
            }
            
            /**
             * Gets the "Attempts" element
             */
            public int getAttempts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTEMPTS$2, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Attempts" element
             */
            public org.apache.xmlbeans.XmlInt xgetAttempts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTEMPTS$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Attempts" element
             */
            public void setAttempts(int attempts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTEMPTS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTEMPTS$2);
                    }
                    target.setIntValue(attempts);
                }
            }
            
            /**
             * Sets (as xml) the "Attempts" element
             */
            public void xsetAttempts(org.apache.xmlbeans.XmlInt attempts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTEMPTS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ATTEMPTS$2);
                    }
                    target.set(attempts);
                }
            }
            
            /**
             * Gets the "Actions" element
             */
            public int getActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$4, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Actions" element
             */
            public org.apache.xmlbeans.XmlInt xgetActions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIONS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Actions" element
             */
            public void setActions(int actions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONS$4);
                    }
                    target.setIntValue(actions);
                }
            }
            
            /**
             * Sets (as xml) the "Actions" element
             */
            public void xsetActions(org.apache.xmlbeans.XmlInt actions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIONS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIONS$4);
                    }
                    target.set(actions);
                }
            }
        }
    }
}
