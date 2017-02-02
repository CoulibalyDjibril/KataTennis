package tennis.model;

import java.util.Map;

public class TieBreak {

	 private Player p1;
		private Player p2;
		private Player winner;
		private Map<Player, Integer> scores;
		/**
		 * @param p1
		 * @param p2
		 */
		public TieBreak(Player p1, Player p2) {
			super();
			this.p1 = p1;
			this.p2 = p2;
			this.addScoresTiebreak(p1, 0);
			this.addScoresTiebreak(p2, 0);
		}
	
		 public void addScoresTiebreak(Player p, Integer point) {
		        this.scores.put(p, point);
		    }

		public Map<Player, Integer> getScores() {
			return scores;
		}

		public void setScores(Map<Player, Integer> scores) {
			this.scores = scores;
		}
		
		
		
			
		
		
}
