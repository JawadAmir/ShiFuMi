package sample;

public class Model {
        public static void jeu(Joueur joueur,Joueur ordinateur){
            ordinateur.choixOrdinateur();
            switch (joueur.choix){
                //papier 0 pierre 1 ciseau 2
                case "papier" : switch (ordinateur.choix){
                    case "papier": ;break;
                    case "pierre": joueur.joueurGagne();break;
                    case "ciseau": ordinateur.joueurGagne(); break;
                }break;
                case "pierre": switch (ordinateur.choix){
                    case "papier": ordinateur.joueurGagne();break;
                    case "pierre": break;
                    case "ciseau": joueur.joueurGagne(); break;
                }break;
                case "ciseau" :switch (ordinateur.choix){
                    case "papier": joueur.joueurGagne();
                    case "pierre": ordinateur.joueurGagne();break;
                    case "ciseau": break;
                }break;
            }
    }

}
