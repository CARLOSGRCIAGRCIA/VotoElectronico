public class Vote {
    private Candidate candidate;
    private int voterId;

    public Vote(Candidate candidate, int voterId) {
        this.candidate = candidate;
        this.voterId = voterId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public int getVoterId() {
        return voterId;
    }
}