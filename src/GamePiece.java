public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;

    public GamePiece (){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;

    }

    public GamePiece(String name, String color) {
        this.name = name;
        this.color = color;
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public void move(int positionX, int positionY) {
       if (!this.isFrozen()) {

           this.positionX = positionX;
           this.positionY = positionY;
           System.out.println("Moved!!");

       }
    }
     public void freeze(){
        if (!this.isFrozen()){
            this.frozen = true;
        }

         System.out.println("Frozen, Can't Move!!");

     }
     public void unfreeze(){
         if(this.isFrozen()){
             this.frozen = false;
         }

         System.out.println("Can Moved!!");

     }



    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

