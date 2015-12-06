package lesson8moreaboutclasses.collecting2;
// BlueJ project: lesson8/collecting2

// Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double sum;
    private int numScores;
    private double lowest;

    public HomeworkScores()
    {
        sum = 0;
        numScores = 0;
        lowest = -1;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        if (numScores == 0 || score < lowest) {
            lowest = score;
        }

        numScores++;
        sum = sum + score;
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (numScores == 0) {
            return 0;
        } else if (numScores == 1) {
            return sum;
        } else {
            return sum - lowest;
        }
    }
}
