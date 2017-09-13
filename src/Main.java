//public class Main {
//    public static void main (String[] args){
//        GamePiece myGamePiece = new GamePiece();
//        myGamePiece.move(9,3);
//
//        System.out.println(myGamePiece);
//        System.out.println(myGamePiece.isFrozen());
//        myGamePiece.freeze();
//        System.out.println(myGamePiece.isFrozen());
//        myGamePiece.unfreeze();
//        myGamePiece.move(3,3);
//
//
//    }

//}
public class Main {
    public static void main(String[] args) {
        GamePiece myGamePiece = new GamePiece();
//        Test for move
        myGamePiece.move(5,2);
        if(myGamePiece.getPositionX() == 5 && myGamePiece.getPositionY()==2){
            System.out.println("SUCCESS: You moved!!");
        } else {
            System.out.println("FAILURE: You didn't moved");
        }
        myGamePiece.freeze();
        if (myGamePiece.isFrozen() == true){
            System.out.println("SUCCESS: Your Frozen");
        } else {
            System.out.println("FAILURE: Your Not Frozen");
        }

        // Test that the default color is what we expect
        if( myGamePiece.getColor() == null){
            System.out.println("SUCCESS: The default color is NULL");
        } else {
            System.out.println("FAILURE: The default color is not NULL");
        }

        // Test that we can change the color to something else
        myGamePiece.setColor("Black");
        if( myGamePiece.getColor() == "Black"){
            System.out.println("SUCCESS: The color can be set properly");
        } else {
            System.out.println("FAILURE: The color is not black");
        }
    }
}