import java.util.Random;

public class de {

    public Integer valeur=6;

    public de(int valeur){
        this.valeur = valeur;
    }
    Random random =  new Random();

    public int lancer() {
        return random.nextInt(valeur)+1;
    }
}
