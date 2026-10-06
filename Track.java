public class Track { //ABDULLAH EFE TERCAN 250444028
    private String title;
    private String artist;
    private int durationSecond;
    private Boolean isExplicit;
    public Track(String title ,String artist , int durationSecond , boolean isExplicit){
        this.title = title;
        this.artist= artist;
        this.isExplicit = isExplicit;

        if (durationSecond >= 0){
            this.durationSecond= durationSecond;
        }else{
            System.out.println("Invalid time.Set to 0");
            this.durationSecond = 0 ;
        }
    }
    public Track(String title , String artist){
        this(title , artist ,0 , false);
    }
    public Track(String title){
        this(title , "Unknown artist." , 0 , false);
    }
    public Track(){
        this("Unknown Title" , "Unknown Artist" , 0 , false);
    }
    public String getTitle(){
        return title ;
    }
    public String getArtist(){
        return artist;
    }
    public int getDurationSecond(){
        return durationSecond;
    }
    public boolean getExplicit(){
        return isExplicit;
    }
    public String getDurationFormatted(){
        int minutes = durationSecond/60;
        int seconds = durationSecond%60;
        return String.format("%d:%02d", minutes , seconds);
    }
    @Override
    public String toString(){
        String result = "\"" + title + "\" by " + artist + "["+ getDurationFormatted() + "]";
        if (isExplicit) {
            result = result + " [EXPLICIT] ";
        }
        return result;
    }
}
