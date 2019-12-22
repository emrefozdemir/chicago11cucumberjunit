package interviewQuestions.mirzatProgrammer;

public class ProgrammerTeacher extends Programmer {

    public static void main(String[] args) {
        ProgrammerTeacher teacher = new ProgrammerTeacher();
        teacher.addLanguage("Java");
        Programmer programmer = new Programmer();
        teacher.teach(programmer, "Java");
        for(String language: programmer.getLanguages()) {
            System.out.println(language);
        }
    }
    public boolean teach(Programmer programmer, String language) {
        if(this.languages.contains(language)) {
            return true;
        }
        else {
            return false;
        }
    }

}
