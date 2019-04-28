package me.samuel.vyma.pluginInterface;

public abstract class VPluginInterface {

    private String name;

    private double version;

    public VPluginInterface(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void load() {
        onLoad();
        onPostLoad();
    }

    public void unload() {
        onUnload();
        onPostUnload();
    }

    public abstract void onLoad();

    public abstract void onPostLoad();

    public abstract void onUnload();

    public abstract void onPostUnload();

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }
}
