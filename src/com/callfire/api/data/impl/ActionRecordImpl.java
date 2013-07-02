/*
 * XML Type:  ActionRecord
 * Namespace: http://api.callfire.com/data
 * Java type: com.callfire.api.data.ActionRecord
 *
 * Automatically generated - do not modify.
 */
package com.callfire.api.data.impl;
/**
 * An XML ActionRecord(@http://api.callfire.com/data).
 *
 * This is a complex type.
 */
public class ActionRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ActionRecord
{
    
    public ActionRecordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULT$0 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "Result");
    private static final javax.xml.namespace.QName FINISHTIME$2 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "FinishTime");
    private static final javax.xml.namespace.QName BILLEDAMOUNT$4 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "BilledAmount");
    private static final javax.xml.namespace.QName QUESTIONRESPONSE$6 = 
        new javax.xml.namespace.QName("http://api.callfire.com/data", "QuestionResponse");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
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
     * Gets the "FinishTime" element
     */
    public java.util.Calendar getFinishTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISHTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "FinishTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFinishTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISHTIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FinishTime" element
     */
    public void setFinishTime(java.util.Calendar finishTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISHTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISHTIME$2);
            }
            target.setCalendarValue(finishTime);
        }
    }
    
    /**
     * Sets (as xml) the "FinishTime" element
     */
    public void xsetFinishTime(org.apache.xmlbeans.XmlDateTime finishTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISHTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FINISHTIME$2);
            }
            target.set(finishTime);
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
     * Gets array of all "QuestionResponse" elements
     */
    public com.callfire.api.data.ActionRecord.QuestionResponse[] getQuestionResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUESTIONRESPONSE$6, targetList);
            com.callfire.api.data.ActionRecord.QuestionResponse[] result = new com.callfire.api.data.ActionRecord.QuestionResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuestionResponse" element
     */
    public com.callfire.api.data.ActionRecord.QuestionResponse getQuestionResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionRecord.QuestionResponse target = null;
            target = (com.callfire.api.data.ActionRecord.QuestionResponse)get_store().find_element_user(QUESTIONRESPONSE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuestionResponse" element
     */
    public int sizeOfQuestionResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTIONRESPONSE$6);
        }
    }
    
    /**
     * Sets array of all "QuestionResponse" element
     */
    public void setQuestionResponseArray(com.callfire.api.data.ActionRecord.QuestionResponse[] questionResponseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(questionResponseArray, QUESTIONRESPONSE$6);
        }
    }
    
    /**
     * Sets ith "QuestionResponse" element
     */
    public void setQuestionResponseArray(int i, com.callfire.api.data.ActionRecord.QuestionResponse questionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionRecord.QuestionResponse target = null;
            target = (com.callfire.api.data.ActionRecord.QuestionResponse)get_store().find_element_user(QUESTIONRESPONSE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(questionResponse);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuestionResponse" element
     */
    public com.callfire.api.data.ActionRecord.QuestionResponse insertNewQuestionResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionRecord.QuestionResponse target = null;
            target = (com.callfire.api.data.ActionRecord.QuestionResponse)get_store().insert_element_user(QUESTIONRESPONSE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuestionResponse" element
     */
    public com.callfire.api.data.ActionRecord.QuestionResponse addNewQuestionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.callfire.api.data.ActionRecord.QuestionResponse target = null;
            target = (com.callfire.api.data.ActionRecord.QuestionResponse)get_store().add_element_user(QUESTIONRESPONSE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuestionResponse" element
     */
    public void removeQuestionResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTIONRESPONSE$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    /**
     * An XML QuestionResponse(@http://api.callfire.com/data).
     *
     * This is a complex type.
     */
    public static class QuestionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.callfire.api.data.ActionRecord.QuestionResponse
    {
        
        public QuestionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUESTION$0 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Question");
        private static final javax.xml.namespace.QName RESPONSE$2 = 
            new javax.xml.namespace.QName("http://api.callfire.com/data", "Response");
        
        
        /**
         * Gets the "Question" element
         */
        public java.lang.String getQuestion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Question" element
         */
        public org.apache.xmlbeans.XmlString xgetQuestion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Question" element
         */
        public void setQuestion(java.lang.String question)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTION$0);
                }
                target.setStringValue(question);
            }
        }
        
        /**
         * Sets (as xml) the "Question" element
         */
        public void xsetQuestion(org.apache.xmlbeans.XmlString question)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTION$0);
                }
                target.set(question);
            }
        }
        
        /**
         * Gets the "Response" element
         */
        public java.lang.String getResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Response" element
         */
        public org.apache.xmlbeans.XmlString xgetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Response" element
         */
        public void setResponse(java.lang.String response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSE$2);
                }
                target.setStringValue(response);
            }
        }
        
        /**
         * Sets (as xml) the "Response" element
         */
        public void xsetResponse(org.apache.xmlbeans.XmlString response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSE$2);
                }
                target.set(response);
            }
        }
    }
}
