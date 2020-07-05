package Lab10_1;

public interface IMediator {
	public Cell move(Player player, int iRow, int jColumn);
	public void markCells(Player player, int iRow, int jCol);
	public boolean isValidMove(Player player, int iRow, int jCol);
	public Cell isGameOver();
	public Board getBoard();
}
