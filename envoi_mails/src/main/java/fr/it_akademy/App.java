package fr.it_akademy;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws EmailException
    {
        try{
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("l.marque@it-students.fr", "itakademymail"));
            email.setSSLOnConnect(true);
            email.setFrom("KimJong-Un@gmail.com");
            email.setSubject("TestMail");
            email.setMsg("This is a test mail ... :-)");
            email.addTo("a.falcoz@it-students.fr");
            email.send();
        }catch (Exception e) {
            System.out.println("Email pas envoyé " + e.getMessage());
        }
    }
}
