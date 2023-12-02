package day02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        //\n -> open new line, move to the next line
        // \t -> press tab key, it creates a space of 2.3 letters
        // \b -> creates a backspace effect, i.e. deletes 1 character back
        // \" -> used to print quotes
        // \\ -> writes a \ to the screen
        //\r -> go to start of line

        System.out.println("MerhabaDünya");    // MerhabaDünya
        System.out.println("Merhaba\nDünya");  // Merhaba  yazra , sonra alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya");  // Merhaba    Dünya   (tab tuşu kadar boşluk)
        System.out.println("Merhaba\bDünya");  //MerhabDünya
        System.out.println("Merhaba\b\bDünya"); //MerhaDünya
        System.out.println("Merhaba\"Dünya");   //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");   //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");   //Dünya

    }
}
