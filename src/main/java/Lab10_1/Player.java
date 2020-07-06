package Lab10_1;

public abstract class Player {
	protected IMediator mediator;
	public Cell color;
	
	public Player(IMediator mediator){
		this.mediator = mediator;
	}
	public Cell getColor(){
		return color;
	}
	abstract Cell move(int iRow, int jColumn);
}
