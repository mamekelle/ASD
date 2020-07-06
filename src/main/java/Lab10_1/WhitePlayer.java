package Lab10_1;

public class WhitePlayer extends Player {
	
	public WhitePlayer(IMediator mediator) {
		super(mediator);
		color = Cell.WHITE;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cell move(int iRow, int jColumn) {
		// TODO Auto-generated method stub
		return mediator.move(this, iRow, jColumn);
	}

}
