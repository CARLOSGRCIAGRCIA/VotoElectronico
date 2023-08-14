import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new ElectronicVotingSystem();

        for (int i = 0; i < args.length; i += 2) {
            String candidateStr = args[i];
            Candidate candidate = Candidate.valueOf(candidateStr);
            int voterId = ((ElectronicVotingSystem) votingSystem).generateVoterId();
            Vote vote = new Vote(candidate, voterId);
            votingSystem.vote(vote);
        }

        Map<Candidate, Integer> voteResults = votingSystem.tallyVotes();

        System.out.println("Escrutinio:");
        for (Map.Entry<Candidate, Integer> entry : voteResults.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}