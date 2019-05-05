import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int popeCount = 0;
		int snowdenCount = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				popeCount++;
				}
				if (votes.get(i).equalsIgnoreCase("edward snowden")) {
					snowdenCount++;
				

			}
		}
		if (popeCount > snowdenCount) {
			return "pope francis";
		} else {
			return "TIE";
		}

	}

}