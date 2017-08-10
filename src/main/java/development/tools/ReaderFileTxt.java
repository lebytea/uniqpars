package development.tools;

import java.io.*;

/**
 * Created by Home on 10.08.2017.
 */
public class ReaderFileTxt {

    //reader for Txt-file. For other it must be check\test

    public String getStringText(String pathSource) {

        String filePath = pathSource;

        String resultStringText = "";
        StringBuffer myStringBuff = new StringBuffer();

        try (FileInputStream myFile = new FileInputStream(filePath);
             BufferedInputStream myBuff = new BufferedInputStream(myFile);) {


            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            reader.readLine();

            int ch;
            while ((ch = myBuff.read()) > -1) {
                myStringBuff.append((char) ch);
            }
            resultStringText = myStringBuff.toString();

        } catch (IOException e) {
            System.out.println("There some problem with read from file: " + filePath + " \n " + "Attension - IOException >> " + e);

        }
        return resultStringText;
    }
}