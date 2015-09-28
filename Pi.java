
class Pi {

	public static void main(String[] args) {
		System.out.println( "pi: " + pi() );
	}

	public static double pi() {
		double sum=0.0;
		for(double k=0.0; k<50.0; k++) {
			sum += Math.pow(-3.0, -k) / (2.0*k+1.0);
		}
		return Math.sqrt(12.0)*sum;
	}

}