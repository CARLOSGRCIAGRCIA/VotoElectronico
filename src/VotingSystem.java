import java.util.Map;

public interface VotingSystem {
    boolean vote(Vote vote);
    Map<Candidate, Integer> tallyVotes();
}