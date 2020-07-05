package Lab7_3;

public class JDBCdemo {

	public static void main(String[] args) {
		IcommandExecutorFacade executor = new commandExecutorFacade();
		executor.process();
	}
}
