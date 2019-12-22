package interviewQuestions;

import java.util.ArrayList;
import java.util.Collection;

public class Programmer {

    static Collection<String> languages;

    static{
        languages = new ArrayList<>();
    }
    public Collection<String> getLanguages(){
        return this.languages;
    }

    public void addLanguage(String language){
    languages.add(language);
    }



}
