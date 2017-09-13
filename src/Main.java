public class Main {
    public static void main (String[] args){
        GamePiece myGamePiece = new GamePiece();
        myGamePiece.move(9,3);

        System.out.println(myGamePiece);
        System.out.println(myGamePiece.isFrozen());
        myGamePiece.freeze();
        System.out.println(myGamePiece.isFrozen());
        myGamePiece.unfreeze();
        myGamePiece.move(3,3);


    }

}
