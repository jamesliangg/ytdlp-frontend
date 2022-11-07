# ytdlp-frontend
![Application GUI](https://res.cloudinary.com/dtwco1l6i/image/upload/v1643158147/Github/ytdlp_izvhhn.png)
## Introduction
Won Best Veteran Hack at BCI Hacks 2021

Have you ever had a video or song on YouTube suddenly disapear from your playlist? It's hard to find out what the content was and you might never remember.
With YT-DLP, you can download both videos and audio to save what you love.

This project is meant to make the downloading of videos with YT-DLP easier and simpler.
The user provides the URL and is asked for several common options they can select including extracting audio.

Original repository can be found below:
https://github.com/yt-dlp/yt-dlp#installation

## Requirements
The code that the user needs to execute will require the installation of YT-DLP and ffmpeg if extracting audio.

They can be installed with homebrew with the following code into the terminal:
```
brew install yt-dlp

brew install ffmpeg
```

## Warnings
The extraction of video will attempt to download in the selected format, if not possible, it'll download the best video.
