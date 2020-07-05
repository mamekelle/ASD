package Lab10_1;

public class BlackPlayer extends Player {
	
	public BlackPlayer(IMediator mediator) {
		super(mediator);
		color = Cell.BLACK;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cell move(int iRow, int jColumn) {
		// TODO Auto-generated method stub
		return mediator.move(this, iRow, jColumn);
	} 
	
}
