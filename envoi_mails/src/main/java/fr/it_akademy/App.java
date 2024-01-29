package fr.it_akademy;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.HtmlEmail;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws EmailException
    {
        try{
            HtmlEmail email = new HtmlEmail();
            email.setHostName("ssl0.ovh.net");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("apprenants.it_akademy@clelia.fr", "P61;Java21"));
            email.setSSLOnConnect(true);
            email.setFrom("KimJong-Un@gmail.com");
            email.setSubject("Envoi de missiles");

            email.setMsg("<html><body><p>Ceci est un message envoyé par <b>Kim Jong-Un</b> avec du <i>HTML</i>... :-)</p></body></html>");

            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath("envoi_mails\\src\\main\\java\\fr\\it_akademy\\opla.jpg");
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Description du fichier");
            attachment.setName("Le leader suprême"); 
            email.attach(attachment);

            email.addTo("fxcote@clelia.fr");
            email.send();
            System.out.println("email envoyé avec succès");
        }catch (Exception e) {
            System.out.println("Email pas envoyé " + e.getMessage());
        }
    }
}
