package interviewQuestions;

public class ProgrammerTeacher extends Programmer {

    boolean teach(Programmer programmer, String language){
        if(super.languages.contains(language)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        ProgrammerTeacher teacher = new ProgrammerTeacher();
        teacher.addLanguage("Java");

        Programmer programmer = new Programmer();
        teacher.teach(programmer, "Java");

        for(String language: programmer.getLanguages()){
            System.out.println(language);
        }
    }
}
