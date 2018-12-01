package sample;

import javax.xml.soap.SAAJResult;

public class Joueur {

    String choix;
    int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    void joueurGagne(){
        setScore(getScore()+1);
    }
    void choixOrdinateur(){
        String choixT[]= {"papier","pierre","ciseau"};
       this.choix= choixT[(int )(Math. random() * 3 + 0)];
    }

}
