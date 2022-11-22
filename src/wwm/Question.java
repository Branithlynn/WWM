/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wwm;

/**
 *
 * @author viktor
 */
public class Question {
    public String Body;
    public String AnswerOne;
    public String AnswerTwo;
    public String AnswerThree;
    public String AnswerFour;
    public int CorrectAnswer;
    //pri prilagane na baza danni shte opravq cvetovete. tam vmesto stringove shte ima id na otgovorite koito shte imat parent idto na vuprosa
    //po tozi nachin shte se vurje s correctanswer i shte se smenqt cvetovete
    public Question(String q, String answerOne, String answerTwo, String answerThree, String answerFour, int correctAnswer){
                       this.Body = q;
                       this.AnswerOne = answerOne;
                       this.AnswerTwo = answerTwo;
                       this.AnswerThree = answerThree;
                       this.AnswerFour = answerFour;
                       this.CorrectAnswer = correctAnswer;
                    }
}
