import java.util.Scanner;

public class DrawAnimals{


    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input 1 for Elephant, \t2 for butterfly, \t3 for Snake \tor 4 for teddybear");
        animalNumber = myScan.nextInt();
        myScan.close();
        animalChoice();
        
    }
    /**
     * Function name: animalChoice
     * @param animalNumber
     * 
     * Inside function draws an animal based on user input.
     */

    public static void animalChoice(int animalNumber){
        
        switch (animalNumber) {
            case 1:
            System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
            System.out.println("   _.-'         \\ __...----...__ /         '-._");
            System.out.println(" .'      .:::...,'              ',...:::.      '.");
            System.out.println("(     .'``'''::;                  ;::'''``'.     )");
            System.out.println(" \\             '-)              (-'             /");
            System.out.println("  \\             /                \\             /");
            System.out.println("   \\          .'.-.            .-.'.          /");
            System.out.println("    \\         | \\0|            |0/ |         /");
            System.out.println("    |          \\  |   .-==-.   |  /          |");
            System.out.println("     \\          `/`;          ;`\\`          /");
            System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
            System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
            System.out.println("               / /`;   .==.   ;`\\ \\");
            System.out.println("         .---./_/   \\  .==.  /   \\ \\");
            System.out.println("        / '.    `-.__)       |    `\"");
            System.out.println("       | =(`-.        '==.   ;");
            System.out.println("        \\  '. `-.           /");
            System.out.println("         \\_:_)   `\"--.....-'");
            break;

            case 2:
            System.out.println("  .==-.                   .-==.     ");
            System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
            System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
            System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
            System.out.println("      `._... .q(_)p. ..._.'         ");
            System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
            System.out.println("        .\"\"' .'|=|`. `\"\".       ");
            System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
            System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
            System.out.println("      \\O `::/       \\::' O/       ");
            System.out.println("       \"\"--'         `--\"\"      ");
            break;

            case 3:
            System.out.println("         ,,'6''-,.");
            System.out.println("        <====,.;;--.");
            System.out.println("        _`---===. \"\"\"==__");
            System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
            System.out.println("     |( @@@  |===|  @@@  ||");
            System.out.println("      \\\\ @@   |===|  @@  //");
            System.out.println("        \\\\ @@ |===|@@@ //");
            System.out.println("         \\\\  |===|  //");
            System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
            System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
            System.out.println("             |==||                           `\\   \\");
            System.out.println("            |==| |                             )   |");
            System.out.println("           |==| |       _____         ______,--'   '");
            System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
            System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
            System.out.println("                \"\"\"\"		");
            break;

            case 4:
            System.out.println("            ___   .--. ");
            System.out.println("      .--.-\"   \"-' .- |");
            System.out.println("     / .-,`          .'");
            System.out.println("     \\   `           \\");
            System.out.println("      '.            ! \\");
            System.out.println("        |     !  .--.  |");
            System.out.println("        \\        '--'  /.____");
            System.out.println("       /`-.     \\__,'.'      `\\");
            System.out.println("    __/   \\`-.____.-' `\\      /");
            System.out.println("    | `---`'-'._/-`     \\----'    _");
            System.out.println("    |,-'`  /             |    _.-' `\\");
            System.out.println("   .'     /              |--'`     / |");
            System.out.println("  /      /\\              `         | |");
            System.out.println("  |   .\\/  \\      .--. __          \\ |");
            System.out.println("   '-'      '._       /  `\\         /");
            System.out.println("               `\\    '     |------'`");
            System.out.println("                 \\  |      |");
            System.out.println("                  \\        /");
            System.out.println("                   '._  _.'");
            System.out.println("                      ``");
            break;
        
            default:
            System.out.println("Choose a number from 1 to 4");
            break;
            
        }
    
 
    }
}