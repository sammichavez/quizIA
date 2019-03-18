public class QuestionGroup {
    Question[] easy;
    Question[] medium;
    Question[] hard;
    int gameLength = 10;

    public void createEasy() {
        easy[0] = new Question("what is ", 7, 2);
    }

    public Question() {
            createEasy();
        }
}