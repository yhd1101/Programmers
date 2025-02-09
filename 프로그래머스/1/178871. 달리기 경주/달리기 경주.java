import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String, Integer> playerMap = new HashMap<String, Integer>();
        for (int i = 0; i<players.length; i++)
            playerMap.put(players[i], i);
         for(String calling : callings)
        {
            int count = playerMap.get(calling);
            String prePlayer = answer[count-1];
            answer[count-1] = calling;
            answer[count] = prePlayer;
            playerMap.put(calling,count-1);
            playerMap.put(prePlayer,count);
        }
    
        return answer;
        
    }
}