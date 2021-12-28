import java.util.*;
import java.util.Map.Entry; 

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner() {
        Iterator<Entry<String, Integer>> it = players.entrySet().iterator();
        int maxP = 0;
        String maxN = "";
        while(it.hasNext()){
            Entry<String, Integer> pl = it.next();
            String name = (String)pl.getKey(); 
            int points = (int)pl.getValue();
            if(points > maxP) {
                maxP = points;
                maxN = name;
            }
        }
        System.out.println(maxN);
        
    }
    

    


    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}