public class pokeLineup {

    static class Charmander extends nPokemon {

        public Charmander(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Ember");
            moveList.add(move);

            move = moveLoader.createMove("Slam");
            moveList.add(move);

        }

    }

    static class Eevee extends nPokemon {

        public Eevee(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Tackle");
            moveList.add(move);

            move = moveLoader.createMove("Slam");
            moveList.add(move);

        }
    }

    static class Lucario extends nPokemon {

        public Lucario(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Aura Sphere");
            moveList.add(move);

            move = moveLoader.createMove("Close Combat");
            moveList.add(move);

        }
    }

    static class MrMime extends nPokemon {

        public MrMime(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Confusion");
            moveList.add(move);

            move = moveLoader.createMove("Slam");
            moveList.add(move);
        }
    }

    static class Pikachu extends nPokemon {

        public Pikachu(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Thunder");
            moveList.add(move);

            move = moveLoader.createMove("Thunderbolt");
            moveList.add(move);
        }
    }

    static class Psyduck extends nPokemon {
        public Psyduck(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Confusion");
            moveList.add(move);

            move = moveLoader.createMove("Water Gun");
            moveList.add(move);
        }
    }

    static class Squirtle extends nPokemon {
        public Squirtle(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Water Gun");
            moveList.add(move);

            move = moveLoader.createMove("Hydro Pump");
            moveList.add(move);
        }
    }

    static class Lugia extends nPokemon {

        public Lugia(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Confusion");
            moveList.add(move);

            move = moveLoader.createMove("Slam");
            moveList.add(move);
        }
    }

    static class Dragonite extends nPokemon {
        public Dragonite(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Dragon Rush");
            moveList.add(move);

            move = moveLoader.createMove("Outrage");
            moveList.add(move);
        }
    }

    static class Mewtwo extends nPokemon {
        public Mewtwo(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Psychic");
            moveList.add(move);

            move = moveLoader.createMove("Psystrike");
            moveList.add(move);
        }
    }

    static class Dialga extends nPokemon {

        public Dialga(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Roar Of Time");
            moveList.add(move);

            move = moveLoader.createMove("Slash");
            moveList.add(move);
        }
    }

    static class Gliscor extends nPokemon {

        public Gliscor(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Slash");
            moveList.add(move);

            move = moveLoader.createMove("Aeroblast");
            moveList.add(move);
        }
    }

    static class Aegislash extends nPokemon {

        public Aegislash(int index, String name, String type, int tHealth, int remHealth, int atk, int def, int spAtk,
                int spDef, int speed, int lvl, Move moveList, String frontIMG, String rearIMG) {
            super(index, name, type, tHealth, remHealth, atk, def, spAtk, spDef, speed, lvl, moveList, frontIMG,
                    rearIMG);
        }

        @Override
        public void addMoves() {
            MoveFactory moveLoader = new MoveFactory();
            Move move = moveLoader.createMove("Slash");
            moveList.add(move);

            move = moveLoader.createMove("Aeroblast");
            moveList.add(move);
        }
    }
}