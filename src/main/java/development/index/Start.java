package development.index;

import development.tools.Parser;
import development.tools.ReaderFileTxt;
import development.tools.WriteFileTxt;
import development.usergui.Listener;

/**
 * Created by Home on 10.08.2017.
 */
public class Start {
    public static void main(String[] args) {

        //User-Gui (Web || App)
            //modeling input user from gui
        Listener listener = new Listener();
        listener.setDataUserOne();

        String userLoadFile = listener.userLoadFile;
        boolean flagVocabulary = listener.flagVocabulary;
        String userPashFileForSafe = listener.userPashFileForSafe;

        ReaderFileTxt readerFileTxt = new ReaderFileTxt();
        String resultStringText = readerFileTxt.getStringText(userLoadFile);

        Parser parser = new Parser();
        String readyVocabulary = parser.getVocabulary(resultStringText);

        WriteFileTxt writeFileTxt = new WriteFileTxt();
        writeFileTxt.writeToFileTxt(readyVocabulary, userPashFileForSafe);

    }

}
