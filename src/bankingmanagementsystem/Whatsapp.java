package bankingmanagementsystem;
import com.twilio.Twilio; 

import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.type.PhoneNumber; 
import java.net.URI; 
import java.util.*; 
import java.math.BigDecimal; 
 
public class Whatsapp{ 
   
    public static final String ACCOUNT_SID = "AC7a27e3368c1862542b584b72480d215d"; 
    public static final String AUTH_TOKEN = "c0a35b178f0b792a1afd2b831d1f8e05"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
       Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+923102228963"), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                "BAASIL HERE Your OTP  code is 1238432")      
            .create(); 
        System.out.println(message.getSid()); 
    } 
}
    

