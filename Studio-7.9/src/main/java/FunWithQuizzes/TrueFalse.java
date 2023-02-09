package FunWithQuizzes;

public class TrueFalse extends Question{
    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString(){
        return "\nTRUE OR FALSE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}

//    private final Boolean correctAnswer;
//
//    public TrueFalse(String questionToBeAsked, String[] answersArray, Boolean correctAnswer){
//        super(questionToBeAsked, answersArray);
//        this.correctAnswer=correctAnswer;
//    }
//
//    public boolean getCorrectAnswer(){
//        return correctAnswer;
//    }
//    @Override
//    public String toString(){
//        return "The correct answer is: " + correctAnswer;
//    }

