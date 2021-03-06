package de.softgames.sdk.model;


/**
 * The Entity Class SoftgamesAd to encapsulate all the ad related attributes
 */
public class SoftgamesAd {

    /** The game name. */
    private String gameName;

    /** The viewport width. */
    private Integer viewportWidth;

    /** The view port height. */
    private Integer viewPortHeight;

    /** The pixel ratio. */
    private Float pixelRatio;

    /** The connection type. */
    private int connectionType;

    private String deviceManufacturer;

    /**
     * Instantiates a new softgames ad.
     * 
     * @param gameName
     *            the game name
     * @param viewportWidth
     *            the viewport width
     * @param viewPortHeight
     *            the view port height
     * @param pixelRatio
     *            the pixel ratio
     * @param connectionType
     *            the type of internet connectivity
     */
    public SoftgamesAd(String gameName, Integer viewportWidth,
            Integer viewPortHeight, Float pixelRatio, int connectionType,
            String deviceManufacturer) {
        super();
        this.gameName = gameName;
        this.viewportWidth = viewportWidth;
        this.viewPortHeight = viewPortHeight;
        this.pixelRatio = pixelRatio;
        this.connectionType = connectionType;
        this.deviceManufacturer = deviceManufacturer;
    }


    /**
     * Gets the game name.
     * 
     * @return the game name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Sets the game name.
     * 
     * @param gameName
     *            the new game name
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * Gets the viewport width.
     * 
     * @return the viewport width
     */
    public Integer getViewportWidth() {
        return viewportWidth;
    }

    /**
     * Sets the viewport width.
     * 
     * @param viewportWidth
     *            the new viewport width
     */
    public void setViewportWidth(Integer viewportWidth) {
        this.viewportWidth = viewportWidth;
    }

    /**
     * Gets the view port height.
     * 
     * @return the view port height
     */
    public Integer getViewportHeight() {
        return viewPortHeight;
    }

    /**
     * Sets the view port height.
     * 
     * @param viewPortHeight
     *            the new view port height
     */
    public void setViewPortHeight(Integer viewPortHeight) {
        this.viewPortHeight = viewPortHeight;
    }

    /**
     * Gets the pixel ratio.
     * 
     * @return the pixel ratio
     */
    public Float getPixelRatio() {
        return pixelRatio;
    }

    /**
     * Sets the pixel ratio.
     * 
     * @param pixelRatio
     *            the new pixel ratio
     */
    public void setPixelRatio(Float pixelRatio) {
        this.pixelRatio = pixelRatio;
    }

    /**
     * Gets the connection type.
     * 
     * @return the connection type
     */
    public int getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the connection type.
     * 
     * @param connectionType
     *            the new connection type
     */
    public void setConnectionType(int connectionType) {
        this.connectionType = connectionType;
    }


    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    @Override
    public String toString() {
        return "SoftgamesAd [gameName=" + gameName + ", viewportWidth="
                + viewportWidth + ", viewPortHeight=" + viewPortHeight
                + ", pixelRatio=" + pixelRatio + ", connectionType="
                + connectionType + ", deviceManufacturer=" + deviceManufacturer
                + "]";
    }


}
