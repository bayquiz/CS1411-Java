public class Rainfall {

    private double[] rain;

    //constructor
    public Rainfall(double r[]){
        rain = new double[r.length];
        for(int index = 0; index< r.length; index++) {
            rain[index] = r[index];
        }
    }

    public double totalRain(){
        double total = 0;
        for (int index =0; index < rain.length; index++) {
            total += rain[index];
        }
        return total;
    }

    public double averageRain() {
        double total = 0;
        for (int index = 0; index < rain.length; index ++) {
            total += rain[index];
        }
        return (total / 12);
    }

    public double largestMonth(){
        double highest = rain[0];
        for (int index = 1; index < rain.length; index++) {
            if (rain[index] > highest)
                highest = rain[index];
        }
        return highest;
    }

    public double smallestMonth() {

        double lowest = rain[0];
        for (int index = 1; index < rain.length; index ++){
            if (rain[index] < lowest)
                lowest = rain[index];
        }
        return lowest;
    }

    public double getRain(int i) {
        return rain[i];
    }

}
