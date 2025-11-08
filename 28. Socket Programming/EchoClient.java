import java.net.*;
import java.io.*;
import javax.swing.*;

public class EchoClient {
    public static void main(String[] args)
    {
        try
        {
            Socket s = new Socket("localhost", 2222);

            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            String msg = JOptionPane.showInputDialog("Please enter your name: ");

            pw.println(msg);

            msg = br.readLine();
            JOptionPane.showMessageDialog(null, msg);

            s.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}