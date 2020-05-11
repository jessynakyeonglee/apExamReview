import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sound {

    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {

        this.samples = samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int output = 0;

        for(int count =0; count<samples.length; count++){
            if(samples[count]<-limit) {
                samples[count]=-limit;
                output++;
            }

            else if(samples[count]>limit) {
                samples[count]=limit;
                output++;
            }
        }

        return output;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {

        int zeros = 0;

        for (int count = 0; count < samples.length; count++){

            if (samples[count] == 0){
                zeros++;
            }
            else {
                break;
            }
        }

        int[] nonzero = new int[(samples.length-zeros)];

        for (int count = 0; count < nonzero.length; count++){
            nonzero[count]=samples[count+zeros];
        }
        samples = nonzero;
    }

    /** accessor method used for testing purposes - Not part of original program */
    public int[] getSamples() {
        return samples;
    }
}
