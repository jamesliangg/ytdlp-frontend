import javax.swing.JOptionPane; //fancy GUI

public class GUI {
    public static int plexRename = 0;
    public static String ignoreOutput = "-i";
    public static String extractAudioOutput = "-x";
    public static String formatOutput = "best";
    public static String sponsorBlockOutput = "--sponsorblock-remove CATS";
    public static String metadataOutput = "--add-metadata";
    public static String archiveOutput = "--download-archive archivedlinks.txt";
    public static void introduction() {
        JOptionPane.showMessageDialog(null, "Welcome to YT-DLP Front End!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        //plexRename = JOptionPane.showConfirmDialog(null, "Would you like to rename files for importing to Plex?", "Plex Integration", JOptionPane.YES_NO_OPTION);
    }
    public static String downloadURL() {
        String URL = JOptionPane.showInputDialog("What is the URL of the YouTube video?");
        return URL;
    }
    public static void downloadOptions(){
        //yes = 0, no = 1
        int ignore = JOptionPane.showConfirmDialog(null, "Would you like to ignore errors?", "Options", JOptionPane.YES_NO_OPTION);
        int extractAudio = JOptionPane.showConfirmDialog(null, "Would you like to extract audio (requires ffmpeg)?", "Options", JOptionPane.YES_NO_OPTION);
        if (extractAudio == 0) {
            String[] audioFormats = {"best", "aac", "flac", "mp3", "m4a", "opus", "vorbis", "wav", "alc"};
            formatOutput = (String) JOptionPane.showInputDialog(null, "What format?", "Format Options", JOptionPane.QUESTION_MESSAGE, null, audioFormats, audioFormats[0]);
        }
        int sponsorBlock = JOptionPane.showConfirmDialog(null, "Would you like to remove sponsor messages?", "Options", JOptionPane.YES_NO_OPTION);
        int metadata = JOptionPane.showConfirmDialog(null, "Would you like to embed metadata?", "Options", JOptionPane.YES_NO_OPTION);
        int archive = JOptionPane.showConfirmDialog(null, "Would you like to archive downloaded links?", "Options", JOptionPane.YES_NO_OPTION);

        if (ignore == 0){
            ignoreOutput = "-i";
        }
        else{
            ignoreOutput = "";
        }
        if (extractAudio == 0){
            extractAudioOutput = "-x";
        }
        else{
            extractAudioOutput = "";
            formatOutput = "";
        }
        if (sponsorBlock == 0){
            sponsorBlockOutput = "--sponsorblock-remove CATS";
        }
        else{
            sponsorBlockOutput = "";
        }
        if (metadata == 0){
            metadataOutput = "--add-metadata";
        }
        else{
            metadataOutput = "";
        }
        if (archive == 0){
            archiveOutput = "--download-archive archivedlinks.txt";
        }
        else{
            archiveOutput = "";
        }
    }
    public static void resultCommand(String URL){
        System.out.println("Copy and paste the code below into terminal:");
        System.out.println("yt-dlp \"" + URL + "\" " + ignoreOutput + " " + extractAudioOutput + " " + formatOutput + " " + sponsorBlockOutput + " " + metadataOutput + " " + archiveOutput);
    }
}
