package desafio.itau.desafio_itau_fernando.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {
    private long count;
    private double sum;
    private double avg;
    private double max;
    private double min;

    public StatisticsResponse(DoubleSummaryStatistics summaryStatistics) {
        this.count = summaryStatistics.getCount();
        this.sum = summaryStatistics.getSum();
        this.avg = summaryStatistics.getAverage();
        this.max = summaryStatistics.getMax();
        this.min = summaryStatistics.getMin();
    }

    //generate gets
    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
