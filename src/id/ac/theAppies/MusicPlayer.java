package id.ac.theAppies;

import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

public class MusicPlayer{
	private String musicFiles;
	private Clip clip;
	
	public MusicPlayer() {
		musicFiles="image/lagu.wav";
		try {
			File soundFile = new File(musicFiles);
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
			AudioFormat format = ais.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void play() {
		clip.loop(1000);
	}
	 
	public void stop() {
		clip.stop();
	}
}