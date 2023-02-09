package FunWithQuizzes;

public class MultipleChoice extends Question{

    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString(){
        return "\nMULTIPLE CHOICE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}






//    private final String correctAnswer;
//
//    public MultipleChoice(String questionToBeAsked, String[] answersArray, String correctAnswer){
//        super(questionToBeAsked, answersArray);
//        this.correctAnswer = correctAnswer;
//    }
//
//    public String getCorrectAnswer() {
//        return correctAnswer;
//    }
//    @Override
//    public String toString(){
//        return correctAnswer;
//    }

