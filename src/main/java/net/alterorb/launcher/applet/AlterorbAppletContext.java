package net.alterorb.launcher.applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.Image;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;

public class AlterorbAppletContext implements AppletContext {

    @Override
    public AudioClip getAudioClip(URL url) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public Image getImage(URL url) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public Applet getApplet(String name) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public Enumeration<Applet> getApplets() {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void showDocument(URL url) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void showDocument(URL url, String target) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void showStatus(String status) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void setStream(String key, InputStream stream) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public InputStream getStream(String key) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public Iterator<String> getStreamKeys() {
        throw new UnsupportedOperationException("Unsupported operation");
    }
}
