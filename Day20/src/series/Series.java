package series;

import java.util.ArrayList;

/**
 * Modeling a Swimmer
 */
public class Series {
    private String title;
    private ArrayList<String> cast = new ArrayList<String>();

    public Series(String title, ArrayList<String> cast){
        this.title = title;
        this.cast = cast;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList<String> getCast(){
        return cast;
    }
}
