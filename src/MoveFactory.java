public class MoveFactory {

    public Move createMove(String name) {
        if (name == null || name.isEmpty())
            return null;

        // just to satisfy the error until I figure out how to fill in the move info

        switch (name) {

            // Pikachus moveset:
            case "Thunderbolt":
                return new moveList.Thunderbolt("Thunderbolt", "Electric", 80, 80);
            case "Thundershock":
                return new moveList.Thundershock("Thundershock", "Electric", 40, 100);
            case "Slam":
                return new moveList.Slam("Slam", "Normal", 80, 75);
            case "Thunder":
                return new moveList.Thunder("Thunder", "Electric", 110, 70);
            // Lucarios Moveset
            case "Meteor Dash":
                return new moveList.MeteorDash("Meteor Dash", "Dragon", 90, 90);
            case "Close Combat":
                return new moveList.CloseCombat("Close Combat", "Fighting", 120, 100);
            case "Aura Sphere":
                return new moveList.AuraSphere("Aura Sphere", "Fighting", 80, 100);
            case "Bullet Punch":
                return new moveList.BulletPunch("Bullet Punch", "Steel", 40, 100);

            // Charmander's moveset
            case "Ember":
                return new moveList.Ember("Ember", "Fire", 60, 60);

            case "Flamethrower":
                return new moveList.Flamethrower("Flamethrower", "Fire", 90, 100);

            case "Slash":
                return new moveList.Slash("Slash", "Normal", 70, 100);

            case "Inferno":
                return new moveList.Inferno("Inferno", "Fire", 100, 50);

            // Psyduck's moveset
            case "Scratch":
                return new moveList.Scratch("Scratch", "Normal", 40, 100);

            case "Water Gun":
                return new moveList.WaterGun("Water Gun", "Water", 40, 100);

            case "Confusion":
                return new moveList.Confusion("Confusion", "Psychic", 50, 100);

            case "Hydro Pump":
                return new moveList.HydroPump("Hydro Pump", "Water", 110, 80);

            case "Tackle":
                return new moveList.Tackle("Tackle", "Normal", 10, 100);
            // Lugia's Power Set
            case "Ancient Power":
                return new moveList.AncientPower("Ancient Power", "Rock", 60, 100);

            case "Dragon Rush":
                return new moveList.DragonRush("Dragon Rush", "Dragon", 100, 75);

            case "Extra Sensory":
                return new moveList.ExtraSensory("ExtraSensory", "Psychic", 80, 100);

            case "Outrage":
                return new moveList.Outrage("Outrage", "Dragon", 120, 100);
            // add more here

            case "Aeroblast":
                return new moveList.Aeroblast("Aeroblast", "Flying", 100, 95);

            // Dialga move set
            case "Metal Claw":
                return new moveList.MetalClaw("Metal Claw", "Steel", 50, 95);

            case "Roar Of Time":
                return new moveList.RoarOfTime("Roar Of Time", "Flying", 150, 90);

            case "Psychic":
                return new moveList.Psychic("Psychic", "Psychic", 120, 100);
            // add more here

            case "Psystrike":
                return new moveList.Psystrike("Psystrike", "Flying", 100, 95);

            default:
                throw new IllegalArgumentException("Unkown Move: " + name);

        }

    }
}
