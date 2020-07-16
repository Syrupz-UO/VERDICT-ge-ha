package com.ge.verdict.gsn;

public class Goal {
    /** An unique Id */
    protected String id;

    /** Some text to display */
    protected String displayText;

    /** Goal status true if passed false if failed */
    protected boolean status;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the displayText property.
     *
     * @return possible object is {@link String }
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link boolean }
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is {@link boolean }
     */
    public void setStatus(boolean value) {
        this.status = value;
    }
}
