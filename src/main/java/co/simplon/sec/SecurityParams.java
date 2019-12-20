// declaration of package security
package co.simplon.sec;

// imports
	public interface SecurityParams {
		public static final String JWT_HEADER_NAME="Authorization";
		public static final String SECRET="Keisi091110";
		public static final long EXPIRATION=10*24*3600;
		public static final String HEADER_PREFIX="Bearer ";
	}
// end