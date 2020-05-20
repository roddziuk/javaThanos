import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Thanos {
	
    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	List<Hero> heroes = new ArrayList<>();
    	
    	Hero widow = new Hero("Black Widow", 34);
    	Hero captain = new Hero("Captain America", 100);
    	Hero vision = new Hero("Vision", 3);
    	Hero iron = new Hero("Iron Man", 48);
    	Hero witch = new Hero("Scarlet Witch", 29);
    	Hero thor = new Hero("Thor", 1500);
    	Hero hulk = new Hero ("Hulk", 49);
    	Hero doctor = new Hero ("Doctor Strange", 42);
     
    	heroes.add(widow);
    	heroes.add(captain);
    	heroes.add(vision);
    	heroes.add(iron);
    	heroes.add(witch);
    	heroes.add(thor);
    	heroes.add(hulk);
    	heroes.add(doctor);
    	
    	Hero Thor = new Hero("Thor", 1501);
    	heroes.set(5, Thor);
    	
        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(heroes, new Random());

        // TODO 5 : Keep only the half of the list
    	heroes = heroes.subList(0, heroes.size()/2 );

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	for (Hero string : heroes) {
    		System.out.println("name of the hero: " + string.getName());
    	}
    }
}