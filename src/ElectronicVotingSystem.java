import java.util.HashMap;
import java.util.Map;

public class ElectronicVotingSystem implements VotingSystem {
    private Map<Integer, Vote> votedMap = new HashMap<>();
    private Map<Candidate, Integer> voteCountMap = new HashMap<>();
    private int voterCounter = 1;

    @Override
    public boolean vote(Vote vote) {
        if (votedMap.containsKey(vote.getVoterId())) {
            System.out.println("Duplicate vote detected for voter: " + vote.getVoterId());
            return false;
        }

        votedMap.put(vote.getVoterId(), vote);
        voteCountMap.put(vote.getCandidate(), voteCountMap.getOrDefault(vote.getCandidate(), 0) + 1);
        return true;
    }

    @Override
    public Map<Candidate, Integer> tallyVotes() {
        return new HashMap<>(voteCountMap);
    }

    public int generateVoterId() {
        return voterCounter++;
    }
}