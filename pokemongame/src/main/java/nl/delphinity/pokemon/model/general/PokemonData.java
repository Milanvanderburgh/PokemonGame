package nl.delphinity.pokemon.model.general;

import nl.delphinity.pokemon.model.battle.Attack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PokemonData {

    BULBASAUR(100, PokemonType.GRASS, 30, 15),
    IVYSAUR(100, PokemonType.GRASS, 30, 30),
    VENUSAUR(100, PokemonType.GRASS, 30, 0),
    CHARMANDER(100, PokemonType.FIRE, 30, 6),
    CHARMELEON(100, PokemonType.FIRE, 30, 5),
    CHARIZARD(100, PokemonType.FIRE, 30, 0),
    SQUIRTLE(100, PokemonType.WATER, 30, 15),
    WARTORTLE(100, PokemonType.WATER, 30, 30),
    BLASTOISE(100, PokemonType.WATER, 30, 0),
    CATERPIE(100, PokemonType.BUG, 30, 15),
    METAPOD(100, PokemonType.BUG, 30, 15),
    BUTTERFREE(100, PokemonType.BUG, 30, 15),
    WEEDLE(100, PokemonType.BUG, 30, 15),
    KAKUNA(100, PokemonType.BUG, 30, 15),
    BEEDRILL(100, PokemonType.BUG, 30, 15),
    PIDGEY(100, PokemonType.FLYING, 30, 15),
    PIDGEOTTO(100, PokemonType.FLYING, 30, 15),
    PIDGEOT(100, PokemonType.FLYING, 30, 15),
    RATTATA(100, PokemonType.NORMAL, 30, 15),
    RATICATE(100, PokemonType.NORMAL, 30, 15),
    SPEAROW(100, PokemonType.FLYING, 30, 15),
    FEAROW(100, PokemonType.FLYING, 30, 15),
    EKANS(100, PokemonType.POISON, 30, 15),
    ARBOK(100, PokemonType.POISON, 30, 15),
    PIKACHU(100, PokemonType.ELECTRIC, 30, 15),
    RAICHU(100, PokemonType.ELECTRIC, 30, 15),
    SANDSHREW(100, PokemonType.GROUND, 30, 15),
    SANDSLASH(100, PokemonType.GROUND, 30, 15),
    NIDORINA(100, PokemonType.POISON, 30, 15),
    NIDOQUEEN(100, PokemonType.POISON, 30, 15),
    NIDORAN(100, PokemonType.POISON, 30, 15),
    NIDORINO(100, PokemonType.POISON, 30, 15),
    NIDOKING(100, PokemonType.POISON, 30, 15),
    CLEFAIRY(100, PokemonType.NORMAL, 30, 15),
    CLEFABLE(100, PokemonType.NORMAL, 30, 15),
    VULPIX(100, PokemonType.FIRE, 30, 15),
    NINETALES(100, PokemonType.FIRE, 30, 15),
    JIGGLYPUFF(100, PokemonType.NORMAL, 30, 15),
    WIGGLYTUFF(100, PokemonType.NORMAL, 30, 15),
    ZUBAT(100, PokemonType.FLYING, 30, 15),
    GOLBAT(100, PokemonType.FLYING, 30, 15),
    ODDISH(100, PokemonType.GRASS, 30, 15),
    GLOOM(100, PokemonType.GRASS, 30, 15),
    VILEPLUME(100, PokemonType.GRASS, 30, 15),
    PARAS(100, PokemonType.BUG, 30, 15),
    PARASECT(100, PokemonType.BUG, 30, 15),
    VENONAT(100, PokemonType.BUG, 30, 15),
    VENOMOTH(100, PokemonType.BUG, 30, 15),
    DIGLETT(100, PokemonType.GROUND, 30, 15),
    DUGTRIO(100, PokemonType.GROUND, 30, 15),
    MEOWTH(100, PokemonType.NORMAL, 30, 15),
    PERSIAN(100, PokemonType.NORMAL, 30, 15),
    PSYDUCK(100, PokemonType.WATER, 30, 15),
    GOLDUCK(100, PokemonType.WATER, 30, 15),
    MANKEY(100, PokemonType.FIGHTING, 30, 15),
    PRIMEAPE(100, PokemonType.FIGHTING, 30, 15),
    GROWLITHE(100, PokemonType.FIRE, 30, 15),
    ARCANINE(100, PokemonType.FIRE, 30, 15),
    POLIWAG(100, PokemonType.WATER, 30, 15),
    POLIWHIRL(100, PokemonType.WATER, 30, 15),
    POLIWRATH(100, PokemonType.WATER, 30, 15),
    ABRA(100, PokemonType.PSYCHIC, 30, 15),
    KADABRA(100, PokemonType.PSYCHIC, 30, 15),
    ALAKAZAM(100, PokemonType.PSYCHIC, 30, 15),
    MACHOP(100, PokemonType.FIGHTING, 30, 15),
    MACHOKE(100, PokemonType.FIGHTING, 30, 15),
    MACHAMP(100, PokemonType.FIGHTING, 30, 15),
    BELLSPROUT(100, PokemonType.GRASS, 30, 15),
    WEEPINBELL(100, PokemonType.GRASS, 30, 15),
    VICTREEBEL(100, PokemonType.GRASS, 30, 15),
    TENTACOOL(100, PokemonType.WATER, 30, 15),
    TENTACRUEL(100, PokemonType.WATER, 30, 15),
    GEODUDE(100, PokemonType.ROCK, 30, 15),
    GRAVELER(100, PokemonType.ROCK, 30, 15),
    GOLEM(100, PokemonType.ROCK, 30, 15),
    PONYTA(100, PokemonType.FIRE, 30, 15),
    RAPIDASH(100, PokemonType.FIRE, 30, 15),
    SLOWPOKE(100, PokemonType.WATER, 30, 15),
    SLOWBRO(100, PokemonType.WATER, 30, 15),
    MAGNEMITE(100, PokemonType.ELECTRIC, 30, 15),
    MAGNETON(100, PokemonType.ELECTRIC, 30, 15),
    FARFETCH(100, PokemonType.NORMAL, 30, 15),
    DODUO(100, PokemonType.NORMAL, 30, 15),
    DODRIO(100, PokemonType.NORMAL, 30, 15),
    SEEL(100, PokemonType.WATER, 30, 15),
    DEWGONG(100, PokemonType.WATER, 30, 15),
    GRIMER(100, PokemonType.POISON, 30, 15),
    MUK(100, PokemonType.POISON, 30, 15),
    SHELLDER(100, PokemonType.WATER, 30, 15),
    CLOYSTER(100, PokemonType.WATER, 30, 15),
    GASTLY(100, PokemonType.GHOST, 30, 15),
    HAUNTER(100, PokemonType.GHOST, 30, 15),
    GENGAR(100, PokemonType.GHOST, 30, 15),
    ONIX(100, PokemonType.ROCK, 30, 15),
    DROWZEE(100, PokemonType.PSYCHIC, 30, 15),
    HYPNO(100, PokemonType.PSYCHIC, 30, 15),
    KRABBY(100, PokemonType.WATER, 30, 15),
    KINGLER(100, PokemonType.WATER, 30, 15),
    VOLTORB(100, PokemonType.ELECTRIC, 30, 15),
    ELECTRODE(100, PokemonType.ELECTRIC, 30, 15),
    EXEGGCUTE(100, PokemonType.GRASS, 30, 15),
    EXEGGUTOR(100, PokemonType.GRASS, 30, 15),
    CUBONE(100, PokemonType.GROUND, 30, 15),
    MAROWAK(100, PokemonType.GROUND, 30, 15),
    HITMONLEE(100, PokemonType.FIGHTING, 30, 15),
    HITMONCHAN(100, PokemonType.FIGHTING, 30, 15),
    LICKITUNG(100, PokemonType.NORMAL, 30, 15),
    KOFFING(100, PokemonType.POISON, 30, 15),
    WEEZING(100, PokemonType.POISON, 30, 15),
    RHYHORN(100, PokemonType.GROUND, 30, 15),
    RHYDON(100, PokemonType.GROUND, 30, 15),
    CHANSEY(100, PokemonType.NORMAL, 30, 15),
    TANGELA(100, PokemonType.GROUND, 30, 15),
    KANGASKHAN(100, PokemonType.NORMAL, 30, 15),
    HORSEA(100, PokemonType.WATER, 30, 15),
    SEADRA(100, PokemonType.WATER, 30, 15),
    GOLDEEN(100, PokemonType.WATER, 30, 15),
    SEAKING(100, PokemonType.WATER, 30, 15),
    STARYU(100, PokemonType.WATER, 30, 15),
    STARMIE(100, PokemonType.WATER, 30, 15),
    MRMIME(100, PokemonType.PSYCHIC, 30, 15),
    SCYTHER(100, PokemonType.BUG, 30, 15),
    JYNX(100, PokemonType.PSYCHIC, 30, 15),
    ELECTABUZZ(100, PokemonType.ELECTRIC, 30, 15),
    MAGMAR(100, PokemonType.ELECTRIC, 30, 15),
    PINSIR(100, PokemonType.BUG, 30, 15),
    TAUROS(100, PokemonType.NORMAL, 30, 15),
    MAGIKARP(100, PokemonType.WATER, 30, 15),
    GYARADOS(100, PokemonType.WATER, 30, 15),
    LAPRAS(100, PokemonType.WATER, 30, 15),
    DITTO(100, PokemonType.NORMAL, 30, 15),
    EEVEE(100, PokemonType.NORMAL, 30, 15),
    VAPOREON(100, PokemonType.WATER, 30, 15),
    JOLTEON(100, PokemonType.ELECTRIC, 30, 15),
    FLAREON(100, PokemonType.FIGHTING, 30, 15),
    PORYGON(100, PokemonType.NORMAL, 30, 15),
    OMANYTE(100, PokemonType.ROCK, 30, 15),
    OMASTAR(100, PokemonType.ROCK, 30, 15),
    KABUTO(100, PokemonType.ROCK, 30, 15),
    KABUTOPS(100, PokemonType.ROCK, 30, 15),
    AERODACTYL(100, PokemonType.ROCK, 30, 15),
    SNORLAX(100, PokemonType.NORMAL, 30, 15),
    ARTICUNO(100, PokemonType.ICE, 30, 15),
    ZAPDOS(100, PokemonType.ELECTRIC, 30, 15),
    MOLTRES(100, PokemonType.FIRE, 30, 15),
    DRATINI(100, PokemonType.DRAGON, 30, 15),
    DRAGONAIR(100, PokemonType.DRAGON, 30, 15),
    DRAGONITE(100, PokemonType.DRAGON, 30, 15),
    MEWTWO(100, PokemonType.PSYCHIC, 30, 15),
    MEW(100, PokemonType.PSYCHIC, 30, 15);

    static {
        PIKACHU.specificAttacks.addAll(Arrays.asList(
                new Attack("Volt tackle", 80, 100),
                new Attack("Static storm", 60, 100)));
        PIKACHU.evolvesIn = RAICHU;
        CHARMANDER.evolvesIn = CHARMELEON;
        CHARMELEON.evolvesIn = CHARIZARD;
        SQUIRTLE.evolvesIn = WARTORTLE;
        WARTORTLE.evolvesIn = BLASTOISE;
        BULBASAUR.evolvesIn = IVYSAUR;
        IVYSAUR.evolvesIn = VENUSAUR;

        CHARMANDER.art =
                "               _.--\"\"`-\n" +
                "            ,'          `.\n" +
                "          ,'          __  `.\n" +
                "         /|          \" __   \\\n" +
                "        , |           / |.   .\n" +
                "        |,'          !_.'|   |\n" +
                "      ,'             '   |   |\n" +
                "     /              |`--'|   |\n" +
                "    |                `---'   |\n" +
                "     .   ,                   |                       ,\".\n" +
                "      ._     '           _'  |                    , ' \\ `\n" +
                "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\n" +
                "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n" +
                "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n" +
                "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n" +
                "    `.      '            '            /          '    |'. |/\n" +
                "      `.   |              \\       _,-'           |       ''\n" +
                "        `._'               \\   '\"\\                .      |\n" +
                "           |                '     \\                `._  ,'\n" +
                "           |                 '     \\                 .'|\n" +
                "           |                 .      \\                | |\n" +
                "           |                 |       L              ,' |\n" +
                "           `                 |       |             /   '\n" +
                "            \\                |       |           ,'   /\n" +
                "          ,' \\               |  _.._ ,-..___,..-'    ,'\n" +
                "         /     .             .      `!             ,j'\n" +
                "        /       `.          /        .           .'/\n" +
                "       .          `.       /         |        _.'.'\n" +
                "        `.          7`'---'          |------\"'_.'\n" +
                "       _,.`,_     _'                ,''-----\"'\n" +
                "   _,-_    '       `.     .'      ,\\\n" +
                "   -\" /`.         _,'     | _  _  _.|\n" +
                "    \"\"--'---\"\"\"\"\"'        `' '! |! /";

        BULBASAUR.art = "                                           /\n" +
                "                        _,.------....___,.' ',.-.\n" +
                "                     ,-'          _,.--\"        |\n" +
                "                   ,'         _.-'              .\n" +
                "                  /   ,     ,'                   `\n" +
                "                 .   /     /                     ``.\n" +
                "                 |  |     .                       \\.\\\n" +
                "       ____      |___._.  |       __               \\ `.\n" +
                "     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\n" +
                "    .  ,            __               `              |   .\n" +
                "    `,'         ,-\"'  .               \\             |    L\n" +
                "   ,'          '    _.'                -._          /    |\n" +
                "  ,`-.    ,\".   `--'                      >.      ,'     |\n" +
                " . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\n" +
                " ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\n" +
                " j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /\n" +
                "/ L:_  |                 .  \"' :_;                `.'.'\n" +
                ".    \"\"'                  \"\"\"\"\"'                    V\n" +
                " `.                                 .    `.   _,..  `\n" +
                "   `,_   .    .                _,-'/    .. `,'   __  `\n" +
                "    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\n" +
                "   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\n" +
                "  .   _  `\"\"'--.._____..--\"   ,             '         |\n" +
                "  | .\" `. `-.                /-.           /          ,\n" +
                "  | `._.'    `,_            ;  /         ,'          .\n" +
                " .'          /| `-.        . ,'         ,           ,\n" +
                " '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\n" +
                " `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--' \n" +
                "\n" +
                "\n";

        SQUIRTLE.art = "" +
                "               _,........__\n" +
                "            ,-'            \"`-.\n" +
                "          ,'                   `-.\n" +
                "        ,'                        \\\n" +
                "      ,'                           .\n" +
                "      .'\\               ,\"\".       `\n" +
                "     ._.'|             / |  `       \\\n" +
                "     |   |            `-.'  ||       `.\n" +
                "     |   |            '-._,'||       | \\\n" +
                "     .`.,'             `..,'.'       , |`-.\n" +
                "     l                       .'`.  _/  |   `.\n" +
                "     `-.._'-   ,          _ _'   -\" \\  .     `\n" +
                "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" +
                ".'        `\"-..___      __,'\\          \\  \\     \\\n" +
                "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n" +
                "  `.          |              `.          |  .     L\n" +
                "    `.        |`--...________.'.        j   |     |\n" +
                "      `._    .'      |          `.     .|   ,     |\n" +
                "         `--,\\       .            `7\"\"' |  ,      |\n" +
                "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n" +
                "             \\ `.     .          /      |  '      |  ,'          `.\n" +
                "              \\  v.__  .        '       .   \\    /| /              \\\n" +
                "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n" +
                "                `        .        `._ ___,j.  `/ .-       ,---.     |\n" +
                "                ,`-.      \\         .\"     `.  |/        j     `    |\n" +
                "               /    `.     \\       /         \\ /         |     /    j\n" +
                "              |       `-.   7-.._ .          |\"          '         /\n" +
                "              |          `./_    `|          |            .     _,'\n" +
                "              `.           / `----|          |-............`---'\n" +
                "                \\          \\      |          |\n" +
                "               ,'           )     `.         |\n" +
                "                7____,,..--'      /          |\n" +
                "                                  `---.__,--.'\n";
    }

    public final List<Attack> specificAttacks = new ArrayList<>();
    public int maxHp;
    public int maxPp;
    public PokemonType pokemonType;
    public PokemonData evolvesIn;
    public int evolutionLevel;
    public String art;

    PokemonData(int maxHp, PokemonType pokemonType, int maxPp, int evolutionLevel) {
        this.maxHp = maxHp;
        this.pokemonType = pokemonType;
        this.maxPp = maxPp;
        this.evolutionLevel = evolutionLevel;
    }
}
