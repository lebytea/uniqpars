package development.tools;


import java.io.*;

public class WriteFileTxt {

    public void writeToFileTxt(String readyVocabulary, String userPathFileForSafe){

        String filePath = userPathFileForSafe;
        StringBuffer myStringBuff = new StringBuffer();

        try (FileOutputStream myFile = new FileOutputStream(userPathFileForSafe);
             Writer myOut = new BufferedWriter(new OutputStreamWriter(myFile, "UTF8"));){

            myOut.write(readyVocabulary);
            //  ;

        } catch (IOException e) {
            System.out.println("There some problem with read from file: " + filePath + " \n " + "Attension - IOException >> " + e);

        }



    }
}
