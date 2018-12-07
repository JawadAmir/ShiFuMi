package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class GameController {

    @FXML
    private Text scoreComputer;

    @FXML
    private Button papier;

    @FXML
    private Button pierre;

    @FXML
    private Button ciseau;

    private int numeroPartie;
    @FXML
    private Text scorePlayer;
    Joueur joueur;
    Joueur ordinateur;

    @FXML
    private TextArea textArea;
    @FXML
    void choixClicked(ActionEvent event) {
        joueur.choix=((Button) event.getSource()).getId();
        Model.jeu(joueur,ordinateur);
        numeroPartie++;
        textArea.appendText("Partie : "+String.valueOf(numeroPartie)+"\nVous avez choisi : "+joueur.choix+"\nAI a choisi : "
        +ordinateur.choix+"\n-------------------------------\n");
        scoreComputer.setText("Score est : "+String.valueOf(ordinateur.score));
        scorePlayer.setText("Score est : "+String.valueOf(joueur.score));

    }
    @FXML
    void endClicked(){
        if(joueur.score<ordinateur.score){
            textArea.appendText("Dommage vous avez PERDU\n");
            textArea.appendText("-------------------------------\n");
        }
        else if (joueur.score>ordinateur.score){
            textArea.appendText("Feliciation !! Vous avez gagné\n");
            textArea.appendText("-------------------------------\n");
        }else{
            textArea.appendText("EGALITE\n");
            textArea.appendText("-------------------------------\n");
        }

    }

    @FXML
    void initialize() {
        joueur = new Joueur();
        ordinateur = new Joueur();
        numeroPartie=0;
        textArea.setText("");
        scorePlayer.setText("Score est : 0");
        scoreComputer.setText("Score est : 0");
    }
}
