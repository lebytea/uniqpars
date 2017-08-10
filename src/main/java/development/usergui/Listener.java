package development.usergui;

/**
 * Created by Home on 10.08.2017.
 */
public class Listener {
    public String userLoadFile;
    public String userPashFileForSafe;
    public boolean flagVocabulary;

    public void setDataUserOne(){
        //input date from user
        this.userLoadFile = ".\\src\\test\\java\\development\\usergui\\PathSource";
        this.userPashFileForSafe = ".\\src\\main\\resources\\UserDate\\User_1_Vocabulary_1";
        this.flagVocabulary = true; //find all diffrent words

    }
}
