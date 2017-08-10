package development.usergui;

/**
 * Created by Home on 10.08.2017.
 */
public class UserGuiForApp {

    String pathSource;

    public UserGuiForApp(){
        this.pathSource = "";
    }

    public UserGuiForApp (String pathSource){
        this.pathSource = pathSource;
    }

    public void setPathSource (String pathSource){
        this.pathSource = pathSource;
    }
    public String getPathSource (){
        return this.pathSource;
    }



}
