package data;

public class Image {

    private double[][] data;
    private int label;

    public double[][] getData() {
        return data;
    }
//.
    public int getLabel() {
        return label;
    }

    public Image(double[][] data, int label) {
        this.data = data;
        this.label = label;
    }

    @Override
    public String toString(){

        String t = label + ", \n";

        for(int i =0; i < data.length; i++){
            for(int j =0; j < data[0].length; j++){
                t+= data[i][j] + ", ";
            }
            t+= "\n";
        }

        return t;
    }
}
