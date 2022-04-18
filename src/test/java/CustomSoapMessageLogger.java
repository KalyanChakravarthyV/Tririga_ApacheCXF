import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomSoapMessageLogger implements SOAPHandler<SOAPMessageContext> {

    private static final Logger logger =
            Logger.getLogger(CustomSoapMessageLogger.class.getName());

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        // Retrieve the message contents
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            context.getMessage().writeTo(stream);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // You've got your XML message and can log it right away or
        // beautify it with some library before sending to log
        logger.log(Level.INFO, (isRequest ? "Request:" : "Response:") + stream.toString());
        System.out.println((isRequest ? "Request:" : "Response:") + stream.toString());
        return true;
    }

    /* For the logging purposes the following methods can be leaved as stubs */

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {
    }
}
