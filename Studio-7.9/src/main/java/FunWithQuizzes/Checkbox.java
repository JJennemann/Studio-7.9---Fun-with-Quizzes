package FunWithQuizzes;

public class Checkbox extends Question{

    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString(){
        return "\nCHOOSE ONE OR MORE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}












//    private final ArrayList<String> correctAnswers = new ArrayList<>();
//
//    public CheckBox(String questionToBeAsked, String[] answersArray, String[] correctAnswersArray){
//        super(questionToBeAsked, answersArray);
//        Collections.addAll(correctAnswers, correctAnswersArray);
//    }
//
//    public ArrayList<String> getCorrectAnswers() {
//        return correctAnswers;
//    }
//    @Override
//    public String toString(){
//        return "The correct answers are: " + correctAnswers;
//    }

