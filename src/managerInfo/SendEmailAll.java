package managerInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailAll {
	String subject;
	String body;
	SendEmailAll(String subject,String body)
	{
		this.subject=subject;
		this.body=body;
	}
	
  public void send(String toUser) throws FileNotFoundException {
  final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
  // Get a Properties object
     Properties props = System.getProperties();
     props.setProperty("mail.smtp.host", "smtp.gmail.com");
     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
     props.setProperty("mail.smtp.socketFactory.fallback", "false");
     props.setProperty("mail.smtp.port", "465");
     props.setProperty("mail.smtp.socketFactory.port", "465");
     props.put("mail.smtp.auth", "true");
     props.put("mail.debug", "true");
     props.put("mail.store.protocol", "pop3");
     props.put("mail.transport.protocol", "smtp");
     
     final String username = "managerdot03@gmail.com";//
     final String password = "dot12345%";
     
     try{
     Session session = Session.getDefaultInstance(props, 
                          new Authenticator(){
                             protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                             }});
     

   // -- Create a new message --
     Message msg = new MimeMessage(session);

  // -- Set the FROM and TO fields --
     msg.setFrom(new InternetAddress("managerdot03@gmail.com"));
     msg.setRecipients(Message.RecipientType.TO, 
                      InternetAddress.parse(toUser,false));  //mail name of the user u want
     msg.setSubject(this.subject);   //setting the subject name
     msg.setText(this.body);		//setting the body
     msg.setSentDate(new Date());	//setting date
     Transport.send(msg);
     System.out.println("Message sent.");
  }catch (MessagingException e){ System.out.println("Error because: " + e);}
  }
  public void sendtoAll() throws FileNotFoundException {
	  final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	  // Get a Properties object
	     Properties props = System.getProperties();
	     props.setProperty("mail.smtp.host", "smtp.gmail.com");
	     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	     props.setProperty("mail.smtp.socketFactory.fallback", "false");
	     props.setProperty("mail.smtp.port", "465");
	     props.setProperty("mail.smtp.socketFactory.port", "465");
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.debug", "true");
	     props.put("mail.store.protocol", "pop3");
	     props.put("mail.transport.protocol", "smtp");
	     
	     final String username = "managerdot03@gmail.com";//
	     final String password = "dot12345%";
	     
	     try{
	     Session session = Session.getDefaultInstance(props, 
	                          new Authenticator(){
	                             protected PasswordAuthentication getPasswordAuthentication() {
	                                return new PasswordAuthentication(username, password);
	                             }});
	     

	   // -- Create a new message --
	     Message msg = new MimeMessage(session);

	  // -- Set the FROM and TO fields --
	     Scanner scan = new Scanner(new FileReader(".\\Records\\Managers\\Member's Emails.txt"));
	     String toUser = "";
	     while(scan.hasNextLine())
	     {
	    	 toUser=scan.nextLine().trim();
	    	 msg.setFrom(new InternetAddress("managerdot03@gmail.com"));
	    	 msg.setRecipients(Message.RecipientType.TO, 
	    			 InternetAddress.parse(toUser,false));  //mail name of the user u want
	    	 msg.setSubject(this.subject);   //setting the subject name
	    	 msg.setText(this.body);		//setting the body
	    	 msg.setSentDate(new Date());	//setting date
	    	 Transport.send(msg);
	    	 System.out.println("Message sent.");
	     
	     }
	  }catch (MessagingException e){ System.out.println("Error because: " + e);}
	  }
}