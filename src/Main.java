public class Main {
    public static void main(String[] args) {
        //Il bot sta attraversando una catastrofe economica! Ha 10.000 sterline.
        //Le vuole vendere tutte il più presto possibile! Prima che lo stato
        //d'Inghilterra crolli, ma è un po' avido.
        //Venderà solamente le sue sterline se il cambio è maggiore di 1.15 (sterlinaAEuro).
        //Nei giorni in cui vende, può solo vendere 1000 sterline per euro.
        //Scrivi un loop while.
        //Usa il calcolo per lo scambio qui sotto:
        //1 + (Math.random() * 0.2);
        //Per ricalcolare il tasso ogni giorno (una volta per loop)
        //Stampa il numero di giorni che richiedono al nostro bot per vendere tutte le sue
        //sterline.

        int giorniInCuiVendere = 0;
        int sterlineRimanenti = 10000;
        int maxSterlineDaVendere = 1000;

        while (sterlineRimanenti > 0){
            double sterlineAEuro = 1 + (Math.random() * 0.2);
            giorniInCuiVendere++;

            if (sterlineAEuro > 1.15){
                sterlineRimanenti -= maxSterlineDaVendere;
            }
            System.out.println("Giorno " + giorniInCuiVendere + "; Sterline rimanenti: " + sterlineRimanenti);
        }
        System.out.println("Ci sono voluti " + giorniInCuiVendere + " giorni per salvare l'economia.");
    }
}