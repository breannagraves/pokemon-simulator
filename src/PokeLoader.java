public class PokeLoader {

    public nPokemon createMon(String name) {

        if (name == null || name.isEmpty())
            return null;

        switch (name) {

            case "Charmander":
                return new pokeLineup.Charmander(0, "Charmander", "Fire", 80, 80, 80, 80, 80, 90, 5, 0, null,
                        "src/assets/images/sprites/charmander_front.gif",
                        "src/assets/images/sprites/charmander_back.gif");

            case "Eevee":
                return new pokeLineup.Eevee(1, "Eevee", "Normal", 35, 35, 55, 40, 50, 50, 90, 5, null,
                        "src/assets/images/sprites/eevee_front.gif", "src/assets/images/sprites/eevee_back.gif");

            case "Lucario":
                return new pokeLineup.Lucario(2, "Lucario", "Steel", 70, 70, 110, 70, 115, 70, 90, 5, null,
                        "src/assets/images/sprites/Lucario_Front.gif",
                        "src/assets/images/sprites/Lucario_Back.gif");

            case "Mr. Mime":
                return new pokeLineup.MrMime(3, "Mr. Mime", "Psychic", 40, 40, 45, 65, 100, 120, 90, 5, null,
                        "src/assets/images/sprites/mr-mime_front.gif", "src/assets/images/sprites/mr-mime_back.gif");

            case "Pikachu":
                return new pokeLineup.Pikachu(4, "Pikachu", "Electric", 35, 35, 55, 40, 50, 50, 90, 5, null,
                        "src/assets/images/sprites/pikachu_front.gif", "src/assets/images/sprites/pikachu_back.gif");

            case "Psyduck":
                return new pokeLineup.Psyduck(5, "Psyduck", "Water", 50, 50, 52, 48, 65, 50, 55, 5, null,
                        "src/assets/images/sprites/psyduck_front.gif", "src/assets/images/sprites/psyduck_back.gif");

            // Squirtle
            case "Squirtle":
                return new pokeLineup.Squirtle(6, "Squirtle", "Water", 44, 44, 48, 65, 50, 64, 43, 5, null,
                        "src/assets/images/sprites/squirtle_front.gif", "src/assets/images/sprites/squirtle_back.gif");

            case "Dragonite":
                return new pokeLineup.Dragonite(7, "Dragonite", "Dragon", 91, 91, 134, 95, 100, 100, 80, 5, null,
                        "src/assets/images/sprites/dragonite_front.gif",
                        "src/assets/images/sprites/dragonite_back.gif");

            case "Mewtwo":
                return new pokeLineup.Mewtwo(7, "Mewtwo", "Psychic", 91, 91, 134, 95, 100, 100, 80, 5, null,
                        "src/assets/images/sprites/mewtwo_front.gif", "src/assets/images/sprites/mewtwo_back.gif");

            case "Lugia":
                return new pokeLineup.Lugia(7, "Lugia", "Psychic", 106, 106, 90, 130, 90, 64, 110, 10, null,
                        "src/assets/images/sprites/Lugia_Front.gif", "src/assets/images/sprites/Lugia_Back.gif");

            case "Dialga":
                return new pokeLineup.Dialga(7, "Dialga", "Steel", 100, 120, 120, 150, 100, 100, 90, 10, null,
                        "src/assets/images/sprites/Dialga_Front.gif", "src/assets/images/sprites/Dialga_Back.gif");

            case "Gliscor":
                return new pokeLineup.Gliscor(7, "Gliscor", "Ground", 100, 120, 120, 150, 100, 100, 90, 10, null,
                        "src/assets/images/sprites/gliscor_front.gif", "src/assets/images/sprites/gliscor_back.gif");

            case "Aegislash":
                return new pokeLineup.Aegislash(7, "Aegislash", "Steel", 100, 120, 120, 150, 100, 100, 90, 10, null,
                        "src/assets/images/sprites/aegislash_front.gif",
                        "src/assets/images/sprites/aegislash_back.gif");

            default:
                throw new IllegalArgumentException("Unknown Pokemon: " + name);
        }

    }

}
