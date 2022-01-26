public class Generator {
    public static String getString(String url, boolean ignoreErrors, boolean metadata, boolean sponsors, boolean archiveLinks, boolean extractVideo, boolean extractAudio, String audioFormat, String videoFormat){
        String output = "yt-dlp \"" + url + "\"";
        if(ignoreErrors == true){
            output += " -i";
        }
        if(metadata == true){
            output += " --add-metadata";
        }
        if(sponsors == true){
            output += " --sponsorblock-remove all";
        }
        if(archiveLinks == true){
            output += " --download-archive archivedlinks.txt";
        }
        if(extractAudio == true){
            switch(audioFormat){
                case "aac":
                    output += " -x --audio-format aac";
                    break;
                case "flac":
                    output += " -x --audio-format flac";
                    break;
                case "mp3":
                    output += " -x --audio-format mp3";
                    break;
                case "m4a":
                    output += " -x --audio-format m4a";
                    break;
                case "wav":
                    output += " -x --audio-format wav";
                    break;
            }
        }
        if(extractVideo == true){
            switch(videoFormat){
                case "mp4":
                    output += " -f \"bv*[ext=mp4]+ba[ext=m4a]/b[ext=mp4] / bv*+ba/b\"";
                    break;
                case "mkv":
                    output += " -f \"bv*[ext=mkv]+ba[ext=m4a]/b[ext=mkv] / bv*+ba/b\"";
                    break;
                case "webm":
                    output += " -f \"bv*[ext=webm]+ba[ext=m4a]/b[ext=webm] / bv*+ba/b\"";
            }
        }
        return output;
    }
}
