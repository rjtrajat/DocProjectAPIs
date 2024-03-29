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

	public static void sendMailDocHosTestMedClass( String name,String mail,String contact, String experience_month, String experience_year,String typeRegister){
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
          
        String messageToSend = "";
        
        messageToSend   += "<html>";
        messageToSend   += "<body >";
        messageToSend   += "<div style=\"height:100%;background-color:#f2f2f2\">";
        messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
        messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:white\">";
        messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
		 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
		 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
        messageToSend   += " </tr>";
        messageToSend   += " </table>";
        messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
        messageToSend   += "  <br>";
		 messageToSend   += "  <br>";
		 messageToSend   += " Hi ,<br>";
		 messageToSend   += " Thanks for Registration on CIS"; 
		 messageToSend   += " </br>";
		 messageToSend   += " </div>";
   		 messageToSend   += " <br>";
		 messageToSend   += " <center>";
		 messageToSend   += " <table rules=\"all\" style=\"width:50%; border-style: solid;border-color: #13866f ;border-width: 2px;border-radius: 20px;color:#13866f;background-color:white ;\"; cellpadding=\"10\">";
		 messageToSend   += " <tr style=\"background-color: #169c81 ; height:50px;color:white\">";
		 messageToSend   += "     <td><strong>CIS</strong> </td>";
		 messageToSend   += "   </tr>";
		 messageToSend   += "   <tr  >";
		 messageToSend   += "     <td><strong>Name :</strong> ";
		 messageToSend   += name;
		 messageToSend   += "  </td>";
		 messageToSend   += "   <tr>";
		 messageToSend   += "      <td><strong>Mail :</strong> ";
		 messageToSend   += mail;
		 messageToSend   += "  </td>";
		 messageToSend   += "    </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Contact :</strong> ";
		 messageToSend   += contact;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Experience Month :</strong> ";
		 messageToSend   += experience_month;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Experience Year :</strong> ";
		 messageToSend   += experience_year;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Register Type :</strong> ";
		 messageToSend   += typeRegister;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     </table>";
		 messageToSend   += "  </center>";
		 messageToSend   += "     <br>";
		 messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
		 messageToSend   += "   <br>";
		 messageToSend   += "   Regards,";
		 messageToSend   += "   <br>";
		  
		 messageToSend   += "         Team CIS <br><br></br><br></br>";
		 messageToSend   += "   </div>";
		 messageToSend   += "    </div> ";
		 messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
	        messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:#13866f\">";
	        messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
			 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
			 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
	        messageToSend   += " </tr>";
	        messageToSend   += " </table>";
		 messageToSend   += " </body>";
		 messageToSend   += " </html>";

        message.setContent(messageToSend,"text/html");
        
        
        
       //send the message  
        Transport.send(message);  
     
        System.out.println("message sent successfully...");  
      
        } catch (MessagingException e) {e.printStackTrace();}  
    
	}
	
	public static void sendMailPatientClass(String uniquekeyappointmentGlobal,String nameofpatientGlobal,String contactofpatientGlobal,String mailidofpatientGlobal,String problemdescriptionofpatientGlobal,String fulladdressofpatientGlobal,String statusvalueGlobal,String dateofappointmentGlobal,String timeofappointmentGlobal,String appointmenttypeGlobal,String appointmenttypekeyGlobal,String DocHosTestNameGlobal,String DocHosTestAboutGlobal,String DocHosTestAddressGlobal,String DocHosTestExperienceGlobal,String DocHosTestMail_idGlobal,String DocHosTestMobile_NoGlobal,String DocHosTestSpecializationGlobal){
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
      
       String messageToSend = "";
       String DoctorHospital="";
       
       if(appointmenttypeGlobal.equals("DOCTOR"))
    	   DoctorHospital = "Doctor";
       else if(appointmenttypeGlobal.equals("HOSPITAL"))
    	   DoctorHospital = "Hospital";
       else
    	   DoctorHospital = "Test Center";
       
       messageToSend   += "<html>";
       messageToSend   += "<body >";
       messageToSend   += "<div style=\"height:100%;background-color:#f2f2f2\">";
       messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
       messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:white\">";
       messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
		 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
		 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
       messageToSend   += " </tr>";
       messageToSend   += " </table>";
       messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
       messageToSend   += "  <br>";
		 messageToSend   += "  <br>";
		 messageToSend   += " Hi ,<br>";
		 messageToSend   += "Your Appointment is confirmed"; 
		 messageToSend   += " </br>";
		 messageToSend   += " </div>";
  		 messageToSend   += " <br>";
		 messageToSend   += " <center>";
		 messageToSend   += " <table rules=\"all\" style=\"width:50%; border-style: solid;border-color: #13866f ;border-width: 2px;border-radius: 20px;color:#13866f;background-color:white ;\"; cellpadding=\"10\">";
		 messageToSend   += " <tr style=\"background-color: #169c81 ; height:50px;color:white\">";
		 messageToSend   += "     <td><strong>CIS</strong> </td>";
		 messageToSend   += "   </tr>";
		 messageToSend   += "   <tr  >";
		 messageToSend   += "     <td><strong>Name : </strong> ";
		 messageToSend   += nameofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "   <tr>";
		 messageToSend   += "      <td><strong>Mail : </strong> ";
		 messageToSend   += mailidofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "    </tr>";
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Contact : </strong> ";
		 messageToSend   += contactofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>CISKey : </strong> ";
		 messageToSend   += uniquekeyappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Problem Description : </strong> ";
		 messageToSend   += problemdescriptionofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Address : </strong> ";
		 messageToSend   += fulladdressofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Status : </strong> ";
		 messageToSend   +=  statusvalueGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Date : </strong> ";
		 messageToSend   +=  dateofappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Time : </strong> ";
		 messageToSend   +=  timeofappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Type : </strong> ";
		 messageToSend   +=  appointmenttypeGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>";
		 
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" Name : </strong> ";
		 messageToSend   +=  DocHosTestNameGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>About ";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" : </strong> ";
		 messageToSend   +=  DocHosTestAboutGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" Address : </strong> ";
		 messageToSend   +=  DocHosTestAddressGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>About ";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" : </strong> ";
		 messageToSend   +=  DocHosTestAboutGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" Mail : </strong> ";
		 messageToSend   +=  DocHosTestMail_idGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" Mobile : </strong> ";
		 messageToSend   +=  DocHosTestMobile_NoGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>";
		 messageToSend   +=DoctorHospital;
		 messageToSend   +=" Specialization : </strong> ";
		 messageToSend   +=  DocHosTestSpecializationGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 
		 messageToSend   += "     </table>";
		 messageToSend   += "  </center>";
		 messageToSend   += "     <br>";
		 messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
		 messageToSend   += "   <br>";
		 messageToSend   += "   Regards,";
		 messageToSend   += "   <br>";
		  
		 messageToSend   += "         Team CIS <br><br></br><br></br>";
		 messageToSend   += "   </div>";
		 messageToSend   += "    </div> ";
		 messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
	        messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:#13866f\">";
	        messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
			 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
			 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
	        messageToSend   += " </tr>";
	        messageToSend   += " </table>";
		 messageToSend   += " </body>";
		 messageToSend   += " </html>";

       message.setContent(messageToSend,"text/html");
       
       
      //send the message  
       Transport.send(message); 
       
       
       
       message = new MimeMessage(session);  
       message.setFrom(new InternetAddress(user));  
       message.addRecipient(Message.RecipientType.TO,new InternetAddress(DocHosTestMail_idGlobal));  
       message.setSubject("Appointment Confirmation");  
      
        messageToSend = "";
     
       
       messageToSend   += "<html>";
       messageToSend   += "<body >";
       messageToSend   += "<div style=\"height:100%;background-color:#f2f2f2\">";
       messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
       messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:white\">";
       messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
		 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
		 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
       messageToSend   += " </tr>";
       messageToSend   += " </table>";
       messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
       messageToSend   += "  <br>";
		 messageToSend   += "  <br>";
		 messageToSend   += " Hi ,<br>";
		 messageToSend   += "A patient has scheduled a appointment "; 
		 messageToSend   += " </br>";
		 messageToSend   += " </div>";
  		 messageToSend   += " <br>";
		 messageToSend   += " <center>";
		 messageToSend   += " <table rules=\"all\" style=\"width:50%; border-style: solid;border-color: #13866f ;border-width: 2px;border-radius: 20px;color:#13866f;background-color:white ;\"; cellpadding=\"10\">";
		 messageToSend   += " <tr style=\"background-color: #169c81 ; height:50px;color:white\">";
		 messageToSend   += "     <td><strong>CIS</strong> </td>";
		 messageToSend   += "   </tr>";
		 messageToSend   += "   <tr  >";
		 messageToSend   += "     <td><strong>Name : </strong> ";
		 messageToSend   += nameofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "   <tr>";
		 messageToSend   += "      <td><strong>Mail : </strong> ";
		 messageToSend   += mailidofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "    </tr>";
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Contact : </strong> ";
		 messageToSend   += contactofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>CISKey : </strong> ";
		 messageToSend   += uniquekeyappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Problem Description : </strong> ";
		 messageToSend   += problemdescriptionofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Address : </strong> ";
		 messageToSend   += fulladdressofpatientGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Status : </strong> ";
		 messageToSend   +=  statusvalueGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Date : </strong> ";
		 messageToSend   +=  dateofappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Time : </strong> ";
		 messageToSend   +=  timeofappointmentGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 
		 messageToSend   += "     <tr>";
		 messageToSend   += "     <td><strong>Appointment Type : </strong> ";
		 messageToSend   +=  appointmenttypeGlobal;
		 messageToSend   += "  </td>";
		 messageToSend   += "       </tr>";
		 
		 messageToSend   += "     </table>";
		 messageToSend   += "  </center>";
		 messageToSend   += "     <br>";
		 messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
		 messageToSend   += "   <br>";
		 messageToSend   += "   Regards,";
		 messageToSend   += "   <br>";
		  
		 messageToSend   += "         Team CIS <br><br></br><br></br>";
		 messageToSend   += "   </div>";
		 messageToSend   += "    </div> ";
		 messageToSend   += " <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
	        messageToSend   += " <tr style=\"background-color: #13866f ; height:50px;color:#13866f\">";
	        messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
			 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
			 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
	        messageToSend   += " </tr>";
	        messageToSend   += " </table>";
		 messageToSend   += " </body>";
		 messageToSend   += " </html>";

       message.setContent(messageToSend,"text/html");
       
       
      //send the message  
       Transport.send(message);  
    
       
       
    
       System.out.println("message sent successfully...");  
     
       } catch (MessagingException e) {e.printStackTrace();}  
    
	}
	
 static public void sendReq(){
	 
	 
	 String port = "465";;
     String sport = "465";

 String host="smtp.gmail.com";  
 final String user="ciscureissure@gmail.com";//change accordingly  
 final String password="ciscureissurerajat";//change accordingly  
   
 String to="rjtrajatsingh2016@gmail.com";//change accordingly  
 
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
    message.setSubject("CureIsSure (CIS) : Registration Invitation");  
      
    String messageToSend = "";
    
   
		messageToSend   += "<html>";
		 messageToSend   += "<body >";
		 messageToSend   += "   <div style=\"height:100%;background-color:#f2f2f2\">";	
		 messageToSend   += "   <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
		 messageToSend   += "      <tr style=\"background-color: #13866f ; height:50px;color:white\">";
		 messageToSend   += "        <td><img src=\"https://cureissure.000webhostapp.com/logotwo.png\" style=\"height:25px;float:left;\">";        
		 messageToSend   += "     <strong><b><div style=\"float:left\"> <font size=\"4";
		 messageToSend   += "   \">  &nbsp;CureIsSure</font></div></b></strong> </td>";
		 messageToSend   += "     </tr>";
		 messageToSend   += "  </table>";
		 messageToSend   += "  <div style=\"margin-left:20px;color:#13866f;\">";
		messageToSend   += "    <br> <b> Hello ,</b>";
		 messageToSend   += "     <br>";
		 messageToSend   += "   <div style=\"margin-left:20px;\">";
		messageToSend   += "      <b>  Sir/Madam </b>";
		 messageToSend   += "  </div>";
		 messageToSend   += "  <div>";
		 messageToSend   += "      <div style=\"margin-left:20px;\">";
		messageToSend   += "    <br>";
		 messageToSend   += "     We <b>CureIsSure(CIS)</b> team is working on online medical platform to book  appointment with <b>Doctors , Hospitals and Test Centers</b> .";
		 messageToSend   += "     <br>";
		 messageToSend   += "     Anyone needs medical help they can find nearby medical assistance by schedulling their appointments with docotor or in a Hospital .";
		 messageToSend   += "    <br>";
		 messageToSend   += "   <br> It is also a best opportunity for Doctors , Hospital and Test Center owners to regitser with CIS using our<b> Android app CureIsSure(CIS)</b>.";
		 messageToSend   += "     <br>";
		 messageToSend   += "      Since we are new in this , we promise to improve our service day by day .";
		 messageToSend   += "       <br>";
		 messageToSend   += "    <br>";
		 messageToSend   += "   So , we kindly request you to join us and help us in improving our service .";
		 messageToSend   += "      <br>";
		 messageToSend   += "      <br>";
		 messageToSend   += "      <b>Android App :</b> https://play.google.com/store/apps/details?id=com.cureissure.cis";
		 messageToSend   += "       <br><br>";
		 messageToSend   += "       Please , use above android app or using attached apk file <b> (CISApp.apk)</b>  to install and register your hospitals , test centers and as a doctor . ";
		 messageToSend   += "     <br>";
		 messageToSend   += "      <br>";
		 messageToSend   += "      Please , find attached images to know more about CIS and please revert us on  for any query , we will love to answer your questions.";
		 messageToSend   += " </div>";
		 messageToSend   += "         <br>";
		 messageToSend   += "         <br>";
		 messageToSend   += "         <b>";
		 messageToSend   += "         Regards,";
		 messageToSend   += "         <br>";
		 messageToSend   += "       CIS team";
		 messageToSend   += "        </b>";
		 messageToSend   += "    </div>";
		 messageToSend   += "     </br>";
		 messageToSend   += "</div>";
		 messageToSend   += " <br>";
		 messageToSend   += " <center> </center>";
		 messageToSend   += "   <br>";
		 messageToSend   += "   <div style=\"color:#13866f;\">";
		messageToSend   += "   <table rules=\"all\" style=\"width:100%;border-color: #13866f ;color:#13866f;background-color:#f2f2f2\"; cellpadding=\"10\">";
		messageToSend   += "      <tr style=\"background-color: #13866f ; height:50px;color:#13866f\">";
		messageToSend   += "          <td><strong><b>CureIsSure</b></strong> </td>";
		 messageToSend   += "      </tr>";
		 messageToSend   += "    </table>";
		 messageToSend   += " </body>";
		 messageToSend   += "</html>";


    message.setContent(messageToSend,"text/html");
    
    
    
   //send the message  
    Transport.send(message);  
 
    System.out.println("message sent successfully...");  
  
    } catch (MessagingException e) {e.printStackTrace();} 
	 
 }
	
}
