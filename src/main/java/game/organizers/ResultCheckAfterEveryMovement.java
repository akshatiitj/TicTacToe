package game.organizers;

import game.board.Board;
import game.board.Tile;
import game.display.Result;
import game.players.Player;

public class ResultCheckAfterEveryMovement {
    private Result result = new Result();

    public int checkResult(int currentNumberOfMoves, Board board,
                           Player player) {
        Tile[][] tiles = board.getTiles();

        if(tiles[0][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][2].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[0][2].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][0].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[0][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[0][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[0][2].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[1][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][2].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[2][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][2].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[0][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][0].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][0].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[0][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][1].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][1].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else if(tiles[0][2].getBoardTile() == player.getPlayerSymbol()
                && tiles[1][2].getBoardTile() == player.getPlayerSymbol()
                && tiles[2][2].getBoardTile() == player.getPlayerSymbol()) {
                result.declareResult(player);
                return board.getTotalNumberOfMoves();
        }
        else
            return ++currentNumberOfMoves;
    }
}