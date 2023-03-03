public class Interfaces {
    public static void main(String[] args) {

    }

    interface ChessPlayer {
        void move();
    }

    interface Player {
        void eats();
    }

    /**
     * Queen
     */
    class Queen implements ChessPlayer, Player {

        @Override
        public void move() {
            // TODO Auto-generated method stub

        }

        @Override
        public void eats() {
            // TODO Auto-generated method stub

        }

    }
}
