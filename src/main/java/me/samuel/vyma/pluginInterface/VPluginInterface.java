package me.samuel.vyma.pluginInterface;

public abstract class VPluginInterface {

    private String name;

    private double version;

    /**
     * @param name Application name
     * @param version Application version
     */
    public VPluginInterface(String name, double version) {
        this.name = name;
        this.version = version;
    }

    /**
     * Api access for the system
     */
    public void load() {
        onLoad();
        onPostLoad();
    }

    /**
     * Api access for the system
     */
    public void unload() {
        onUnload();
        onPostUnload();
    }

    /**
     * Pre load event.
     * Common uses would be basic initialisation and preparations.
     */
    public abstract void onLoad();

    /**
     * Post load event.
     * This is basically the start point of the application, here you can start main loops and threads.
     */
    public abstract void onPostLoad();

    /**
     * Pre unload event.
     * Common uses would be some user confirmations and thread management.
     */
    public abstract void onUnload();

    /**
     * Post unload event.
     * Common uses would be closing file streams and informing the user of the exit.
     */
    public abstract void onPostUnload();

    /**
     * @return app name
     */
    public String getName() {
        return name;
    }

    /**
     * @return app version
     */
    public double getVersion() {
        return version;
    }
}
