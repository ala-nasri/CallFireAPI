
/**
 * ServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package callfire.api.wsdl;

public class ServiceFault extends java.lang.Exception{

    private static final long serialVersionUID = 1372726673896L;
    
    private com.callfire.api.service.xsd.ServiceFaultInfoDocument faultMessage;

    
        public ServiceFault() {
            super("ServiceFault");
        }

        public ServiceFault(java.lang.String s) {
           super(s);
        }

        public ServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.callfire.api.service.xsd.ServiceFaultInfoDocument msg){
       faultMessage = msg;
    }
    
    public com.callfire.api.service.xsd.ServiceFaultInfoDocument getFaultMessage(){
       return faultMessage;
    }
}
    