package flagMaker;

public class convertedString {
	private String input = "";          //Input string fed into converter
	private String output = "";         //Output string given by converter
	private int inputLength = 0;        //Counted in char length minus spaces
	private int outputLength = 0;       //Counted in emotes, not char length
	private int flags = 0;              //The difference in input and output length
	private double compressRatio = 0.0; //OutputLength/Input Length, to show how much smaller it is

	public convertedString (String input, String output, int outputLength) {
		this.input = input;
		this.output = output;
		this.inputLength = input.replaceAll(" ", "").length();
		this.outputLength = outputLength;
		this.flags = this.inputLength - outputLength;
		if (inputLength != 0) {
			this.compressRatio = (double) outputLength / inputLength;
		} else {
			this.compressRatio = 0.0;
		}
	}

	public convertedString () {
	}

	public String getInput () {
		return input;
	}

	public String getOutput () {
		return output;
	}

	public int getFlags () {
		return flags;
	}

	public int getOutputLength () {
		return outputLength;
	}

	public double getCompressRatio () {
		return compressRatio;
	}

	public String toString () {
		return output;
	}
}
