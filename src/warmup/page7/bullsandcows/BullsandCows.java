package warmup.page7.bullsandcows;

import java.util.PriorityQueue;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String getHint(String secret, String guess) {
        PriorityQueue<Character> qS = new PriorityQueue<>();
        PriorityQueue<Character> qG = new PriorityQueue<>();
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i ++){
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls ++;
            }else{
                qS.offer(secret.charAt(i));
                qG.offer(guess.charAt(i));
            }
        }

        while (!qS.isEmpty() && !qG.isEmpty()) {
            if (qS.peek() > qG.peek()) {
                qG.poll();
                continue;
            }
            if (qS.peek() < qG.peek()) {
                qS.poll();
                continue;
            }
            if (qS.peek() == qG.peek()) {
                cows ++;
                qS.poll();
                qG.poll();
            }
        }

        return bulls + "A" + cows + "B";
    }
}