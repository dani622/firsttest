
class Pi {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double result = pi();
		long end = System.currentTimeMillis();
		System.out.println( "pi: " + result + ", time: " + (end-start) );
	}

	public static double pi() {
		double sum=0.0;
		for(double k=0.0; k<1000000.0; k++) {
			sum += Math.pow(-3.0, -k) / (2.0*k+1.0);
		}
		return Math.sqrt(12.0)*sum;
	}

}