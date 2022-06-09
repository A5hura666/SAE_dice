import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Score {
    public String nomJoueur;
    public Integer pointJoueur;

    public Score(String nomJoueur, Integer pointJoueur){

        this.nomJoueur = nomJoueur;
        this.pointJoueur = pointJoueur;
        /*    Map<String,Integer> map = new HashMap<>();

        map.put("ethan",150);
        map.put("yohann",100);
        map.put("théo",300);
        map.put("nassim",50);
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (int i=list.size()-1; i>=0;i--){
        System.out.println(list.get(i));
        }*/
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setPointJoueur(Integer pointJoueur) {
        this.pointJoueur = pointJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public Integer getPointJoueur() {
        return pointJoueur;
    }

    public Integer incrementer(){
        return null;
    }
}
