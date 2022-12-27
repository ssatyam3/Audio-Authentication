package VoiceAuthentication;

import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;

/**
 *
 * @author Owen
 */
public class TextAreaOutputStream extends OutputStream
{
    private static int BUFFER_SIZE = 8192;
    private JTextArea target;
    private byte[] buffer = new byte[BUFFER_SIZE];
    private int pos = 0;

    /**
     *
     * @param target
     */
    public TextAreaOutputStream(JTextArea target)
    {
        this.target = target;
    }

    /**
     *
     * @param b
     * @throws IOException
     */
    @Override
    public void write(int b) throws IOException
    {
        buffer[pos++] = (byte)b;
        //Append to the TextArea when the buffer is full
        if (pos == BUFFER_SIZE) {
            flush();
        }
    }

    /**
     *
     * @throws IOException
     */
    @Override
    public void flush() throws IOException
    {
        byte[] flush = null;
        if (pos != BUFFER_SIZE) {
            flush = new byte[pos];
            System.arraycopy(buffer, 0, flush, 0, pos);
        }
        else {
            flush = buffer;
        }

        target.append(new String(flush));
        pos = 0;
    }
}