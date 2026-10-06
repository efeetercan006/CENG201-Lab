public class PlaylistDemo {
    public static void main(String[] args){
        System.out.println("----Playlist Track Demo----"); //ABDULLAH EFE TERCAN 250444028
        //DEFAULT CONSTRUCTOR
        Track defaultTrack = new Track();
        System.out.println("Default track: ");
        System.out.println(defaultTrack);
        System.out.println();
        //titleonly
        Track titleOnlyTrack = new Track("Ankaranın Bağları");
        System.out.println("Title-only track: ");
        System.out.println(titleOnlyTrack);
        System.out.println();
        //titleartist
        Track titleArtistTrack = new Track("Maalesef" , "Mansur Ark");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack);
        System.out.println();
        //fullconstructor
        Track fullTrack = new Track("Lost on You" , "LP" , 180 , false);
        System.out.println("Full Track (non explicit): ");
        System.out.println(fullTrack);
        System.out.println();
        //invaliddur.test
        System.out.println("Invalid Duration Test: ");
        Track invalidTrack = new Track("Saldım Çayıra" , "Kıraç" , -87 , false );
        System.out.println(invalidTrack);
        System.out.println();
        //gettertest
        Track getterTrack = new Track("Zehir" , "Manifest" , 213 ,true);
        System.out.println("Getter Test: ");
        System.out.println("Title:  " + getterTrack.getTitle());
        System.out.println("Artist:   " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationSecond());
        System.out.println("Explicit:  " + getterTrack.getExplicit());

    }
}
 