package com.cureissure.cis.Mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RequestParam;

public class MailNotification {

	public static void sendMailDocHosTestMedClass( String name,String mail,String contact, String experience_month, String experience_year){
		String port = "465";;
	     String sport = "465";
	
     String host="smtp.gmail.com";  
     final String user="ciscureissure@gmail.com";//change accordingly  
     final String password="ciscureissurerajat";//change accordingly  
       
     String to=mail;//change accordingly  
     
      //Get the session object  
      Properties props = new Properties();  
      props.put("mail.smtp.host",host);  
      props.put("mail.smtp.auth", "true"); 
      props.put("mail.smtp.port", port);
       props.put("mail.smtp.socketFactory.port", sport);
       props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       props.put("mail.smtp.socketFactory.fallback", "false");
      
      
        
      Session session = Session.getDefaultInstance(props,  
       new javax.mail.Authenticator() {  
         protected PasswordAuthentication getPasswordAuthentication() {  
       return new PasswordAuthentication(user,password);  
         }  
       });  
     
      //Compose the message  
       try {  
        MimeMessage message = new MimeMessage(session);  
        message.setFrom(new InternetAddress(user));  
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
        message.setSubject("CureIsSure Registration Confirmation");  
        message.setText("Hi "+name+" your "+mail+" is registered on CureIsSure(CIS) with contact "+contact+". And will contact you Soon");  
          
       //send the message  
        Transport.send(message);  
     
        System.out.println("message sent successfully...");  
      
        } catch (MessagingException e) {e.printStackTrace();}  
    
	}
	
	public static void sendMailPatientClass(String uniquekeyappointmentGlobal,String nameofpatientGlobal,String contactofpatientGlobal,String mailidofpatientGlobal,String problemdescriptionofpatientGlobal,String fulladdressofpatientGlobal,String statusvalueGlobal,String dateofappointmentGlobal,String timeofappointmentGlobal,String appointmenttypeGlobal,String appointmenttypekeyGlobal){
		String port = "465";;
	     String sport = "465";
	
    String host="smtp.gmail.com";  
    final String user="ciscureissure@gmail.com";//change accordingly  
    final String password="ciscureissurerajat";//change accordingly  
      
    String to=mailidofpatientGlobal;//change accordingly  
    
     //Get the session object  
     Properties props = new Properties();  
     props.put("mail.smtp.host",host);  
     props.put("mail.smtp.auth", "true"); 
     props.put("mail.smtp.port", port);
      props.put("mail.smtp.socketFactory.port", sport);
      props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
      props.put("mail.smtp.socketFactory.fallback", "false");
     
     
       
     Session session = Session.getDefaultInstance(props,  
      new javax.mail.Authenticator() {  
        protected PasswordAuthentication getPasswordAuthentication() {  
      return new PasswordAuthentication(user,password);  
        }  
      });  
    
     //Compose the message  
      try {  
       MimeMessage message = new MimeMessage(session);  
       message.setFrom(new InternetAddress(user));  
       message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
       message.setSubject("Appointment Confirmation");  
       message.setText("Hi "+nameofpatientGlobal+" your appointment confirmed with detail : "+mailidofpatientGlobal);  
         
      //send the message  
       Transport.send(message);  
    
       System.out.println("message sent successfully...");  
     
       } catch (MessagingException e) {e.printStackTrace();}  
    
	}
	
}
